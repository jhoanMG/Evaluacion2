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
class Cuadrado extends FiguraGeometrica {
    private double lado;
    
    public Cuadrado(double lado, String color) {
        super(color);
        this.lado = lado;
    }
    
    @Override
    public double calcularArea() {
        return lado * lado;
    }
}


