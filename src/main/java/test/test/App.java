package test.test;
import org.joda.time.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        DateTime dt = new DateTime();
        System.out.println("oggi è "+dt.toString("dd-MM-yyyy"));
        System.out.println("aggiunta di una modifica");
    }
}
