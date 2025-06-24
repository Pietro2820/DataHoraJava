import javax.swing.text.html.HTMLDocument;
import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Vou criar um exemplo com uma data de uma compra e vou colocar parcelas

        LocalDate dataDaCompra = LocalDate.now();

        System.out.println(dataDaCompra);
        LocalDate dPrimeiraParcela = LocalDate.of(2025, 7, 24);
        LocalDate dSegundaParcela = LocalDate.of(2025, 8, 24);

        // Vamos fazer um if para saber se a parcela está atrasada ou não

        // Nesse caso aqui vou ver se a data da primeira parcela é correspondente à data de hoje (24/06/2025).
        if (dPrimeiraParcela.isEqual(LocalDate.now())) { // o "is.Equal" vê se as datas são iguais
            System.out.println("Hoje é dia do vencimento");
        } else {
            System.out.println("Ainda não venceu. Vencerá na data: " + dPrimeiraParcela);
        }

        // Continuado com a mesma estrutura posso utilizar diferentes is... para colocar outros tipos de comparação...

        // Nesse caso aqui vou ver se a data da primeira parcela é correspondente à data de hoje (24/06/2025).
        if (dPrimeiraParcela.isBefore(LocalDate.now())) { // O "is.Before" ele compra se as datas são anteriores.
            System.out.println("Hoje é dia do vencimento");
        } else {
            System.out.println("Ainda não venceu. Vencerá na data: " + dPrimeiraParcela);
        }

        // Para colocar a data no formato brasileiro, por exemplo, temos que usar o "DataTimeFormatter"

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data da compra: " + dataDaCompra.format(formato));


        // Uma coisa que já senti falta é o fato da criação de parcelas automaticamente


    }
}
