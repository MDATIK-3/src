import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class text {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\java progrmming\\codeforces\\src\\txt.txt");
            Scanner myReader = new Scanner(file);

            while (myReader.hasNext()) {
                int data = myReader.nextInt();
                if(data %5 ==0)
                System.out.println(data);
            }

            myReader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
    }
}
