public class Function{
    public static void main(String ar[]){
        System.out.println("noughty ");
        // Static function
        spx();
        // Parameterized function
        Function Fp=new Function();
        System.out.println(Fp.Para(10,31));

    }
// static function
    public static void spx(){
        System.out.println("hello Charlie");
    }

// Parameterized Function
    public int Para(int x,int y){
        return x+y;
    }
}