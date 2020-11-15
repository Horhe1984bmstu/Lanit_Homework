package Animals;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Giraffe extends Herbivore
{
    public String name;

    public Giraffe  (String name, int speed, int activity, int disguise_and_flair)
    {
        super(speed, activity, disguise_and_flair);
        this.name = name;
    }

    public void move() {System.out.println("Жираф гуляет по саванне");}
    public void voice() {System.out.println("Раздается довольное чавканье");}
    public Method eat(Object Food)
    {
        move();
        try {
            Field field = Food.getClass().getDeclaredField("TYPE_OF_FOOD");
            String value = (String) field.get(Food);

            if (value.equals("For Herbivore"))
            {
                System.out.println("Подходит для травоядных");
                try
                {
                    Method method = Food.getClass().getDeclaredMethod("was_eaten");
                    method.setAccessible(true);
                    method.invoke(Food);
                }
                catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e)
                {
                    e.printStackTrace();
                }

                voice();
            }
            else throw new WrongFoodException ("Не подходит для травоядных, жираф вежливо отказался это есть.", value);
        }
        catch (NoSuchFieldException | IllegalAccessException | WrongFoodException e)
        {
            e.printStackTrace();
        }


        return null;
    }

}

