/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer_paquete;
/*El Extends es el que contiene los metodos Abstractos y el cual usuaremos
para realizar las operaciones */
public class Triangulo extends Figura{
     private double base,altura,lado; 
    /*
     este constructor tiene como objetivo tomar los valores
     para hacer las operaciones correspondientes
     */
    public Triangulo(double base, double altura, double lado) {
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }
     
   /*
     aqui estamos haciendo los getters y setters de para calcular el 
     area y perimetro del Triangulo.
     */
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double obtenrArea() {
        return (base*altura)/2;
    }

    @Override
    public double obtenerPerimetro() {
        return base+altura+lado;
    }
     
     
}
