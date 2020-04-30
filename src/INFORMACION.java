
public class INFORMACION {

    int edad;
    String nombre;
    
public void  Persona(int edad, String nombre) { 
    System.out.println("--Información Primaria--");
    System.out.println("La persona "+nombre+" tiene "+edad+" años");
    }

public void  Persona(String nombre) { 
    System.out.println("--Información Secundaria--");
    System.out.println("La persona que se ingreso es: "+nombre);
    }			
    
public void Persona(){
    System.out.println("--Información Terciaria--");
    System.out.println("No se puede realizar la suma por falta de parámetros."); 
}           
}    
 
