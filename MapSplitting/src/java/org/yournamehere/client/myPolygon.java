/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yournamehere.client;

import java.io.Serializable;
import java.util.LinkedList;

/**
 *
 * @author Christian
 */
public class myPolygon implements Serializable {

    public int idPolygons;
    public myRing exterior;
    public LinkedList<myRing> interior;

    public boolean isPoint = false;
    public double lon,lat;
    
    public myPolygon() {
        interior = new LinkedList();
    }
    public myPolygon(double lon,double lat)
    {
        isPoint=true;
        this.lon=lon;
        this.lat=lat;
                
    }
    public myPolygon(myRing exterior) {
        this.exterior = exterior;
        interior = new LinkedList();
    }

    public myPolygon(myRing exterior, LinkedList<myRing> interior) {
        this.exterior = exterior;
        this.interior = interior;
    }
    public boolean isSameAs(myPolygon p)
    {
        if((p.idPolygons>0)&&(idPolygons>0)&&(p.idPolygons==idPolygons))
        {
            return true;
        }
        if(p.isPoint&&isPoint&&(p.lat==lat)&&(p.lon==lon))
            return true;
        
        return false;
                    
                    
    }
}
