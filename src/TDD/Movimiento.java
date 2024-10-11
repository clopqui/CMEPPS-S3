package TDD;

public class Movimiento {
	private double importe;
    public enum Signo{D,H};
    private final Signo signo;
    private String detalle;
    
    public Movimiento(double importe, Signo signo){
        this.importe = importe;
        this.signo = signo;
        this.detalle = (signo == Signo.D)?"Ingreso":"Reintegro";
    }
    
    public double getImporte() {
        return importe;
    }

    public Signo getSigno() {
        return signo;
    }

    public String getDetalle() {
        return detalle;
    }

}
