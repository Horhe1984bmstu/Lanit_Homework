package animals;

public interface NocturnalActiveAnimal
{
 public void activityIncreasing();

 default public void nightSeeing()
 {
  System.out.println("Ночные животные хорошо видят в темноте");
 }


 public void silentMoving();
}
