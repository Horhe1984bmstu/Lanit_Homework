package animal_food;

public class Bugs extends CarnivorousFood
{
    final public String TYPE_OF_FOOD = "For Carnivorous";
    public Bugs (int calories, int delicacy, int rigidity)
    {
        super (calories, delicacy, rigidity);
    }
    public void wasEaten()
    {
        System.out.println("Съел жука");
    }

}
