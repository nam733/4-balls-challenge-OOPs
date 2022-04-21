import processing.core.PApplet;

public class BallsProcessing extends PApplet {

    public static final int width = 648;
    public static final int height = 480;
    public static final int diameter = 10;
    int speed =0;
    Ball ball1;
    Ball ball2;
    Ball ball3;
    Ball ball4;

    public static void main(String[] args) {
        PApplet.main("BallsProcessing",args);
    }

    @Override
    public void settings() {
        size(width,height);
    }

    @Override
    public void setup() {
        ball1 = new Ball(speed, height/5, diameter, diameter);
        ball2 = new Ball(speed, height*2/5, diameter, diameter);
        ball3 = new Ball(speed, height*3/5, diameter, diameter);
        ball4 = new Ball(speed, height*4/5, diameter, diameter);
    }

    @Override
    public void draw() {
       drawCircle();
    }

    private void drawCircle() {
        ball1.display(this);
        ball1.xCoordinate++;
        ball2.display(this);
        ball2.xCoordinate+=2;
        ball3.display(this);
        ball3.xCoordinate+=3;
        ball4.display(this);
        ball4.xCoordinate+=4;
    }
}
