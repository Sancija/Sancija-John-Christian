import java.util.Scanner;
interface StudentInfo {
    void inputInfo();
    void displayInfo();
}

class StudentInfoImpl implements StudentInfo {
    private Student student = new Student();


    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First Name: ");
        student.setFirstName(scanner.nextLine());

        System.out.print("Middle Name: ");
        student.setMiddleName(scanner.nextLine());

        System.out.print("Last Name: ");
        student.setLastName(scanner.nextLine());

        System.out.print("Suffix: ");
        student.setSuffix(scanner.nextLine());
    }


    public void displayInfo() {
        System.out.println("First Name: " + student.getFirstName());
        System.out.println("Middle Name: " + student.getMiddleName());
        System.out.println("Last Name: " + student.getLastName());
        System.out.println("Suffix: " + student.getSuffix());

        String fullName = student.getFirstName() + " " + student.getMiddleName() + " " + student.getLastName();
        System.out.println("Full Name: " + fullName);
    }
}

public class Students {
    public static void main(String[] args) {
        StudentInfo studentInfo = new StudentInfoImpl();
        studentInfo.inputInfo();
        studentInfo.displayInfo();
    }
}