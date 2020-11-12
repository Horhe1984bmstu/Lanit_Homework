import Animal_food.Carnivorous_food;
import Animal_food.Fruit;
import Animal_food.Herbivore_food;
import Animal_food.Meat;
import Animals.Coon;
import Animals.Lemure;
import Aviaries.Herbivore_aviaries;

public class Main
{
    public static void main (String[] args)
    {
    Lemure lemur_1 = new Lemure (2,5,3);
    Lemure lemur_2 = new Lemure (2,5,3);
    Lemure lemur_3 = new Lemure (2,5,3);
    Lemure lemur_4 = new Lemure (2,5,3);
    Lemure lemur_5 = new Lemure (2,5,3);
    Lemure lemur_6 = new Lemure (2,5,3);
    Lemure lemur_7 = new Lemure (2,5,3);

    Coon coon_1 = new Coon(3,7,8);
    Coon coon_2 = new Coon(3,7,8);

    Herbivore_food fruit_1 = new Fruit(150,10,8);
    Carnivorous_food fruit_2 = new Meat (800,10,8);

    //Если попробовать накормить лимура "фруктом" fruit_2, он не станет это есть, а вот еноту нравится.

    //lemur_1.eat(fruit_1);
    //coon_1.eat(fruit_2);


        Herbivore_aviaries A_1  = new Herbivore_aviaries(7);
    /* Проверку на хищников и травоядных в одном вольере делать не стал,
       можно было сделать так же как и с типом еды, веганской и не очень.
       И еноты с лимурами нормально уживаются*/
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
    }
}
