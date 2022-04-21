import processing.core.PApplet;

import java.util.ArrayList;

public class BallsProcessing extends PApplet {

    public static final int width = 648;
    public static final int height = 480;
    public static ArrayList<Ball> balls = new ArrayList<>();

    public static void main(String[] args) {
        PApplet.main("BallsProcessing",args);
    }

    @Override
    public void settings() {
        size(width,height);
    }

    @Override
    public void setup() {
        for(int posX=1;posX<=4;posX++){
        balls.add(new Ball(posX,height*posX/5));}
    }

    @Override
    public void draw() {
       drawCircle();
    }

    private void drawCircle() {
        for(Ball ball:balls)
            {
                ball.display(this);
                ball.newCoordinate();
            }
    }
}
