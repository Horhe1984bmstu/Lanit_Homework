package animal_food;

public class Fruit extends HerbivoreFood

{
    final public String TYPE_OF_FOOD = "For Herbivore";
    public Fruit (int calories, int delicacy, int juiciness)
    {
        super (calories, delicacy, juiciness);
    }
    void wasEaten()
    {
        System.out.println("Съел фрукт");
    }
}

