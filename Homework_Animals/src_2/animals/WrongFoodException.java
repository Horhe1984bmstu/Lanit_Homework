package animals;

public class WrongFoodException extends Exception
// там в дз ошибка - WorngFoodException вместо WrongFoodException
{
    private String type_of_food;
    public String getType_of_food(){return type_of_food;}
    public WrongFoodException(String message, String value){

        super(message);
        type_of_food=value;
    }
}
