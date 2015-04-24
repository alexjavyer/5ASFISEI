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
public class OperacionesBasicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        operaciones op = new operaciones();
   
        float a,b;
        int opcion;
        //a = Float.valueOf(JOptionPane.showInputDialog(null,"Numero 1"));
        //b = Float.valueOf(JOptionPane.showInputDialog(null,"Numero 2"));
        
        //op.suma(a,b);
        //op.division(a, b);
        //op.potencia(a,b);
        //op.multiplicacion(a, b);
        do{
          opcion=(Integer)JOptionPane.showOptionDialog(null, "Escoja una operación", "Operaciones Basicas", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null
                , new Object[]{"Suma","Multiplicación","División","Potencia", "Par o impar","Salir"}, args);
        //float a,b;
        if(opcion==0){
            a = Float.valueOf(JOptionPane.showInputDialog(null,"Numero 1"));
            b = Float.valueOf(JOptionPane.showInputDialog(null,"Numero 2"));
            op.suma(a, b);
        }else{
            if(opcion==1){
                a = Float.valueOf(JOptionPane.showInputDialog(null,"Numero 1"));
                b = Float.valueOf(JOptionPane.showInputDialog(null,"Numero 2"));
                op.multiplicacion(a, b);
            }else{
                if(opcion==2){
                    a = Float.valueOf(JOptionPane.showInputDialog(null,"Numero 1"));
                    b = Float.valueOf(JOptionPane.showInputDialog(null,"Numero 2"));
                    op.division(a, b);
                }else{
                    if(opcion==3){
                    a = Float.valueOf(JOptionPane.showInputDialog(null,"BASE :"));
                    b = Float.valueOf(JOptionPane.showInputDialog(null,"EXPONENTE : "));
                    op.potencia(a, b);
                }else{
                     if(opcion==4){
                    a = Float.valueOf(JOptionPane.showInputDialog(null,"Numero: "));
                    op.parInpar(a);
                     }else{
                         opcion=5;
                     }
                }
                }
            }
        }
        }while(opcion!=5);
        System.exit(0);
    }
}