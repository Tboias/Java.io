import java.io.IOException;
import java.io.PrintWriter;

/**
 * 
 * Estabelecendo um fluxo de entrada concreto a partir de um arquivo !
 * 
 * @author Caio Augusto
 * @version 0.0.2
 */
public class TesteEscritaPrintWriter {

    public static void main(String[] args) throws IOException { 
        
        PrintWriter ps = new PrintWriter("lorem3.txt","UTF-8");
        ps.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
        ps.println();
        ps.write("fafwafafawf afawwafaw");

        ps.close(); // a detecção de seu fim;


    }

}