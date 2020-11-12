package Animals;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Duck extends Herbivore
{
    private String Animal_name = "Утка";

    public String setAnimal_name(String Name)
    {
        if (Name.equals("Ente") || Name.equals("Canard"))
        {
            Animal_name = Name;
        }
        return Animal_name;
    }
    public Duck (int speed, int activity, int disguise_and_flair)
    {
        super(speed, activity,disguise_and_flair );
    }

    public void move() {System.out.println("Утка плавает по воде");}
    public void voice() {System.out.println("Раздается довольное кряканье");}
    public Method eat(Object Herbivore_food)
    {
        move();
        try {
            Field field = Herbivore_food.getClass().getDeclaredField("TYPE_OF_FOOD");
            String value = (String) field.get(Herbivore_food);

            if (value.equals("For Herbivore"))
            {
                System.out.println("Подходит для травоядных");
                try
                {
                    Method method = Herbivore_food.getClass().getDeclaredMethod("was_eaten");
                    method.setAccessible(true);
                    method.invoke(Herbivore_food);
                }
                catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e)
                {
                    e.printStackTrace();
                }

                voice();
            }
            else
            {
                System.out.println("Не подходит для травоядных");
                System.out.println("Утка вежливо отказался это есть");
            }
        }
        catch (NoSuchFieldException | IllegalAccessException e)
        {
            e.printStackTrace();
        }


        return null;
    }

}

