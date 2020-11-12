package Animal_food;

public abstract class Carnivorous_food extends Food

{
    int rigidity;

    public Carnivorous_food(int calories, int delicacy, int rigidity)
    {
        super (calories, delicacy);
        this.rigidity = rigidity;
    }
}