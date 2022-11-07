import fruitNinjaHelper.cs331ScoreController;
import fruitNinjaHelper.Constants;

public class Apple extends Fruit{

    public Apple(cs331ScoreController cont){
        super(2, cont);
        setImage(Constants.APPLE_PATH);
    }
}
