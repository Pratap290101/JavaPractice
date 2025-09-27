class Parent{
    String name;
    public Parent(String name) {
        this.name=name;
    }
    void show_name(){
        System.out.println("My name is "+name);
    }
}
class Child extends Parent{
    int gender;
    String gen[]={"Female","Male"};
    public Child(String name,int gender){
        super(name);
        this.gender=gender;
    }
    void show_age(){
        System.out.println(",Gender is "+gen[gender]);
    }
}
class Grandchild extends Child{
    int age;
    public Grandchild(String name, int gender,int age) {
        super(name,gender);
        this.age=age;
    }
    void show_gender(){
        System.out.println("My age is "+age);
    }
    
}

public class MultiLevelInheritance {
    public static void main(String ar[]){
        Grandchild gc= new Grandchild("Ram",1,39);
        gc.show_name();
        gc.show_age();
        gc.show_gender();
    }
}
