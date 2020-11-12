package Animal_food;

public abstract class Herbivore_food extends Food

{
    int juiciness;

    public Herbivore_food(int calories, int delicacy, int juiciness)
    {
        super (calories, delicacy);
        this.juiciness = juiciness;
    }
}
