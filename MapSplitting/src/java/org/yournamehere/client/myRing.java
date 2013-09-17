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
public class myRing implements Serializable{
    public LinkedList<myPoint> points ;

    public myRing() {
        points = new LinkedList();
    }
     public myRing( LinkedList<myPoint> p) {
         points = p;
    }
    
}
