import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * Estabelecendo um fluxo de entrada concreto a partir de um arquivo !
 * 
 * @author Caio Augusto
 * @version 0.0.2
 */
public class TesteEscritaFileWriter {

    public static void main(String[] args) throws IOException { // Utilização de exceptions pelo
                                                                // Java IO caso a operação
                                                                // de leitura não saia como esperado
        // Fluxo de Entrada com Arquivo
        // OutputStream fos = new FileOutputStream("lorem2.txt"); // Le o arquivo em bytes
        // Writer osr = new OutputStreamWriter(fos); // Transforma bytes em caracteres
        // BufferedWriter bw = new BufferedWriter(osr); // Transforma um conjunto de caracteres

        FileWriter fw = new FileWriter("lorem2.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
        bw.newLine();;
        bw.write("fafwafafawf afawwafaw");
        bw.close(); // a detecção de seu fim;


    }

}