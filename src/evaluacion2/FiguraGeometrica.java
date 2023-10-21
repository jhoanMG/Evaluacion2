package evaluacion2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
 abstract class FiguraGeometrica {
    protected String color;
    
    public FiguraGeometrica(String color) {
        this.color = color;
    }
    
    public abstract double calcularArea();
}
