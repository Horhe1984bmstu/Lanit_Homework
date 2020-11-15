package animals;


public abstract class Herbivore extends Animals
{
    int disguise_and_flair;
    public Herbivore (int speed, int activity, int disguise_and_flair)
    {
        super(speed, activity);
        this.disguise_and_flair = disguise_and_flair;
    }
}