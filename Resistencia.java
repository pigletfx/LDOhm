/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leydeohms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * ;@author carlos
 */
public class Resistencia {

    private final double vol;
    private final double it;
    public double ot;
    public String xx;
    public Resistencia(double v, double i) {

        vol = v;
        it = i;
        ot = vol / it;
        xx=String.format("%.3f",ot);
    }

}
