package Animals;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Lion extends Carnivorous implements TerritorialAnimals
{
    public String name;
    public int size;

    public Lion (String name, int size, int speed, int activity, int tooth_and_nails)
    {
        super(speed, activity, tooth_and_nails);
        this.name = name;
        this.size = size;
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
            else throw new WrongFoodException ("Не подходит для хищников, льву такое лучше не предлагать.", value);
        }
        catch (NoSuchFieldException | IllegalAccessException | WrongFoodException e)
        {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public void territoryControl(double square)
    {
        System.out.println("Лев может контролировать территорию размером" +square+ "м.кв.");
    }

    @Override
    public void driveoffIntruder()
    {
        System.out.println("Лучше не провоцировать... Нарушитель в панике покидает территорию (иногда по частям)");
    }
}