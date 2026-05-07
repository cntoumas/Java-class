public class Student {
    
    private String name;       
    private int studentID;      
    private int grade;          
    
   
    public Student(String name, int studentID, int grade) {
        this.name = name;
        this.studentID = studentID;
        this.grade = grade;
    }
    
    public void print() {
        System.out.println("Όνομα: " + name + ", Αριθμός Μητρώου: " + studentID + ", Βαθμός: " + grade);
    }
    
   
    public String getName() {
        return name;
    }
    
    
    public int getGrade() {
        return grade;
    }
}
