import fruitNinjaHelper.cs331Blade;
import fruitNinjaHelper.cs331FruitNinjaGame;
import fruitNinjaHelper.cs331ScoreController;

import java.lang.Math;
public class Game extends cs331FruitNinjaGame{

    // You may need to add constructor
    cs331Blade fruitSlicer;
    cs331ScoreController cont;
    public Game(cs331ScoreController cont){
        this.cont = cont;
        fruitSlicer = new cs331Blade("Fruit Slicer");
        addBlade(fruitSlicer);
    }

   

    public void updateChoppable(Choppable obj){
        obj.move();
        if(fruitSlicer.checkIntersection(obj)){
            obj.slice();
        }
    }

    @Override
    public Object launchItem() {
        int rand = (int)(Math.random()*(5));
        
        switch(rand){
            case 0:
                return new Apple(cont);
            case 1:
                return new Lemon(cont);
            case 2:
                return new Pear(cont);
            case 3:
                return new Peach(cont);
            case 4:
                return new Bomb();
            default:
                return new Bomb();
        }
    }
    
    // Do not modify anything below this line
    @Override
    public void updateChoppableHelper() {
        this.updateChoppable(this.getCurrentItem());
    }
}
