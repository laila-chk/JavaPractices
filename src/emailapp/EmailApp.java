package emailapp;
import java.util.Scanner;

public class EmailApp {
  public static void main(String[] args) {
    String fn, ln;
    Email em1; 
    Scanner inp = new Scanner(System.in);
    System.out.println("Welcome to email generator, Please provide us with necessary infos to get your email");
    System.out.println("Enter first name: " );
    fn = inp.nextLine();
    System.out.println("Enter last name: " );
    ln = inp.nextLine();
    if (fn.length() == 0 || ln.length() == 0)
      System.out.println("Please enter data correctly!" );
    else
      em1 = new Email(fn, ln);
  }
}
