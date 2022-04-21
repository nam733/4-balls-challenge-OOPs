import processing.core.PApplet;

public class Ball extends PApplet {
    float xCoordinate;
    float yCoordinate;
    float arc_width;
    float arc_height;

    public Ball(float xCoordinate,float yCoordinate,float arc_width,float arc_height) {
        this.xCoordinate=xCoordinate;
        this.yCoordinate=yCoordinate;
        this.arc_width=arc_width;
        this.arc_height=arc_height;
    }

    void display(PApplet pApplet) {
        pApplet.ellipse(xCoordinate,yCoordinate,arc_width,arc_height);
    }
}
