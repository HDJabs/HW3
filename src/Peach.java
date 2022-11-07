import fruitNinjaHelper.cs331ScoreController;
import fruitNinjaHelper.Constants;

public class Peach extends Fruit{

    public Peach(cs331ScoreController cont){
        super(2, cont);
        setImage(Constants.PEACH_PATH);
    }
}
