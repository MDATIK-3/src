

interface StudentProfile {
    abstract void setAcademicInterest(String interest);
    abstract String getAcademicInterest();
}


interface HobbyProfile {
  abstract   void setHobby(String hobby);
   abstract String getHobby();
}


class Student implements StudentProfile, HobbyProfile {
 String academicInterest;

 String hobby;

    @Override
    public void setAcademicInterest(String interest) {
        this.academicInterest = interest;
    }

    @Override
    public String getAcademicInterest() {
        return academicInterest;
    }

    @Override
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String getHobby() {
        return hobby;
    }
}

public class final_exam3 {
    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();

        student1.setAcademicInterest("Computer Science");
        student1.setHobby("Painting");


        student2.setAcademicInterest("Biology");
        student2.setHobby("Music");
 }
}
