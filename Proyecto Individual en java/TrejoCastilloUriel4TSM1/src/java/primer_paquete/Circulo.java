/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer_paquete;

/**
 *
 * @author URIEL&YAIR-PC
 */
//El Extends es el que contiene los metodos Abstractos y el cual usuaremos
//para realizar las operaciones 
public class Circulo extends Figura{
    private double radio;
 /*
    Este constructor tiene como función 
    recibir y hacer las operaciones correspondientes
    */
    public Circulo(double radio) {
        this.radio = radio;
    }
    
    /*
    Haciendo sobre escriturar y metidendo el procedimientk en mis metodos abstractos
    */
    @Override
    public double obtenrArea() {
        /*
        el pi.math es para el 3.1416 y el math.pow es para potencia en este caso es para elevar al cuadrado. 
        */
        return Math.PI*Math.pow(radio,2);
    }

    @Override
    public double obtenerPerimetro() {
        return Math.PI*(2*radio);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
}
