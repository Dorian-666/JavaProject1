import java.util.HashMap;
import java.util.Scanner;

public class Drinks extends Cost {
    Scanner scan5 = new Scanner(System.in);

    private HashMap<String, Double> carbonatedDrinks = new java.util.HashMap<String, Double>();{


    }

    public HashMap<String, Double> getCarbonatedDrinks() {
        return carbonatedDrinks;
    }
    public void showCarbonatedDrinks() {

        int o = 1;
        for (String u : getCarbonatedDrinks().keySet()) {
            System.out.println(o+"." + u + " Price: " + getCarbonatedDrinks().get(u) + "$");
            o++;
        }


    }
    int loop5=1;
    public void addCarbonatedDrinks(){

        boolean loop=true;

        if (loop5 == 1) {

            System.out.print("Please,enter new name of drink:");




        }
        else if(loop5>1){


            System.out.print("Please,enter new name of drink:");
            scan5.nextLine();



        }

        String inputDrink33= scan5.nextLine();

        while(loop) {


            try {

                System.out.print("Enter the price of this new drink:");

                double inputDrinkPrice3 = scan5.nextDouble();

                this.getCarbonatedDrinks().put(inputDrink33,inputDrinkPrice3);

                loop5 = loop5+1;

                loop=false;

            } catch (Exception e) {

                System.out.println("Please,enter number for price!");
                scan5.next();


            }


        }







    }

    public void removeCarbonatedDrinks(){
        if(loop5>1){
            scan5.nextLine();}



        while(true) {
            System.out.print("Enter drink's name from list:");


            String inputDrink3 = scan5.nextLine();

            boolean resultDrink3=getCarbonatedDrinks().containsKey(inputDrink3);

            if(resultDrink3==true){

                this.getFruitJuices().remove(inputDrink3);
                break;
            }
            else{

                System.out.println("Please,enter correct  drink's name!");
                continue;
            }






        }






    }


    private HashMap<String, Double> fruitJuices = new HashMap<String, Double>();{

    }

    public HashMap<String, Double> getFruitJuices() {
        return fruitJuices;
    }
    public void showFruitJuices() {

        int oo = 1;
        for (String uu : getFruitJuices().keySet()) {


            System.out.println(oo+"." + uu + " Price: " + getFruitJuices().get(uu) + "$");
            oo++;

        }

    }
    public void removeFruitJuices(){
        if(loop4>1){

            scan5.nextLine();}



        while(true) {
            System.out.print("Enter drink's name from list:");


            String inputDrink1 = scan5.nextLine();

            boolean resultDrink=getFruitJuices().containsKey(inputDrink1);


            if(resultDrink==true){
                this.getFruitJuices().remove(inputDrink1);
                break;
            }

            else{
                System.out.println("Please,enter correct  drink name!");
                continue;
            }






        }






    }
    int loop4=1;
    public void addFruitJuices(){

        boolean loop=true;

        if (loop4 == 1) {

            System.out.print("Please,enter new name of drink:");




        }
        else if(loop4>1){


            System.out.print("Please,enter new name of drink:");
            scan5.nextLine();



        }

        String inputDrink11 = scan5.nextLine();

        while(loop) {


            try {

                System.out.print("Enter the price of this new drink:");

                double inputDrinkPrice1 = scan5.nextDouble();

                this.getFruitJuices().put(inputDrink11,inputDrinkPrice1);

                loop=false;

                loop4 = loop4+1;

            } catch (Exception e) {

                System.out.println("Please,enter number for price!");
                scan5.next();


            }


        }







    }

    private HashMap<String, Double > alcoholicDrinks = new HashMap<String, Double>();{

    }

    public HashMap<String, Double> getAlcoholicDrinks() {
        return alcoholicDrinks;
    }
    public void showAlcoholicDrinks() {
        int ooo = 1;
        for (String uuu : getAlcoholicDrinks().keySet()) {


            System.out.println(ooo+"." + uuu + " Price: " + getAlcoholicDrinks().get(uuu) + "$");
            ooo++;

        }

    }
    public void removeAlchoholicDrinks(){
        if(loop3>1){
            scan5.nextLine();}


        while(true) {
            System.out.print("Enter drink's name from list:");


            String inputDrink2 = scan5.nextLine();
            boolean resultDrink2=getAlcoholicDrinks().containsKey(inputDrink2);

            if(resultDrink2==true){

                this.getAlcoholicDrinks().remove(inputDrink2);
                break;
            }
            else{
                System.out.println("Please,enter correct  drink's name!");
                continue;
            }






        }






    }
    int loop3=1;
    public void addAlchoholicDrinks(){
        boolean loop=true;
        if (loop3 == 1) {

            System.out.print("Please,enter new name of desert:");




        }
        else if(loop3>1){


            System.out.print("Please,enter new name of desert:");
            scan5.nextLine();



        }

        String inputDrink22= scan5.nextLine();

        while(loop) {


            try {
                System.out.print("Enter the price of this new drink:");
                double inputDrinkPrice2 = scan5.nextDouble();
                this.getAlcoholicDrinks().put(inputDrink22,inputDrinkPrice2);
                loop=false;
                loop3 = loop3+1;

            } catch (Exception e) {
                scan5.next();
                System.out.println("Please,enter number for price!");



            }



        }







    }

}
