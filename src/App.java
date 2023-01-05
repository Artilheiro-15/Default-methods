import java.util.Locale;
import java.util.Scanner;
import services.BrazilInterestService;
import services.InteresetService;
import services.UsaInterestService;

public class App {

  public static void main(String[] args) throws Exception {
    System.out.println("=======================================");
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Amount: ");
    double amount = sc.nextDouble();
    System.out.print("Months: ");
    int Months = sc.nextInt();

    InteresetService is = new UsaInterestService(1.0);
    double payment = is.payment(amount, Months);

    System.out.println("=======================================");
    System.out.println("Payment After " + Months + " Months: ");
    System.out.println(String.format("%.2f", payment));

    System.out.println("=======================================");
    sc.close();
  }
}
