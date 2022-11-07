import fruitNinjaHelper.cs331ScoreController;
import fruitNinjaHelper.Constants;

public class Lemon extends Fruit{
    
    public Lemon(cs331ScoreController cont){
        super(2, cont);
        setImage(Constants.LEMON_PATH);
    }
}
