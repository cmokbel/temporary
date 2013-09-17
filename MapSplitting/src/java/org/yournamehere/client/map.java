/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yournamehere.client;


import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import java.util.LinkedList;
import org.gwtopenmaps.openlayers.client.Bounds;
import org.gwtopenmaps.openlayers.client.Icon;
import org.gwtopenmaps.openlayers.client.LonLat;
import org.gwtopenmaps.openlayers.client.Map;
import org.gwtopenmaps.openlayers.client.MapOptions;
import org.gwtopenmaps.openlayers.client.MapWidget;
import org.gwtopenmaps.openlayers.client.Pixel;
import org.gwtopenmaps.openlayers.client.Projection;
import org.gwtopenmaps.openlayers.client.Size;
import org.gwtopenmaps.openlayers.client.control.DrawFeature;
import org.gwtopenmaps.openlayers.client.control.LayerSwitcher;
import org.gwtopenmaps.openlayers.client.control.OverviewMap;
import org.gwtopenmaps.openlayers.client.control.ScaleLine;
import org.gwtopenmaps.openlayers.client.event.MapClickListener;
import org.gwtopenmaps.openlayers.client.event.MapZoomListener;
import org.gwtopenmaps.openlayers.client.event.VectorFeatureAddedListener;
import org.gwtopenmaps.openlayers.client.event.VectorFeatureAddedListener.FeatureAddedEvent;
import org.gwtopenmaps.openlayers.client.event.VectorFeatureSelectedListener;
import org.gwtopenmaps.openlayers.client.event.VectorFeatureSelectedListener.FeatureSelectedEvent;
import org.gwtopenmaps.openlayers.client.feature.VectorFeature;
import org.gwtopenmaps.openlayers.client.geometry.Geometry;
import org.gwtopenmaps.openlayers.client.geometry.LineString;
import org.gwtopenmaps.openlayers.client.geometry.LinearRing;
import org.gwtopenmaps.openlayers.client.geometry.MultiPolygon;
import org.gwtopenmaps.openlayers.client.geometry.Point;
import org.gwtopenmaps.openlayers.client.geometry.Polygon;
import org.gwtopenmaps.openlayers.client.handler.PathHandler;
import org.gwtopenmaps.openlayers.client.layer.Bing;
import org.gwtopenmaps.openlayers.client.layer.BingOptions;
import org.gwtopenmaps.openlayers.client.layer.BingType;
import org.gwtopenmaps.openlayers.client.layer.Vector;
import org.gwtopenmaps.openlayers.client.popup.AnchoredBubble;

/**
 *
 * @author Christian
 */
public class map extends FlowPanel {

    private Vector markerLayer = new Vector("Marker layer");
    public static final Projection DEFAULT_PROJECTION = new Projection("EPSG:4326");
    public Map map;
    private DrawFeature drawLineFeatureControl;

    public void split(VectorFeature toSplit, VectorFeature by){
        
        Geometry geo = toSplit.getGeometry();
        Geometry byeo = by.getGeometry();
       
//    convert the mutipolygone into a multilinestring...
            MultiPolygon mp = MultiPolygon.narrowToMultiPolygon(toSplit.getJSObject());
            
            
            Polygon[] p = mp.getComponents();
           LinearRing[] r= p[0].getComponents();
          Point[] points =  r[0].getVertices(true);
         LineString ls= new LineString(points);
         
         
          split(byeo.getJSObject(),ls.getJSObject());
          
        //call the javascript method to split:
          //http://dev.openlayers.org/docs/files/OpenLayers/Geometry/MultiLineString-js.html
        
       
       
        
    }
   public  native final JavaScriptObject split(JavaScriptObject object,JavaScriptObject object2)/*-{
	return object.split(object2);
	}-*/;
    
