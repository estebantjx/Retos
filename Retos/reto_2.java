import java.util.Scanner;

 public class reto_2
 {
/**
 * @param args
 */
public static void main(String[] args) 
{
    double Pbebe = 0;
    double Ebebe = 0;
    double dosis = 0;
    try (Scanner sc = new  Scanner(System.in))
    {

        System.out.println("Calcular dosis de vacuna: ");
        System.out.println("Peso del bebe en kg: ");
        Pbebe = sc.nextInt();
        System.out.println("Introduce la edad del bebe en meses: ");
        Ebebe = sc.nextInt();
        dosis = ((Pbebe + 10) /  (Ebebe *10) * 8);
        System.out.println("La dosis para la vacuna correspondiente para el bebe de " + Ebebe + 
        " meses y de un peso de " + Pbebe + "Kg, es: " + dosis);
    }
}
}