import fruitNinjaHelper.cs331Fruit;
import fruitNinjaHelper.cs331ScoreController;


public abstract class Fruit extends cs331Fruit implements Choppable{

    private int points;
    private cs331ScoreController cont;


    public Fruit(int points, cs331ScoreController cont){
        this.points = points;
        this.cont = cont;
        wash();
        ripen();
        //super.setImage(getImage());
    }
    
    @Override
    public void move(){
        this.moveFruit();;
    }

    @Override
    public void slice(){
        this.chopGraphically();
        this.splash();
        cont.addToScore(points);
    }

    public int getPoints(){
        return this.points;
    }
}
