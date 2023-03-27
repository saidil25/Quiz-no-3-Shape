public class Rectangle extends Shape {
    private double widht;
    private double lenght;

    public Rectangle(){
        this.widht = 1.0;
        this.lenght = 1.0;
    }
    public Rectangle(double widht, double lenght){
        this.lenght = lenght;
        this.widht = widht;
    }
    public Rectangle(double widht, double lenght,String color, boolean filled){
        super(color, filled);
        this.lenght = lenght;
        this.widht = widht;

    }

    public double getWidht() {
        return widht;
    }

    public double getLenght() {
        return lenght;
    }

    public double getarea(){
        return this.widht * lenght;
    }

    public double getPrimeter(){
        return (this.widht + lenght)*2 ;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "widht=" + widht +
                ", lenght=" + lenght +
                '}';
    }
}
