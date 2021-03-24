//Ejemplo Excepcion Verificada con Throws
package cr.ac.itcr;

// Bibliotecas
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
// Las excepciones verificadas deben ser capturadas de forma obligatoria por nuestro programa
// En este caso lo haremos con throws
public class CheckedException
{
    public void LeerDoc() throws FileNotFoundException
    {
        File documento = new File("C:\\prueba\\prueba.txt");//abrir texto
        FileReader lector = new FileReader(documento);
    }
    // FileNotFoundException deriva de IOException
    public void LeerDocVersion2() throws IOException
    {
        LeerDoc();
    }

    public static void main(String args[])
    {
    }
}