    public map() {
setWidth("100%");
setHeight("100%");

        MapOptions defaultMapOptions = new MapOptions();
        defaultMapOptions.setNumZoomLevels(16);

        //Create a MapWidget
        MapWidget mapWidget = new MapWidget("500px", "500px", defaultMapOptions);
        //Create some Bing layers
        final String key = "Apd8EWF9Ls5tXmyHr22OuL1ay4HRJtI4JG4jgluTDVaJdUXZV6lpSBpX-TwnoRDG"; //Bing key
        BingOptions b1 = new BingOptions("Road Layer", key, BingType.ROAD);
        BingOptions b2 = new BingOptions("Hybrid Layer", key, BingType.HYBRID);
        BingOptions b3 = new BingOptions("Aerial Layer", key, BingType.AERIAL);

        b1.setAttribution("");
        b2.setAttribution("");
        b3.setAttribution("");

        Bing road = new Bing(b1);
        Bing hybrid = new Bing(b2);
        Bing aerial = new Bing(b3);

        //And add them to the map
        map = mapWidget.getMap();
        map.addLayer(aerial);
        map.addLayer(hybrid);
        map.addLayer(road);
        map.addLayer(markerLayer);


        //Lets add some default controls to the map
        map.addControl(new LayerSwitcher()); //+ sign in the upperright corner to display the layer switcher
        map.addControl(new OverviewMap()); //+ sign in the lowerright to display the overviewmap
        map.addControl(new ScaleLine()); //Display the scaleline

        markerLayer.addVectorFeatureSelectedListener(new VectorFeatureSelectedListener() {
            public void onFeatureSelected(FeatureSelectedEvent eventObject) {

                
                GWT.log("vf clicked:" + eventObject.getVectorFeature().getFID());
            }
        });

        /* map.getEvents().register("mousemove", map, new EventHandler() {
         @Override
         public void onHandle(EventObject eventObject) {
         JSObject xy = eventObject.getJSObject().getProperty("xy");
         Pixel px = Pixel.narrowToPixel(xy);
         LonLat lonlat = map.getLonLatFromPixel(px);


         // GWT.log("map mouse move:" + lonlat.lat() + " " + lonlat.lon());

         splitLine(lonlat);
         }
         });*/
        map.addMapClickListener(new MapClickListener() {
            public void onClick(MapClickListener.MapClickEvent mapClickEvent) {
                GWT.log("map clicked:");
                if (drawLineFeatureControl.isActive()) {
                    return;
                }

                LonLat lonLat = mapClickEvent.getLonLat();
                String temp = "";


                for (VectorFeature vf : markerLayer.getFeatures()) {
                    if (vf.getGeometry().atPoint(lonLat, .0001, .0001)) {

                        map.addPopupExclusive(vf.getPopup());
                        return;

                    }
                }

            }
        });
        drawLineFeatureControl = new DrawFeature(markerLayer, new PathHandler());
      markerLayer.addVectorFeatureAddedListener(new VectorFeatureAddedListener() {

            public void onFeatureAdded(FeatureAddedEvent eventObject) {
            VectorFeature vf = eventObject.getVectorFeature();
            
                GWT.log("vector feature added:"+eventObject.getVectorFeature().getFeatureId());
if(vf.getFeatureId().toLowerCase().indexOf("vector_")>=0)
{
                VectorFeature[] features=markerLayer.getFeatures();
                for(VectorFeature v:features)
                {
                    if(!v.getFeatureId().equalsIgnoreCase(vf.getFeatureId()))
                    {
                       split(v,vf);
                        
                    }
                    
                }
                 //markerLayer.removeFeature(vf);
}
                
            
            }
        });
        
        map.addControl(drawLineFeatureControl);

        centerMap(6.95, 50.94);
        //addPoint(6.95, 50.94);

        map.zoomTo(6);

        mapWidget.getElement().getFirstChildElement().getStyle().setZIndex(0); //force the map to fall behind popups
mapWidget.setWidth("100%");
mapWidget.setHeight("100%");


        RootLayoutPanel.get().add(mapWidget);
        map.addMapZoomListener(new MapZoomListener() {
            public void onMapZoom(MapZoomListener.MapZoomEvent eventObject) {



                markerLayer.redraw();


            }
        });

    }
    public void startSplit(){
           
        drawLineFeatureControl.cancel();
        drawLineFeatureControl.activate();
    }
    public void endSplit(boolean accept){
    
        drawLineFeatureControl.deactivate();
         
    }

    public void showWorld() {
       
        map.updateSize();
        map.zoomTo(1);
        map.setCenter(new LonLat(0, 0));

    }

    public void centerMap(double lon, double lat) {
        final LonLat lonLat = new LonLat(lon, lat);
        lonLat.transform(DEFAULT_PROJECTION.getProjectionCode(), map.getProjection()); // transform lonlat to OSM coordinate system
        // Center the map on the received location
        map.setCenter(lonLat);

    }
    private final LinkedList<Integer> loadingList = new LinkedList();


   

