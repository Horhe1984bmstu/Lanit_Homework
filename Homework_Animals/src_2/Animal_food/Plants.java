package Animal_food;

public class Plants extends Herbivore_food

{
    final public String TYPE_OF_FOOD = "For Herbivore";
    public Plants (int calories, int delicacy, int juiciness)
    {
        super (calories, delicacy, juiciness);
    }
    public void was_eaten()
    {
        System.out.println("Съел растение");
    }

}