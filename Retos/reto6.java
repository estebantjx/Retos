import java.util.Random;
import java.util.Scanner;

public class reto6
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    Random num = new Random();
    
    double apuesta;
    double dinero = 0;
    int a;
    int seleccion;
    int cantidad =0;
    
   
    do
    {
    System.out.println("Juego de cara o sello, Ingrese el dinero que desea apostar: ");
    apuesta = sc.nextDouble();
    System.out.println("Ingrese cara o sello: "+ 
    "-----------1.- Cara------------" + 
    "-----------2.- Sello-----------" );
    a = sc.nextInt();
 
   
System.out.println("Se acaba de lanzar la moneda al aire");
 int moneda = num.nextInt();

switch (moneda) 
{
  case 1:

    
    if (a == 1) 
    {
      dinero = dinero + (apuesta*2);
      System.out.println("Acabas de ganar, tu dinero actual es: " + dinero);
    }
    else if (a == 2) 
    {
      dinero = dinero - apuesta;
      System.out.println("Acabas de perder, tu dinero actual es: " + dinero);
    }
    else
    {
      System.out.println("La opción que seleccionaste es invalida. ");
    }
        
        break;

        case 2:
        
        if (a == 2) 
    {
      dinero = dinero + (apuesta*2);
      System.out.println("Ganaste, tu dienro actual es: " + dinero);
    }
    else if (a == 1) {
      dinero = dinero - apuesta;
      System.out.println("Perdiste, tu dinero actual es: " + dinero);
    }
    else{
      System.out.println("La opción que seleccionaste es invalida");
    }

        break;

    default:
        break;
}
    cantidad ++;
    System.out.println("\n¿Quieres volver a jugar?" 
    + "------------1.-Si.----------" +
     "----------2.-No---------");
    seleccion = sc.nextInt();
}
while(seleccion == 1);
System.out.println("Gracias por jugar. La cantidad de veces jugadas fue: "+ cantidad + "\nEl total final de dinero es: " + dinero);
sc.close();
}
}

