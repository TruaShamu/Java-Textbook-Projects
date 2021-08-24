import java.util.ArrayList;

public class StudentTestDrive {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<Student>();
        Student S1 = new Student("Trua", 1);
        Student S2 = new Student("Makaio", 2);
        Student S3 = new Student("Nalani", 3);
        Student S4 = new Student("Trua", 4);
        studentList.add(S1);
        studentList.add(S2);
        studentList.add(S3);
        studentList.add(S4);
        int studentSize = studentList.size();
        System.out.println("Students = " + S1.getName() + " " + S2.getName() + " " + S3.getName() + " " + S4.getName());
        System.out.println("There are " + studentSize + " students in the array list.");
        boolean containsTrua = studentList.contains(S1);
        System.out.println("Checking if the array list contains Trua...");
        System.out.println(containsTrua);
        for (int i = 0; i < studentSize - 1; i++) {
            if (studentList.get(i).getName() == "Trua") {
                studentList.remove((studentList.get(i)));
            }
        }

        containsTrua = studentList.contains(S1);
        System.out.println("Checking if array list still contains Trua...");
        System.out.println(containsTrua);
        studentSize = studentList.size();
        System.out.println("There are now " + studentSize + " students in the array list.");


    }
}
