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
public class Evaluacion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Cuadrado cuadrado = new Cuadrado(5, "Rojo");
        Circulo circulo = new Circulo(3, "Azul");
        
        System.out.println("Área del cuadrado: " + cuadrado.calcularArea() + " unidades cuadradas");
        System.out.println("Área del círculo: " + circulo.calcularArea() + " unidades cuadradas");
    }
}
    
    

