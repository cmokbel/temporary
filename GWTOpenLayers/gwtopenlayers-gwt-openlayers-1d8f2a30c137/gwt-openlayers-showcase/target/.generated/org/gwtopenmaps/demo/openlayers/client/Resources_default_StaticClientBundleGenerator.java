package org.gwtopenmaps.demo.openlayers.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Resources_default_StaticClientBundleGenerator implements org.gwtopenmaps.demo.openlayers.client.Resources {
  private static Resources_default_StaticClientBundleGenerator _instance0 = new Resources_default_StaticClientBundleGenerator();
  private void gwtOlLogoInitializer() {
    gwtOlLogo = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "gwtOlLogo",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(bundledImage_None),
      0, 0, 196, 50, false, false
    );
  }
  private static class gwtOlLogoInitializer {
    static {
      _instance0.gwtOlLogoInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return gwtOlLogo;
    }
  }
  public com.google.gwt.resources.client.ImageResource gwtOlLogo() {
    return gwtOlLogoInitializer.get();
  }
  private void icon_infoInitializer() {
    icon_info = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "icon_info",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(bundledImage_None),
      196, 0, 40, 40, false, false
    );
  }
  private static class icon_infoInitializer {
    static {
      _instance0.icon_infoInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return icon_info;
    }
  }
  public com.google.gwt.resources.client.ImageResource icon_info() {
    return icon_infoInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String bundledImage_None = GWT.getModuleBaseURL() + "131217F75593EA8818F3C612442B6920.cache.png";
  private static com.google.gwt.resources.client.ImageResource gwtOlLogo;
  private static com.google.gwt.resources.client.ImageResource icon_info;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      gwtOlLogo(), 
      icon_info(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("gwtOlLogo", gwtOlLogo());
        resourceMap.put("icon_info", icon_info());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'gwtOlLogo': return this.@org.gwtopenmaps.demo.openlayers.client.Resources::gwtOlLogo()();
      case 'icon_info': return this.@org.gwtopenmaps.demo.openlayers.client.Resources::icon_info()();
    }
    return null;
  }-*/;
}
