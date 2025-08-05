class ABC{
    int x=5;
    XYZ xy=new XYZ();

    void print(){
        System.out.println("from class ABC x="+x);
    }
    class XYZ{
        int y=10;
        void show(){
            System.out.println("In class XYZ x="+x);
            System.out.println("In class XYZ y="+y);            
        }
        void display(){
            System.out.println("In class xyz x="+x);
            System.out.println("In class xyz y="+y);
        }
    }
}
class ClassAndOb{
    public static void main(String ar[]){
        ABC abc=new ABC();
        abc.print();
        abc.xy.show();
        ABC.XYZ xyz=new ABC().new XYZ();
        xyz.show();
    }
}