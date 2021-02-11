import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * 
 * Estabelecendo um fluxo de entrada concreto a partir de um arquivo !
 * 
 * @author Caio Augusto
 * @version 0.0.2
 */
public class TesteLeitura {

  public static void main(String[] args) throws IOException { // Utilização de exceptions pelo 
                                                              //Java IO caso a operação
                                                              // de leitura não saia como esperado
    //Fluxo de Entrada com Arquivo  
    InputStream fis = new FileInputStream("lorem.txt"); //Le o arquivo em bytes
    Reader isr = new InputStreamReader(fis,"UTF-8"); // Transforma bytes em caracteres
    BufferedReader br = new BufferedReader(isr); //Transforma um conjunto de caracteres

    String linha = br.readLine(); //Leitura linha a linha do arquivo;

    while (linha != null) {     
      System.out.println(linha); 
      linha = br.readLine();
    }

    br.close(); // a detecção de seu fim;
  
  }

}