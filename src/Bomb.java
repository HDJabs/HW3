import fruitNinjaHelper.cs331Bomb;

public class Bomb extends cs331Bomb implements Choppable{
    public Bomb(){
        this.setImage("images/bomb.png");
    }

    @Override
    public void move(){
        this.moveBomb();
    }

    @Override
    public void slice(){
        this.explode();
    }


}
