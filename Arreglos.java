package com.mycompany.progra1;
import java.util.*;
public class Arreglos {    
    int[] numeros = new int[10];
        public int[] llamada(){           
            for(int x=0;x<numeros.length;x++)
            numeros[x] = (int) (Math.random()*10)+1;
            return numeros;            
        }
    public static void main(String[] args) {
       Scanner sn = new Scanner(System.in);
       boolean salir = false;
       int opcion; 
       while(!salir){            
           System.out.println("1. Llenar arreglo aleatoreamente");
           System.out.println("2. Ordenar de forma ascendente");
           System.out.println("3. Ordenar de forma descendente");
           System.out.println("4. Salir");                      
           System.out.println("Escribe una de las opciones");
           opcion = sn.nextInt();            
            switch(opcion){
               case 1:
                   System.out.println("Cargar array");
                   llenarArreglo();
                   break;
               case 2:
                    System.out.println("Ordenado Asendentemente:");
                   ordenarAsc();
                   break;
                case 3:
                   System.out.println("Has seleccionado la opcion 3");
                   ordenarDes();
                   break;
                case 4:
                   salir=true;
                   break;
                default:
                   System.out.println("Solo números entre 1 y 5");                                     
           }
       }
  return;
    }
    public static void  llenarArreglo(){
        Progra1 obj = new Progra1();
        int[] numeros= obj.llamada();        
        System.out.println("Lista de numeros: " + Arrays.toString(numeros));   
    }
    public static void ordenarAsc() {
        Progra1 obj = new Progra1();
        int[] numeros= obj.llamada();
        Arrays.sort(numeros);
        System.out.println("Lista de numero ascendente: ");  
        for (int i=0;i< numeros.length;i++)         
        System.out.println(numeros[i]);
    }        
    public static void ordenarDes() {
        Progra1 obj = new Progra1();
        int[] numeros= obj.llamada();
        Arrays.sort(numeros);
        System.out.println("Lista de numero descendente: ");         
        for (int i = numeros.length-1; i >= 0; i--)          
        System.out.println(numeros[i]);
    }        
}
