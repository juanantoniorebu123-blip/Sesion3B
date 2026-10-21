package Sesion3B;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {

    String mNumero;
    String nTitular;
    double saldo;
    List<Movimiento> mMovimientos;

    public Cuenta(String n, String t,double sal) {
        mNumero = n;
        nTitular = t;
        saldo = sal;
        mMovimientos = new ArrayList<>();
    }

    public void ingresar(double x) {
        saldo += x;
        mMovimientos.add(new Movimiento(x, Movimiento.Signo.H, "Ingreso"));
    }

    public void retirar(double x) {
        
        if (saldo - x >= -500) {
            saldo -= x;
            mMovimientos.add(new Movimiento(x, Movimiento.Signo.D, "Reintegro"));
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Movimiento> getMovimientos() {
        return mMovimientos;
    }
}