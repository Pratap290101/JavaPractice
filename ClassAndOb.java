import java.util.*;
class Student{
        Scanner sc=new Scanner(System.in);
        String name;
        int id=0;
        Student() {
            getDetails();
            showDetails();
        }
        public void getDetails(){
            System.out.println("enter your Name:-");
            name=sc.nextLine();
            System.out.println("enter your Id:-");
            id=sc.nextInt();
        }
        public void showDetails(){
            System.out.println("Your name is "+name+" and ID is "+id+" .");
        }        
    }

public class ClassAndOb {
    public static void main(String[] ar){
        Student s=new Student();
    }
}