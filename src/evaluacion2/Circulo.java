/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacion2;

/**
 *
 * @author USUARIO
 */
class Circulo extends FiguraGeometrica {
    private double radio;
    private static final double PI = 3.14159265359;
    
    public Circulo(double radio, String color) {
        super(color);
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        return PI * radio * radio;
    }
}
