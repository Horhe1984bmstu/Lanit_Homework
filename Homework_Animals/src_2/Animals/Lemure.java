package Animals;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Lemure extends Herbivore
{
    public String name;
    public int size;

    public Lemure  (String name, int size, int speed, int activity, int disguise_and_flair)
    {
        super(speed, activity, disguise_and_flair);
        this.name = name;
        this.size = size;
    }

    public void move() {System.out.println("Лимур лезет на дерево");}
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
            else throw new WrongFoodException ("Не подходит для травоядных, лимур вежливо отказался это есть.", value);
        }
        catch (NoSuchFieldException | IllegalAccessException | WrongFoodException e)
        {
            e.printStackTrace();
        }


        return null;
    }

}
