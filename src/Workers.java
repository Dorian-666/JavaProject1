import java.util.HashMap;
import java.util.Scanner;

public class Workers extends Human {
    Scanner scan = new Scanner(System.in);

    private HashMap<String, String> workers= new HashMap<String, String>();
    {



            workers.put("John Mikey","32");
            workers.put("Nicholos Cage","24");
            workers.put("Tobey Magiure","21");
            workers.put("Valentina Tereshkova","23");
            workers.put("Fuad Agalarov","34");
            workers.put("Josh Brolin","23");
            workers.put("Leyla Mustafazadeh","30");
            workers.put("Emir Cankiran","12");
            workers.put("July Obama","19");
            workers.put("Anna Mey","28");


        }

    public HashMap<String, String> getWorkers() {
            return this.workers;


        }

    public void showInfo(){

        int num=1;

        System.out.println("Workers' details:");

        for (String i : getWorkers().keySet()) {
            System.out.println(num+"."+"Name and Surname: " + i + " ,Age: " + getWorkers().get(i));
            num++;
        }


    }

    public void setWorkers( String input) {
        this.workers = workers;
    }

    @Override
    public void setAge(String age) {
        super.setAge(age);
    }

    @Override
    public void setNameAndSurname(String nameAndSurname) {
        super.setNameAndSurname(nameAndSurname);
    }

    public void changeRemove(){
        int loop0=1;

        if(loop0>1){

            scan.nextLine();
        }


        while(true){

            System.out.print("Enter:");

            String input1 =  scan.nextLine();

            boolean result = getWorkers().containsKey(input1);

            loop0=loop0+1;

        if (result == true) {

            this.getWorkers().remove(input1);
            break;
        }

        else{
            System.out.println("Please, enter correct name or surname!");

            scan.next();

            System.out.print("Enter:");
            }
        }




    }
    public void changeAdd(){

        System.out.print("Enter name and surname:");
        String input2 = scan.nextLine();
        setNameAndSurname(input2);

        System.out.print("Enter age:");
        String input3 = scan.nextLine();
        setAge(input3);

        this.getWorkers().put(input2,input3);
    }
}



