class Parent{
    protected int x=12;
    int y=30;
}
class Child extends Parent{
    Child(){
        int z=30,x=232;
        System.out.println("x="+x+"y="+y+"z="+z);
        System.out.println(super.x);
    }
}
public class SingleLevelInheritance {
    public static void main(String ar[]){
        Child c=new Child();
    }
}
