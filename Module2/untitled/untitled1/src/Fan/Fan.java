package Fan;
public class Fan {
    public static final int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean On) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString() {
        if(on== true){
            return "Thong tin quat :"+this.speed+","+this.color+","+this.radius+", quat dang bat";
        }else {
            return "thong tin quat :"+this.color+","+this.radius+", quat dang tat";
        }
    }
}
class TestFan{
    public static void main(String[] args) {
        Fan fan1= new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("Green");
        fan1.setOn(true);
        System.out.println(fan1);
    }
}