    public org.gwtopenmaps.openlayers.client.geometry.LinearRing getRing(myRing r) {
        org.gwtopenmaps.openlayers.client.geometry.Point[] pts = new org.gwtopenmaps.openlayers.client.geometry.Point[r.points.size()];
        for (int i = 0; i < pts.length; i++) {
            pts[i] = new org.gwtopenmaps.openlayers.client.geometry.Point(r.points.get(i).x, r.points.get(i).y);
        }

        return new org.gwtopenmaps.openlayers.client.geometry.LinearRing(pts);
    }

    public void removeCommunity(int community) {
        VectorFeature vf = markerLayer.getFeatureById("community" + community);
        if (vf != null) {

            markerLayer.removeFeature(vf);
        }
        while (true) {

            int count = 1;

            vf = markerLayer.getFeatureById("community" + community + "pt" + count);
            if (vf != null) {

                markerLayer.removeFeature(vf);
                count++;
            } else {
                break;
            }



        }

    }

    public void showCommunity(LinkedList<myPolygon> polygons, int communityID, String name) {

        org.gwtopenmaps.openlayers.client.Style pointStyle = new org.gwtopenmaps.openlayers.client.Style();
        pointStyle.setFillColor("yellow");
        pointStyle.setStrokeColor("green");
        pointStyle.setStrokeWidth(1);
        pointStyle.setFillOpacity(.5);
        pointStyle.setFill(true);

        VectorFeature vf = markerLayer.getFeatureById("community" + communityID);
        VectorFeature vfpt1 = markerLayer.getFeatureById("community" + communityID + "pt1");


        if ((vf == null) && (vfpt1 == null)) {

            int numberOfPolygons = 0;
            int numberOfPoints = 1;


            for (myPolygon p : polygons) {
                if (!p.isPoint) {
                    numberOfPolygons++;
                } else {

                    Point point = new Point(p.lon, p.lat);

                    point.transform(DEFAULT_PROJECTION, new Projection(map.getProjection()));

                    vf = new VectorFeature(point, pointStyle);

                    vf.setFeatureId("community" + communityID + "pt" + numberOfPoints);
                    vf.setPopup(new AnchoredBubble("marker-info",
                            vf.getCenterLonLat(),
                            new Size(130, 40),
                            "<p>You Clicked On<BR /><B>" + name + "</b></p>",
                            new Icon("", new Size(0, 0), new Pixel(0, 0)),
                            true));

                    markerLayer.addFeature(vf);
                    numberOfPoints++;
                }
            }




            if (numberOfPolygons > 0) {

                org.gwtopenmaps.openlayers.client.geometry.Polygon[] p = new org.gwtopenmaps.openlayers.client.geometry.Polygon[polygons.size()];
                for (int i = 0; i < polygons.size(); i++) {
                    if (!polygons.get(i).isPoint) {
                        int count = 1;
                        if (polygons.get(i).interior != null) {
                            count += polygons.get(i).interior.size();
                        }
                        org.gwtopenmaps.openlayers.client.geometry.LinearRing[] lr = new org.gwtopenmaps.openlayers.client.geometry.LinearRing[count];
                        lr[0] = getRing(polygons.get(i).exterior);
                        for (int j = 1; j < lr.length; j++) {
                            lr[j] = getRing(polygons.get(i).interior.get(j - 1));
                        }

                        p[i] = new org.gwtopenmaps.openlayers.client.geometry.Polygon(lr);
                        
                    }
                }



                MultiPolygon mp = new MultiPolygon(p);
                
                mp.transform(DEFAULT_PROJECTION, new Projection(map.getProjection()));

                vf = new VectorFeature(mp, pointStyle);


                vf.setFeatureId("community" + communityID);
                vf.setPopup(new AnchoredBubble("marker-info",
                        vf.getCenterLonLat(),
                        new Size(130, 40),
                        "<p>You Clicked On<BR /><B>" + name + "</b></p>",
                        new Icon("", new Size(0, 0), new Pixel(0, 0)),
                        true));

                markerLayer.addFeature(vf);
            }

        }


        showAllVF();
    }

    public void showAllVF() {
        Bounds b = markerLayer.getDataExtent();

        if (b != null) {
            map.setCenter(b.getCenterLonLat());

            map.zoomToExtent(b);
        } else {
            map.zoomTo(0);
            map.setCenter(new LonLat(0, 0));
        }
    }
}
