package emailapp;

public class EmailApp {
  public static void main(String[] args) {
    Email em1 = new Email("john", "Doe");
    // em1.setDepartement();
    em1.generatePwd();
  }
}
