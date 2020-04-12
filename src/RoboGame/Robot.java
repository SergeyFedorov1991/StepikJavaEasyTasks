package RoboGame;

public class Robot {
    int x;
    int y;
    RoboGame.Direction dir;


    public Robot (int x, int y, RoboGame.Direction dir) {
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    public RoboGame.Direction getDirection() {return dir;}

    public int getX() {return x;}

    public int getY() {return y;}

    public void turnLeft() {
        if      (dir == RoboGame.Direction.UP)    {dir = RoboGame.Direction.LEFT;}
        else if (dir == RoboGame.Direction.DOWN)  {dir = RoboGame.Direction.RIGHT;}
        else if (dir == RoboGame.Direction.LEFT)  {dir = RoboGame.Direction.DOWN;}
        else if (dir == RoboGame.Direction.RIGHT) {dir = RoboGame.Direction.UP;}
    }

    public void turnRight() {
        if      (dir == RoboGame.Direction.UP)    {dir = RoboGame.Direction.RIGHT;}
        else if (dir == RoboGame.Direction.DOWN)  {dir = RoboGame.Direction.LEFT;}
        else if (dir == RoboGame.Direction.LEFT)  {dir = RoboGame.Direction.UP;}
        else if (dir == RoboGame.Direction.RIGHT) {dir = RoboGame.Direction.DOWN;}
    }

    public void stepForward() {
        if (dir == RoboGame.Direction.UP)    {y++;}
        if (dir == RoboGame.Direction.DOWN)  {y--;}
        if (dir == RoboGame.Direction.LEFT)  {x--;}
        if (dir == RoboGame.Direction.RIGHT) {x++;}
    }
}
