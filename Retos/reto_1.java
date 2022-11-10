import java.util.Scanner;

 public class reto_1
 {
public static void main(String[] args) 
{
    try (Scanner sc = new  Scanner(System.in))
    {
        double Farenheit = 0;

        System.out.println("Introduce el dato en Farenheit: ");
        Farenheit = sc.nextInt();
        double centigrados = (Farenheit - 32) / 1.8;
        System.out.println("En grados centigrados son: "+ centigrados);
    }
}
}