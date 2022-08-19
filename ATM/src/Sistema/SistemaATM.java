
package Sistema;

import javax.swing.JOptionPane;

public class SistemaATM {
    
    //VARIABLES LOCALES
    public static double saldoActual;
    
    //CONSTRUCTOR
    public SistemaATM(){
        saldoActual = 0;
    }
    
    //METODOS
    public void depositar(double deposito){
        saldoActual += deposito;
    }
    public void retirar(double retiro){
       if(saldoActual >= retiro){
           saldoActual -= retiro;
       } 
       else {
           JOptionPane.showMessageDialog(null, "[ERROR] - SALDO INSUFICIENTE");
       } 
    }
    
    public double obtenerSaldo(){
        return saldoActual;
    }
}
