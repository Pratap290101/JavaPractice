import java.util.*;
class Cla{
    Scanner sc=new Scanner(System.in);
    int age=01;
    String name;
    Cla(){
        System.out.println("this CLa");
        getDetails();
        showDetails();
        sc.close();
    }
    final void getDetails(){
        name="Charlie";
        age=25;
        System.out.println("enter name and age :-");
        name = sc.nextLine();
        age=sc.nextInt();

    }
    final void showDetails(){
        System.out.println("Student name = "+name+" and Age is "+age);
    }
}

public class ClassExp {
    public static void main(String ar[]){
        Cla cla= new Cla();
    }
}
