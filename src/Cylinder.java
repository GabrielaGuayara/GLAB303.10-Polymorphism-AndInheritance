public class Cylinder extends Circle{
    private final double PI = Math.PI;

    public Cylinder (double radius, double height){
        super(radius, height);
    }

    public Cylinder(double radius){
        super(radius);
    }

    public double getVolumne(){
        return (PI * Math.pow(super.radius,2)) * super.height;
    }

    public double getSurface(){
        return 2.0 * Math.PI * super.radius * super.height;
    }

    @Override
    public void displayshapName() {
        System.out.println();
    }

    @Override
    public String toString() {
        return "The radius is "+ super.radius + " height is " + super.height;
    }
}
