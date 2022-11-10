package Retos;
import java.util.*;
public class reto8
 {
 public static void main(String[] args)
   {
    int nadadores;
    double mejorT;
    String[] nadador = new String[nadadores];
    Double[] tiemponadador = new Double[nadadores];
    Scanner sc= new Scanner(System.in);
   
   
    System.out.println("Competencia de natación, porfavor ingrese la cantidad de competidores");
    nadadores = sc.nextInt();
   
    for(int i=0; i<nadadores; i++)
    {
      System.out.println("Nombre de nadador: ");
      nadador[i]= sc.next();
      System.out.println("Tiempo que realiza el nadador en segundos ");
      tiemponadador[i]= sc.nextDouble();
    }
   
    System.out.println("El tiempo que tomarón los nadadores fue: ");
    for(int n=0;n<nadadores;n++)
    {
      System.out.println(nadador[n] + tiemponadador[n] + " segundos");

    }

 
  for(int t=0;t<nadadores;t++)
  {
    if(tiemponadador[t] == (mejorT))
    {
    System.out.println("El ganador fue: " + nadador[t] + " \ncon un tiempo de: " + tiemponadador[t]);
    }
  }
sc.close();
  }
}