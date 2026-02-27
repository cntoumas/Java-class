import java.util.Scanner;

class ex7{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Name and Surname: ");
        String name = input.next();
        String surname = input.next();
        System.out.print("Enter position: ");
        String position = input.next();
        System.out.print("Enter AEM: ");
        int aem = input.nextInt();
        System.out.print("Enter email: ");
        String email = input.next();
        System.out.print("Enter class name: ");
        String className = input.next();
        System.out.print("Enter grade: ");
        double grade = input.nextDouble();
        System.out.println("Name: " + name + " " + surname);
        System.out.println("Position: " + position);
        System.out.println("AEM: " + aem);
        System.out.println("Email: " + email);
        System.out.println("Class Name: " + className);
        System.out.println("Grade: " + grade);
    }
}
