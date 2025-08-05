import java.util.*;
final class x{
    Scanner sc=new Scanner(System.in);
    String name,id;
    x(){
        getDetails();
        printl();
    }
    void getDetails(String s){
        name=s;
        id="12";
    }
    final void getDetails(){
        System.out.println("enter id and name");
        id=sc.nextLine();
        name=sc.next();
    }
    void printl(){
        System.out.println("Student name is "+name+" and Id is "+id+".");
    }
}


class ClassAndMethods {
    public static void main(String ar[]){
        x xx=new x();
        xx.getDetails("raj");
        xx.printl();
        
        // Instantiate ClassAndMethods to ensure it is used
        ClassAndMethods cam = new ClassAndMethods();
        System.out.println(xx.getClass());
    }
}
