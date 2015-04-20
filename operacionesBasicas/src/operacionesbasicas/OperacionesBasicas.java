/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesbasicas;

//libreria propia de java

import javax.swing.JOptionPane;

/**
 *
 * @author Javy
 */
public class OperacionesBasicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        operaciones op = new operaciones();
   
        float a,b;
        a = Float.valueOf(JOptionPane.showInputDialog(null,"Numero 1"));
        b = Float.valueOf(JOptionPane.showInputDialog(null,"Numero 2"));
        
        op.suma(a,b);
    }
}
