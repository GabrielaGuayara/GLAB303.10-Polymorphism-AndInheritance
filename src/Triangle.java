public class Triangle extends Shape {
    public Triangle(){}

    public Triangle (String color, double area, double base, double width, double height){
        super(color, area, base, width, height);
    }

    public Triangle(String color){
        super(color);
    }

    @Override
    public void setBase(double base){
        super.base = base;
    }

    @Override
    public void setWidth(double width){
        super.width = width;
    }

    @Override
    public void displayshapName() {
        System.out.println("I am a Triangle");
    }

    @Override
    public String toString(){
        return "Trangle[base = "+ base + "height = " + height + " , " + super.toString()+ "]";
    }
}
