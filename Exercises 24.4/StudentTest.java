public class StudentTest {
    public static void main(String[] args) {
        
        Student[] students = new Student[3];
        
        
        students[0] = new Student("Γιώργος Παπαδόπουλος", 101, 8);
        students[1] = new Student("Μαρία Αντωνιάδου", 102, 4);
        students[2] = new Student("Γιώργος Σειτανίδης", 103, 7);
        
        System.out.println("all students:");
        for (Student student : students) {
            student.print();
        }
        System.out.println();
        
        
        System.out.println("Students with grade > 5:");
        for (Student student : students) {
            if (student.getGrade() > 5) {
                System.out.println(student.getName());
            }
        }
    }
}
