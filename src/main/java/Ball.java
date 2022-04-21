import processing.core.PApplet;

public class Ball extends PApplet {
    int xCoordinate;
    float yCoordinate;
    int diameter;
    int speed;

    public Ball(int xCoordinate,float yCoordinate) {
        this.xCoordinate=xCoordinate;
        this.yCoordinate=yCoordinate;
        this.diameter=10;
        this.speed=0;
    }

    void display(PApplet pApplet) {
        pApplet.ellipse(speed,yCoordinate,diameter,diameter);
    }

     void newCoordinate() {
        speed = speed + xCoordinate;
    }
}
