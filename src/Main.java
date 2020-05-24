import java.util.Scanner;

public class Main extends Cost{

    static double sum=0;

    static double cashCarbonated=0.0;
    static double cashFruit=0.0;
    static double cashAlcoholic=0.0;
    static double sumOfDrinks=0.0;

    static double cashMeat=0.0;
    static double cashVegetable=0.0;
    static  double sumOfMeals=0.0;

    static double cashFrozen=0.0;
    static double cashHot=0.0;
    static  double sumOfDesert=0.0;

    static int resultMenu1=1;


    public static void main(String[] args) {

        Meals vegetable = new VegetableMeals();
        Meals meat = new MeatMeals();

        Options options = new Options();

        Account account = new Account();
        Workers worker = new Workers();

        Deserts frozen = new FrozenDeserts();
        Deserts hot = new HotDeserts();

        Drinks carbonated = new CarbonatedDrinks();
        Drinks fruitJuices = new FruitJuices();
        Drinks alcoholic = new AlcoholicDrinks();

        Scanner scanEnter = new Scanner(System.in);

        while (true) {

            options.entrance();
            options.entranceAccount();

            if(options.isExitFromSystem()==true){break;}

            if (options.isLoopWorker() == false) {
                if(resultMenu1>1){
                    scanEnter.nextLine();
                }

                System.out.print("Enter:");


                while (true) {

                    String menuInput = scanEnter.nextLine();

                    if (menuInput.equals("1")) {

                        while (true) {

                            System.out.println("1.Carbonated Drinks");
                            System.out.println("2.Fruit Juices");
                            System.out.println("3.Alcoholic Drinks");
                            System.out.println("4.Go back");
                            System.out.print("Enter:");

                            String menuInputDrink = scanEnter.nextLine();

                            if (menuInputDrink.equals("1")) {

                                carbonated.showCarbonatedDrinks();

                                while (true) {

                                    System.out.print("Enter the name of drink which you want(blank(push only enter button) to quit) :");

                                    String inputMenuCarbonated = scanEnter.nextLine();

                                    boolean resultCarbonated = carbonated.getCarbonatedDrinks().containsKey(inputMenuCarbonated);

                                    if (resultCarbonated == true) {

                                        cashCarbonated = cashCarbonated + cost(carbonated.getCarbonatedDrinks(), inputMenuCarbonated);

                                        System.out.println(cashCarbonated + "$");

                                    } else if (inputMenuCarbonated.isEmpty()) {

                                        System.out.println(cashCarbonated + "$");
                                        break;

                                    } else {
                                        System.out.println("This drink can not be found!Please,try again!");

                                    }

                                }

                            } else if (menuInputDrink.equals("2")) {

                                fruitJuices.showFruitJuices();

                                while (true) {

                                    System.out.print("Enter the name of drink which you want(blank(push only enter button) to quit) :");

                                    String inputMenuFruit = scanEnter.nextLine();

                                    boolean resultFruit = fruitJuices.getFruitJuices().containsKey(inputMenuFruit);

                                    if (resultFruit == true) {

                                        cashFruit = cashFruit + cost(fruitJuices.getFruitJuices(), inputMenuFruit);
                                        System.out.println(cashFruit + "$");

                                    } else if (inputMenuFruit.isEmpty()) {

                                        System.out.println(cashFruit + "$");
                                        break;
                                    } else {

                                        System.out.println("This drink can not be found!Please,try again!");

                                    }

                                }

                            } else if (menuInputDrink.equals("3")) {

                                alcoholic.showAlcoholicDrinks();

                                while (true) {

                                    System.out.print("Enter the name of drink which you want(blank(push only enter button) to quit) :");

                                    String inputMenuAlcoholic = scanEnter.nextLine();
                                    boolean resultAlcoholic = alcoholic.getAlcoholicDrinks().containsKey(inputMenuAlcoholic);
                                    if (resultAlcoholic == true) {

                                        cashAlcoholic = cashAlcoholic + cost(alcoholic.getAlcoholicDrinks(), inputMenuAlcoholic);
                                        System.out.println(cashAlcoholic + "$");

                                    } else if (inputMenuAlcoholic.isEmpty()) {

                                        System.out.println(cashAlcoholic + "$");
                                        break;

                                    } else {

                                        System.out.println("This drink can not be found!Please,try again!");

                                    }

                                }

                            } else if (menuInputDrink.equals("4")) {
                                sumOfDrinks = cashAlcoholic + cashFruit + cashCarbonated;

                                System.out.println("Welcome to menu!");
                                System.out.println("1.Drinks");
                                System.out.println("2.Meals");
                                System.out.println("3.Deserts");
                                System.out.println("4.Go back to entrance");

                                sum=sumOfDrinks+sumOfMeals+sumOfDesert;

                                System.out.println("Current total cash:"+sum+"$");
                                System.out.print("Enter:");
                                break;

                            } else {

                                System.out.println("Please,enter number ranging from 1 to 4");

                            }
                        }


                    } else if (menuInput.equals("2")) {
                        while (true) {

                            System.out.println("1.Vegetable");
                            System.out.println("2.Meat");
                            System.out.println("3.Go back");
                            System.out.print("Enter:");

                            String inputMenuMeal=scanEnter.nextLine();




                            if (inputMenuMeal.equals("1")){

                                vegetable.showVegetableMeals();

                                while (true) {

                                    System.out.print("Enter the name of meal which you want(blank to quit) :");

                                    String inputMenuVegetable = scanEnter.nextLine();

                                    boolean resultVegetable = vegetable.getVegetable().containsKey(inputMenuVegetable);

                                    if (resultVegetable == true) {

                                        cashVegetable = cashVegetable+ cost(vegetable.getVegetable(), inputMenuVegetable);

                                        System.out.println(cashVegetable + "$");

                                    } else if (inputMenuVegetable.isEmpty()) {

                                        System.out.println(cashVegetable+ "$");
                                        break;
                                    } else {

                                        System.out.println("This meal can not be found!Please,try again!");
                                    }
                                }
                            }else if (inputMenuMeal.equals("2")) {
                                meat.showMeatMeals();

                                while (true) {

                                    System.out.print("Enter the name of meal which you want(blank(push only enter button) to quit) :");

                                    String inputMenuMeat = scanEnter.nextLine();

                                    boolean resultMeat = meat.getMeat().containsKey(inputMenuMeat);

                                    if (resultMeat == true) {
                                        cashMeat = cashMeat + cost(meat.getMeat(), inputMenuMeat);
                                        System.out.println(cashMeat + "$");

                                    } else if (inputMenuMeat.isEmpty()) {
                                        System.out.println(cashMeat + "$");
                                        break;

                                    } else {
                                        System.out.println("This meal can not be found!Please,try again!");
                                    }
                                }

                            }else if(inputMenuMeal.equals("3")){

                                sumOfMeals=  cashMeat + cashVegetable;

                                System.out.println("Welcome to menu!");
                                System.out.println("1.Drinks");
                                System.out.println("2.Meals");
                                System.out.println("3.Deserts");
                                System.out.println("4.Go back to entrance");

                                sum=sumOfDrinks+sumOfMeals+sumOfDesert;

                                System.out.println("Current total cash:"+sum+"$");
                                System.out.print("Enter:");

                                break;


                            }else {
                                System.out.println("Please,enter number ranging from 1 to 4");

                            }
                            }

                    }else if (menuInput.equals("3")) {

                        while (true) {

                            System.out.println("1.Frozen");
                            System.out.println("2.Hot");;
                            System.out.println("3.Go back");
                            System.out.print("Enter:");

                            String inputMenuDesert=scanEnter.nextLine();




                            if (inputMenuDesert.equals("1")){

                                frozen.showFrozenDeserts();

                                while (true) {

                                    System.out.print("Enter the name of desert which you want(blank to quit) :");

                                    String inputMenuFrozen= scanEnter.nextLine();

                                    boolean resultFrozen = frozen.getFrozenDeserts().containsKey(inputMenuFrozen);

                                    if (resultFrozen == true) {

                                        cashFrozen = cashFrozen+ cost(frozen.getFrozenDeserts(), inputMenuFrozen);

                                        System.out.println(cashFrozen+ "$");

                                    } else if (inputMenuFrozen.isEmpty()) {

                                        System.out.println(cashFrozen+ "$");
                                        break;

                                    } else {

                                        System.out.println("This desert can not be found!Please,try again!");

                                    }

                                }
                            }else if (inputMenuDesert.equals("2")) {

                                hot.showHotDeserts();

                                while (true) {

                                    System.out.print("Enter the name of desert which you want(blank(push only enter button) to quit) :");

                                    String inputMenuHot = scanEnter.nextLine();

                                    boolean resultHot = hot.getHotDeserts().containsKey(inputMenuHot);

                                    if (resultHot == true) {

                                        cashHot = cashHot + cost(hot.getHotDeserts(), inputMenuHot);

                                        System.out.println(cashHot + "$");

                                    } else if (inputMenuHot.isEmpty()) {

                                        System.out.println(cashHot + "$");
                                        break;

                                    } else {

                                        System.out.println("This desert can not be found!Please,try again!");
                                    }
                                }

                            }else if(inputMenuDesert.equals("3")){
                                sumOfDesert=cashHot+cashFrozen;

                                System.out.println("Welcome to menu!");
                                System.out.println("1.Drinks");
                                System.out.println("2.Meals");
                                System.out.println("3.Deserts");
                                System.out.println("4.Go back to entrance");

                                sum=sumOfDrinks+sumOfMeals+sumOfDesert;

                                System.out.println("Current total cash:"+sum+"$");
                                System.out.print("Enter:");
                                break;


                            }else {
                                System.out.println("Please,enter one number ranging from 1 to 4");

                            }
                            }
                        }


                    else if(menuInput.equals("4")){
                        sum=sumOfDrinks+sumOfMeals+sumOfDesert;
                        System.out.println("Total cash:"+sum+"$");

                        sum=0.0;

                        sumOfDesert=0.0;
                        sumOfMeals=0.0;
                        sumOfDrinks=0.0;

                        cashFrozen=0.0;
                        cashHot=0.0;

                        cashVegetable=0.0;
                        cashMeat=0.0;

                        cashAlcoholic=0.0;
                        cashCarbonated=0.0;
                        cashFruit=0.0;

                        break;
                    }else{
                        System.out.println("Please,enter number ranging from 1 to 4");
                        System.out.print("Enter:");
                    }
                }

            }
            else if (options.isLoopWorker() == true) {

                options.edit();

                if (options.isResultEdit() == false) {
                    boolean loopWorker=true;

                    while (loopWorker) {


                        options.changeOfWorkers();

                        try {

                            int inputChangeNumber = scanEnter.nextInt();

                            switch (inputChangeNumber) {

                                case 1:
                                    worker.showInfo();
                                    break;

                                case 2:
                                    worker.changeAdd();
                                    worker.showInfo();
                                    break;

                                case 3:
                                    worker.changeRemove();
                                    worker.showInfo();
                                    break;

                                case 4:
                                    options.setResultEdit(true);
                                    loopWorker=false;
                                    break;

                                default:
                                    System.out.println("Please, enter one number ranging from 1 to 4!");




                            }
                        } catch (Exception e) {

                            scanEnter.next();
                            System.out.println("Please, enter one number ranging from 1 to 4!");


                        }if(options.isResultEdit()==true){

                            options.setLoopWorker(false);
                            break;
                        }
                    }


                } else if (options.isResultEdit() == true) {

                    boolean loopO = true;

                    while (true) {

                        options.changeOfMenu();

                        try {
                            System.out.print("Enter:");

                            int inputChangeNumber1 = scanEnter.nextInt();

                            loopO = false;

                            if (inputChangeNumber1 == 1) {

                                boolean loopMeal = true;

                                while (loopMeal) {

                                    try {

                                        System.out.println("1.Vegetable");
                                        System.out.println("2.Meat");
                                        System.out.print("Enter:");

                                        loopMeal = false;

                                        int enterMeal = scanEnter.nextInt();

                                        if (enterMeal == 1) {

                                            boolean loopVegetable = true;
                                            while (loopVegetable)
                                            {
                                                try {
                                                    options.changeMeal();

                                                    System.out.print("Enter:");


                                                    int inputVegetable = scanEnter.nextInt();




                                                    if (inputVegetable == 1) {
                                                        vegetable.showVegetableMeals();

                                                    } else if (inputVegetable == 2) {
                                                        vegetable.addVegetableMeal();
                                                        vegetable.showVegetableMeals();

                                                    } else if (inputVegetable == 3) {
                                                        vegetable.removeVegetableMeals();
                                                        vegetable.showVegetableMeals();

                                                    } else if (inputVegetable == 4) {
                                                        options.setResultEdit(true);
                                                        loopVegetable = false;
                                                        resultMenu1=resultMenu1+1;

                                                    } else {
                                                        System.out.println("Please enter one number ranging from 1 to 4!");

                                                    }


                                                } catch (Exception e) {
                                                    scanEnter.next();

                                                    System.out.println("Please, enter one number ranging from 1 to 4!");

                                                }
                                            }
                                        } else if (enterMeal == 2) {

                                            boolean loopMeat = true;

                                            while (loopMeat) {

                                                try {
                                                    options.changeMeal();

                                                    System.out.print("Enter:");

                                                    int inputMeat = scanEnter.nextInt();



                                                    if (inputMeat == 1) {
                                                        meat.showMeatMeals();

                                                    } else if (inputMeat == 2) {
                                                        meat.addMeatMeal();
                                                        meat.showMeatMeals();

                                                    } else if (inputMeat == 3) {
                                                        meat.removeMeatMeals();
                                                        meat.showMeatMeals();

                                                    } else if (inputMeat == 4) {
                                                        options.setResultEdit(true);
                                                        loopMeat = false;
                                                        resultMenu1=resultMenu1+1;

                                                    } else {
                                                        System.out.println("Please enter one number ranging from 1 to 4!");

                                                    }

                                                } catch (Exception e) {

                                                    scanEnter.next();

                                                    System.out.println("Please, enter one number ranging from 1 to 4!");

                                                }

                                            }
                                        } else {

                                            System.out.println("Please enter one number ranging from 1 to 2!");

                                        }
                                    } catch (Exception e) {

                                        scanEnter.next();

                                        System.out.println("Please, enter one number ranging from 1 to 2!");
                                    }
                                }
                            } else if (inputChangeNumber1 == 2) {

                                boolean loopDesert = true;

                                while (loopDesert) {


                                    try {

                                        System.out.println("1.Frozen");
                                        System.out.println("2.Hot");
                                        System.out.print("Enter:");

                                        int enterDesert = scanEnter.nextInt();

                                        if (enterDesert == 1) {

                                            boolean loopFrozen = true;
                                            while (loopFrozen)
                                            {
                                                try {

                                                    options.changeDesert();

                                                    System.out.print("Enter:");

                                                    int inputFrozen = scanEnter.nextInt();



                                                    switch (inputFrozen) {

                                                        case 1:
                                                            frozen.showFrozenDeserts();
                                                            break;

                                                        case 2:
                                                            frozen.addFrozenDeserts();
                                                            frozen.showFrozenDeserts();
                                                            break;

                                                        case 3:

                                                            frozen.removeFrozenDeserts();
                                                            frozen.showFrozenDeserts();
                                                            break;

                                                        case 4:
                                                            options.setResultEdit(true);
                                                            loopFrozen = false;
                                                            resultMenu1=resultMenu1+1;
                                                            break;

                                                        default:
                                                            System.out.println("Please enter one number ranging from 1 to 4!");



                                                    }


                                                } catch (Exception e) {

                                                    scanEnter.next();
                                                    System.out.println("Please, enter one number ranging from 1 to 4!");
                                                }

                                            }
                                        } else if (enterDesert == 2) {

                                            boolean loopHot = true;

                                            while (loopHot) {

                                                try {

                                                    options.changeDesert();

                                                    System.out.print("Enter:");

                                                    int inputHot = scanEnter.nextInt();

                                                    if (inputHot == 1) {
                                                        hot.showHotDeserts();

                                                    } else if (inputHot == 2) {
                                                        hot.addHotDeserts();
                                                        hot.showHotDeserts();

                                                    } else if (inputHot == 3) {
                                                        hot.removeHotDeserts();
                                                        hot.showHotDeserts();

                                                    } else if (inputHot == 4) {
                                                        options.setResultEdit(true);
                                                        loopHot=true;
                                                        resultMenu1=resultMenu1+1;


                                                    } else {
                                                        System.out.println("Please enter number ranging from 1 to 4!");

                                                    }


                                                } catch (Exception e) {

                                                    scanEnter.next();
                                                    System.out.println("Please, enter one number ranging from 1 to 4!");

                                                }
                                            }
                                        } else {

                                            System.out.println("Please enter number ranging from 1 to 2!");

                                        }

                                    } catch (Exception e) {

                                        scanEnter.next();
                                        System.out.println("Please, enter one number ranging from 1 to 2!");
                                    }
                                }
                            } else if (inputChangeNumber1 == 3) {

                                boolean loopDrink = true;

                                while (loopDrink) {

                                    try {
                                        System.out.println("1.Carbonated Drinks");
                                        System.out.println("2.Fruit Juices");
                                        System.out.println("3.Alcoholic Drinks");
                                        System.out.print("Enter:");

                                        loopDrink=false;

                                        int enterDrink = scanEnter.nextInt();

                                        if (enterDrink == 1) {

                                            boolean loopCarbonated = true;

                                            while (loopCarbonated) {

                                                try {

                                                    options.changeDrink();

                                                    System.out.print("Enter:");

                                                    int inputCarbonated = scanEnter.nextInt();




                                                    if (inputCarbonated == 1) {
                                                        carbonated.showCarbonatedDrinks();

                                                    } else if (inputCarbonated == 2) {
                                                        carbonated.addCarbonatedDrinks();
                                                        carbonated.showCarbonatedDrinks();

                                                    } else if (inputCarbonated == 3) {
                                                        carbonated.removeCarbonatedDrinks();
                                                        carbonated.showCarbonatedDrinks();

                                                    } else if (inputCarbonated == 4) {
                                                        options.setResultEdit(true);
                                                        loopCarbonated = false;
                                                        resultMenu1=resultMenu1+1;

                                                    } else {
                                                        System.out.println("Please, enter one number ranging from 1 to 4!");

                                                    }

                                                } catch (Exception e) {

                                                    scanEnter.next();
                                                    System.out.println("Please, enter one number ranging from 1 to 4!");


                                                }
                                            }
                                        } else if (enterDrink == 2) {

                                            boolean loopFruit = true;

                                            while (loopFruit) {

                                                try {

                                                    options.changeDrink();

                                                    System.out.print("Enter:");

                                                    int inputFruit = scanEnter.nextInt();



                                                    if (inputFruit == 1) {
                                                        fruitJuices.showFruitJuices();

                                                    } else if (inputFruit == 2) {
                                                        fruitJuices.addFruitJuices();
                                                        fruitJuices.showFruitJuices();

                                                    } else if (inputFruit == 3) {
                                                        fruitJuices.removeFruitJuices();
                                                        fruitJuices.showFruitJuices();

                                                    } else if (inputFruit == 4) {
                                                        options.setResultEdit(true);
                                                        loopFruit = false;
                                                        resultMenu1=resultMenu1+1;

                                                    } else {
                                                        System.out.println("Please, enter one number ranging from 1 to 4!");


                                                    }

                                                } catch (Exception e) {

                                                    scanEnter.next();
                                                    System.out.println("Please, enter one number ranging from 1 to 3!");
                                                }
                                            }
                                        } else if (enterDrink == 3) {

                                            boolean loopAlcoholic = true;

                                            while (loopAlcoholic)
                                            {
                                                try {

                                                    options.changeDrink();

                                                    System.out.print("Enter:");

                                                    int inputAlchoholic = scanEnter.nextInt();



                                                    if (inputAlchoholic == 1) {
                                                        alcoholic.showAlcoholicDrinks();

                                                    } else if (inputAlchoholic == 2) {
                                                        alcoholic.addAlchoholicDrinks();
                                                        alcoholic.showAlcoholicDrinks();

                                                    } else if (inputAlchoholic == 3) {
                                                        alcoholic.removeAlchoholicDrinks();
                                                        alcoholic.showAlcoholicDrinks();

                                                    } else if (inputAlchoholic == 4) {
                                                        options.setResultEdit(true);
                                                        loopAlcoholic = false;
                                                        resultMenu1=resultMenu1+1;

                                                    } else {
                                                        System.out.println("Please, enter one number ranging from 1 to 4!");

                                                    }
                                                } catch (Exception e) {

                                                    scanEnter.next();
                                                    System.out.println("Please, enter one number ranging from 1 to 4!");
                                                }
                                            }
                                        } else {

                                            System.out.println("Please, enter one number ranging from 1 to 4!");

                                        }

                                    } catch (Exception e) {

                                        scanEnter.next();
                                        System.out.println("Please, enter one number ranging from 1 to 3!");
                                    }
                                }
                            } else if (inputChangeNumber1 == 4) {

                                options.setResultEdit(true);

                            } else {

                                System.out.println("Please, enter one number ranging from 1 to 4!");



                            }

                        } catch (Exception e) {

                            scanEnter.next();

                            System.out.println("Please, enter one number ranging from 1 to 4!");


                        }
                        if (options.isResultEdit() == true) {

                            options.setLoopWorker(false);
                            break;
                        }

                    }
                }
            }
        }
    }
        }






