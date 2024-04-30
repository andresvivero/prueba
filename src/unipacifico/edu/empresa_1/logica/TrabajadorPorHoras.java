
package unipacifico.edu.empresa_1.logica;


public class TrabajadorPorHoras extends Trabajador {
     private double valorHora;
    private int horasTrabajadas;
    
    public TrabajadorPorHoras(String nombre, String identificacion, double valorHora, int horasTrabajadas) {
        super(nombre, identificacion, 0); 
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
      @Override
    public double calcularSalario() {
        return valorHora * horasTrabajadas;
    }
    
}
