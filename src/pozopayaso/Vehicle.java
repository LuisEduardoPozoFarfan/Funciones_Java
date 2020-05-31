package pozopayaso;

public class Vehicle {
    static String name = "pozo mamon" ;
    //Atributos
    String color;
    int numero_llantas;
    
    
    public Vehicle(String color, int numero_llantas){ //Método contructor
        this.color = color; // this.color = "azul"
        this.numero_llantas = numero_llantas; //this.numero_llantas = 5
    }
    //color = "azul"
    //numero_llantas = 5
    public boolean Estado(){
        System.out.println("Estamos verificando su numero de llanats para darle el visto bueno ");
        if(numero_llantas == 4){
            return true;
        } else{
            return false;
        }
    }
    
    public void Arrancar(boolean confirmacion){
        if(true == confirmacion){
            System.out.println("Estoy arrancando");
        } else{
            System.out.println("No puedo arrancar");
        }
    }
    
    public static void main(String[] args){ // Método principal
        Vehicle auto = new Vehicle("azul",4); //Creaste un objeto de la clase vehivle y que se llama auto
        boolean atrapando_valor_retornado = auto.Estado();// se retornó la confirmación para arrancar
        //System.out.println(abc);
        System.out.println("debajo de esta linea sale lo que se ejcutó en el metodo arrancar");
        auto.Arrancar(atrapando_valor_retornado);
    }
    
}

