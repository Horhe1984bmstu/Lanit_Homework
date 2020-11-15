package animals;

import java.lang.reflect.Method;

public abstract class Animals
{
private String name;
int speed;
int activity;

public Animals (int speed, int activity)






{
    this.speed = speed;
    this.activity = activity;
}
public abstract void move ();
public abstract Method eat (Object Fruit) throws WrongFoodException;
public abstract void voice ();


     public  boolean equals(String Name)
    {
        if(this.name.equals(Name))
        {
            return true;
        }
        else
        {
            return  false;
        }
    }


}






