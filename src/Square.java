public class Square extends Shape{
    private double side;

    public Square(){
        this.side = side;
    }
    public Square(double side,String color,boolean filled){
        super(color, filled);
        this.side = side;

    }

    public double getSide() {
        return side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
