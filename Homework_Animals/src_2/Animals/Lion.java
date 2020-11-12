package Animals;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Lion extends Carnivorous
{
    private String Animal_name = "Лев";

    public String setAnimal_name(String Name)
    {
    if (Name.equals("ein_Löwe") || Name.equals("un_Lion"))
        {
        Animal_name = Name;
        }
    return Animal_name;
    }

    public Lion (int speed, int activity, int tooth_and_nails)
    {
        super(speed, activity, tooth_and_nails);
    }

    public void move() {System.out.println("Лев гуляет по саванне");}
    public void voice() {System.out.println("Раздается довольное урчание");}
    public Method eat(Object Herbivore_food)
    {
        move();
        try {
            Field field = Herbivore_food.getClass().getDeclaredField("TYPE_OF_FOOD");
            String value = (String) field.get(Herbivore_food);

            if (value.equals("For Carnivorous"))
            {
                System.out.println("Подходит для хищников");
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
                System.out.println("Не подходит для хищников");
                System.out.println("Льву такое лучше не предлагать" );
            }
        }
        catch (NoSuchFieldException | IllegalAccessException e)
        {
            e.printStackTrace();
        }


        return null;
    }

}