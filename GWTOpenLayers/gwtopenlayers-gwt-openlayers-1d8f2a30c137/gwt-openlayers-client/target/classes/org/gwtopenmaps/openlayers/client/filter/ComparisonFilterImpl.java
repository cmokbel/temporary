package org.gwtopenmaps.openlayers.client.filter;

import org.gwtopenmaps.openlayers.client.util.JSObject;


/**
 * @author Frank Wynants/www.fks.be
 */
public class ComparisonFilterImpl
{

    public static native JSObject create() /*-{
        return new $wnd.OpenLayers.Filter.Comparison();
    }-*/;


}
