import java.util.HashMap;
import java.util.Scanner;

public class Meals extends Cost {
    Scanner scan6 = new Scanner(System.in);


    private HashMap<String,Double> vegetable= new HashMap<String, Double>();{

    }

    public HashMap<String, Double> getVegetable() {
        return vegetable;
    }
    public void showVegetableMeals() {
        int p = 1;
        for (String x : getVegetable().keySet()) {


            System.out.println(p + "." + x + " Price: " + getVegetable().get(x) + "$");
            p++;

        }
    }
    public void removeVegetableMeals(){
        if(loop1>1){
        scan6.nextLine();}



        while(true) {

            System.out.print("Enter Meal's name from list:");


            String inputVegetable = scan6.nextLine();

            boolean resultMeal = getVegetable().containsKey(inputVegetable);

            if (resultMeal == true) {
                this.getVegetable().remove(inputVegetable);
                break;
            } else {
                System.out.println("Please,enter correct Vegetable(meal)'s name!");
                continue;



            }


        }


        }
    int loop1=1;
    public void addVegetableMeal(){
        boolean loop=true;


        if (loop1 == 1) {

            System.out.print("Please,enter the name of Meal(Vegetable):");




        } else if(loop1>1){


        System.out.print("Please,enter the name of Meal(Vegetable):");
        scan6.nextLine();



        }
        String inputMeal= scan6.nextLine();




        while(loop) {


            try {

                System.out.print("Enter the price of this new meal(vegetable):");

                double inputMealPrice1 = scan6.nextDouble();

                this.getVegetable().put(inputMeal,inputMealPrice1);

                loop1 = loop1+1;

                loop=false;


            }
            catch (Exception e) {
                scan6.next();
                System.out.println("Please,enter number for price!");



            }


        }







    }


    private HashMap<String,Double> meat= new HashMap<String, Double>();{

    }

    public HashMap<String, Double> getMeat() {
        return meat;
    }
    public void showMeatMeals(){

        int y = 1;

        for (String f : getMeat().keySet()) {
            System.out.println(y + "." + f + " Price: " + getMeat().get(f) + "$");
            y++;
        }
    }
    public void removeMeatMeals(){
        if(loop2>1){
            scan6.nextLine();}



        while(true) {

            System.out.print("Enter Meal's name from list:");


            String inputMeat = scan6.nextLine();

            boolean resultMeal = getMeat().containsKey(inputMeat);


            if (resultMeal == true) {

                this.getMeat().remove(inputMeat);
                break;

            } else {

                System.out.println("Please,enter correct meat(meal)'s name!");
                continue;
            }


        }


    }
    int loop2=1;
    public void addMeatMeal(){

        boolean loop=true;

        if (loop2 == 1) {

            System.out.print("Please,enter the name of Meal(Meat):");




        }
        else if(loop2>1){


            System.out.print("Please,enter the name of Meal(Meat):");
            scan6.nextLine();



        }

        String inputMeal1= scan6.nextLine();

        while(loop) {


            try {
                System.out.print("Enter the price of this new meal(meat):");

                double inputMealPrice2 = scan6.nextDouble();

                this.getMeat().put(inputMeal1,inputMealPrice2);

                loop=false;

                loop2 = loop2+1;

            } catch (Exception e) {

                scan6.next();
                System.out.println("Please,enter number for price!");



            }



        }







    }


}
