
/*Object and Class Example: Initialization through method//
public class Student {
    public static void main(String[] args) {

        //initialization of objects
        Animal a1 = new Animal();
        Animal a2 = new Animal();

        //inserting the values
        a1.data(221, "atik");
        a2.data(332, "mukta");

        //printing the values
        a1.showdata();
        a2.showdata();

    }
}


class Animal{
    int id;
    String name;

  void data(int n, String nam){
        id = n;
        name = nam;

    }
    void showdata(){
        System.out.println(id + " " + name);
    }


}
//Object and Class Example: Initialization through method//
------------------xxxxxxxxxxxx-------------------------- */


//   Anonymous object
//  Anonymous simply means nameless.
//        An object which has no reference is known as an anonymous object.
//        It can be used at the time of object creation only.
/*
class Student{

  void insert(int n){
int fact = 1;
  for(int i = 1; i<= n; i++){
      fact = fact * i;
    }
      System.out.println(fact);
  }

    public static void main(String[] args) {

        new Student().insert(5);

    }
}

*/
//--------------xxxxxxxxxxxxxx--------------


//Example of default constructor that displays the default values

/* class Student {
    int n;
    String name;

    void display() {
        System.out.println("My name is " + n + " and id " + name);
    }

    public static void main(String[] args) {
        Student data1 = new Student();
        data1.display();  // out put: 0 null

        data1.n = 221;
        data1.name = "atik";
        data1.display();
    }


}
*/








