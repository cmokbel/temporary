/**
 *
 */
package org.gwtopenmaps.openlayers.client.symbolizer;

import org.gwtopenmaps.openlayers.client.util.JSObject;


/**
 * @author lorenzo
 *
 */
public class LineSymbolizerImpl
{

    public static native JSObject create(JSObject options) /*-{
        return new $wnd.OpenLayers.Symbolizer.Line(options);
    }-*/;

}
