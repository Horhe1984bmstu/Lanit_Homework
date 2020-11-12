package Animal_food;

public class Fruit extends Herbivore_food

{
    final public String TYPE_OF_FOOD = "For Herbivore";
    public Fruit (int calories, int delicacy, int juiciness)
    {
        super (calories, delicacy, juiciness);
    }
    void was_eaten()
    {
        System.out.println("Съел фрукт");
    }
}

