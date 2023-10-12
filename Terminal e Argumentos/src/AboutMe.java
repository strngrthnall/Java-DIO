import java.util.Scanner;
import java.util.Locale;

public class AboutMe {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

     double altura = scanner.nextDouble();

     System.out.println(altura);

    }

}
