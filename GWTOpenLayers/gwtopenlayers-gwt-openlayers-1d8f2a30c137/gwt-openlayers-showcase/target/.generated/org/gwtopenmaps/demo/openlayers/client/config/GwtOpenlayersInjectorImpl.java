package org.gwtopenmaps.demo.openlayers.client.config;

import com.google.gwt.core.client.GWT;

public class GwtOpenlayersInjectorImpl implements org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjector {
  public org.gwtopenmaps.demo.openlayers.client.puregwt.ShowcaseEventBus getEventBus() {
    return get_Key$type$org$gwtopenmaps$demo$openlayers$client$puregwt$ShowcaseEventBus$_annotation$$none$$();
  }
  
  public org.gwtopenmaps.demo.openlayers.client.components.store.ShowcaseExampleStore getExampleStore() {
    return get_Key$type$org$gwtopenmaps$demo$openlayers$client$components$store$ShowcaseExampleStore$_annotation$$none$$();
  }
  
  public org.gwtopenmaps.demo.openlayers.client.components.ShowcaseExamplePanel getShowcaseExamplePanel() {
    return get_Key$type$org$gwtopenmaps$demo$openlayers$client$components$ShowcaseExamplePanel$_annotation$$none$$();
  }
  
  public org.gwtopenmaps.demo.openlayers.client.components.ShowcaseSearchPanel getShowcaseSearchPanel() {
    return get_Key$type$org$gwtopenmaps$demo$openlayers$client$components$ShowcaseSearchPanel$_annotation$$none$$();
  }
  
  public org.gwtopenmaps.demo.openlayers.client.components.ShowcaseTopPanel getShowcaseTopPanel() {
    return get_Key$type$org$gwtopenmaps$demo$openlayers$client$components$ShowcaseTopPanel$_annotation$$none$$();
  }
  
  
  /**
   * Binding for org.gwtopenmaps.demo.openlayers.client.components.store.ShowcaseExampleStore declared at:
   *   Implicit binding for Key[type=org.gwtopenmaps.demo.openlayers.client.components.store.ShowcaseExampleStore, annotation=[none]]
   */
  private void memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$components$store$ShowcaseExampleStore$_annotation$$none$$(org.gwtopenmaps.demo.openlayers.client.components.store.ShowcaseExampleStore injectee) {
    
  }
  
  private org.gwtopenmaps.demo.openlayers.client.components.store.ShowcaseExampleStore create_Key$type$org$gwtopenmaps$demo$openlayers$client$components$store$ShowcaseExampleStore$_annotation$$none$$() {
    Object created = GWT.create(org.gwtopenmaps.demo.openlayers.client.components.store.ShowcaseExampleStore.class);
    assert created instanceof org.gwtopenmaps.demo.openlayers.client.components.store.ShowcaseExampleStore;
    org.gwtopenmaps.demo.openlayers.client.components.store.ShowcaseExampleStore result = (org.gwtopenmaps.demo.openlayers.client.components.store.ShowcaseExampleStore) created;
    
    memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$components$store$ShowcaseExampleStore$_annotation$$none$$(result);
    return result;
  }
  
