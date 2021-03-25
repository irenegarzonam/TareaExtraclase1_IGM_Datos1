//ejemplo de un custom checked exception

package cr.ac.itcr;

//Bibliotecas
import java.util.Scanner;

class MiExcepcion2 extends Exception
{
    MiExcepcion2()
    {
        System.err.println("ERROR");
    }
}

public class CustomCheckedException
{
    public static void main(String args[])
    {
        //crea objet)o scanner para obtener ventana de comandos
        Scanner entrada = new Scanner(System.in);

        int estatura;

        System.out.println("Linea de espera: Montaña Rusa");

        System.out.print("Digita tu estatura en numeros (centimetros): ");
        estatura = entrada.nextInt();

        try
        {
            if (estatura < 150) //si la persona es menor a esa estatura, dara un mensaje de error.
                throw new MiExcepcion2();
        }catch(MiExcepcion2 ex)
        {
            System.err.print(ex);
            System.out.print("Para poder ingresar a la atraccion tu estatura debe de estar entre los 150 cm");
        }finally {
            System.out.println("\nPARQUE DE DIVERSIONES\n...está lleno de emociones");
        }
    }
}

