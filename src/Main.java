
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        INFORMACION Info= new INFORMACION ();
        Scanner teclado = new Scanner(System.in);
        int edad;
        String Nombre;
        
        /*INGRESO DE NOMBRE*/
        System.out.println("Ingrese nombre de la persona");
        Nombre=teclado.nextLine();
        teclado.nextLine();
        
        /*INGRESO DE EDAD*/
        System.out.println("Ingrese la edad de la persona");
        edad=teclado.nextInt();
        teclado.nextLine();

        Info.Persona(edad, Nombre);
        Info.Persona(Nombre);
	Info.Persona();
    }
    
}
