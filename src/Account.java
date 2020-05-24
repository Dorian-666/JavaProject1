import java.util.HashMap;
import java.util.Scanner;

public class Account {

    Scanner scan1 = new Scanner(System.in);

    private HashMap<String, String> accounts=  new HashMap<String, String>();
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

            boolean resultLogin = getAccounts().containsKey(login);
            boolean resultPassword = getAccounts().containsValue(password);
            if ((resultLogin == true) && (resultPassword == true )) {

                System.out.println("System is loading...");;
                break;


            }
            else{

                System.out.println("Please, enter correct login or password!");
            }
        }

    }
}
