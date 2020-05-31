package library;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        /*Scanner ingresa = new Scanner(System.in);
        System.out.print("¿Cuántos libros vas a ingresar?: ");
        int n = ingresa.nextInt();
        Library libro1 = new Library(n);
        //Library libro2 = new Library(n);
        System.out.println("¡Ingrese los datos del libro 1!");
        
        String a[] = libro1.Ingresa_datos();
        //System.out.println("¡Ingrese los datosdel libro 2!");
        //String b[] = libro2.Ingresa_datos();
        libro1.Ver_datos(a);
        //libro2.Ver_datos(b);*/
        
        
        
        int array[] = new int[10]; //cantidad de elemnetos
        String arraycadena[] = new String[4];
        // 1 2 5 4 7 8 9 5 4 2
        for(int i = 0 ; i<array.length ; i++){  // i = 1
            array[i] = (int) (Math.random()*10); //array[0] = 1 
        }
        // array [] = [2 , 5 , 4 , 8 6, 5 4 6 6]
        for(int i = 0 ; i<array.length ; i++){
            System.out.println(array[i]);
        }
        
        
        
        
    }
}
