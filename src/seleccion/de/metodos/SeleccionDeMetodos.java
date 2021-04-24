/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleccion.de.metodos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Denilson
 */
public class SeleccionDeMetodos {
    public static int suma = 0;
    public static int factorial;
    public static int sum = 0, Num;
    public static int media;
    public static float mean;
 
    public static void encabezado(){
        System.out.println("Universidad Autonoma de Campeche"); 
        System.out.println("Faculdad de ingeneria");
        System.out.println("Ingeneria en sistemas computacionales");
        System.out.println("Denilson Blanco Garcia");
        System.out.println("Seleccion de metodos");
        System.out.println("Segundo Semestres A");
        System.out.println("Abril 2021");
    }  
    
    public static void cuerpo(){
        System.out.println("=====================================");
        System.out.println("SELECCIONA UNA OPCION PARA EFECTUAR"); 
        System.out.println("1 Suma consecutiva");
        System.out.println("2 Factorial");
        System.out.println("3 Factorial Introducido");
        System.out.println("4 La media de la suma");
        System.out.println("5 Pedir un numero");
        System.out.println("6 Dias de la semana");
        System.out.println("7 Gato");
        System.out.println("======================================");
    }  
    
    public static void pie(){
        System.out.println("--------------------------------------"); 
    }  
    
    public static void sumaconsecutiva(){
       
        System.out.println("==========Suma consecutiva==========");
        for(int i = 0; i <= 10; i++) {
            suma += i;
            System.out.println(suma); 
        }
    }
    
    public static void factorial(){
        System.out.println("==========Factorial==========");
        factorial = 1;
        for (int i = 1; i <= 10; i++) {
            //factorial = factorial + (factorial*i);
            factorial *=i;
            System.out.println(factorial);
        }
    }
    
    public static void factorialIntroducido(){
        Scanner entrada= new Scanner(System.in);
        System.out.println("==========Factorial Introducido==========");
        System.out.println("INTRODUCE UN NUMERO");
        factorial = entrada.nextInt();
        for (int i = 1; i <= 10; i++) {
           factorial *=i;
           System.out.println(factorial);
        }
    }
     
    public static void Lamediadelasuma(){
        Scanner NumScanner = new Scanner(System.in);
        Scanner charScanner = new Scanner(System.in);
        System.out.println("==========La media==========");
        System.out.println("Ingresa el número total de términos que quieres que calcule la media");

        media = NumScanner.nextInt();
      
        System.out.println("Por favor ingresa " + media + " números:");
      
        for(int x = 1; x <= media; x++){          
           Num = NumScanner.nextInt();
           sum = sum + Num;
           System.out.println();
        }
        mean = sum / media;
        System.out.println("La media de " + media + " de los números que ingresaste es " + mean);
    }
    
    public static void pedirunnumero(int numeroI){
        System.out.println("==========Promedio==========");
        Scanner entrada = new Scanner(System.in);
        
        int numero = numeroI;
        int suma = 0;
        double promedio;
        int diferencia;
        
        int arrays[] = new int[numero];
        
        for (int i = 0; i < arrays.length; i++) {
            
            System.out.print("Introduce el numero " + (i + 1) + ": ");
            arrays[i] = entrada.nextInt();
            
        }
        
        int mayor, menor;
        mayor = menor = arrays[0];
        
        for (int i = 0; i < arrays.length; i++) {
            
            if(arrays[i] > mayor){
                mayor = arrays[i];
            } else if(arrays[i] < menor){
                menor = arrays[i];
            }
            
            suma += arrays[i];
            
        }
        
        promedio = (double)suma / (double)numero;
        diferencia = mayor - menor;
        
        System.out.println("La cantidad de numeros introducidos fueron : " + numero);
        System.out.println("El promedio de los numeros introducidos es de: " + promedio);
        System.out.println("El numero mayor introducido fue: " + mayor);
        System.out.println("El numero menor introducido fue: " + menor);
        System.out.println("La diferencia del numero mayor y menor es de: " + diferencia);
    }
    
    public static void Diasdelasemana(){
        System.out.println("==========Dias de la semana==========");
        String dias[] = new String[7];
  
        dias[0] = "Lunes";
        dias[1] = "Martes";
        dias[2] = "Miercoles";
        dias[3] = "Jueves";
        dias[4] = "Viernes";
        dias[5] = "Sabado";
        dias[6] = "Domingo";
        
        for(String diaS: dias){
            
            System.out.println(diaS);
            
        } 
    }
    
    public static void gato(){
        System.out.println("==========Gato==========");
        String gato[][] = new String[3][3];
        
        for(String vertical[]: gato){
            for(String horizontal: vertical){
                System.out.print("+" + " ");
            }
            System.out.println("");
        }
    }
    
    public static void Principal(int opcion){
        Scanner entrada= new Scanner(System.in);
        System.out.println("INGRESA LA OPCION DESEADA");
        opcion = entrada.nextInt();
        switch(opcion)
        {
        case 1:
            sumaconsecutiva();
           break;
        case 2:
            factorial();
           break;
        case 3:
             factorialIntroducido();
           break;
        case 4:
             Lamediadelasuma();
           break;
        case 5:
            System.out.println("CANTIDAD DE MATERIAS");
             pedirunnumero(entrada.nextInt());
           break;
        case 6:
            Diasdelasemana();
           break;
        case 7:
            gato();
           break;
        default:  
            System.out.println("Ingrese numero de que desea");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        encabezado();
        cuerpo();
        Principal(7);
        pie();       
    }

}
