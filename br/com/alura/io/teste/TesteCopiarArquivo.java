import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

/**
 * 
 * Estabelecendo um fluxo de entrada concreto a partir de um arquivo !
 * 
 * @author Caio Augusto
 * @version 0.0.2
 */

public class TesteCopiarArquivo {

    // Utilização de exceptions pelo Java IO caso a operação de leitura não saia como esperado
    public static void main(String[] args) throws IOException { 

        // <------------------------------------------------------->

            //Somente Rede

            // new Socket().getInputStream();

            // Socket s = new Socket();
            // InputStream fis = s.getInputStream();
            // OutputStream fos = s.getOutputStream();

        //<------------------------------------------------------->

        // Fluxo de Entrada com Arquivo
        InputStream fis = System.in; // new FileInputStream("lorem.txt"); Le o arquivo em bytes 
                                    //System.out; Isso serve para Ler o Teclado 
        Reader isr = new InputStreamReader(fis); // Transforma bytes em caracteres
        BufferedReader br = new BufferedReader(isr); // Transforma um conjunto de caracteres

        // Fluxo de Saida com Arquivo                              
        OutputStream fos = System.out; // new FileOutputStream("lorem2.txt") Cria o arquivo em bytes
        Writer osw = new OutputStreamWriter(fos); // Transforma bytes em caracteres
        BufferedWriter bw = new BufferedWriter(osw); // Transforma um conjunto de caracteres

        String linha = br.readLine(); // Leitura linha a linha do arquivo;

        while (linha != null && !linha.isEmpty()) {
            bw.write(linha); //Faz com que a linha apareça no arquivo
            bw.newLine(); //Cria uma nova linha
            bw.flush(); // Se não criar um flush,ele ira guardar e não ira permitir sair até o close
                        //Com o flush o que vc digita sai na hora.
            linha = br.readLine(); //O codigo le a linha e adiciona
        }

        br.close(); // a detecção de seu fim;
        bw.close(); // a detecção de seu fim;

        // bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
        // bw.newLine();
        // bw.write("fafwafafawf afawwafaw");
    }

}
