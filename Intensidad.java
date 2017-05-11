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
public class Intensidad {

    private final double vol;
    private final double res;
    public double ot;
    public String cr;

    public Intensidad(double v, double r) {
        vol = v;
        res = r;
        ot = vol / res;
        cr = String.format("%.3f",ot);
    }
}
