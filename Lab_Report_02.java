import java.util.Scanner;

abstract class Shape{
    abstract double Cal_Area();
    abstract double  Cal_Perimeter();

}

class Rectangle extends Shape{
    double length;
    double breadth;

    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }



    @Override
    double Cal_Area() {
        return length * breadth;
    }

    @Override
    double Cal_Perimeter() {
        return 2 * ( length + breadth);
    }
}

class Square extends Shape{

    double side;

    Square(double side){
        this.side = side;
    }


    @Override
    double Cal_Area() {
        return (side * side);
    }

    @Override
    double Cal_Perimeter() {
        return (4 * side);
    }
}





public class Lab_Report_02 {
    public static void main(String[] args) {

        int run = 1;
        while(run == 1){
            double length ;
            double breadth;
            double side;

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the value of length and breadth : ");
            length = scanner.nextDouble();
            breadth = scanner.nextDouble();
            System.out.print("Enter the value of one side of Square: ");
            side = scanner.nextDouble();

            Shape rectangle = new Rectangle(length, breadth);
            Shape square = new Square(side);
            System.out.printf("Rectangle: Area = %.2f, Perimeter = %.2f%n", rectangle.Cal_Area(), rectangle.Cal_Perimeter());
            System.out.printf("Square: Area = %.2f, Perimeter = %.2f%n", square.Cal_Area(), square.Cal_Perimeter());
            System.out.println();

            System.out.print("IF YOU WANNA RUN THIS PROGRAM AGAIN TYPE '1' OR TYPE ANY KEY: ");
            run = scanner.nextInt();
            if(run == 1){
                System.out.println();
            }

        }


    }


}

