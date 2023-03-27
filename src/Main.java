public class Main {
    public static void main (String[] args) {
//        Shape
        Shape shape = new Shape("red",true);
        String setcolor = shape.getColor();
        boolean isfilled = shape.isFilled();
        System.out.println("Color : " + setcolor);
        System.out.println("Isfilled ? " + isfilled);
        System.out.println(shape);
        System.out.println("");

//        circle
        lingkaran circle = new lingkaran(1.0,"red",true);
        double setradius = circle.getradius();
        double area = circle.getarea();
        double perimeter = circle.getperimeter();
        System.out.println("Radius :" + setradius);
        System.out.println("Area : " + area);
        System.out.println("Perimeter : " + perimeter);
        System.out.println(circle+" "+shape);
        System.out.println("");

//        Rectanmgel
        Rectangle persegi = new Rectangle(1.0,1.0,"red",true);
        double setwidht = persegi.getWidht();
        double setlenght = persegi.getLenght();
        double area1 = persegi.getarea();
        double parimetere = persegi.getPrimeter();
        System.out.println("Widht : " + setwidht);
        System.out.println("Lenght : " + setlenght);
        System.out.println("Area : " + area1);
        System.out.println("parametere : " + parimetere);
        System.out.println(persegi+" "+circle+" "+shape);
        System.out.println("");

//        Square
        Square kotak = new Square(1.0,"red",true);
        double setside = kotak.getSide();
        double setwidht1 = kotak.getSide();
        double setlenght1 = kotak.getSide();
        System.out.println("Side : " + setside);
        System.out.println("WIdht : " + setwidht1);
        System.out.println("Leght : " + setlenght1);
        System.out.println(kotak+" "+persegi+" "+circle+" "+shape);
    }
}