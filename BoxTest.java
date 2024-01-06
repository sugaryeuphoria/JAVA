/*
Design and implement a class called Box that contains instance
data that represent the height, width, and depth of the box. Also
include a boolean variable called full as instance data that rep-
resent whether the box is full or not. Define the Box constructor
to accept and initialize the height, width, and depth of the box.
Each newly created Box is empty (the constructor should initialize
full to false). Include getter and setter methods for all instance
data. Include a toString method that returns a one-line descrip-
tion of the box. Create a driver class called BoxTest, whose main
method instantiates and updates several Box objects.
*/

class Box{
    private double height;
    private double width;
    private double depth;
    private boolean full;

    public Box(double height,double width,double depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.full = false;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getDepth() {
        return depth;
    }
    public void setDepth(double depth) {
        this.depth = depth;
    }
    public boolean isFull() {
        return full;
    }
    public void setFull(boolean full) {
        this.full = full;
    }
    public String toString(){
        return "This is the Box with height: " + height + ", width: " + width + ", depth: " + depth + ", full: " + full;
    }
}

class BoxTest{
    public static void main(String[] args) {
        Box box1 = new Box(10,20,30);
        Box box2 = new Box(10,20,30);
        Box box3 = new Box(10,20,30);

        box1.setHeight(20);
        box1.setWidth(40);
        box1.setDepth(10);
        box1.setFull(true);

        System.out.println("Box 1: "+ box1);
        System.out.println("Box 2: "+ box2);
        System.out.println("Box 3: "+ box3);

    }
}