  private org.gwtopenmaps.demo.openlayers.client.components.store.ShowcaseExampleStore singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$components$store$ShowcaseExampleStore$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   Implicit binding for Key[type=org.gwtopenmaps.demo.openlayers.client.components.store.ShowcaseExampleStore, annotation=[none]]
   */
  private org.gwtopenmaps.demo.openlayers.client.components.store.ShowcaseExampleStore get_Key$type$org$gwtopenmaps$demo$openlayers$client$components$store$ShowcaseExampleStore$_annotation$$none$$() {
    if (singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$components$store$ShowcaseExampleStore$_annotation$$none$$ == null) {
      singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$components$store$ShowcaseExampleStore$_annotation$$none$$ = create_Key$type$org$gwtopenmaps$demo$openlayers$client$components$store$ShowcaseExampleStore$_annotation$$none$$();
    }
    return singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$components$store$ShowcaseExampleStore$_annotation$$none$$;
  }
  
  
  /**
   * Binding for org.gwtopenmaps.demo.openlayers.client.examples.basictms.BasicTmsExample declared at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:76)
   */
  private void memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$basictms$BasicTmsExample$_annotation$$none$$(org.gwtopenmaps.demo.openlayers.client.examples.basictms.BasicTmsExample injectee) {
    
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.basictms.BasicTmsExample org$gwtopenmaps$demo$openlayers$client$examples$basictms$BasicTmsExample_BasicTmsExample_methodInjection(org.gwtopenmaps.demo.openlayers.client.components.store.ShowcaseExampleStore _0) {
    return new org.gwtopenmaps.demo.openlayers.client.examples.basictms.BasicTmsExample(_0);
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.basictms.BasicTmsExample create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$basictms$BasicTmsExample$_annotation$$none$$() {
    org.gwtopenmaps.demo.openlayers.client.examples.basictms.BasicTmsExample result = org$gwtopenmaps$demo$openlayers$client$examples$basictms$BasicTmsExample_BasicTmsExample_methodInjection(get_Key$type$org$gwtopenmaps$demo$openlayers$client$components$store$ShowcaseExampleStore$_annotation$$none$$());
    memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$basictms$BasicTmsExample$_annotation$$none$$(result);
    return result;
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.basictms.BasicTmsExample singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$basictms$BasicTmsExample$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:76)
   */
  private org.gwtopenmaps.demo.openlayers.client.examples.basictms.BasicTmsExample get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$basictms$BasicTmsExample$_annotation$$none$$() {
    if (singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$basictms$BasicTmsExample$_annotation$$none$$ == null) {
      singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$basictms$BasicTmsExample$_annotation$$none$$ = create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$basictms$BasicTmsExample$_annotation$$none$$();
    }
    return singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$basictms$BasicTmsExample$_annotation$$none$$;
  }
  
  
  /**
   * Binding for org.gwtopenmaps.demo.openlayers.client.examples.wmsrefresh.WmsRefreshExample declared at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:90)
   */
  private void memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$wmsrefresh$WmsRefreshExample$_annotation$$none$$(org.gwtopenmaps.demo.openlayers.client.examples.wmsrefresh.WmsRefreshExample injectee) {
    
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.wmsrefresh.WmsRefreshExample org$gwtopenmaps$demo$openlayers$client$examples$wmsrefresh$WmsRefreshExample_WmsRefreshExample_methodInjection(org.gwtopenmaps.demo.openlayers.client.components.store.ShowcaseExampleStore _0) {
    return new org.gwtopenmaps.demo.openlayers.client.examples.wmsrefresh.WmsRefreshExample(_0);
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.wmsrefresh.WmsRefreshExample create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$wmsrefresh$WmsRefreshExample$_annotation$$none$$() {
    org.gwtopenmaps.demo.openlayers.client.examples.wmsrefresh.WmsRefreshExample result = org$gwtopenmaps$demo$openlayers$client$examples$wmsrefresh$WmsRefreshExample_WmsRefreshExample_methodInjection(get_Key$type$org$gwtopenmaps$demo$openlayers$client$components$store$ShowcaseExampleStore$_annotation$$none$$());
    memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$wmsrefresh$WmsRefreshExample$_annotation$$none$$(result);
    return result;
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.wmsrefresh.WmsRefreshExample singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$wmsrefresh$WmsRefreshExample$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:90)
   */
  private org.gwtopenmaps.demo.openlayers.client.examples.wmsrefresh.WmsRefreshExample get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$wmsrefresh$WmsRefreshExample$_annotation$$none$$() {
    if (singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$wmsrefresh$WmsRefreshExample$_annotation$$none$$ == null) {
      singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$wmsrefresh$WmsRefreshExample$_annotation$$none$$ = create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$wmsrefresh$WmsRefreshExample$_annotation$$none$$();
    }
    return singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$wmsrefresh$WmsRefreshExample$_annotation$$none$$;
  }
  
  
  /**
   * Binding for org.gwtopenmaps.demo.openlayers.client.examples.vector.VectorExample declared at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:88)
   */
  private void memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$vector$VectorExample$_annotation$$none$$(org.gwtopenmaps.demo.openlayers.client.examples.vector.VectorExample injectee) {
    
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.vector.VectorExample org$gwtopenmaps$demo$openlayers$client$examples$vector$VectorExample_VectorExample_methodInjection(org.gwtopenmaps.demo.openlayers.client.components.store.ShowcaseExampleStore _0) {
    return new org.gwtopenmaps.demo.openlayers.client.examples.vector.VectorExample(_0);
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.vector.VectorExample create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$vector$VectorExample$_annotation$$none$$() {
    org.gwtopenmaps.demo.openlayers.client.examples.vector.VectorExample result = org$gwtopenmaps$demo$openlayers$client$examples$vector$VectorExample_VectorExample_methodInjection(get_Key$type$org$gwtopenmaps$demo$openlayers$client$components$store$ShowcaseExampleStore$_annotation$$none$$());
    memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$vector$VectorExample$_annotation$$none$$(result);
    return result;
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.vector.VectorExample singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$vector$VectorExample$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:88)
   */
  private org.gwtopenmaps.demo.openlayers.client.examples.vector.VectorExample get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$vector$VectorExample$_annotation$$none$$() {
    if (singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$vector$VectorExample$_annotation$$none$$ == null) {
      singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$vector$VectorExample$_annotation$$none$$ = create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$vector$VectorExample$_annotation$$none$$();
    }
    return singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$vector$VectorExample$_annotation$$none$$;
  }
  
  
  /**
   * Binding for org.gwtopenmaps.demo.openlayers.client.examples.cql.CqlWmsExample declared at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:93)
   */
  private void memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$cql$CqlWmsExample$_annotation$$none$$(org.gwtopenmaps.demo.openlayers.client.examples.cql.CqlWmsExample injectee) {
    
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.cql.CqlWmsExample org$gwtopenmaps$demo$openlayers$client$examples$cql$CqlWmsExample_CqlWmsExample_methodInjection(org.gwtopenmaps.demo.openlayers.client.components.store.ShowcaseExampleStore _0) {
    return new org.gwtopenmaps.demo.openlayers.client.examples.cql.CqlWmsExample(_0);
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.cql.CqlWmsExample create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$cql$CqlWmsExample$_annotation$$none$$() {
    org.gwtopenmaps.demo.openlayers.client.examples.cql.CqlWmsExample result = org$gwtopenmaps$demo$openlayers$client$examples$cql$CqlWmsExample_CqlWmsExample_methodInjection(get_Key$type$org$gwtopenmaps$demo$openlayers$client$components$store$ShowcaseExampleStore$_annotation$$none$$());
    memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$cql$CqlWmsExample$_annotation$$none$$(result);
    return result;
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.cql.CqlWmsExample singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$cql$CqlWmsExample$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:93)
   */
  private org.gwtopenmaps.demo.openlayers.client.examples.cql.CqlWmsExample get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$cql$CqlWmsExample$_annotation$$none$$() {
    if (singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$cql$CqlWmsExample$_annotation$$none$$ == null) {
      singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$cql$CqlWmsExample$_annotation$$none$$ = create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$cql$CqlWmsExample$_annotation$$none$$();
    }
    return singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$cql$CqlWmsExample$_annotation$$none$$;
  }
  
  
  /**
   * Binding for org.gwtopenmaps.demo.openlayers.client.components.ShowcaseExamplePanel declared at:
   *   Implicit binding for Key[type=org.gwtopenmaps.demo.openlayers.client.components.ShowcaseExamplePanel, annotation=[none]]
   */
  private void memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$components$ShowcaseExamplePanel$_annotation$$none$$(org.gwtopenmaps.demo.openlayers.client.components.ShowcaseExamplePanel injectee) {
    
  }
  
  private org.gwtopenmaps.demo.openlayers.client.components.ShowcaseExamplePanel org$gwtopenmaps$demo$openlayers$client$components$ShowcaseExamplePanel_ShowcaseExamplePanel_methodInjection(org.gwtopenmaps.demo.openlayers.client.components.store.ShowcaseExampleStore _0, org.gwtopenmaps.demo.openlayers.client.puregwt.ShowcaseEventBus _1) {
    return new org.gwtopenmaps.demo.openlayers.client.components.ShowcaseExamplePanel(_0, _1);
  }
  
  private org.gwtopenmaps.demo.openlayers.client.components.ShowcaseExamplePanel create_Key$type$org$gwtopenmaps$demo$openlayers$client$components$ShowcaseExamplePanel$_annotation$$none$$() {
    org.gwtopenmaps.demo.openlayers.client.components.ShowcaseExamplePanel result = org$gwtopenmaps$demo$openlayers$client$components$ShowcaseExamplePanel_ShowcaseExamplePanel_methodInjection(get_Key$type$org$gwtopenmaps$demo$openlayers$client$components$store$ShowcaseExampleStore$_annotation$$none$$(), get_Key$type$org$gwtopenmaps$demo$openlayers$client$puregwt$ShowcaseEventBus$_annotation$$none$$());
    memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$components$ShowcaseExamplePanel$_annotation$$none$$(result);
    return result;
  }
  
  private org.gwtopenmaps.demo.openlayers.client.components.ShowcaseExamplePanel singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$components$ShowcaseExamplePanel$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   Implicit binding for Key[type=org.gwtopenmaps.demo.openlayers.client.components.ShowcaseExamplePanel, annotation=[none]]
   */
  private org.gwtopenmaps.demo.openlayers.client.components.ShowcaseExamplePanel get_Key$type$org$gwtopenmaps$demo$openlayers$client$components$ShowcaseExamplePanel$_annotation$$none$$() {
    if (singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$components$ShowcaseExamplePanel$_annotation$$none$$ == null) {
      singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$components$ShowcaseExamplePanel$_annotation$$none$$ = create_Key$type$org$gwtopenmaps$demo$openlayers$client$components$ShowcaseExamplePanel$_annotation$$none$$();
    }
    return singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$components$ShowcaseExamplePanel$_annotation$$none$$;
  }
  
  
  /**
   * Binding for org.gwtopenmaps.demo.openlayers.client.examples.linestring2multilinestring.LineString2MultiLineStringExample declared at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:80)
   */
  private void memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$linestring2multilinestring$LineString2MultiLineStringExample$_annotation$$none$$(org.gwtopenmaps.demo.openlayers.client.examples.linestring2multilinestring.LineString2MultiLineStringExample injectee) {
    
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.linestring2multilinestring.LineString2MultiLineStringExample org$gwtopenmaps$demo$openlayers$client$examples$linestring2multilinestring$LineString2MultiLineStringExample_LineString2MultiLineStringExample_methodInjection(org.gwtopenmaps.demo.openlayers.client.components.store.ShowcaseExampleStore _0) {
    return new org.gwtopenmaps.demo.openlayers.client.examples.linestring2multilinestring.LineString2MultiLineStringExample(_0);
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.linestring2multilinestring.LineString2MultiLineStringExample create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$linestring2multilinestring$LineString2MultiLineStringExample$_annotation$$none$$() {
    org.gwtopenmaps.demo.openlayers.client.examples.linestring2multilinestring.LineString2MultiLineStringExample result = org$gwtopenmaps$demo$openlayers$client$examples$linestring2multilinestring$LineString2MultiLineStringExample_LineString2MultiLineStringExample_methodInjection(get_Key$type$org$gwtopenmaps$demo$openlayers$client$components$store$ShowcaseExampleStore$_annotation$$none$$());
    memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$linestring2multilinestring$LineString2MultiLineStringExample$_annotation$$none$$(result);
    return result;
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.linestring2multilinestring.LineString2MultiLineStringExample singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$linestring2multilinestring$LineString2MultiLineStringExample$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:80)
   */
  private org.gwtopenmaps.demo.openlayers.client.examples.linestring2multilinestring.LineString2MultiLineStringExample get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$linestring2multilinestring$LineString2MultiLineStringExample$_annotation$$none$$() {
    if (singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$linestring2multilinestring$LineString2MultiLineStringExample$_annotation$$none$$ == null) {
      singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$linestring2multilinestring$LineString2MultiLineStringExample$_annotation$$none$$ = create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$linestring2multilinestring$LineString2MultiLineStringExample$_annotation$$none$$();
    }
    return singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$linestring2multilinestring$LineString2MultiLineStringExample$_annotation$$none$$;
  }
  
  
  /**
   * Binding for org.gwtopenmaps.demo.openlayers.client.examples.measure.MeasureExample declared at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:82)
   */
  private void memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$measure$MeasureExample$_annotation$$none$$(org.gwtopenmaps.demo.openlayers.client.examples.measure.MeasureExample injectee) {
    
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.measure.MeasureExample org$gwtopenmaps$demo$openlayers$client$examples$measure$MeasureExample_MeasureExample_methodInjection(org.gwtopenmaps.demo.openlayers.client.components.store.ShowcaseExampleStore _0) {
    return new org.gwtopenmaps.demo.openlayers.client.examples.measure.MeasureExample(_0);
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.measure.MeasureExample create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$measure$MeasureExample$_annotation$$none$$() {
    org.gwtopenmaps.demo.openlayers.client.examples.measure.MeasureExample result = org$gwtopenmaps$demo$openlayers$client$examples$measure$MeasureExample_MeasureExample_methodInjection(get_Key$type$org$gwtopenmaps$demo$openlayers$client$components$store$ShowcaseExampleStore$_annotation$$none$$());
    memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$measure$MeasureExample$_annotation$$none$$(result);
    return result;
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.measure.MeasureExample singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$measure$MeasureExample$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:82)
   */
  private org.gwtopenmaps.demo.openlayers.client.examples.measure.MeasureExample get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$measure$MeasureExample$_annotation$$none$$() {
    if (singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$measure$MeasureExample$_annotation$$none$$ == null) {
      singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$measure$MeasureExample$_annotation$$none$$ = create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$measure$MeasureExample$_annotation$$none$$();
    }
    return singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$measure$MeasureExample$_annotation$$none$$;
  }
  
  
  /**
   * Binding for org.gwtopenmaps.demo.openlayers.client.examples.click.ClickExample declared at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:103)
   */
  private void memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$click$ClickExample$_annotation$$none$$(org.gwtopenmaps.demo.openlayers.client.examples.click.ClickExample injectee) {
    
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.click.ClickExample org$gwtopenmaps$demo$openlayers$client$examples$click$ClickExample_ClickExample_methodInjection(org.gwtopenmaps.demo.openlayers.client.components.store.ShowcaseExampleStore _0) {
    return new org.gwtopenmaps.demo.openlayers.client.examples.click.ClickExample(_0);
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.click.ClickExample create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$click$ClickExample$_annotation$$none$$() {
    org.gwtopenmaps.demo.openlayers.client.examples.click.ClickExample result = org$gwtopenmaps$demo$openlayers$client$examples$click$ClickExample_ClickExample_methodInjection(get_Key$type$org$gwtopenmaps$demo$openlayers$client$components$store$ShowcaseExampleStore$_annotation$$none$$());
    memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$click$ClickExample$_annotation$$none$$(result);
    return result;
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.click.ClickExample singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$click$ClickExample$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:103)
   */
  private org.gwtopenmaps.demo.openlayers.client.examples.click.ClickExample get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$click$ClickExample$_annotation$$none$$() {
    if (singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$click$ClickExample$_annotation$$none$$ == null) {
      singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$click$ClickExample$_annotation$$none$$ = create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$click$ClickExample$_annotation$$none$$();
    }
    return singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$click$ClickExample$_annotation$$none$$;
  }
  
  
  /**
   * Binding for org.gwtopenmaps.demo.openlayers.client.examples.kml.KmlExample declared at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:96)
   */
  private void memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$kml$KmlExample$_annotation$$none$$(org.gwtopenmaps.demo.openlayers.client.examples.kml.KmlExample injectee) {
    
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.kml.KmlExample org$gwtopenmaps$demo$openlayers$client$examples$kml$KmlExample_KmlExample_methodInjection(org.gwtopenmaps.demo.openlayers.client.components.store.ShowcaseExampleStore _0) {
    return new org.gwtopenmaps.demo.openlayers.client.examples.kml.KmlExample(_0);
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.kml.KmlExample create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$kml$KmlExample$_annotation$$none$$() {
    org.gwtopenmaps.demo.openlayers.client.examples.kml.KmlExample result = org$gwtopenmaps$demo$openlayers$client$examples$kml$KmlExample_KmlExample_methodInjection(get_Key$type$org$gwtopenmaps$demo$openlayers$client$components$store$ShowcaseExampleStore$_annotation$$none$$());
    memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$kml$KmlExample$_annotation$$none$$(result);
    return result;
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.kml.KmlExample singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$kml$KmlExample$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:96)
   */
  private org.gwtopenmaps.demo.openlayers.client.examples.kml.KmlExample get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$kml$KmlExample$_annotation$$none$$() {
    if (singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$kml$KmlExample$_annotation$$none$$ == null) {
      singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$kml$KmlExample$_annotation$$none$$ = create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$kml$KmlExample$_annotation$$none$$();
    }
    return singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$kml$KmlExample$_annotation$$none$$;
  }
  
  
  /**
   * Binding for org.gwtopenmaps.demo.openlayers.client.components.ShowcaseSearchPanel declared at:
   *   Implicit binding for Key[type=org.gwtopenmaps.demo.openlayers.client.components.ShowcaseSearchPanel, annotation=[none]]
   */
  private void memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$components$ShowcaseSearchPanel$_annotation$$none$$(org.gwtopenmaps.demo.openlayers.client.components.ShowcaseSearchPanel injectee) {
    
  }
  
  private org.gwtopenmaps.demo.openlayers.client.components.ShowcaseSearchPanel org$gwtopenmaps$demo$openlayers$client$components$ShowcaseSearchPanel_ShowcaseSearchPanel_methodInjection(org.gwtopenmaps.demo.openlayers.client.puregwt.ShowcaseEventBus _0) {
    return new org.gwtopenmaps.demo.openlayers.client.components.ShowcaseSearchPanel(_0);
  }
  
  private org.gwtopenmaps.demo.openlayers.client.components.ShowcaseSearchPanel create_Key$type$org$gwtopenmaps$demo$openlayers$client$components$ShowcaseSearchPanel$_annotation$$none$$() {
    org.gwtopenmaps.demo.openlayers.client.components.ShowcaseSearchPanel result = org$gwtopenmaps$demo$openlayers$client$components$ShowcaseSearchPanel_ShowcaseSearchPanel_methodInjection(get_Key$type$org$gwtopenmaps$demo$openlayers$client$puregwt$ShowcaseEventBus$_annotation$$none$$());
    memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$components$ShowcaseSearchPanel$_annotation$$none$$(result);
    return result;
  }
  
  private org.gwtopenmaps.demo.openlayers.client.components.ShowcaseSearchPanel singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$components$ShowcaseSearchPanel$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   Implicit binding for Key[type=org.gwtopenmaps.demo.openlayers.client.components.ShowcaseSearchPanel, annotation=[none]]
   */
  private org.gwtopenmaps.demo.openlayers.client.components.ShowcaseSearchPanel get_Key$type$org$gwtopenmaps$demo$openlayers$client$components$ShowcaseSearchPanel$_annotation$$none$$() {
    if (singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$components$ShowcaseSearchPanel$_annotation$$none$$ == null) {
      singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$components$ShowcaseSearchPanel$_annotation$$none$$ = create_Key$type$org$gwtopenmaps$demo$openlayers$client$components$ShowcaseSearchPanel$_annotation$$none$$();
    }
    return singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$components$ShowcaseSearchPanel$_annotation$$none$$;
  }
  
  
  /**
   * Binding for org.gwtopenmaps.demo.openlayers.client.examples.wmswfsedit.WmsWfsEditExample declared at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:92)
   */
  private void memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$wmswfsedit$WmsWfsEditExample$_annotation$$none$$(org.gwtopenmaps.demo.openlayers.client.examples.wmswfsedit.WmsWfsEditExample injectee) {
    
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.wmswfsedit.WmsWfsEditExample org$gwtopenmaps$demo$openlayers$client$examples$wmswfsedit$WmsWfsEditExample_WmsWfsEditExample_methodInjection(org.gwtopenmaps.demo.openlayers.client.components.store.ShowcaseExampleStore _0) {
    return new org.gwtopenmaps.demo.openlayers.client.examples.wmswfsedit.WmsWfsEditExample(_0);
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.wmswfsedit.WmsWfsEditExample create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$wmswfsedit$WmsWfsEditExample$_annotation$$none$$() {
    org.gwtopenmaps.demo.openlayers.client.examples.wmswfsedit.WmsWfsEditExample result = org$gwtopenmaps$demo$openlayers$client$examples$wmswfsedit$WmsWfsEditExample_WmsWfsEditExample_methodInjection(get_Key$type$org$gwtopenmaps$demo$openlayers$client$components$store$ShowcaseExampleStore$_annotation$$none$$());
    memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$wmswfsedit$WmsWfsEditExample$_annotation$$none$$(result);
    return result;
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.wmswfsedit.WmsWfsEditExample singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$wmswfsedit$WmsWfsEditExample$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:92)
   */
  private org.gwtopenmaps.demo.openlayers.client.examples.wmswfsedit.WmsWfsEditExample get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$wmswfsedit$WmsWfsEditExample$_annotation$$none$$() {
    if (singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$wmswfsedit$WmsWfsEditExample$_annotation$$none$$ == null) {
      singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$wmswfsedit$WmsWfsEditExample$_annotation$$none$$ = create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$wmswfsedit$WmsWfsEditExample$_annotation$$none$$();
    }
    return singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$wmswfsedit$WmsWfsEditExample$_annotation$$none$$;
  }
  
  
  /**
   * Binding for org.gwtopenmaps.demo.openlayers.client.examples.TransformFeature.TransformFeatureExample declared at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:72)
   */
  private void memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$TransformFeature$TransformFeatureExample$_annotation$$none$$(org.gwtopenmaps.demo.openlayers.client.examples.TransformFeature.TransformFeatureExample injectee) {
    
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.TransformFeature.TransformFeatureExample org$gwtopenmaps$demo$openlayers$client$examples$TransformFeature$TransformFeatureExample_TransformFeatureExample_methodInjection(org.gwtopenmaps.demo.openlayers.client.components.store.ShowcaseExampleStore _0) {
    return new org.gwtopenmaps.demo.openlayers.client.examples.TransformFeature.TransformFeatureExample(_0);
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.TransformFeature.TransformFeatureExample create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$TransformFeature$TransformFeatureExample$_annotation$$none$$() {
    org.gwtopenmaps.demo.openlayers.client.examples.TransformFeature.TransformFeatureExample result = org$gwtopenmaps$demo$openlayers$client$examples$TransformFeature$TransformFeatureExample_TransformFeatureExample_methodInjection(get_Key$type$org$gwtopenmaps$demo$openlayers$client$components$store$ShowcaseExampleStore$_annotation$$none$$());
    memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$TransformFeature$TransformFeatureExample$_annotation$$none$$(result);
    return result;
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.TransformFeature.TransformFeatureExample singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$TransformFeature$TransformFeatureExample$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:72)
   */
  private org.gwtopenmaps.demo.openlayers.client.examples.TransformFeature.TransformFeatureExample get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$TransformFeature$TransformFeatureExample$_annotation$$none$$() {
    if (singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$TransformFeature$TransformFeatureExample$_annotation$$none$$ == null) {
      singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$TransformFeature$TransformFeatureExample$_annotation$$none$$ = create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$TransformFeature$TransformFeatureExample$_annotation$$none$$();
    }
    return singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$TransformFeature$TransformFeatureExample$_annotation$$none$$;
  }
  
  
  /**
   * Binding for org.gwtopenmaps.demo.openlayers.client.examples.wmsfeatureinfo.WmsFeatureInfoExample declared at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:89)
   */
  private void memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$wmsfeatureinfo$WmsFeatureInfoExample$_annotation$$none$$(org.gwtopenmaps.demo.openlayers.client.examples.wmsfeatureinfo.WmsFeatureInfoExample injectee) {
    
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.wmsfeatureinfo.WmsFeatureInfoExample org$gwtopenmaps$demo$openlayers$client$examples$wmsfeatureinfo$WmsFeatureInfoExample_WmsFeatureInfoExample_methodInjection(org.gwtopenmaps.demo.openlayers.client.components.store.ShowcaseExampleStore _0) {
    return new org.gwtopenmaps.demo.openlayers.client.examples.wmsfeatureinfo.WmsFeatureInfoExample(_0);
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.wmsfeatureinfo.WmsFeatureInfoExample create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$wmsfeatureinfo$WmsFeatureInfoExample$_annotation$$none$$() {
    org.gwtopenmaps.demo.openlayers.client.examples.wmsfeatureinfo.WmsFeatureInfoExample result = org$gwtopenmaps$demo$openlayers$client$examples$wmsfeatureinfo$WmsFeatureInfoExample_WmsFeatureInfoExample_methodInjection(get_Key$type$org$gwtopenmaps$demo$openlayers$client$components$store$ShowcaseExampleStore$_annotation$$none$$());
    memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$wmsfeatureinfo$WmsFeatureInfoExample$_annotation$$none$$(result);
    return result;
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.wmsfeatureinfo.WmsFeatureInfoExample singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$wmsfeatureinfo$WmsFeatureInfoExample$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:89)
   */
  private org.gwtopenmaps.demo.openlayers.client.examples.wmsfeatureinfo.WmsFeatureInfoExample get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$wmsfeatureinfo$WmsFeatureInfoExample$_annotation$$none$$() {
    if (singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$wmsfeatureinfo$WmsFeatureInfoExample$_annotation$$none$$ == null) {
      singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$wmsfeatureinfo$WmsFeatureInfoExample$_annotation$$none$$ = create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$wmsfeatureinfo$WmsFeatureInfoExample$_annotation$$none$$();
    }
    return singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$wmsfeatureinfo$WmsFeatureInfoExample$_annotation$$none$$;
  }
  
  
  /**
   * Binding for org.gwtopenmaps.demo.openlayers.client.puregwt.ShowcaseEventBus declared at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:66)
   */
  private org.gwtopenmaps.demo.openlayers.client.puregwt.ShowcaseEventBus create_Key$type$org$gwtopenmaps$demo$openlayers$client$puregwt$ShowcaseEventBus$_annotation$$none$$() {
    return get_Key$type$org$gwtopenmaps$demo$openlayers$client$puregwt$ShowcaseEventBusImpl$_annotation$$none$$();
  }
  
  private org.gwtopenmaps.demo.openlayers.client.puregwt.ShowcaseEventBus singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$puregwt$ShowcaseEventBus$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:66)
   */
  private org.gwtopenmaps.demo.openlayers.client.puregwt.ShowcaseEventBus get_Key$type$org$gwtopenmaps$demo$openlayers$client$puregwt$ShowcaseEventBus$_annotation$$none$$() {
    if (singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$puregwt$ShowcaseEventBus$_annotation$$none$$ == null) {
      singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$puregwt$ShowcaseEventBus$_annotation$$none$$ = create_Key$type$org$gwtopenmaps$demo$openlayers$client$puregwt$ShowcaseEventBus$_annotation$$none$$();
    }
    return singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$puregwt$ShowcaseEventBus$_annotation$$none$$;
  }
  
  
  /**
   * Binding for com.google.gwt.user.client.ui.Image declared at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:69)
   */
  private com.google.gwt.user.client.ui.Image create_Key$type$com$google$gwt$user$client$ui$Image$_annotation$$none$$() {
    return get_Key$type$org$gwtopenmaps$demo$openlayers$client$config$provider$ShowcaseLogoProvider$_annotation$$none$$().get();
  }
  
  private com.google.gwt.user.client.ui.Image singleton_Key$type$com$google$gwt$user$client$ui$Image$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:69)
   */
  private com.google.gwt.user.client.ui.Image get_Key$type$com$google$gwt$user$client$ui$Image$_annotation$$none$$() {
    if (singleton_Key$type$com$google$gwt$user$client$ui$Image$_annotation$$none$$ == null) {
      singleton_Key$type$com$google$gwt$user$client$ui$Image$_annotation$$none$$ = create_Key$type$com$google$gwt$user$client$ui$Image$_annotation$$none$$();
    }
    return singleton_Key$type$com$google$gwt$user$client$ui$Image$_annotation$$none$$;
  }
  
  
  /**
   * Binding for org.gwtopenmaps.demo.openlayers.client.examples.wfshoverhighlight.WfsHoverHighlightExample declared at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:95)
   */
  private void memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$wfshoverhighlight$WfsHoverHighlightExample$_annotation$$none$$(org.gwtopenmaps.demo.openlayers.client.examples.wfshoverhighlight.WfsHoverHighlightExample injectee) {
    
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.wfshoverhighlight.WfsHoverHighlightExample org$gwtopenmaps$demo$openlayers$client$examples$wfshoverhighlight$WfsHoverHighlightExample_WfsHoverHighlightExample_methodInjection(org.gwtopenmaps.demo.openlayers.client.components.store.ShowcaseExampleStore _0) {
    return new org.gwtopenmaps.demo.openlayers.client.examples.wfshoverhighlight.WfsHoverHighlightExample(_0);
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.wfshoverhighlight.WfsHoverHighlightExample create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$wfshoverhighlight$WfsHoverHighlightExample$_annotation$$none$$() {
    org.gwtopenmaps.demo.openlayers.client.examples.wfshoverhighlight.WfsHoverHighlightExample result = org$gwtopenmaps$demo$openlayers$client$examples$wfshoverhighlight$WfsHoverHighlightExample_WfsHoverHighlightExample_methodInjection(get_Key$type$org$gwtopenmaps$demo$openlayers$client$components$store$ShowcaseExampleStore$_annotation$$none$$());
    memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$wfshoverhighlight$WfsHoverHighlightExample$_annotation$$none$$(result);
    return result;
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.wfshoverhighlight.WfsHoverHighlightExample singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$wfshoverhighlight$WfsHoverHighlightExample$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:95)
   */
  private org.gwtopenmaps.demo.openlayers.client.examples.wfshoverhighlight.WfsHoverHighlightExample get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$wfshoverhighlight$WfsHoverHighlightExample$_annotation$$none$$() {
    if (singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$wfshoverhighlight$WfsHoverHighlightExample$_annotation$$none$$ == null) {
      singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$wfshoverhighlight$WfsHoverHighlightExample$_annotation$$none$$ = create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$wfshoverhighlight$WfsHoverHighlightExample$_annotation$$none$$();
    }
    return singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$wfshoverhighlight$WfsHoverHighlightExample$_annotation$$none$$;
  }
  
  
  /**
   * Binding for org.gwtopenmaps.demo.openlayers.client.examples.canceldrawing.CancelDrawingExample declared at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:77)
   */
  private void memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$canceldrawing$CancelDrawingExample$_annotation$$none$$(org.gwtopenmaps.demo.openlayers.client.examples.canceldrawing.CancelDrawingExample injectee) {
    
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.canceldrawing.CancelDrawingExample org$gwtopenmaps$demo$openlayers$client$examples$canceldrawing$CancelDrawingExample_CancelDrawingExample_methodInjection(org.gwtopenmaps.demo.openlayers.client.components.store.ShowcaseExampleStore _0) {
    return new org.gwtopenmaps.demo.openlayers.client.examples.canceldrawing.CancelDrawingExample(_0);
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.canceldrawing.CancelDrawingExample create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$canceldrawing$CancelDrawingExample$_annotation$$none$$() {
    org.gwtopenmaps.demo.openlayers.client.examples.canceldrawing.CancelDrawingExample result = org$gwtopenmaps$demo$openlayers$client$examples$canceldrawing$CancelDrawingExample_CancelDrawingExample_methodInjection(get_Key$type$org$gwtopenmaps$demo$openlayers$client$components$store$ShowcaseExampleStore$_annotation$$none$$());
    memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$canceldrawing$CancelDrawingExample$_annotation$$none$$(result);
    return result;
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.canceldrawing.CancelDrawingExample singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$canceldrawing$CancelDrawingExample$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:77)
   */
  private org.gwtopenmaps.demo.openlayers.client.examples.canceldrawing.CancelDrawingExample get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$canceldrawing$CancelDrawingExample$_annotation$$none$$() {
    if (singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$canceldrawing$CancelDrawingExample$_annotation$$none$$ == null) {
      singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$canceldrawing$CancelDrawingExample$_annotation$$none$$ = create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$canceldrawing$CancelDrawingExample$_annotation$$none$$();
    }
    return singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$canceldrawing$CancelDrawingExample$_annotation$$none$$;
  }
  
  
  /**
   * Binding for org.gwtopenmaps.demo.openlayers.client.examples.dragfeature.DragFeatureExample declared at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:102)
   */
  private void memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$dragfeature$DragFeatureExample$_annotation$$none$$(org.gwtopenmaps.demo.openlayers.client.examples.dragfeature.DragFeatureExample injectee) {
    
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.dragfeature.DragFeatureExample org$gwtopenmaps$demo$openlayers$client$examples$dragfeature$DragFeatureExample_DragFeatureExample_methodInjection(org.gwtopenmaps.demo.openlayers.client.components.store.ShowcaseExampleStore _0) {
    return new org.gwtopenmaps.demo.openlayers.client.examples.dragfeature.DragFeatureExample(_0);
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.dragfeature.DragFeatureExample create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$dragfeature$DragFeatureExample$_annotation$$none$$() {
    org.gwtopenmaps.demo.openlayers.client.examples.dragfeature.DragFeatureExample result = org$gwtopenmaps$demo$openlayers$client$examples$dragfeature$DragFeatureExample_DragFeatureExample_methodInjection(get_Key$type$org$gwtopenmaps$demo$openlayers$client$components$store$ShowcaseExampleStore$_annotation$$none$$());
    memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$dragfeature$DragFeatureExample$_annotation$$none$$(result);
    return result;
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.dragfeature.DragFeatureExample singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$dragfeature$DragFeatureExample$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:102)
   */
  private org.gwtopenmaps.demo.openlayers.client.examples.dragfeature.DragFeatureExample get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$dragfeature$DragFeatureExample$_annotation$$none$$() {
    if (singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$dragfeature$DragFeatureExample$_annotation$$none$$ == null) {
      singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$dragfeature$DragFeatureExample$_annotation$$none$$ = create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$dragfeature$DragFeatureExample$_annotation$$none$$();
    }
    return singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$dragfeature$DragFeatureExample$_annotation$$none$$;
  }
  
  
  /**
   * Binding for org.gwtopenmaps.demo.openlayers.client.examples.filter.FeatureIdFilterExample declared at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:99)
   */
  private void memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$filter$FeatureIdFilterExample$_annotation$$none$$(org.gwtopenmaps.demo.openlayers.client.examples.filter.FeatureIdFilterExample injectee) {
    
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.filter.FeatureIdFilterExample org$gwtopenmaps$demo$openlayers$client$examples$filter$FeatureIdFilterExample_FeatureIdFilterExample_methodInjection(org.gwtopenmaps.demo.openlayers.client.components.store.ShowcaseExampleStore _0) {
    return new org.gwtopenmaps.demo.openlayers.client.examples.filter.FeatureIdFilterExample(_0);
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.filter.FeatureIdFilterExample create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$filter$FeatureIdFilterExample$_annotation$$none$$() {
    org.gwtopenmaps.demo.openlayers.client.examples.filter.FeatureIdFilterExample result = org$gwtopenmaps$demo$openlayers$client$examples$filter$FeatureIdFilterExample_FeatureIdFilterExample_methodInjection(get_Key$type$org$gwtopenmaps$demo$openlayers$client$components$store$ShowcaseExampleStore$_annotation$$none$$());
    memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$filter$FeatureIdFilterExample$_annotation$$none$$(result);
    return result;
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.filter.FeatureIdFilterExample singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$filter$FeatureIdFilterExample$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:99)
   */
  private org.gwtopenmaps.demo.openlayers.client.examples.filter.FeatureIdFilterExample get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$filter$FeatureIdFilterExample$_annotation$$none$$() {
    if (singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$filter$FeatureIdFilterExample$_annotation$$none$$ == null) {
      singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$filter$FeatureIdFilterExample$_annotation$$none$$ = create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$filter$FeatureIdFilterExample$_annotation$$none$$();
    }
    return singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$filter$FeatureIdFilterExample$_annotation$$none$$;
  }
  
  
  /**
   * Binding for org.gwtopenmaps.demo.openlayers.client.puregwt.ShowcaseEventBusImpl declared at:
   *   Implicit binding for Key[type=org.gwtopenmaps.demo.openlayers.client.puregwt.ShowcaseEventBusImpl, annotation=[none]]
   */
  private void memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$puregwt$ShowcaseEventBusImpl$_annotation$$none$$(org.gwtopenmaps.demo.openlayers.client.puregwt.ShowcaseEventBusImpl injectee) {
    
  }
  
  private org.gwtopenmaps.demo.openlayers.client.puregwt.ShowcaseEventBusImpl create_Key$type$org$gwtopenmaps$demo$openlayers$client$puregwt$ShowcaseEventBusImpl$_annotation$$none$$() {
    Object created = GWT.create(org.gwtopenmaps.demo.openlayers.client.puregwt.ShowcaseEventBusImpl.class);
    assert created instanceof org.gwtopenmaps.demo.openlayers.client.puregwt.ShowcaseEventBusImpl;
    org.gwtopenmaps.demo.openlayers.client.puregwt.ShowcaseEventBusImpl result = (org.gwtopenmaps.demo.openlayers.client.puregwt.ShowcaseEventBusImpl) created;
    
    memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$puregwt$ShowcaseEventBusImpl$_annotation$$none$$(result);
    return result;
  }
  
  
  /**
   * Binding for org.gwtopenmaps.demo.openlayers.client.puregwt.ShowcaseEventBusImpl declared at:
   *   Implicit binding for Key[type=org.gwtopenmaps.demo.openlayers.client.puregwt.ShowcaseEventBusImpl, annotation=[none]]
   */
  private org.gwtopenmaps.demo.openlayers.client.puregwt.ShowcaseEventBusImpl get_Key$type$org$gwtopenmaps$demo$openlayers$client$puregwt$ShowcaseEventBusImpl$_annotation$$none$$() {
    return create_Key$type$org$gwtopenmaps$demo$openlayers$client$puregwt$ShowcaseEventBusImpl$_annotation$$none$$();
  }
  
  
  
  /**
   * Binding for org.gwtopenmaps.demo.openlayers.client.examples.basicgooglev3.BasicGoogleV3Example declared at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:74)
   */
  private void memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$basicgooglev3$BasicGoogleV3Example$_annotation$$none$$(org.gwtopenmaps.demo.openlayers.client.examples.basicgooglev3.BasicGoogleV3Example injectee) {
    
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.basicgooglev3.BasicGoogleV3Example org$gwtopenmaps$demo$openlayers$client$examples$basicgooglev3$BasicGoogleV3Example_BasicGoogleV3Example_methodInjection(org.gwtopenmaps.demo.openlayers.client.components.store.ShowcaseExampleStore _0) {
    return new org.gwtopenmaps.demo.openlayers.client.examples.basicgooglev3.BasicGoogleV3Example(_0);
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.basicgooglev3.BasicGoogleV3Example create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$basicgooglev3$BasicGoogleV3Example$_annotation$$none$$() {
    org.gwtopenmaps.demo.openlayers.client.examples.basicgooglev3.BasicGoogleV3Example result = org$gwtopenmaps$demo$openlayers$client$examples$basicgooglev3$BasicGoogleV3Example_BasicGoogleV3Example_methodInjection(get_Key$type$org$gwtopenmaps$demo$openlayers$client$components$store$ShowcaseExampleStore$_annotation$$none$$());
    memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$basicgooglev3$BasicGoogleV3Example$_annotation$$none$$(result);
    return result;
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.basicgooglev3.BasicGoogleV3Example singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$basicgooglev3$BasicGoogleV3Example$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:74)
   */
  private org.gwtopenmaps.demo.openlayers.client.examples.basicgooglev3.BasicGoogleV3Example get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$basicgooglev3$BasicGoogleV3Example$_annotation$$none$$() {
    if (singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$basicgooglev3$BasicGoogleV3Example$_annotation$$none$$ == null) {
      singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$basicgooglev3$BasicGoogleV3Example$_annotation$$none$$ = create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$basicgooglev3$BasicGoogleV3Example$_annotation$$none$$();
    }
    return singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$basicgooglev3$BasicGoogleV3Example$_annotation$$none$$;
  }
  
  
  /**
   * Binding for org.gwtopenmaps.demo.openlayers.client.examples.variablewfsstyle.VariableWfsStyle declared at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:94)
   */
  private void memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$variablewfsstyle$VariableWfsStyle$_annotation$$none$$(org.gwtopenmaps.demo.openlayers.client.examples.variablewfsstyle.VariableWfsStyle injectee) {
    
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.variablewfsstyle.VariableWfsStyle org$gwtopenmaps$demo$openlayers$client$examples$variablewfsstyle$VariableWfsStyle_VariableWfsStyle_methodInjection(org.gwtopenmaps.demo.openlayers.client.components.store.ShowcaseExampleStore _0) {
    return new org.gwtopenmaps.demo.openlayers.client.examples.variablewfsstyle.VariableWfsStyle(_0);
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.variablewfsstyle.VariableWfsStyle create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$variablewfsstyle$VariableWfsStyle$_annotation$$none$$() {
    org.gwtopenmaps.demo.openlayers.client.examples.variablewfsstyle.VariableWfsStyle result = org$gwtopenmaps$demo$openlayers$client$examples$variablewfsstyle$VariableWfsStyle_VariableWfsStyle_methodInjection(get_Key$type$org$gwtopenmaps$demo$openlayers$client$components$store$ShowcaseExampleStore$_annotation$$none$$());
    memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$variablewfsstyle$VariableWfsStyle$_annotation$$none$$(result);
    return result;
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.variablewfsstyle.VariableWfsStyle singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$variablewfsstyle$VariableWfsStyle$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:94)
   */
  private org.gwtopenmaps.demo.openlayers.client.examples.variablewfsstyle.VariableWfsStyle get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$variablewfsstyle$VariableWfsStyle$_annotation$$none$$() {
    if (singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$variablewfsstyle$VariableWfsStyle$_annotation$$none$$ == null) {
      singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$variablewfsstyle$VariableWfsStyle$_annotation$$none$$ = create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$variablewfsstyle$VariableWfsStyle$_annotation$$none$$();
    }
    return singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$variablewfsstyle$VariableWfsStyle$_annotation$$none$$;
  }
  
  
  /**
   * Binding for org.gwtopenmaps.demo.openlayers.client.examples.rotatevector.RotateVectorExample declared at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:84)
   */
  private void memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$rotatevector$RotateVectorExample$_annotation$$none$$(org.gwtopenmaps.demo.openlayers.client.examples.rotatevector.RotateVectorExample injectee) {
    
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.rotatevector.RotateVectorExample org$gwtopenmaps$demo$openlayers$client$examples$rotatevector$RotateVectorExample_RotateVectorExample_methodInjection(org.gwtopenmaps.demo.openlayers.client.components.store.ShowcaseExampleStore _0) {
    return new org.gwtopenmaps.demo.openlayers.client.examples.rotatevector.RotateVectorExample(_0);
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.rotatevector.RotateVectorExample create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$rotatevector$RotateVectorExample$_annotation$$none$$() {
    org.gwtopenmaps.demo.openlayers.client.examples.rotatevector.RotateVectorExample result = org$gwtopenmaps$demo$openlayers$client$examples$rotatevector$RotateVectorExample_RotateVectorExample_methodInjection(get_Key$type$org$gwtopenmaps$demo$openlayers$client$components$store$ShowcaseExampleStore$_annotation$$none$$());
    memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$rotatevector$RotateVectorExample$_annotation$$none$$(result);
    return result;
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.rotatevector.RotateVectorExample singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$rotatevector$RotateVectorExample$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:84)
   */
  private org.gwtopenmaps.demo.openlayers.client.examples.rotatevector.RotateVectorExample get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$rotatevector$RotateVectorExample$_annotation$$none$$() {
    if (singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$rotatevector$RotateVectorExample$_annotation$$none$$ == null) {
      singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$rotatevector$RotateVectorExample$_annotation$$none$$ = create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$rotatevector$RotateVectorExample$_annotation$$none$$();
    }
    return singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$rotatevector$RotateVectorExample$_annotation$$none$$;
  }
  
  
  /**
   * Binding for org.gwtopenmaps.demo.openlayers.client.examples.undoredodrawing.UndoRedoDrawingExample declared at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:87)
   */
  private void memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$undoredodrawing$UndoRedoDrawingExample$_annotation$$none$$(org.gwtopenmaps.demo.openlayers.client.examples.undoredodrawing.UndoRedoDrawingExample injectee) {
    
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.undoredodrawing.UndoRedoDrawingExample org$gwtopenmaps$demo$openlayers$client$examples$undoredodrawing$UndoRedoDrawingExample_UndoRedoDrawingExample_methodInjection(org.gwtopenmaps.demo.openlayers.client.components.store.ShowcaseExampleStore _0) {
    return new org.gwtopenmaps.demo.openlayers.client.examples.undoredodrawing.UndoRedoDrawingExample(_0);
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.undoredodrawing.UndoRedoDrawingExample create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$undoredodrawing$UndoRedoDrawingExample$_annotation$$none$$() {
    org.gwtopenmaps.demo.openlayers.client.examples.undoredodrawing.UndoRedoDrawingExample result = org$gwtopenmaps$demo$openlayers$client$examples$undoredodrawing$UndoRedoDrawingExample_UndoRedoDrawingExample_methodInjection(get_Key$type$org$gwtopenmaps$demo$openlayers$client$components$store$ShowcaseExampleStore$_annotation$$none$$());
    memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$undoredodrawing$UndoRedoDrawingExample$_annotation$$none$$(result);
    return result;
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.undoredodrawing.UndoRedoDrawingExample singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$undoredodrawing$UndoRedoDrawingExample$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:87)
   */
  private org.gwtopenmaps.demo.openlayers.client.examples.undoredodrawing.UndoRedoDrawingExample get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$undoredodrawing$UndoRedoDrawingExample$_annotation$$none$$() {
    if (singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$undoredodrawing$UndoRedoDrawingExample$_annotation$$none$$ == null) {
      singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$undoredodrawing$UndoRedoDrawingExample$_annotation$$none$$ = create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$undoredodrawing$UndoRedoDrawingExample$_annotation$$none$$();
    }
    return singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$undoredodrawing$UndoRedoDrawingExample$_annotation$$none$$;
  }
  
  
  /**
   * Binding for org.gwtopenmaps.demo.openlayers.client.examples.snap.SnapFeatureExample declared at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:86)
   */
  private void memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$snap$SnapFeatureExample$_annotation$$none$$(org.gwtopenmaps.demo.openlayers.client.examples.snap.SnapFeatureExample injectee) {
    
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.snap.SnapFeatureExample org$gwtopenmaps$demo$openlayers$client$examples$snap$SnapFeatureExample_SnapFeatureExample_methodInjection(org.gwtopenmaps.demo.openlayers.client.components.store.ShowcaseExampleStore _0) {
    return new org.gwtopenmaps.demo.openlayers.client.examples.snap.SnapFeatureExample(_0);
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.snap.SnapFeatureExample create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$snap$SnapFeatureExample$_annotation$$none$$() {
    org.gwtopenmaps.demo.openlayers.client.examples.snap.SnapFeatureExample result = org$gwtopenmaps$demo$openlayers$client$examples$snap$SnapFeatureExample_SnapFeatureExample_methodInjection(get_Key$type$org$gwtopenmaps$demo$openlayers$client$components$store$ShowcaseExampleStore$_annotation$$none$$());
    memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$snap$SnapFeatureExample$_annotation$$none$$(result);
    return result;
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.snap.SnapFeatureExample singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$snap$SnapFeatureExample$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:86)
   */
  private org.gwtopenmaps.demo.openlayers.client.examples.snap.SnapFeatureExample get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$snap$SnapFeatureExample$_annotation$$none$$() {
    if (singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$snap$SnapFeatureExample$_annotation$$none$$ == null) {
      singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$snap$SnapFeatureExample$_annotation$$none$$ = create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$snap$SnapFeatureExample$_annotation$$none$$();
    }
    return singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$snap$SnapFeatureExample$_annotation$$none$$;
  }
  
  
  /**
   * Binding for org.gwtopenmaps.demo.openlayers.client.examples.location.LocationExample declared at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:81)
   */
  private void memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$location$LocationExample$_annotation$$none$$(org.gwtopenmaps.demo.openlayers.client.examples.location.LocationExample injectee) {
    
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.location.LocationExample org$gwtopenmaps$demo$openlayers$client$examples$location$LocationExample_LocationExample_methodInjection(org.gwtopenmaps.demo.openlayers.client.components.store.ShowcaseExampleStore _0) {
    return new org.gwtopenmaps.demo.openlayers.client.examples.location.LocationExample(_0);
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.location.LocationExample create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$location$LocationExample$_annotation$$none$$() {
    org.gwtopenmaps.demo.openlayers.client.examples.location.LocationExample result = org$gwtopenmaps$demo$openlayers$client$examples$location$LocationExample_LocationExample_methodInjection(get_Key$type$org$gwtopenmaps$demo$openlayers$client$components$store$ShowcaseExampleStore$_annotation$$none$$());
    memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$location$LocationExample$_annotation$$none$$(result);
    return result;
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.location.LocationExample singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$location$LocationExample$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:81)
   */
  private org.gwtopenmaps.demo.openlayers.client.examples.location.LocationExample get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$location$LocationExample$_annotation$$none$$() {
    if (singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$location$LocationExample$_annotation$$none$$ == null) {
      singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$location$LocationExample$_annotation$$none$$ = create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$location$LocationExample$_annotation$$none$$();
    }
    return singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$location$LocationExample$_annotation$$none$$;
  }
  
  
  /**
   * Binding for org.gwtopenmaps.demo.openlayers.client.examples.filter.SpatialFilterExample declared at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:100)
   */
  private void memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$filter$SpatialFilterExample$_annotation$$none$$(org.gwtopenmaps.demo.openlayers.client.examples.filter.SpatialFilterExample injectee) {
    
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.filter.SpatialFilterExample org$gwtopenmaps$demo$openlayers$client$examples$filter$SpatialFilterExample_SpatialFilterExample_methodInjection(org.gwtopenmaps.demo.openlayers.client.components.store.ShowcaseExampleStore _0) {
    return new org.gwtopenmaps.demo.openlayers.client.examples.filter.SpatialFilterExample(_0);
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.filter.SpatialFilterExample create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$filter$SpatialFilterExample$_annotation$$none$$() {
    org.gwtopenmaps.demo.openlayers.client.examples.filter.SpatialFilterExample result = org$gwtopenmaps$demo$openlayers$client$examples$filter$SpatialFilterExample_SpatialFilterExample_methodInjection(get_Key$type$org$gwtopenmaps$demo$openlayers$client$components$store$ShowcaseExampleStore$_annotation$$none$$());
    memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$filter$SpatialFilterExample$_annotation$$none$$(result);
    return result;
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.filter.SpatialFilterExample singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$filter$SpatialFilterExample$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:100)
   */
  private org.gwtopenmaps.demo.openlayers.client.examples.filter.SpatialFilterExample get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$filter$SpatialFilterExample$_annotation$$none$$() {
    if (singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$filter$SpatialFilterExample$_annotation$$none$$ == null) {
      singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$filter$SpatialFilterExample$_annotation$$none$$ = create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$filter$SpatialFilterExample$_annotation$$none$$();
    }
    return singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$filter$SpatialFilterExample$_annotation$$none$$;
  }
  
  
  /**
   * Binding for org.gwtopenmaps.demo.openlayers.client.examples.basicosm.BasicOsmExample declared at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:75)
   */
  private void memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$basicosm$BasicOsmExample$_annotation$$none$$(org.gwtopenmaps.demo.openlayers.client.examples.basicosm.BasicOsmExample injectee) {
    
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.basicosm.BasicOsmExample org$gwtopenmaps$demo$openlayers$client$examples$basicosm$BasicOsmExample_BasicOsmExample_methodInjection(org.gwtopenmaps.demo.openlayers.client.components.store.ShowcaseExampleStore _0) {
    return new org.gwtopenmaps.demo.openlayers.client.examples.basicosm.BasicOsmExample(_0);
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.basicosm.BasicOsmExample create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$basicosm$BasicOsmExample$_annotation$$none$$() {
    org.gwtopenmaps.demo.openlayers.client.examples.basicosm.BasicOsmExample result = org$gwtopenmaps$demo$openlayers$client$examples$basicosm$BasicOsmExample_BasicOsmExample_methodInjection(get_Key$type$org$gwtopenmaps$demo$openlayers$client$components$store$ShowcaseExampleStore$_annotation$$none$$());
    memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$basicosm$BasicOsmExample$_annotation$$none$$(result);
    return result;
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.basicosm.BasicOsmExample singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$basicosm$BasicOsmExample$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:75)
   */
  private org.gwtopenmaps.demo.openlayers.client.examples.basicosm.BasicOsmExample get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$basicosm$BasicOsmExample$_annotation$$none$$() {
    if (singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$basicosm$BasicOsmExample$_annotation$$none$$ == null) {
      singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$basicosm$BasicOsmExample$_annotation$$none$$ = create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$basicosm$BasicOsmExample$_annotation$$none$$();
    }
    return singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$basicosm$BasicOsmExample$_annotation$$none$$;
  }
  
  
  /**
   * Binding for org.gwtopenmaps.demo.openlayers.client.examples.vector.WFSFeatureSelectionExamples declared at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:98)
   */
  private void memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$vector$WFSFeatureSelectionExamples$_annotation$$none$$(org.gwtopenmaps.demo.openlayers.client.examples.vector.WFSFeatureSelectionExamples injectee) {
    
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.vector.WFSFeatureSelectionExamples org$gwtopenmaps$demo$openlayers$client$examples$vector$WFSFeatureSelectionExamples_WFSFeatureSelectionExamples_methodInjection(org.gwtopenmaps.demo.openlayers.client.components.store.ShowcaseExampleStore _0) {
    return new org.gwtopenmaps.demo.openlayers.client.examples.vector.WFSFeatureSelectionExamples(_0);
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.vector.WFSFeatureSelectionExamples create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$vector$WFSFeatureSelectionExamples$_annotation$$none$$() {
    org.gwtopenmaps.demo.openlayers.client.examples.vector.WFSFeatureSelectionExamples result = org$gwtopenmaps$demo$openlayers$client$examples$vector$WFSFeatureSelectionExamples_WFSFeatureSelectionExamples_methodInjection(get_Key$type$org$gwtopenmaps$demo$openlayers$client$components$store$ShowcaseExampleStore$_annotation$$none$$());
    memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$vector$WFSFeatureSelectionExamples$_annotation$$none$$(result);
    return result;
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.vector.WFSFeatureSelectionExamples singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$vector$WFSFeatureSelectionExamples$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:98)
   */
  private org.gwtopenmaps.demo.openlayers.client.examples.vector.WFSFeatureSelectionExamples get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$vector$WFSFeatureSelectionExamples$_annotation$$none$$() {
    if (singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$vector$WFSFeatureSelectionExamples$_annotation$$none$$ == null) {
      singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$vector$WFSFeatureSelectionExamples$_annotation$$none$$ = create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$vector$WFSFeatureSelectionExamples$_annotation$$none$$();
    }
    return singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$vector$WFSFeatureSelectionExamples$_annotation$$none$$;
  }
  
  
  /**
   * Binding for org.gwtopenmaps.demo.openlayers.client.examples.imagelayer.ImageLayerExample declared at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:97)
   */
  private void memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$imagelayer$ImageLayerExample$_annotation$$none$$(org.gwtopenmaps.demo.openlayers.client.examples.imagelayer.ImageLayerExample injectee) {
    
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.imagelayer.ImageLayerExample org$gwtopenmaps$demo$openlayers$client$examples$imagelayer$ImageLayerExample_ImageLayerExample_methodInjection(org.gwtopenmaps.demo.openlayers.client.components.store.ShowcaseExampleStore _0) {
    return new org.gwtopenmaps.demo.openlayers.client.examples.imagelayer.ImageLayerExample(_0);
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.imagelayer.ImageLayerExample create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$imagelayer$ImageLayerExample$_annotation$$none$$() {
    org.gwtopenmaps.demo.openlayers.client.examples.imagelayer.ImageLayerExample result = org$gwtopenmaps$demo$openlayers$client$examples$imagelayer$ImageLayerExample_ImageLayerExample_methodInjection(get_Key$type$org$gwtopenmaps$demo$openlayers$client$components$store$ShowcaseExampleStore$_annotation$$none$$());
    memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$imagelayer$ImageLayerExample$_annotation$$none$$(result);
    return result;
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.imagelayer.ImageLayerExample singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$imagelayer$ImageLayerExample$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:97)
   */
  private org.gwtopenmaps.demo.openlayers.client.examples.imagelayer.ImageLayerExample get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$imagelayer$ImageLayerExample$_annotation$$none$$() {
    if (singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$imagelayer$ImageLayerExample$_annotation$$none$$ == null) {
      singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$imagelayer$ImageLayerExample$_annotation$$none$$ = create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$imagelayer$ImageLayerExample$_annotation$$none$$();
    }
    return singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$imagelayer$ImageLayerExample$_annotation$$none$$;
  }
  
  
  /**
   * Binding for org.gwtopenmaps.demo.openlayers.client.examples.selectfeature.SelectFeatureExample declared at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:85)
   */
  private void memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$selectfeature$SelectFeatureExample$_annotation$$none$$(org.gwtopenmaps.demo.openlayers.client.examples.selectfeature.SelectFeatureExample injectee) {
    
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.selectfeature.SelectFeatureExample org$gwtopenmaps$demo$openlayers$client$examples$selectfeature$SelectFeatureExample_SelectFeatureExample_methodInjection(org.gwtopenmaps.demo.openlayers.client.components.store.ShowcaseExampleStore _0) {
    return new org.gwtopenmaps.demo.openlayers.client.examples.selectfeature.SelectFeatureExample(_0);
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.selectfeature.SelectFeatureExample create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$selectfeature$SelectFeatureExample$_annotation$$none$$() {
    org.gwtopenmaps.demo.openlayers.client.examples.selectfeature.SelectFeatureExample result = org$gwtopenmaps$demo$openlayers$client$examples$selectfeature$SelectFeatureExample_SelectFeatureExample_methodInjection(get_Key$type$org$gwtopenmaps$demo$openlayers$client$components$store$ShowcaseExampleStore$_annotation$$none$$());
    memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$selectfeature$SelectFeatureExample$_annotation$$none$$(result);
    return result;
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.selectfeature.SelectFeatureExample singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$selectfeature$SelectFeatureExample$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:85)
   */
  private org.gwtopenmaps.demo.openlayers.client.examples.selectfeature.SelectFeatureExample get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$selectfeature$SelectFeatureExample$_annotation$$none$$() {
    if (singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$selectfeature$SelectFeatureExample$_annotation$$none$$ == null) {
      singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$selectfeature$SelectFeatureExample$_annotation$$none$$ = create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$selectfeature$SelectFeatureExample$_annotation$$none$$();
    }
    return singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$selectfeature$SelectFeatureExample$_annotation$$none$$;
  }
  
  
  /**
   * Binding for org.gwtopenmaps.demo.openlayers.client.examples.graticule.GraticuleExample declared at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:79)
   */
  private void memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$graticule$GraticuleExample$_annotation$$none$$(org.gwtopenmaps.demo.openlayers.client.examples.graticule.GraticuleExample injectee) {
    
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.graticule.GraticuleExample org$gwtopenmaps$demo$openlayers$client$examples$graticule$GraticuleExample_GraticuleExample_methodInjection(org.gwtopenmaps.demo.openlayers.client.components.store.ShowcaseExampleStore _0) {
    return new org.gwtopenmaps.demo.openlayers.client.examples.graticule.GraticuleExample(_0);
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.graticule.GraticuleExample create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$graticule$GraticuleExample$_annotation$$none$$() {
    org.gwtopenmaps.demo.openlayers.client.examples.graticule.GraticuleExample result = org$gwtopenmaps$demo$openlayers$client$examples$graticule$GraticuleExample_GraticuleExample_methodInjection(get_Key$type$org$gwtopenmaps$demo$openlayers$client$components$store$ShowcaseExampleStore$_annotation$$none$$());
    memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$graticule$GraticuleExample$_annotation$$none$$(result);
    return result;
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.graticule.GraticuleExample singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$graticule$GraticuleExample$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:79)
   */
  private org.gwtopenmaps.demo.openlayers.client.examples.graticule.GraticuleExample get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$graticule$GraticuleExample$_annotation$$none$$() {
    if (singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$graticule$GraticuleExample$_annotation$$none$$ == null) {
      singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$graticule$GraticuleExample$_annotation$$none$$ = create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$graticule$GraticuleExample$_annotation$$none$$();
    }
    return singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$graticule$GraticuleExample$_annotation$$none$$;
  }
  
  
  /**
   * Binding for org.gwtopenmaps.demo.openlayers.client.examples.custommouseposition.CustomMousePositionExample declared at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:78)
   */
  private void memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$custommouseposition$CustomMousePositionExample$_annotation$$none$$(org.gwtopenmaps.demo.openlayers.client.examples.custommouseposition.CustomMousePositionExample injectee) {
    
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.custommouseposition.CustomMousePositionExample org$gwtopenmaps$demo$openlayers$client$examples$custommouseposition$CustomMousePositionExample_CustomMousePositionExample_methodInjection(org.gwtopenmaps.demo.openlayers.client.components.store.ShowcaseExampleStore _0) {
    return new org.gwtopenmaps.demo.openlayers.client.examples.custommouseposition.CustomMousePositionExample(_0);
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.custommouseposition.CustomMousePositionExample create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$custommouseposition$CustomMousePositionExample$_annotation$$none$$() {
    org.gwtopenmaps.demo.openlayers.client.examples.custommouseposition.CustomMousePositionExample result = org$gwtopenmaps$demo$openlayers$client$examples$custommouseposition$CustomMousePositionExample_CustomMousePositionExample_methodInjection(get_Key$type$org$gwtopenmaps$demo$openlayers$client$components$store$ShowcaseExampleStore$_annotation$$none$$());
    memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$custommouseposition$CustomMousePositionExample$_annotation$$none$$(result);
    return result;
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.custommouseposition.CustomMousePositionExample singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$custommouseposition$CustomMousePositionExample$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:78)
   */
  private org.gwtopenmaps.demo.openlayers.client.examples.custommouseposition.CustomMousePositionExample get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$custommouseposition$CustomMousePositionExample$_annotation$$none$$() {
    if (singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$custommouseposition$CustomMousePositionExample$_annotation$$none$$ == null) {
      singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$custommouseposition$CustomMousePositionExample$_annotation$$none$$ = create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$custommouseposition$CustomMousePositionExample$_annotation$$none$$();
    }
    return singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$custommouseposition$CustomMousePositionExample$_annotation$$none$$;
  }
  
  
  /**
   * Binding for org.gwtopenmaps.demo.openlayers.client.examples.filter.ComparisonAndLogicalFilterExample declared at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:101)
   */
  private void memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$filter$ComparisonAndLogicalFilterExample$_annotation$$none$$(org.gwtopenmaps.demo.openlayers.client.examples.filter.ComparisonAndLogicalFilterExample injectee) {
    
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.filter.ComparisonAndLogicalFilterExample org$gwtopenmaps$demo$openlayers$client$examples$filter$ComparisonAndLogicalFilterExample_ComparisonAndLogicalFilterExample_methodInjection(org.gwtopenmaps.demo.openlayers.client.components.store.ShowcaseExampleStore _0) {
    return new org.gwtopenmaps.demo.openlayers.client.examples.filter.ComparisonAndLogicalFilterExample(_0);
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.filter.ComparisonAndLogicalFilterExample create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$filter$ComparisonAndLogicalFilterExample$_annotation$$none$$() {
    org.gwtopenmaps.demo.openlayers.client.examples.filter.ComparisonAndLogicalFilterExample result = org$gwtopenmaps$demo$openlayers$client$examples$filter$ComparisonAndLogicalFilterExample_ComparisonAndLogicalFilterExample_methodInjection(get_Key$type$org$gwtopenmaps$demo$openlayers$client$components$store$ShowcaseExampleStore$_annotation$$none$$());
    memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$filter$ComparisonAndLogicalFilterExample$_annotation$$none$$(result);
    return result;
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.filter.ComparisonAndLogicalFilterExample singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$filter$ComparisonAndLogicalFilterExample$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:101)
   */
  private org.gwtopenmaps.demo.openlayers.client.examples.filter.ComparisonAndLogicalFilterExample get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$filter$ComparisonAndLogicalFilterExample$_annotation$$none$$() {
    if (singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$filter$ComparisonAndLogicalFilterExample$_annotation$$none$$ == null) {
      singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$filter$ComparisonAndLogicalFilterExample$_annotation$$none$$ = create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$filter$ComparisonAndLogicalFilterExample$_annotation$$none$$();
    }
    return singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$filter$ComparisonAndLogicalFilterExample$_annotation$$none$$;
  }
  
  
  /**
   * Binding for org.gwtopenmaps.demo.openlayers.client.examples.refresh.WfsRefreshExample declared at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:83)
   */
  private void memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$refresh$WfsRefreshExample$_annotation$$none$$(org.gwtopenmaps.demo.openlayers.client.examples.refresh.WfsRefreshExample injectee) {
    
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.refresh.WfsRefreshExample org$gwtopenmaps$demo$openlayers$client$examples$refresh$WfsRefreshExample_WfsRefreshExample_methodInjection(org.gwtopenmaps.demo.openlayers.client.components.store.ShowcaseExampleStore _0) {
    return new org.gwtopenmaps.demo.openlayers.client.examples.refresh.WfsRefreshExample(_0);
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.refresh.WfsRefreshExample create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$refresh$WfsRefreshExample$_annotation$$none$$() {
    org.gwtopenmaps.demo.openlayers.client.examples.refresh.WfsRefreshExample result = org$gwtopenmaps$demo$openlayers$client$examples$refresh$WfsRefreshExample_WfsRefreshExample_methodInjection(get_Key$type$org$gwtopenmaps$demo$openlayers$client$components$store$ShowcaseExampleStore$_annotation$$none$$());
    memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$refresh$WfsRefreshExample$_annotation$$none$$(result);
    return result;
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.refresh.WfsRefreshExample singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$refresh$WfsRefreshExample$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:83)
   */
  private org.gwtopenmaps.demo.openlayers.client.examples.refresh.WfsRefreshExample get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$refresh$WfsRefreshExample$_annotation$$none$$() {
    if (singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$refresh$WfsRefreshExample$_annotation$$none$$ == null) {
      singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$refresh$WfsRefreshExample$_annotation$$none$$ = create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$refresh$WfsRefreshExample$_annotation$$none$$();
    }
    return singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$refresh$WfsRefreshExample$_annotation$$none$$;
  }
  
  
  /**
   * Binding for org.gwtopenmaps.demo.openlayers.client.components.ShowcaseTopPanel declared at:
   *   Implicit binding for Key[type=org.gwtopenmaps.demo.openlayers.client.components.ShowcaseTopPanel, annotation=[none]]
   */
  private void memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$components$ShowcaseTopPanel$_annotation$$none$$(org.gwtopenmaps.demo.openlayers.client.components.ShowcaseTopPanel injectee) {
    
  }
  
  private org.gwtopenmaps.demo.openlayers.client.components.ShowcaseTopPanel org$gwtopenmaps$demo$openlayers$client$components$ShowcaseTopPanel_ShowcaseTopPanel_methodInjection(com.google.gwt.user.client.ui.Image _0, org.gwtopenmaps.demo.openlayers.client.components.ShowcaseSearchPanel _1) {
    return new org.gwtopenmaps.demo.openlayers.client.components.ShowcaseTopPanel(_0, _1);
  }
  
  private org.gwtopenmaps.demo.openlayers.client.components.ShowcaseTopPanel create_Key$type$org$gwtopenmaps$demo$openlayers$client$components$ShowcaseTopPanel$_annotation$$none$$() {
    org.gwtopenmaps.demo.openlayers.client.components.ShowcaseTopPanel result = org$gwtopenmaps$demo$openlayers$client$components$ShowcaseTopPanel_ShowcaseTopPanel_methodInjection(get_Key$type$com$google$gwt$user$client$ui$Image$_annotation$$none$$(), get_Key$type$org$gwtopenmaps$demo$openlayers$client$components$ShowcaseSearchPanel$_annotation$$none$$());
    memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$components$ShowcaseTopPanel$_annotation$$none$$(result);
    return result;
  }
  
  private org.gwtopenmaps.demo.openlayers.client.components.ShowcaseTopPanel singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$components$ShowcaseTopPanel$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   Implicit binding for Key[type=org.gwtopenmaps.demo.openlayers.client.components.ShowcaseTopPanel, annotation=[none]]
   */
  private org.gwtopenmaps.demo.openlayers.client.components.ShowcaseTopPanel get_Key$type$org$gwtopenmaps$demo$openlayers$client$components$ShowcaseTopPanel$_annotation$$none$$() {
    if (singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$components$ShowcaseTopPanel$_annotation$$none$$ == null) {
      singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$components$ShowcaseTopPanel$_annotation$$none$$ = create_Key$type$org$gwtopenmaps$demo$openlayers$client$components$ShowcaseTopPanel$_annotation$$none$$();
    }
    return singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$components$ShowcaseTopPanel$_annotation$$none$$;
  }
  
  
  /**
   * Binding for org.gwtopenmaps.demo.openlayers.client.config.provider.ShowcaseLogoProvider declared at:
   *   Implicit binding for Key[type=org.gwtopenmaps.demo.openlayers.client.config.provider.ShowcaseLogoProvider, annotation=[none]]
   */
  private void memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$config$provider$ShowcaseLogoProvider$_annotation$$none$$(org.gwtopenmaps.demo.openlayers.client.config.provider.ShowcaseLogoProvider injectee) {
    
  }
  
  private org.gwtopenmaps.demo.openlayers.client.config.provider.ShowcaseLogoProvider create_Key$type$org$gwtopenmaps$demo$openlayers$client$config$provider$ShowcaseLogoProvider$_annotation$$none$$() {
    Object created = GWT.create(org.gwtopenmaps.demo.openlayers.client.config.provider.ShowcaseLogoProvider.class);
    assert created instanceof org.gwtopenmaps.demo.openlayers.client.config.provider.ShowcaseLogoProvider;
    org.gwtopenmaps.demo.openlayers.client.config.provider.ShowcaseLogoProvider result = (org.gwtopenmaps.demo.openlayers.client.config.provider.ShowcaseLogoProvider) created;
    
    memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$config$provider$ShowcaseLogoProvider$_annotation$$none$$(result);
    return result;
  }
  
  
  /**
   * Binding for org.gwtopenmaps.demo.openlayers.client.config.provider.ShowcaseLogoProvider declared at:
   *   Implicit binding for Key[type=org.gwtopenmaps.demo.openlayers.client.config.provider.ShowcaseLogoProvider, annotation=[none]]
   */
  private org.gwtopenmaps.demo.openlayers.client.config.provider.ShowcaseLogoProvider get_Key$type$org$gwtopenmaps$demo$openlayers$client$config$provider$ShowcaseLogoProvider$_annotation$$none$$() {
    return create_Key$type$org$gwtopenmaps$demo$openlayers$client$config$provider$ShowcaseLogoProvider$_annotation$$none$$();
  }
  
  
  
  /**
   * Binding for org.gwtopenmaps.demo.openlayers.client.examples.wmswfs.WmsWfsExample declared at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:91)
   */
  private void memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$wmswfs$WmsWfsExample$_annotation$$none$$(org.gwtopenmaps.demo.openlayers.client.examples.wmswfs.WmsWfsExample injectee) {
    
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.wmswfs.WmsWfsExample org$gwtopenmaps$demo$openlayers$client$examples$wmswfs$WmsWfsExample_WmsWfsExample_methodInjection(org.gwtopenmaps.demo.openlayers.client.components.store.ShowcaseExampleStore _0) {
    return new org.gwtopenmaps.demo.openlayers.client.examples.wmswfs.WmsWfsExample(_0);
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.wmswfs.WmsWfsExample create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$wmswfs$WmsWfsExample$_annotation$$none$$() {
    org.gwtopenmaps.demo.openlayers.client.examples.wmswfs.WmsWfsExample result = org$gwtopenmaps$demo$openlayers$client$examples$wmswfs$WmsWfsExample_WmsWfsExample_methodInjection(get_Key$type$org$gwtopenmaps$demo$openlayers$client$components$store$ShowcaseExampleStore$_annotation$$none$$());
    memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$wmswfs$WmsWfsExample$_annotation$$none$$(result);
    return result;
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.wmswfs.WmsWfsExample singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$wmswfs$WmsWfsExample$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:91)
   */
  private org.gwtopenmaps.demo.openlayers.client.examples.wmswfs.WmsWfsExample get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$wmswfs$WmsWfsExample$_annotation$$none$$() {
    if (singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$wmswfs$WmsWfsExample$_annotation$$none$$ == null) {
      singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$wmswfs$WmsWfsExample$_annotation$$none$$ = create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$wmswfs$WmsWfsExample$_annotation$$none$$();
    }
    return singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$wmswfs$WmsWfsExample$_annotation$$none$$;
  }
  
  
  /**
   * Binding for org.gwtopenmaps.demo.openlayers.client.examples.basicbing.BasicBingExample declared at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:73)
   */
  private void memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$basicbing$BasicBingExample$_annotation$$none$$(org.gwtopenmaps.demo.openlayers.client.examples.basicbing.BasicBingExample injectee) {
    
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.basicbing.BasicBingExample org$gwtopenmaps$demo$openlayers$client$examples$basicbing$BasicBingExample_BasicBingExample_methodInjection(org.gwtopenmaps.demo.openlayers.client.components.store.ShowcaseExampleStore _0) {
    return new org.gwtopenmaps.demo.openlayers.client.examples.basicbing.BasicBingExample(_0);
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.basicbing.BasicBingExample create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$basicbing$BasicBingExample$_annotation$$none$$() {
    org.gwtopenmaps.demo.openlayers.client.examples.basicbing.BasicBingExample result = org$gwtopenmaps$demo$openlayers$client$examples$basicbing$BasicBingExample_BasicBingExample_methodInjection(get_Key$type$org$gwtopenmaps$demo$openlayers$client$components$store$ShowcaseExampleStore$_annotation$$none$$());
    memberInject_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$basicbing$BasicBingExample$_annotation$$none$$(result);
    return result;
  }
  
  private org.gwtopenmaps.demo.openlayers.client.examples.basicbing.BasicBingExample singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$basicbing$BasicBingExample$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:73)
   */
  private org.gwtopenmaps.demo.openlayers.client.examples.basicbing.BasicBingExample get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$basicbing$BasicBingExample$_annotation$$none$$() {
    if (singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$basicbing$BasicBingExample$_annotation$$none$$ == null) {
      singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$basicbing$BasicBingExample$_annotation$$none$$ = create_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$basicbing$BasicBingExample$_annotation$$none$$();
    }
    return singleton_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$basicbing$BasicBingExample$_annotation$$none$$;
  }
  
  public GwtOpenlayersInjectorImpl() {
    // Eager singleton bound at:
    //   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:76)
    get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$basictms$BasicTmsExample$_annotation$$none$$();
    // Eager singleton bound at:
    //   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:90)
    get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$wmsrefresh$WmsRefreshExample$_annotation$$none$$();
    // Eager singleton bound at:
    //   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:88)
    get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$vector$VectorExample$_annotation$$none$$();
    // Eager singleton bound at:
    //   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:93)
    get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$cql$CqlWmsExample$_annotation$$none$$();
    // Eager singleton bound at:
    //   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:80)
    get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$linestring2multilinestring$LineString2MultiLineStringExample$_annotation$$none$$();
    // Eager singleton bound at:
    //   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:82)
    get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$measure$MeasureExample$_annotation$$none$$();
    // Eager singleton bound at:
    //   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:103)
    get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$click$ClickExample$_annotation$$none$$();
    // Eager singleton bound at:
    //   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:96)
    get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$kml$KmlExample$_annotation$$none$$();
    // Eager singleton bound at:
    //   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:92)
    get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$wmswfsedit$WmsWfsEditExample$_annotation$$none$$();
    // Eager singleton bound at:
    //   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:72)
    get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$TransformFeature$TransformFeatureExample$_annotation$$none$$();
    // Eager singleton bound at:
    //   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:89)
    get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$wmsfeatureinfo$WmsFeatureInfoExample$_annotation$$none$$();
    // Eager singleton bound at:
    //   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:95)
    get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$wfshoverhighlight$WfsHoverHighlightExample$_annotation$$none$$();
    // Eager singleton bound at:
    //   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:77)
    get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$canceldrawing$CancelDrawingExample$_annotation$$none$$();
    // Eager singleton bound at:
    //   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:102)
    get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$dragfeature$DragFeatureExample$_annotation$$none$$();
    // Eager singleton bound at:
    //   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:99)
    get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$filter$FeatureIdFilterExample$_annotation$$none$$();
    // Eager singleton bound at:
    //   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:74)
    get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$basicgooglev3$BasicGoogleV3Example$_annotation$$none$$();
    // Eager singleton bound at:
    //   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:94)
    get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$variablewfsstyle$VariableWfsStyle$_annotation$$none$$();
    // Eager singleton bound at:
    //   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:84)
    get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$rotatevector$RotateVectorExample$_annotation$$none$$();
    // Eager singleton bound at:
    //   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:87)
    get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$undoredodrawing$UndoRedoDrawingExample$_annotation$$none$$();
    // Eager singleton bound at:
    //   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:86)
    get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$snap$SnapFeatureExample$_annotation$$none$$();
    // Eager singleton bound at:
    //   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:81)
    get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$location$LocationExample$_annotation$$none$$();
    // Eager singleton bound at:
    //   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:100)
    get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$filter$SpatialFilterExample$_annotation$$none$$();
    // Eager singleton bound at:
    //   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:75)
    get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$basicosm$BasicOsmExample$_annotation$$none$$();
    // Eager singleton bound at:
    //   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:98)
    get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$vector$WFSFeatureSelectionExamples$_annotation$$none$$();
    // Eager singleton bound at:
    //   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:97)
    get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$imagelayer$ImageLayerExample$_annotation$$none$$();
    // Eager singleton bound at:
    //   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:85)
    get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$selectfeature$SelectFeatureExample$_annotation$$none$$();
    // Eager singleton bound at:
    //   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:79)
    get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$graticule$GraticuleExample$_annotation$$none$$();
    // Eager singleton bound at:
    //   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:78)
    get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$custommouseposition$CustomMousePositionExample$_annotation$$none$$();
    // Eager singleton bound at:
    //   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:101)
    get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$filter$ComparisonAndLogicalFilterExample$_annotation$$none$$();
    // Eager singleton bound at:
    //   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:83)
    get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$refresh$WfsRefreshExample$_annotation$$none$$();
    // Eager singleton bound at:
    //   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:91)
    get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$wmswfs$WmsWfsExample$_annotation$$none$$();
    // Eager singleton bound at:
    //   org.gwtopenmaps.demo.openlayers.client.config.GwtOpenlayersInjectorModule.configure(GwtOpenlayersInjectorModule.java:73)
    get_Key$type$org$gwtopenmaps$demo$openlayers$client$examples$basicbing$BasicBingExample$_annotation$$none$$();
    
  }
  
}
