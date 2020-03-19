package figuras;
import java.util.Scanner;
/**
 * @author Mahonri
 */
public class Figuras {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);        
        int l1,l2,opcion;
        System.out.println("Menu de opciones");
        System.out.println("1.Calcular aerea del cuadrado");
        System.out.println("2.Calcular el perimetro del cuadrado");
        System.out.println("3.Calcular aerea de rectangulo");
        System.out.println("4.Calcular el perimetro del rectangulo");
        System.out.println("Ingrese la opcion que desea");
        opcion=sc.nextInt();
        if (opcion==1)
        { System.out.println("Has ingresado a la opcion 1");
          System.out.println("Ingresa el lado del cuadrado");
          l1=sc.nextInt();
          System.out.println("El aerea del cuadrado es: " + l1*l1);
        }
        if (opcion==3)
        {System.out.println("Has ingresado a la opcion 2");
          System.out.println("Ingresa el largo del rectangulo");
          l1=sc.nextInt();
          System.out.println("Ingresa la base del rectangulo");
          l2=sc.nextInt();
          System.out.println("El aerea del rectangulo es: " + l1*l2);        
        }
        if(opcion==2)
        {System.out.println("Has ingresado a la opcion 2");
          System.out.println("Ingresa el lado del cuadrado");
          l1=sc.nextInt();
          System.out.println("El perimetro del cuadrado es: " + 4*l1);
        }
        if (opcion==4)
        {System.out.println("Has ingresado a la opcion 2");
          System.out.println("Ingresa el largo del rectangulo");
          l1=sc.nextInt();
          System.out.println("Ingresa la base del rectangulo");
          l2=sc.nextInt();
          System.out.println("El perimetro del rectangulo es: " + ((2*l1)+(2*l2)));
        }
    }
}
