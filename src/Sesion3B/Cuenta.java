package Sesion3B;
import java.util.*;
public class Cuenta {
	String mNumero; 
    String nTitular; 
    double saldo=0;
    List <Movimiento> mMovimientos;

    public void ingresar(double x) {
    	saldo=x;
    }
    public void retirar(double x) {
    	saldo=x;
    }

    public double getSaldo() {
    	return saldo;
    }
    
    
}
