package Aviaries;

import Animals.Animals;
import java.lang.reflect.Field;
import java.util.HashMap;

public class Aviaries<T>

{
  enum Sizes {VERY_SMALL, SMALL, MEDIUM, BIG, HUGE}
  int capacity;
  String aviary_size;
  private HashMap<String, T> animalAviarie = new HashMap<>();

    public Aviaries (int capacity, String aviary_size )
    {
    this.capacity = capacity;
    this.aviary_size = aviary_size;
    }

//==========================================================================|

    int av_size;

    public void add(T animal, String key ) throws IllegalAccessException, NoSuchFieldException
{

    Animals a = (Animals) animal;

    Field field_1 = a.getClass().getDeclaredField("name");
    String Name = (String) field_1.get(a);

    Field field_2 = a.getClass().getDeclaredField("size");
    int an_size = (int) field_2.get(a);

//==========================================================================|
    switch (this.aviary_size) {
        case "VERY_SMALL" -> av_size = Sizes.VERY_SMALL.ordinal();
        case "SMALL" -> av_size = Sizes.SMALL.ordinal();
        case "MEDIUM" -> av_size = Sizes.MEDIUM.ordinal();
        case "BIG" -> av_size = Sizes.BIG.ordinal();
        case "HUGE" -> av_size = Sizes.HUGE.ordinal();
        default -> System.out.println("Укажите допустимый тип вольера");
    }
//==========================================================================|

        System.out.println("Типоразмер вольера: " + av_size);
        System.out.println("Типоразмер подходящий для животного: " + an_size);

    if (av_size >= an_size)
    {
        if (capacity > animalAviarie.size() && key.equals(Name))
        {
            animalAviarie.put(key, animal);
            System.out.println(animalAviarie);
        } else if (capacity <= animalAviarie.size()) {
            System.out.println("Мест нет");
        } else {
            System.out.println("Ключ не соответствует имени");
        }
    }
    else
    {
        System.out.println("Типоразмер вольера не подходит, он должен быть больше или равен типоразмеру, указанному в полях животного.");
    }
}

    public void release (String key)
    {
        animalAviarie.remove(key);
        System.out.println(animalAviarie);
    }
    public void searchingByname (String key)
    {
        System.out.println(animalAviarie.get(key).getClass().getName());
    }


}