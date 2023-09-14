/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica4;
import java.util.Scanner;

public class Practica4 {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dolar = 17.13;
        double euro = 18.29;
        
        System.out.println("Ingresa la cantidad que desea convertir: ");
        double pesos = scanner.nextInt();
        
        
        double conversion1 = pesos/dolar;
        double conversion2 = pesos/euro;
        
        System.out.println("La conversion de " + pesos + "a dolares es de " + conversion1);
        System.out.println("La conversion de " + pesos + "a euros es de " + conversion2);
        
        scanner.close();
        
        
        
     
    }
    
}
