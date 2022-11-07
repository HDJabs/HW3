import fruitNinjaHelper.cs331ScoreController;
import fruitNinjaHelper.Constants;

public class Pear extends Fruit{

    public Pear(cs331ScoreController cont){
        super(3, cont);
        setImage(Constants.PEAR_PATH);
    }
}
