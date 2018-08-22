package simpleGame;

/**
 * @author Suma Subbu
 * 22 Aug. 2018
 */

public class Player {
    private int x;
    private int y;

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
    }

//    public isInitialPosition(int x, int y){
//
//    }
    public void moveLeft(int count){ //method to move the player to the left of his position
        this.x-=count;
    }

    public boolean isBlock(int x, int y){ //checking if the path is blocked by a wall
        int blockx=x;
        int blocky=y;
        if(this.x==blockx+1 || this.x==blocky-1)
            return true;
        else if(this.y==blocky+1 || this.y==blocky-1)
            return true;
        else return false;

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

