package library;
import java.util.Scanner;
public class Library {
    Scanner ingresa = new Scanner(System.in);
    private String titulo, autor, estreno, genero;
    private int n, año;
    
    public Library(int n){
        this.n = n;
        System.out.println();
        System.out.println("¡Bienvenido!");
        System.out.println();
    }
    
    public String[] Ingresa_datos(){
        String libro[] = new String[4];
        int a=0;
        // Validación del título
        do{
            System.out.print("Ingrese el título del libro: ");
              titulo = ingresa.nextLine().trim();
            if(!titulo.equals("")){
                libro[0] = titulo;
                a = 1;
            }else{
                System.out.println("¡Completa lo que te pide!");
            }
        }while(a == 0);
        // Validación del autor
        do{
            System.out.print("Ingrese el nombre del autor del libro: ");
              autor = ingresa.nextLine().trim();
            if(!autor.equals("")){
                libro[1] = autor;
                a = 2;
            }else{
                System.out.println("¡Completa lo que te pide!");
            }
        }while(a == 1);
        // Validación del año
        do{
            System.out.print("Ingrese Año: ");
            estreno = ingresa.nextLine();
            if(!estreno.equals("")){
                
                    int año = Integer.parseInt(estreno);
                    if (año >= 1900 && año <= 2020) {
                       libro[2] = estreno; 
                    }else{
                        System.out.println("¡Año incorrecto!");
                        estreno = "";
                    }
            }else{
                System.out.println("¡Completa lo que se te pide!");
            }
        }while(estreno.equals(""));
        // Validación del género
        do{
            //System.out.println("¡Ingrese el género del libro!");
            System.out.print("Ingrese el género del libro: ");
              genero = ingresa.nextLine();
            if(!genero.equals("")){
                libro[3] = genero;
                a = 3;
            }else{
                System.out.println("¡Completa lo que te pide!");
            }
        }while(a == 2);
         System.out.println();
        return libro;//template String averiguar
    }
    
    public void Ver_datos(String libro[]){
        /*for(int i = 0 ; i < libro.length ; i++){
            if(i == 0){
                System.out.println("Título: " + libro[i]);
            }else if(i == 1){
                System.out.println("Autor : " + libro[i]);
            }else if(i == 2){
                System.out.println("Año   : " + libro[i]);
            }else if(i == 3){
                System.out.println("Género: " + libro[i]);
            }
        }*/
        System.out.println("Título: " + libro[0] + "\n" +
                           "Autor : " + libro[1] + "\n" +
                           "Año   : " + libro[2] + "\n" +
                           "Género: " + libro[3] + "\n" );
    }
}
