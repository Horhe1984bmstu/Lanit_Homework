package animal_food;

public class Plants extends HerbivoreFood

{
    final public String TYPE_OF_FOOD = "For Herbivore";
    public Plants (int calories, int delicacy, int juiciness)
    {
        super (calories, delicacy, juiciness);
    }
    public void wasEaten()
    {
        System.out.println("Съел растение");
    }

}