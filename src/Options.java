import java.util.Scanner;

import static javafx.application.Platform.exit;

public class Options {
    private boolean loopWorker;

    private boolean resultEdit;
    private boolean result;

    private boolean exitFromSystem;

    Account account = new Account();
    Scanner scanEnter1 = new Scanner(System.in);
    Deserts desertFrozen= new FrozenDeserts();


    Main main = new Main();
    public void edit(){

        while(true){

        System.out.println("1.Menu");
        System.out.println("2.Workers");
        System.out.print("Enter:");

        String inputEdit=scanEnter1.nextLine();

        if(inputEdit.equals("1")){

            setResultEdit(true);
            break;

        }else if(inputEdit.equals("2")){

            setLoopWorker(false);
            break;

        } else{
            System.out.println("Please enter number ranging from 1 to 2!");

        }







        }


    }
    public void changeMeal(){

        System.out.println("1.Show meals");
        System.out.println("2.Add New Meal");
        System.out.println("3.Remove Meal");
        System.out.println("4.Go back to entrance ");

    }

    public void changeDesert(){

      System.out.println("1.Show Deserts");
        System.out.println("2.Add New Desert");
        System.out.println("3.Remove Desert");
        System.out.println("4.Go back to entrance ");
    }
    public void changeDrink(){

            System.out.println("1.Show Drinks");
            System.out.println("2.Add New Drink");
            System.out.println("3.Remove Drink");
            System.out.println("4.Go back to entrance");

    }



    public void entrance(){

        System.out.println("Welcome to restaurant management system!");
        System.out.println("PLease , enter the particular  number according to the  one of options-Menu(Ordering) and Management.");
        System.out.println("1.Menu");
        System.out.println("2.Management");
        System.out.println("3.Exit the system");



    }
    public void menu(){

        System.out.println("Welcome to menu!");
        System.out.println("Menu:");
        System.out.println("1.Meals");
        System.out.println("2.Drinks");
        System.out.println("3.Deserts");
        System.out.println("4.Go back");
    }

    public void changeOfWorkers(){

        System.out.println("1.Show workers' details");
        System.out.println("2.Add new worker");
        System.out.println("3.Change worker");
        System.out.println("4.Go back");
        System.out.print("Enter number for option which you want to do:");
    }

    public void changeOfMenu(){

            System.out.println("1.Meals");
            System.out.println("2.Deserts");
            System.out.println("3.Drinks");
            System.out.println("4.Go back to entrance");

    }


    public void entranceAccount() {


        while(true){

            System.out.print("Enter:");

            String inputEdit=scanEnter1.nextLine();

            if(inputEdit.equals("1")){

                System.out.println("Welcome to menu!");
                System.out.println("1.Drinks");
                System.out.println("2.Meals");
                System.out.println("3.Deserts");
                System.out.println("4.Go back to entrance");
                break;
            }else if(inputEdit.equals("2")){

                setLoopWorker(true);
                account.enterPasswordAndAccount();
                break;

            } else if(inputEdit.equals("3")){

                System.out.println("Logged out!");

                setExitFromSystem(true);
                break;
            }
            else{
                System.out.println("Please enter number ranging from 1 to 3!");

            }







        }





    }

    public boolean isLoopWorker() {
        return loopWorker;
    }

    public void setLoopWorker(boolean loopWorker) {
        this.loopWorker = loopWorker;
    }

    public boolean isResultEdit() {
        return resultEdit;
    }

    public void setResultEdit(boolean resultEdit) {
        this.resultEdit = resultEdit;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public boolean isExitFromSystem() {
        return exitFromSystem;
    }

    public void setExitFromSystem(boolean exitFromSystem) {
        this.exitFromSystem = exitFromSystem;
    }
}

