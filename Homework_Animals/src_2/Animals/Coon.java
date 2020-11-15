package Animals;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Coon extends Carnivorous implements NocturnalActiveAnimal, TerritorialAnimals
{
    public String name;
    public int size;

    public Coon (String name, int size, int speed, int activity, int tooth_and_nails)
    {
        super(speed, activity, tooth_and_nails);
        this.name = name;
        this.size = size;
    }

    public void move() {System.out.println("Енот потрошит холодильник");}
    public void voice() {System.out.println("Раздается довольное урчание");}
    public Method eat(Object Food)
    {
        move();
        try {
            Field field = Food.getClass().getDeclaredField("TYPE_OF_FOOD");
            String value = (String) field.get(Food);

            if (value.equals("For Carnivorous"))
            {
                System.out.println("Подходит для хищников");
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
            else throw new WrongFoodException ("Не подходит для хищников, енот вежливо отказался это есть.", value);
            }

        catch (NoSuchFieldException | IllegalAccessException | WrongFoodException e)
        {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public void activityIncreasing() {
        System.out.println("Енот ночной охотник, его активность повышается ночью");
        activity *= 2;
        System.out.println(activity);
    }

    @Override
    public void silentMoving() {
        System.out.println("Когда енот крадётся его скорость снижается, но повышается эффективность нападения");
        speed -= 2;
        tooth_and_nails +=3;
        System.out.println(speed);
    }

    @Override
    public void territoryControl(double square) {
        System.out.println("Енот может контролировать территорию размером" +square+ "м.кв.");
    }

    @Override
    public void driveoffIntruder() {
        System.out.println("Раздается устрашающее шипение... Нарушитель в панике покидает территорию");
    }
}