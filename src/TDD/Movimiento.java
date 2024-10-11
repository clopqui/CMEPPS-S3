package TDD;

public class Movimiento {
	private double importe;
    public enum Signo{D,H};
    private final Signo signo;
    private String detalle;
    
    public Movimiento(double importe, Signo signo){
        this.importe = 0.0;
        this.signo = null;
        
    }
    
    public double getImporte() {
        return 0.0;
    }

    public Signo getSigno() {
        return null;
    }

    public String getDetalle() {
        return null;
    }

}
