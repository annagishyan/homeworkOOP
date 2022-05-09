package inheritance.overriddenmethods;

 class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }
    Figure(int a, int b) {
        dim1 = a;
        dim2 = b;
    }

    double area(double a, double b) {
        return 0;
    }
    double perimeter(double a, double b) {
        return 0;
    }

 //method overloading
    int area(int a, int b) {
        return 0;
    }
}
class Rectangle extends Figure{
     Rectangle(double a, double b) {
         super(a, b);
     }
     double area() {
            return dim1 * dim2;
     }
     double perimeter() {    //շփոթում եմ՝ պետք է պարամետրերն էլ գրեմ թե ոչ՞
         return dim1 *2 + dim2 * 2;
     }
     int perimeter(int a, int b){   //եթե պարամետր ունեմ, ուրեմն մեթոդն ավելի անկախ կիրառվող չի լինի՞
         return a * 2 + b * 2;
     }
}
class Triangle extends Figure{
    double dim3;
     Triangle(double a, double b, double c) {
         super(a, b);
         dim3 = c;  // we need 3rd dim. for perimeter
     }
     Triangle(double a, double b){
         super(a, b);
     }

     double area() {
         return dim1 * dim2 / 2;
     }
     double perimeter() {
         return dim1 + dim2 + dim3;
     }

     int perimeter(int a, int b, int c) {
         return a + b + c;
     }

}
class Trapezoid extends Triangle {    //I chose Triangle as superclass for Trapezoid then added 4th dim.
     double dim4;
     Trapezoid(double a, double b, double c, double d) {
         super(a,  b, c);
         dim4 = d;
     }

    @Override
    double area() {
        return (dim1 + dim2) / 2 * dim3;  //սեղանի մակերես = հիմքերի կիսագումարի և բարձրոյթնան արտադրյալին
    }
    double perimeter() {
         return dim1 + dim2 + dim3 + dim4;
    }
}

