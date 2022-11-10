import java.util.*;
public class reto5
{
  public static void main(String[] args)
   {
  Scanner sc = new Scanner(System.in);
  
  int Productos;
  double Costo;
  double suma = suma+ Costo;

    System.out.println("Bienvenido al supermercado" +
    "\n Ingrese la cantidad de productos que desea facturar:");
    Productos = sc.nextInt();
    
    for(int total = 1;  total <= Productos; a++)
    {
    System.out.println("Ingrese el costo del producto " + total + ":");
    Costo = read.nextDouble();
    }
    
    System.out.println("El total de su compra es: " + suma);
    sc.close();
  }
}