package constructor_first_16_01_26;

//public class Level1_2 {
//    static void main(String[] args) {
//
//        Circle c = new Circle(3);
//       c.calculate();
//        c.disp();
//
//    }
//}
//
//class Circle{
//
//    private final double  radius;
//    double areaOfCircle;
//    double circumference;
//
//    Circle(double radius){
//        this.radius =radius;
//    }
//
//    void calculate(){
//        areaOfCircle = Math.PI*radius*radius;
//        circumference = 2*Math.PI*radius;
//
//    }
//
//    void disp(){
//        System.out.println(areaOfCircle);
//        System.out.println(circumference);
//    }
//}


// like professional


public  class Level1_2 {
    static void main(String[] args) {

        Circle c = new Circle(3);
        System.out.println("Area "+ c.getArea());
        System.out.println("CircumferenceOfCircle "+ c.getCircumference());
    }
}

class Circle{

    private final double radius;

    Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

    public double getCircumference(){

        return 2*Math.PI*radius;
    }
}