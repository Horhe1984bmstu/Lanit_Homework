package animals;

public interface NocturnalActiveAnimal
{
 public void activityIncreasing();

 default public void nightSeeing()
 {
  System.out.println("Ночные животные хорошо видят в темноте");
  logger_01.LG.LOG1.info("выполнен default метод в интерфейсе -ночные животные-");
 }


 public void silentMoving();
}
