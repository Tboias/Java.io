import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

import java.io.File;

public class TesteLeituraScanner {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(new File("contas.csv"),"UTF-8");

        while(scanner.hasNextLine()){
            String linha = scanner.nextLine();
            //System.out.println(linha);

            Scanner linhaScanner = new Scanner(linha);
            linhaScanner.useLocale(Locale.US);
            linhaScanner.useDelimiter(",");

            String tipoConta = linhaScanner.next();
            int Agencia = linhaScanner.nextInt();
            int Numero = linhaScanner.nextInt();
            String Titular = linhaScanner.next();
            double Saldo = linhaScanner.nextDouble();

            String valorFormatado = String.format( new Locale("pt","BR"), /*Locale.US*/ 
                                " %s - %02d-%02d, %s: %n" , tipoConta,Agencia,Numero,Titular,Saldo);
            System.out.println(valorFormatado);

            linhaScanner.close();
            // String[] valores = linha.split(",");
            // System.out.println(valores[3]);
        }

        scanner.close();
    }
}