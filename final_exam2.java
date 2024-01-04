import java.util.Scanner;

class UnavailableForProjectException extends Exception {
    public UnavailableForProjectException(String message) {
        super(message);
    }
}

class EmployeeAvailability {
    void checkAvailability(int age) throws UnavailableForProjectException {


        if ( age < 25 || age > 40 ) {
            throw new UnavailableForProjectException("Employee age " + age + " is not acceptable.");
        } else {
            System.out.println("Employee age " + age + " is eligible for this project.");
        }
    }
}

public class final_exam2 {
    public static void main(String[] args) {

        EmployeeAvailability ob1 = new EmployeeAvailability();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.printf("Employee age: ");
        int age = sc.nextInt();
        try {

            ob1.checkAvailability(age);


        } catch (UnavailableForProjectException e) {
            System.out.println("Exception: " + e.getMessage());
        }
            System.out.println();
        }


    }
}
