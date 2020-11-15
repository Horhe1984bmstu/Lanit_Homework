package Animals;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Duck extends Herbivore implements FlyingAnimals
{
    public String name;
    public Duck  (String name, int speed, int activity, int disguise_and_flair)
    {
        super(speed, activity, disguise_and_flair);
        this.name = name;
    }

    public Duck (int speed, int activity, int disguise_and_flair)
    {
        super(speed, activity,disguise_and_flair );
    }

    public void move() {System.out.println("Утка плавает по воде");}
    public void voice() {System.out.println("Раздается довольное кряканье");}
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
            else throw new WrongFoodException ("Не подходит для травоядных, утка вежливо отказалась это есть.", value);
        }
        catch (NoSuchFieldException | IllegalAccessException | WrongFoodException e)
        {
            e.printStackTrace();
        }


        return null;
    }

    @Override
    public void Flying() {
        System.out.println("Скорость утки в полете увеличивается многократно");
        speed *= 20;
        System.out.println(speed);
    }
}

