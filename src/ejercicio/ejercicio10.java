/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;
import java.util.Scanner;
/**
 *
 * @author Riky
 */
public class ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer=new Scanner (System.in);
    System.out.println("Ingrese un valor limite positivo");
    int limite;
    int suma =0;
    limite = leer.nextInt();
    
   do{
        System.out.println("Ingrese un número");
        int numero;
        numero = leer.nextInt();
        suma=numero+suma;
        // TODO code application logic here
    }while(suma<=limite);
        System.out.println("El valor de la suma total es de: "+suma);
   }
    
}
