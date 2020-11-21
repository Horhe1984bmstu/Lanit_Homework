import animal_food.CarnivorousFood;
import animal_food.Fruit;
import animal_food.HerbivoreFood;
import animal_food.Meat;
import animals.Bat;
import animals.Coon;
import animals.Lemure;
import aviaries.Aviaries;
import logger_01.LG;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    static final Logger LOG2 = LogManager.getLogger();

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException
    {

       // Exception e = new RuntimeException("RuntimeException example");
        LOG2.trace("trace");
        LOG2.debug("debug");
        LOG2.info("info");
        LOG2.warn("warn");
       // LOG.error("error", e);
        LOG2.error("error");
        LOG2.fatal("fatal");

        LOG2.atLevel(Level.ERROR);


        System.out.println("--------------------------------------");

        LG.main();




        Lemure lemur_1 = new Lemure("Пират", 1,2, 3, 3);
        Lemure lemur_2 = new Lemure("Бухгалтер Вася",1, 3, 5, 3);
        Lemure lemur_3 = new Lemure("Леон", 1,2, 3, 3);
        Lemure lemur_4 = new Lemure("Чапаев",1 ,2, 3, 3);
        Lemure lemur_5 = new Lemure("Тихий", 1,2, 3, 3);
        Lemure lemur_6 = new Lemure("Пионер", 1,2, 3, 3);
        Lemure lemur_7 = new Lemure("Тед", 1,2, 3, 3);

        Coon coon_1 = new Coon("Федя",1, 3, 7, 4);
        Coon coon_2 = new Coon("Рыхлый",2, 3, 7, 4);
        Coon coon_3 = new Coon("Пухлый",3, 2, 5, 4);

        Bat bat_1 = new Bat("Дракула",1,2, 5, 2);
        HerbivoreFood fruit_1 = new Fruit(150, 10, 8);
        CarnivorousFood fruit_2 = new Meat(800, 10, 8);

/*
       HerbivoreAviaries A_1  = new HerbivoreAviaries(7);
       //Проверку на хищников и травоядных в одном вольере делать не стал,
       //можно было сделать так же как и с типом еды, веганской и не очень.
       //И еноты с лимурами нормально уживаются


        A_1.addAnimals(lemur_1,coon_1,coon_2,lemur_3,lemur_4,lemur_5,lemur_6);
        A_1.view_aviarie();
        A_1.release_all_Animals();
        A_1.view_aviarie();
        A_1.addAnimals(coon_1,coon_2);
        A_1.view_aviarie();
        A_1.release_all_Animals();
        A_1.view_aviarie();
        A_1.addAnimals(coon_1,coon_2);
        A_1.view_aviarie();
        A_1.addAnimals(lemur_1,coon_1,coon_2,lemur_3,lemur_4,lemur_2,lemur_7);
        A_1.view_aviarie();


    */


        Aviaries A_1_T = new Aviaries(5,"MEDIUM");

        //A_1_T.add(coon_1,"Федя");
        //A_1_T.add(coon_2,"Рыхлый");
        //A_1_T.add(lemur_1,"Пират");
        //A_1_T.add(lemur_2,"Бухгалтер Вася");
        //A_1_T.add(lemur_3,"Леон");
        //A_1_T.add(lemur_4,"Чапаев");
        //A_1_T.release("Федя");
        //A_1_T.release("Рыхлый");

        coon_1.nightSeeing();
        bat_1.nightSeeing();


       //lemur_1.eat(fruit_1);
       //coon_2.eat(fruit_2); //мясо, с названием fruit_2
       //coon_1.eat(fruit_1); //фрукт, выведет исключение

       //A_1_T.add(coon_1,"Федя");
       //A_1_T.add(coon_2,"Рыхлый");
       //A_1_T.add(coon_3,"Пухлый"); //  слишком большой енот, ему не подойдет стандартный вольер
       //A_1_T.add(lemur_1,"Пират");
       //A_1_T.searchingByname("Федя");



    }

}
