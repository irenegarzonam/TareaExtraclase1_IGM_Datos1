//Ejemplo Excepcion verificada con try catch

package cr.ac.itcr;

//Bibliotecas
import java.io.*;

public class TryCatchCheckedException
{
    public static void main(String args[])
    {
        //Creacion del documento
        try
        {
            File documento = new File("prueba.txt");
            FileWriter escritor = new FileWriter(documento);
            BufferedWriter buffer = new BufferedWriter(escritor);
            buffer.write("Hola!");
            buffer.newLine();
            buffer.write("Soy un ejemplo de una excepcion verificada");
            buffer.close();
            escritor.close();
        } catch (IOException ex) {
            System.out.println("Problema en la creacion del documento");
        }
        //Lectura del Documento
        try
        {
            FileReader lector = new FileReader(new File("prueba.txt")); //Ejemplo extra, si en vez de prueba.txt, pongo otro .txt, mi ctach me va a mandar un mensaje donde me dira donde esta el problema
            BufferedReader lectorbuffer = new BufferedReader(lector);
            String renglon = lectorbuffer.readLine();
            while (renglon!=null)
            {
                System.out.println(renglon);
                renglon = lectorbuffer.readLine();
            }
        } catch (IOException ex)
        {
            System.out.println("Problemas con la lectura del documento");
            System.out.println(ex.getMessage());
        }
    }
}
