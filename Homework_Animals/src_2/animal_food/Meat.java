package animal_food;

public class Meat extends CarnivorousFood
{
    final public String TYPE_OF_FOOD = "For Carnivorous";
    public Meat (int calories, int delicacy, int rigidity)
    {
        super (calories, delicacy, rigidity);
    }
    void wasEaten()
    {
        System.out.println("Съел мясо");
    }

}
