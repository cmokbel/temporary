/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yournamehere.client;

import java.io.Serializable;

/**
 *
 * @author Christian
 */
public class myPoint implements Serializable {
    public double x,y;

    public myPoint() {
    }

    public myPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
   
}
