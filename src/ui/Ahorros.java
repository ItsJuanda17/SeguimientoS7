package ui;
import model.Usuario;
import model.Gastos;
import java.util.Scanner;

public class Ahorros{
    
  //Atributos de clase   
    private Usuario usuario; // conexion con el model por medio de un atributo 
	private Gastos gastos;// conexion con el model por medio de un atributo 
	private Scanner reader; // declarando un atributo Scanner
 
  
  
  //Metodo constructor 
   public Ahorros(){

    usuario= null;
    reader = new Scanner(System.in);
    gastos= new Gastos();
  }


    public static void main(String[] args) {
       
        Ahorros ahorros = new Ahorros(); // Crear una instancia de la clase Ahorros
        
        int opcion = 0;
       
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Registrar usuario");
            System.out.println("2. Registrar un gasto");
            System.out.println("3. Ver total de gastos");
            System.out.println("4. Ver gasto promedio");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = ahorros.reader.nextInt(); // Acceder al atributo de instancia reader

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del usuario: ");
                    String name = ahorros.reader.next(); // Acceder al atributo de instancia reader
                    System.out.print("Ingrese el ID del usuario: ");
                    String id = ahorros.reader.next(); // Acceder al atributo de instancia reader
                    ahorros.usuario = new Usuario(name, id);
                    System.out.println("Usuario registrado exitosamente");
                    break;
                case 2:
                    if (ahorros.usuario == null) {
                        System.out.println("Primero debe registrar un usuario");
                    } else {
                        System.out.print("Ingrese el valor del gasto: ");
                        double valor = ahorros.reader.nextDouble(); // Acceder al atributo de instancia reader
                        ahorros.gastos.ingresarGasto(valor);
                        System.out.println("Gasto registrado exitosamente");
                    }
                    break;
                case 3:
                    if (ahorros.usuario == null) {
                        System.out.println("Primero debe registrar un usuario");
                    } else {
                        double total = ahorros.gastos.gastoTotal();
                        System.out.println("El total de gastos es: " + total);
                    }
                    break;
                case 4:
                    if (ahorros.usuario == null) {
                        System.out.println("Primero debe registrar un usuario");
                    } else {
                        double promedio = ahorros.gastos.promedio();
                        System.out.println("El gasto promedio es: " + promedio);
                    }
                    break;
                case 5:
                    System.out.println("Gracias por usar nuestro sistema");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (opcion != 5);

        
    }
}




  

   
    
 





    