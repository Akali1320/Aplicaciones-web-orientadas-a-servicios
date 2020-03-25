/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer_paquete;
//El Extends es el que contiene los metodos Abstractos y el cual usuaremos
//para realizar las operaciones 
public class Cuadrado extends Figura{
     
    private double lado;
    /*
     este constructor tiene como objetivo tomar los valores
     para hacer las operaciones correspondientes
     */
    public Cuadrado (double lado){
      this.lado = lado;
    }
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    /*
    estamos sacando el area y el permitro del cuadrado por medio de metodos abstractos.
    */
    @Override
    public double obtenrArea() {
       return lado*lado;
    }

    @Override
    public double obtenerPerimetro() {
        return lado*4;
    }
    
}
