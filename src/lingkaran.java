public class lingkaran extends Shape{
    private double jari ;


    public lingkaran(){
        this.jari = 1.0;
    }
    public lingkaran(double jari){
        this.jari = jari;
    }
    public lingkaran(double jari,String color, boolean filled){
        super(color, filled);
        this.jari = jari;
    }
    public double getradius(){
        return jari;
    }
    public double getarea(){
    return this.jari *  this.jari * 3.14;
    }

    public double getperimeter(){
        return this.jari * 2 * 3.14;
    }

    public double getJari() {
        return jari;
    }

    @Override
    public String toString() {
        return "lingkaran{" +
                "jari=" + jari +
                '}';
    }
}

