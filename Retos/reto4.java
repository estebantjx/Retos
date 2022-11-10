import java.util.Scanner;

public class reto4
{
	public static void main(String [] args)
	{
        Scanner sc = new Scanner(System.in);
        int selCompu = (int)(Math.random() * 3) + 1;
		
        System.out.println("Juego de la piedra papel y tijeras");
	    System.out.println("La computadora ya escogio...");

		System.out.print("Elija una opcion: " 
        + "    1-Piedra  " 
        + "    2-Papel  "
        +"     3-Tijeras  ");
		int selUs = sc.nextInt();

		System.out.print("La computadora habia escogido: ");
		switch ( selCompu )
		{
			case 1:
				System.out.println("Piedra");
				switch ( selUs)
				{
					case 1: 
                    System.out.println("Empate"); 
                    break;
					case 2: 
                    System.out.println("Tu ganas");
                    break;
					case 3: 
                    System.out.println("La computadora gana"); 
                    break;
				}
				break;

			case 2:
				System.out.println("Papel");
				switch ( selUs )
				{
					case 1: 
                    System.out.println("La computadora gana"); 
                    break;
					case 2: 
                    System.out.println("Empate");
                     break;
					case 3:
                     System.out.println("Tu ganas");
                      break;
				}
				break;

			case 3:
				System.out.println("Tijeras");
				switch ( selUs )
				{
					case 1:
                   System.out.println("Tu ganas"); 
                    break;
					case 2: 
                    System.out.println("La computadora gana"); 
                    break;
					case 3: 
                    System.out.println("Empate"); 
                    break;
				}
				break;
		}
        sc.close();
	}
}