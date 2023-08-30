/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solucion;

/**
 *
 * @author 507
 */
public class Solucion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int operacion1;
        float operacion2;
        float operacion3;
        boolean operacion4 = (25 >18);
        boolean operacion5 = (3 + (2.5 * 4)) / 3 != (4 * 5.2) - 3.8;
        
        
        operacion1 = 3 + (8 * 5) - (6 / 3);
        System.out.println("El resultado de la oporacion1 es: " + operacion1);
                
        operacion2 = (2.5f * 2 * 3) - (4 / 2) + 8;
        float operacionfloat = (float) operacion2;
        System.out.println("El resultado de la operacion2 es: " + operacionfloat);
        
        operacion3 = (2 * (6 - 2.5f)) / 3;
        float operacion3float = (float) operacion3;
        System.out.println("El resultado de la operacion3 es: " + operacion3float);
        
        /*operacion4   25>18*/
        System.out.println("El resultado de la operacion 25>18 es igual a: " + operacion4);
        
        /*operacion5 (3 + (2.5 * 4)) / 3 != (4 * 5.2) - 3.8*/
        System.out.println("El resultado de la operacion 25>18 es igual a: " + operacion5);
    }
    
}
