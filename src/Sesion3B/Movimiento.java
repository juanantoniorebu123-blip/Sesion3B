package Sesion3B;

public class Movimiento {

    public double importe;
    public enum Signo { D, H }
    public Signo signo;
    public String detalle;

    public Movimiento(double importe, Signo signo, String detalle) {
        this.importe = importe;
        this.signo = signo;
        this.detalle = detalle;
    }

}
