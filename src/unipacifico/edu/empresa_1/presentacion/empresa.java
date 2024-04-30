
package unipacifico.edu.empresa_1.presentacion;

import unipacifico.edu.empresa_1.logica.TrabajadorAsalariado;
import unipacifico.edu.empresa_1.logica.TrabajadorAsalariadoComision;
import unipacifico.edu.empresa_1.logica.TrabajadorPorHoras;


public class empresa {
    
     public static void main(String[] args) {
         
        TrabajadorAsalariado felipe = new TrabajadorAsalariado("Juan", "1111455788", 2000, 5);
        TrabajadorAsalariadoComision juan = new TrabajadorAsalariadoComision("Juan", "11112336654", 1000, 30);
        TrabajadorPorHoras maria = new TrabajadorPorHoras("Maria", "1111488877", 200, 40);

        System.out.println("Salario de Felipe (Trabajador asalariado): $" + felipe.calcularSalario());
        System.out.println("Salario de Juan (Trabajador asalariado mas comisión): $" + juan.calcularSalario());
        System.out.println("Salario de Maria (Trabajador por horas): $" + maria.calcularSalario());
    }
    
}
