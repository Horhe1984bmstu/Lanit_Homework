package Animals;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Lemure extends Herbivore
{
    private String Animal_name = "Лемур";

    public String setAnimal_name(String Name)
    {
        if (Name.equals("Lemur") || Name.equals("Maki"))
        {
            Animal_name = Name;
        }
        return Animal_name;
    }

    public Lemure(int speed, int activity, int disguise_and_flair)
    {
        super(speed, activity, disguise_and_flair);
    }

    public void move() {System.out.println("Лемур лезет на дерево");}
    public void voice() {System.out.println("Раздается довольное урчание");}
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
                System.out.println("Лемур вежливо отказался это есть" );
            }
        }
        catch (NoSuchFieldException | IllegalAccessException e)
        {
            e.printStackTrace();
        }


        return null;
    }

}
