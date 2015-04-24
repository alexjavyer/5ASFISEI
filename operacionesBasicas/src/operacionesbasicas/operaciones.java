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
     void division(float numero1, float numero2){
        resultado = numero1 / numero2;
        System.out.println("Division de dos numeros----> " + resultado);
        JOptionPane.showMessageDialog(null, "Resultado--->"+resultado);
    }
    void potencia(float base, float exponente) {
        float r=0;
        for(int i=1;i<=exponente;i++){
        r= r+base;
        }
        System.out.println("Potencia : " +base+ "^"+exponente+" = "+ r);
        JOptionPane.showMessageDialog(null, "Potencia : " +base+ "^"+exponente+" = "+ r);
     }
    void multiplicacion(float multiplicando, float multiplicador){
        float producto;
        producto=multiplicando*multiplicador;
        System.out.println("El Producto de: " +multiplicando+"*"+multiplicador+ "="+ producto);
        JOptionPane.showMessageDialog(null, "El Producto de: " +multiplicando+"*"+multiplicador+ "="+ producto);
    }
    
    void parInpar(float numero1){
         if(numero1%2==0){
             JOptionPane.showMessageDialog(null, "El numero "+numero1+" es par");
         }else{
             JOptionPane.showMessageDialog(null, "El numero "+numero1+" es impar");
         }
     }

     
}
