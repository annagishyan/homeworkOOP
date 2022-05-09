package inheritance.overriddenmethods;

public class RunMethods {
    public static void main(String[] args) {
        Triangle myTriangle = new Triangle(4.5, 7.5);  //for calc.area
        Triangle anotherTriangle = new Triangle(4, 7, 6);  //perimeter

        double areaOfTriangle = myTriangle.area();
        double perimeterOfAnotherTriangle = anotherTriangle.perimeter();
        System.out.println(areaOfTriangle);
        System.out.println(perimeterOfAnotherTriangle);
        int perimeterOfTriangle = anotherTriangle.perimeter(4, 7, 6);
    }
}
