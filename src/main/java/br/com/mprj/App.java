package br.com.mprj;

import javax.swing.*;

/**
 * by Alanne Soares
 *
 */

public class App {
    public static void main( String[] args ) {
        JFrame jf = new JFrame("Botões");
        Painel jp = new Painel();

        jf.setSize(300, 200);
        jf.add(jp);
        jf.setVisible(true);
    }
}
