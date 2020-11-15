package aviaries;

import java.util.ArrayList;

public class CarnivorousAviaries
{
    public int capacity;
    int rev = 0;

    ArrayList<Object> arrayList = new ArrayList<>(10);

    public CarnivorousAviaries(int capacity)
    {
        this.capacity = capacity;
    }

    public void view_aviarie()
    {
        System.out.println(arrayList.toString());
        System.out.println("В вольере будет комфортно еще " +capacity + " лохматым");
    }

    public void release_all_Animals()
    {
        capacity += rev;
        rev = 0;
        arrayList.clear();
    }

    public void addAnimals(Object... arg) {

        for (Object A : arg) {
            if (!(capacity <= 0))
            {
                arrayList.add(rev, A);
                rev++;
                capacity--;
            }
            else
            {
                System.out.println("превышена вместимость вальера");
            }
        }
    }
}
