package Animal_food;

public abstract class Food
{
    int calories;
    int delicacy;

    public Food(int calories, int delicacy)
    {
        this.calories = calories;
        this.delicacy = delicacy;
    }
    abstract void was_eaten();

}
