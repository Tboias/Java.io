import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

/**
 * 
 * Estabelecendo um fluxo de entrada concreto a partir de um arquivo !
 * 
 * @author Caio Augusto
 * @version 0.0.2
 */
public class TesteEscritaPrintStream {

    public static void main(String[] args) throws IOException { 

        PrintStream ps = new PrintStream("lorem2.txt");
        ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
        ps.println();
        ps.println();
        ps.println();
        ps.println();
        ps.print("fafwafafawf afawwafaw");

        ps.close(); // a detecção de seu fim;


    }

}