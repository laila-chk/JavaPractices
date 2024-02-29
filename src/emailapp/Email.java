package emailapp;
import java.util.Scanner;


public class Email {
  private String firstName;
  private String lastName;
  private String password;
  private String departement;
  private String email;
  private int mailboxCapacity;
  private String alternateEmail;

  //Constructor to receive firstName and lastName;
  public Email(String firstName, String lastName){
    this.firstName = firstName;
    this.lastName = lastName;
    setDepartement();
    this.email = firstName + "." + lastName + "@" + departement + ".company.com";
    System.out.println("Email created Mr: " + firstName + " " + lastName);
    System.out.println("it is: " + email );
    generatePwd(15);
  } 
  //ask for departement
  public void setDepartement() {
    System.out.println("choose departement:\n1) Sales\n2) Accounting\n3) Developement\n0) None");
    Scanner inp = new Scanner(System.in);

    try {
      int dep = inp.nextInt();
      switch (dep) {
        case 0:
        this.departement = "";
        break;

        case 1:
        this.departement = "Sales";
        break;

        case 2:
        this.departement = "Accounting";
        break;

        case 3:
        this.departement = "Developement";
        break;

        default:
        this.departement = "";
        break;
      }
    } catch (Exception e) {
      System.out.println("Please Choose a departement number!");
    }
    if (this.departement == null || this.departement.isEmpty()){
      System.out.println("departement was NOT set! try again..");
      System.exit(0);
    }
  }

  // //Generate random pwd
  public void generatePwd(int len) {

    String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*_+-=";
    char[] pwd = new char[len];
    int rand;
    for (int i = 0; i < len; i++){
      rand =(int)(Math.random() * chars.length()); 
      pwd[i] = chars.charAt(rand);
    }
   System.out.println("your password is: " + pwd); 
   System.out.println("please remember it."); 

  }

}
