package Animal_food;

public class Bugs extends Carnivorous_food
{
    final public String TYPE_OF_FOOD = "For Carnivorous";
    public Bugs (int calories, int delicacy, int rigidity)
    {
        super (calories, delicacy, rigidity);
    }
    public void was_eaten()
    {
        System.out.println("Съел жука");
    }

}
