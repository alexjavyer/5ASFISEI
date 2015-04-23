/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesbasicas;

import javax.swing.JOptionPane;

/**
 *
 * @author Javy
 */
public class operaciones {
    
    float resultado;
    void suma(float numero1, float numero2){
        resultado = numero1 + numero2;
        System.out.println("Suma de dos numeros----> " + resultado);
        JOptionPane.showMessageDialog(null, "Resultado--->"+resultado);
    }
    void multiplicacion(float numero1, float numero2){
        resultado = numero1 * numero2;
        System.out.println("Suma de dos numeros----> " + resultado);
        JOptionPane.showMessageDialog(null, "Resultado--->"+resultado);
    }
     void division(float numero1, float numero2){
        resultado = numero1 / numero2;
        System.out.println("Division de dos numeros----> " + resultado);
        JOptionPane.showMessageDialog(null, "Resultado--->"+resultado);
    }
     void potencia(float base, float exponente) {
         float r;
        r= base+exponente;
        System.out.println("Potencia : " +base+ "^"+exponente+" ="+ resultado);
        JOptionPane.showMessageDialog(null, "Potencia : " +base+ "^"+exponente+" ="+ resultado);
     }
     
            
}
