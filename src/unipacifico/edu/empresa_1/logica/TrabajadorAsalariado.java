
package unipacifico.edu.empresa_1.logica;


public class TrabajadorAsalariado extends Trabajador{
    
    private int meses;
    
     public TrabajadorAsalariado(String nombre, String identificacion, double salario, int meses) {
        super(nombre, identificacion, salario);
        this.meses = meses;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }
     @Override
    public double calcularSalario() {
        return super.calcularSalario() * this.meses;
    }

   
}
