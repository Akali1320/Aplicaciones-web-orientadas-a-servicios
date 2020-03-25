/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer_paquete;

public class Rectangulo extends Figura{
    private double base,altura;
/*
     este constructor tiene como objetivo tomar los valores
     para hacer las operaciones correspondientes
     */
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

        /*
    estamos sacando el area y el permitro del rectangulo por medio de metodos abstractos que se crearo en la 
    clase figura.
    */
    @Override
    public double obtenrArea() {
        return base*altura;
        /*
        Retornando las operaciones para obtener area.
        */
    }

    @Override
    public double obtenerPerimetro() {
        return (2*base)+(2*altura);
    }

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
    
}
