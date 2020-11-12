package Animal_food;

public class Meat extends Carnivorous_food
{
    final public String TYPE_OF_FOOD = "For Carnivorous";
    public Meat (int calories, int delicacy, int rigidity)
    {
        super (calories, delicacy, rigidity);
    }
    void was_eaten()
    {
        System.out.println("Съел мясо");
    }

}
