import java.io.PrintStream;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
     Operadores aulaOperadores = new Operadores();
     Repeticoes aulaRepeticoes = new Repeticoes();
     Vetores aulaVetores = new Vetores();
     aulaOperadores.showResults();
     aulaRepeticoes.showResults();
     aulaVetores.showResults();
     Metodos.printFromMetodos();
     Metodos.printGetSumMethodResult();
    }

}