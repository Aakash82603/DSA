package Inheritance;
class parent{
    String name;
    int age;
    long phnumber;
    parent(String name,int age,long phnumber){
        this.name=name;
        this.age=age;
        this.phnumber=phnumber;
    }
    public void displayInfo() {
        System.out.println("Name" + name);
        System.out.println("Age: " + age);
        System.out.println("Phnumber: " + phnumber);
    }
}
class Student extends parent{
    String course;
    Student(String  name,int age,long phnumber ,String course){
        super(name, age, phnumber);
        this.course=course;
    }
   public void attentdClass(){
        System.out.println(name + " is attending class for " + course);

   }
}
class Professor extends parent{
    String subject;
    Professor(String  name,int age,long phnumber ,String subject){
        super(name, age, phnumber);
        this.subject=subject;
    }
    public void teachClass(){
        System.out.println(name + " is teaching class for " + subject);
    }
}
class staff extends parent{
    String department;
    staff(String name,int age,long phnumber ,String department){
        super(name, age, phnumber);
        this.department=department;
    }
    public void manageOffice(){
        System.out.println(name + " is managing office for " + department);
    }
}
public class UniversityManagementSystem {
    public static void main(String[] args) {
      Student s=new Student("Aakash",20,1234567890,"Computer Science");
      Professor p=new Professor("Dr. Smith",45,9876543210l,"Mathematics");
      staff st=new staff("John Doe",35,5555555555l,"IT Department");
      s.displayInfo();
      s.attentdClass();
      p.displayInfo();
      p.teachClass();
      st.displayInfo();
      st.manageOffice();
    }
}
