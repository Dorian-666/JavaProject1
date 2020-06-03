import java.util.HashMap;
import java.util.Scanner;

public class Account {

    Scanner scan1 = new Scanner(System.in);

    private HashMap<String, String> accounts=  new HashMap <String, String>();
    {
        accounts.put("SuperMario","1234");
        accounts.put("Andrew","4321");
        accounts.put("Tobey2001","abc123");
        accounts.put("Valiya","1881");


    }

    public HashMap<String, String> getAccounts() {
        return accounts;
    }

    public void enterPasswordAndAccount(){
        while(true){

            System.out.print("Enter Login:");
            String login =  scan1.nextLine();

            System.out.print("Enter Password:");
            String password =  scan1.nextLine();


            if ((login.equals("SuperMario")) && (password.equals("1234") )) {

                System.out.println("System is loading...");
                break;


            }
            else if ((login.equals("Andrew")) && (password.equals("4321") )) {

                System.out.println("System is loading...");
                break;


            }
            else if ((login.equals("Tobey2001")) && (password.equals("abc123") )) {

                System.out.println("System is loading...");
                break;


            }
            else if ((login.equals("Valiya")) && (password.equals("1881") )) {

                System.out.println("System is loading...");
                break;


            }


            else{

                System.out.println("Please, enter correct login or password!");
            }
        }

    }
}
