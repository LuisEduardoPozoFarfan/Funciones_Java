package empezando;
import java.util.Scanner;
public class Operaciones {
    
    /*int a;
    
    public void Ver(){
        int b = 5;
        a = 5;
        System.out.println(a);
    }
    
    public void Ver2(){
        a = 8;
        System.out.println(a);
    }
    */
    
    
    
    //Métodos sin retorno de valores ----- sin parámetros
    /*public void Suma(){
        int a = 5;
        int b = 6;
        int suma = a + b;
        System.out.println(suma);
    }*/
    
    //Métodos con retorno de valores ----- sin parámetros
    /*public int Suma(){
        int a = 5;
        int b = 6;
        int suma = a + b;
        return suma;
    }*/
    
    //Métodos sin retorno de valores ----- con parámetros
    /*public void Suma(int num1 , int num2){
        int suma = num1 + num2;
        System.out.println(suma);
    }*/
    
    //Métodos con retorno de valores ----- con parámetros
    /*public int Suma(int num1 , int num2){
        int suma = num1 + num2;
        return suma;
    }*/
    
    public static void main(String[] args){ // Método principal
        //Operaciones objeto = new Operaciones();
        //int a = objeto.Suma(); // suma = 11
        //int a = objeto.Suma(6,25);
        //System.out.println(a);
        //objeto.Ver();
        Scanner ingresa = new Scanner(System.in);
        System.out.println("Ingresa un número1: ");
        int guarda_entero = ingresa.nextInt();
        System.out.println("Ingresa un número2: ");
        int guarda_entero2 = ingresa.nextInt();
        
        Scanner ingresa1 = new Scanner(System.in);
        System.out.println("Ingresa tu chapa: ");
        String guarda_name = ingresa1.nextLine();
        System.out.println("Ingresa tu numeroooooooo: ");
        int a = ingresa1.nextInt();
    }
    
}
