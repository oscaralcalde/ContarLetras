/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scanearstring;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author oscar
 */
public class ScanearString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // char[] letras ={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','y','z'};
        Scanner lector = new Scanner (System.in);
        String cadena = "";
        char [] lista;
        int mayor=0;
        char letramayor=' ';
        char caracteres;
        int contador = 0;
        System.out.println("Ingresa la oracion que quieras: ");
        cadena = lector.nextLine();// esto leera cada caracter
        lista = cadena.toCharArray();// aqui cada caracter se guardara en el array
        for (int i = 0; i < lista.length; i++) { // en este for tomara cada caracter de la oracion
            caracteres = lista[i];
            for (int j = 0; j < lista.length; j++) {// aca este for recorre con el caracter que tomo antes antes toda la oracion viendo cuantas veces se repite
                if(lista[j] == caracteres){ // si el caracter se repite se suma en el contador
                    contador++;
                }
                    if(contador > mayor){ // aca se pone la condicion de que si el contador supera al numero mayor de veces que se repitio antes, que ingrese
                    letramayor=lista[j]; // aca se guarda que letra fue la que mas veces se repitio
                    mayor = contador;} // aca se guarda la cantidad de veces que mas sumo el contador
                
            }
            
                    contador=0; // aca se inicializa 0 para que empieze desde el principio asi cuenta la otra letra
            
        }
                    System.out.println("La letra que mas se repite es: "+ letramayor+ " "+ "se repite: "+mayor+ " veces");
            
            
        
        
    }
    
}
