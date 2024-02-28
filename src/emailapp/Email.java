package emailapp;
import java.util.Scanner;
import java.time.Instant;


public class Email {
  private String firstName;
  private String lastName;
  private String password;
  private String departement;
  private int mailboxCapacity;
  private String alternateEmail;

  //Constructor to receive firstName and lastName;
  public Email(String firstName, String lastName){
    this.firstName = firstName;
    this.lastName = lastName;
    setDepartement();
    generatePwd(12);
    System.out.println("Email created Mr: " + firstName + " " + lastName);
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
      System.out.println("departement was NOT set!");
    }
    else
    System.out.println("departement was set To: " + this.departement);

  }

  // //Generate random pwd ans set it.
  public void generatePwd(int len) {
    char[] pwd  = new char[len];
    String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
    int randomIndex;

    for (int i = 0; i < len; i++){
      randomIndex = (int)(Math.random() * chars.length());
      pwd[i] = chars.charAt(randomIndex);
    }
    this.password = new String(pwd);

  }

  //set mailboxCapacity

  //change the pwd

}
