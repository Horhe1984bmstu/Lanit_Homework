package animals;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Bat extends Carnivorous implements NocturnalActiveAnimal, FlyingAnimals
    {
        public String name;
        public int size;

        public Bat (String name, int size, int speed, int activity, int tooth_and_nails)
        {
        super(speed, activity, tooth_and_nails);
                this.name = name;
                this.size = size;
        }

public void move() {System.out.println("Мышь летает над лесом");}
public void voice() {System.out.println("Раздается криповый хруст в ночи");}
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
        Method method = Food.getClass().getDeclaredMethod("wasEaten");
        method.setAccessible(true);
        method.invoke(Food);
        }
        catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e)
        {
        e.printStackTrace();
        }

        voice();
        }
        else throw new WrongFoodException ("Не подходит для хищников, летучая мышь на такое не позарится.", value);
        }

        catch (NoSuchFieldException | IllegalAccessException | WrongFoodException e)
        {
        e.printStackTrace();
        }
        return null;
        }


@Override
public void activityIncreasing() {
        System.out.println("Летучая мышь ночной охотник, она активна ночью");
        activity *= 2;
        System.out.println(activity);
        }

@Override
public void silentMoving() {
        System.out.println("Летучая мышь бесшумно планирует, повышается эффективность нападения");
        speed -= 2;
        tooth_and_nails +=8;
        System.out.println(speed);
        }

@Override
public void Flying() {
        System.out.println("Скорость летучей мыши в полете увеличивается многократно");
        speed *= 10;
        System.out.println(speed);
        }
}