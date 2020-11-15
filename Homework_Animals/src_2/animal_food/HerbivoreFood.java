package animal_food;

public abstract class HerbivoreFood extends Food

{
    int juiciness;

    public HerbivoreFood(int calories, int delicacy, int juiciness)
    {
        super (calories, delicacy);
        this.juiciness = juiciness;
    }
}
