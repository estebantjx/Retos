package Retos;
import java.util.*;
public class reto7 
{
  public static void main(String[] args)
   {
    int numeroN;
    double suma = 0;
    double promedionotas;
    Scanner sc = new Scanner(System.in);
    
    
     System.out.println("Se va a realizar el primedio de las notas, ingrese las notas porfavor ");
     numeroN = sc.nextInt();
     double[] notas = new double[numeroN];
     
     
     
      for(int i = 0; i<numeroN; i++)
    {
      System.out.println("\nIngrese la nota ");
      notas[i]=sc.nextDouble();
     }
     System.out.println("\nLas notas son las siguientes: ");
    
     for(int n = 0; n<numeroN; n++)
     {
    System.out.println(notas[n]);
    suma = suma + notas[n];
     }
     promedionotas = suma / numeroN;
     
     System.out.println("\nLa definitva es:" +  promedionotas);
     if ( promedionotas<3) 
     {
      System.out.println("Reprobaste.");
     }
     else if( promedionotas >=3 )
     {
      System.out.println("Pasaste por poco");
     }
     else if( promedionotas >4)
     {
      System.out.println("Buenas notas, bien");
     }
     sc.close();
  }
}