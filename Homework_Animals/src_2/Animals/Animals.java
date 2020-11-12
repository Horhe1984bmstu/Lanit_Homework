package Animals;

import java.lang.reflect.Method;

public abstract class Animals
{
int speed;
int activity;

public Animals (int speed, int activity)
{
    this.speed = speed;
    this.activity = activity;
}
public abstract void move ();
public abstract Method eat (Object Fruit);
public abstract void voice ();
}






