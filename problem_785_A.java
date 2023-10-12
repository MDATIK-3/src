import java.util.Scanner;

public class problem_785_A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while(n-- > 0){
            String ch = sc.next();
            if(ch.equals("Tetrahedron")){
                sum += 4;
            }
           else if(ch.equals("Cube"))
                sum += 6;
           else if(ch.equals("Octahedron"))
                sum += 8;
            else if(ch.equals("Dodecahedron"))
                sum +=12;
            else if(ch.equals("Icosahedron"))
                sum += 20;
            System.out.println();
        }
        System.out.println(sum);


    }
}
