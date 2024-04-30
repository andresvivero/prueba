
package unipacifico.edu.empresa_1.logica;


public class TrabajadorAsalariadoComision extends Trabajador{
    
    private double porcentaje;
    
     public TrabajadorAsalariadoComision(String nombre, String identificacion, double salario, double porcentaje) {
        super(nombre, identificacion, salario);
        this.porcentaje = porcentaje;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
     @Override
    public double calcularSalario() {
        return super.calcularSalario() + ((super.calcularSalario() * this.porcentaje)/100);
    }

   
}
