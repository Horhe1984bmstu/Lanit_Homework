package Animals;

public abstract class Carnivorous extends Animals
{
    int tooth_and_nails;
    public Carnivorous (int speed, int activity, int tooth_and_nails)
    {
        super(speed, activity);
        this.tooth_and_nails = tooth_and_nails;
    }
}
