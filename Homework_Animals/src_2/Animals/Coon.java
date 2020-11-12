package Animals;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Coon extends Carnivorous
{
    private String Animal_name = "Енот";

    public String setAnimal_name(String Name)
    {
        if (Name.equals("Waschbär") || Name.equals("Raton_laveur"))
        {
            Animal_name = Name;
        }
        return Animal_name;
    }

    public Coon(int speed, int activity, int tooth_and_nails)
    {
        super(speed, activity, tooth_and_nails);
    }

    public void move() {System.out.println("Енот потрошит холодильник");}
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
                System.out.println("Енот вежливо отказался это есть" );
                }
            }
        catch (NoSuchFieldException | IllegalAccessException e)
        {
            e.printStackTrace();
        }


        return null;
    }

}