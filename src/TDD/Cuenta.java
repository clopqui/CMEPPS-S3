package TDD;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {
	private String numero;
    private String titular;
    List <Movimiento> mMovimientos = new ArrayList<>();
    private double saldo;
    
    public Cuenta(double saldo){
        super();
        
    }

    public void ingresar(double cantidad) {
        this.saldo = this.saldo + cantidad;
        
    }

    public double getSaldo() {
        return 0.0;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = 0.0;
    }
    
    public void retirar(double cantidad){
        
    }
}
