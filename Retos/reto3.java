import java.util.*;

public class reto3
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
      
      
      int numero=(int)(Math.random()*2);
      String lado;
      String nombre;
      String respuesta;

        if (numero==1)
        {
            lado="Cara";
        }
        else 
        {
            lado="Sello";
        }	
        
        System.out.println("Introduzca su nombre: ");
        nombre=sc.nextLine();
        System.out.println(nombre+ " ¿Quieres Cara o Sello? ");
        respuesta=sc.nextLine();
        
        if (respuesta==lado)
        {
            System.out.println("Muy bien ha salido "+ lado + " has acertado");
        }
        else 
        {
            System.out.println("Que mal ha salido "+ lado + " has perdido");
        }

       sc.close();

    
    }
}