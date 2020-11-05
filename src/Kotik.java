public class Kotik

{
    String name;
    String color;
    int satiety;     // сытость
    double activity; // активность по шкале от 0 до 5 (включительно) - влияет на успех в охоте и производстве других котиков
    int weight;      // вес
    int fatigue;     // усталость - можно было связать со сном, весом, активностью и действиями, но не стал усложнять

    int cats, crap, mouses, sofa_trying, Zzzz, crush;
    // съев мышь, может дольше продержаться без обеда
    // когда голодный может драть диван

    public  Kotik (String name, String color, int satiety, double activity, int weight, int fatigue )
    {
        this.name = name;
        this.color = color;
        this.satiety = satiety;
        this.activity = activity;
        this.weight = weight;
        this.fatigue = fatigue;
    }

    void liveAnotherDay()
    {
        for (int i = 0;i < 24; i++)
        {
            switch  ((int) (Math.random() * 6 + 1)) {

                case 1:
                    if (satiety > 5)
                    play();
                    else
                        System.out.println("Требуется заправка");
                        break;

                case 2:
                    if (satiety > 10)
                    sleep();
                    else
                        System.out.println("Требуется ужин перед сном");
                        break;

                case 3:
                    if (satiety > 5)
                    chaseMouse();
                    else
                        System.out.println("Требуется перекус перед охотой");
                        break;

                case 4:
                    if (weight > 2)
                    make_a_crap();
                    else
                        System.out.println("Закон сохранения энергии никто не отменял");
                        break;

                case 5:
                    make_a_scratch();

                case 6:
                    if (satiety > 15)
                    make_a_cat();
                    else
                        System.out.println("Перед воспроизводством нужно выспаться и поесть");
                        break;

            }

        }

    //=====================================================================================
    }
    void eat(int food)
    {
        System.out.println("Уничтожил сметану");
        satiety+=food;
        fatigue+=5;
        weight+=food;
    }
    void eat(int food, String type_of_food)
    {
        System.out.println("Кушать подано, сегодня в меню " + type_of_food);
        satiety+=food;
        fatigue+=5;
        weight+=food;
    }
    void eat( )
    {
        eat();
    }
    //=====================================================================================
    void play()
    {
        crush++;
        System.out.println("квартира разбомблена");
        satiety-=5;
        fatigue-=5;
    }
    void sleep()
    {
        Zzzz++;
        Zzzz++;
        Zzzz++;
        System.out.println("ZzzZzz");
        satiety-=10;
        fatigue+=5;
    }
    void chaseMouse()
    {
        double count= Math.random() * activity;

        if (count<=1.5)
            System.out.println("Провал: Вялый домашний");
        else
            mouses++;
            System.out.println("Победа: Прирожденный хищник");
            satiety+=15;
            fatigue-=5;
            weight+=2;
    }
    void make_a_crap()
    {
        System.out.println("Хорошо быть кисою");
        weight-=1;
        crap+=1;
    }
    void make_a_scratch()
    {
        sofa_trying++;
        System.out.println("-1 диван");
        fatigue+=5;
    }
    void make_a_cat()
    {
        double count = Math.random() * activity;
        if (count <= 1.5)
            System.out.println("Пронесло");
        else if (count > 1.5)
            cats++;
        System.out.println("Еще один шустрый и быстрый...");
        satiety -=10;
        fatigue -=10;
    }

    void info_cat()
    {
        System.out.println("=====================================|");
        System.out.println("Достижения за день, вес:" + weight);
        System.out.println("Достижения за день, сытость:" + satiety);
        System.out.println("Достижения за день, бодрость:" + fatigue);
        System.out.println("=====================================|");
        System.out.println("Главное достижение:" + cats);
        System.out.println("Достижения в лотке:" + crap);
        System.out.println("Пойманных мышей:" + mouses);
        System.out.println("Подходов к дивану:" + sofa_trying);
        System.out.println("Часов сна:" + Zzzz);
        System.out.println("Игровая активность:" + crush);
    }
}
