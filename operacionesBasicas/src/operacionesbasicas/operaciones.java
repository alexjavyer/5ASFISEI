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
    
     void resta(float numero1, float numero2){
        resultado = numero1 - numero2;
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
        System.out.println("division de dos numeros----> " + resultado);
        JOptionPane.showMessageDialog(null, "Resultado--->"+resultado);
    }
            
}
