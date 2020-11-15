package animal_food;

public abstract class CarnivorousFood extends Food

{
    int rigidity;

    public CarnivorousFood(int calories, int delicacy, int rigidity)
    {
        super (calories, delicacy);
        this.rigidity = rigidity;
    }
}