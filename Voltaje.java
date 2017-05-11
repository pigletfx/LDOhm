/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leydeohms;

/**
 *
 * @author carlos
 */
public class Voltaje {

    private final double res;
    private final double in;
    public double ot;
    public String st;

    public Voltaje(double r, double i) {
        res = r;
        in = i;
        ot = res * in;
        st = String.format("%.3f", ot);
    }

}
