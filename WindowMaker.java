package leydeohms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author carlos
 */
public class WindowMaker extends JFrame {

    public JTextField getVv() {
        return vv;
    }

    public JTextField getRr() {
        return rr;
    }

    public JTextField getIi() {
        return ii;
    }

    JLabel vl = new JLabel("Voltaje");
    JLabel rt = new JLabel("Resistencia");
    JLabel it = new JLabel("Intensidad");
    JTextField vv = new JTextField();
    JTextField rr = new JTextField();
    JTextField ii = new JTextField();
    JButton rb = new JButton("Resistencia");
    JButton ib = new JButton("Intensidad");
    JButton vb = new JButton("Voltaje");

    public WindowMaker() {
        init();
    }

    private void init() {
        setLayout(null);
        setTitle("VCR enemigo detectado");
        setSize(350, 250);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vl.setBounds(25, 10, 50, 20);
        add(vl);
        vv.setBounds(10, 40, 100, 20);
        add(vv);
        rt.setBounds(25, 70, 70, 20);
        add(rt);
        rr.setBounds(10, 100, 100, 20);
        add(rr);
        it.setBounds(25, 130, 100, 20);
        add(it);
        ii.setBounds(10, 160, 100, 20);
        add(ii);
        rb.setBounds(150, 20, 150, 40);
        add(rb);
        rb.addActionListener(new Res());
        ib.setBounds(150, 80, 150, 40);
        add(ib);
        ib.addActionListener(new Int());
        vb.setBounds(150, 140, 150, 40);
        add(vb);
        vb.addActionListener(new Volt());
    }

    private class Res implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double v = Double.parseDouble(vv.getText());
                double i = Double.parseDouble(ii.getText());
                Resistencia x = new Resistencia(v, i);
                rr.setText(x.xx);
            } catch (NumberFormatException d) {
                JOptionPane.showMessageDialog(null, "Favor de llenar los cuadros"
                        + " solo con numeros");
            }
        }
    }

    private class Int implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double v = Double.parseDouble(vv.getText());
                double r = Double.parseDouble(rr.getText());
                Intensidad x = new Intensidad(v, r);
                ii.setText(x.cr);
            } catch (NumberFormatException d) {
                JOptionPane.showMessageDialog(null, "Favor de llenar los cuadros"
                        + " solo con numeros");
            }
        }
    }

    private class Volt implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double r = Double.parseDouble(rr.getText());
                double i = Double.parseDouble(ii.getText());
                Voltaje x = new Voltaje(r, i);
                vv.setText(x.st);
            } catch (NumberFormatException a) {
                JOptionPane.showMessageDialog(null, "Favor de llenar los cuadros"
                        + " solo con numeros");
            }
        }

    }
}
