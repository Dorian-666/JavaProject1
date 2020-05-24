import java.util.HashMap;
import java.util.Scanner;

public class Deserts extends Cost {
    Scanner scan4 = new Scanner(System.in);

    private HashMap<String, Double> frozenDeserts = new HashMap<String, Double>();

    {

    }

    public HashMap<String, Double> getFrozenDeserts() {
        return frozenDeserts;
    }

    private HashMap<String, Double> hotDeserts = new HashMap<String, Double>();

    {

    }

    public HashMap<String, Double> getHotDeserts() {
        return hotDeserts;
    }

    public void showFrozenDeserts() {

        int n = 1;

        for (String i : getFrozenDeserts().keySet()) {
            System.out.println(n+"." + i + " Price: " + getFrozenDeserts().get(i) + "$");
                n++;
        }



    }
    public void removeFrozenDeserts(){
        if(loop6>1){

            scan4.nextLine();}


            while(true) {

                System.out.print("Enter desert's name from list:");


                String inputDesert1 = scan4.nextLine();

                boolean resultDesert=getFrozenDeserts().containsKey(inputDesert1);

                if(resultDesert==true){
                    this.getFrozenDeserts().remove(inputDesert1);
                    break;
                }
                else{
                    System.out.println("Please,enter correct frozen desert name!");
                    continue;
                }






            }






    }
    int loop6=1;
    public void addFrozenDeserts(){

        boolean loop=true;

        if (loop6 == 1) {

            System.out.print("Please,enter new name of desert:");




        }
        else if(loop6>1){


            System.out.print("Please,enter new name of desert:");
            scan4.nextLine();



        }

        String input= scan4.nextLine();

        while(loop) {


            try {
                System.out.print("Enter the price of this new desert:");

                double input1 = scan4.nextDouble();

                this.getFrozenDeserts().put(input, input1);

                loop=false;

                loop6 = loop6+1;

            } catch (Exception e) {
                System.out.println("Please,enter number for price!");
                scan4.next();


            }


        }







    }
    public void showHotDeserts(){

        int nn =1;

        for (String ii : getHotDeserts().keySet()){
            System.out.println(nn+"."+ ii+" Price: "+ getHotDeserts().get(ii)+"$");
               nn++;
        }
    }
    int loop7=1;

    public void addHotDeserts() {

        boolean loop = true;

        if (loop7 == 1) {

            System.out.print("Please,enter new name of desert:");




        }
        else if(loop7>1){


            System.out.print("Please,enter new name of desert:");
            scan4.nextLine();



        }

        String inputHotDesert = scan4.nextLine();

        while (loop) {


            try {
                System.out.print("Enter the price of this new desert:");

                double inputPrice = scan4.nextDouble();

                this.getHotDeserts().put(inputHotDesert, inputPrice);

                loop7 = loop7+1;

                loop = false;

            } catch (Exception e) {

                System.out.println("Please,enter number for price!");
                scan4.next();


            }


        }
    }
    public void removeHotDeserts() {
        if(loop7>1){
            scan4.nextLine();}

        while (true) {

            System.out.print("Enter desert's name from list:");


            String n = scan4.nextLine();

            boolean resultHot = getHotDeserts().containsKey(n);

            System.out.println(resultHot);

            if (resultHot == true) {

                this.getHotDeserts().remove(n);
                break;

            } else {
                System.out.println("Please,enter correct name of hot desert!");
               continue;
            }
        }
    }
        }



