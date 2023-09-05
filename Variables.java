/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package variables;

/**
 *
 * @author labcca
 */
public class Variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad;
        String nombre = "Manuel";
        String carrera = "TICs";
        String nombremascota = "perrito husky";
        String nombremateria = "Fundamentos de programacion";
         final int anioNacimiento = 2005;
         boolean apagarLuz;
                 
         apagarLuz = false;
         apagarLuz = true;
         
         
         edad = 18;
         
         System.out.println("Mi nombre es " + nombre + " y estudio " + carrera + ", mi materia favorita es " + nombremateria + ", mi mascota favorita es un " + nombremascota);
         
         System.out.println("Naci en el anio " + anioNacimiento);
         
         System.out.println("Mi edad es " + edad);
         
         System.out.println(apagarLuz);
    }
    
}
