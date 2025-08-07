public class StaticAndFinal {
   static int count = 0;  // static variable

    StaticAndFinal() {
        count++;  // increases for every object created
        System.out.println("Count is: " + count);
        x();
    }
    static void x(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        StaticAndFinal c1 = new StaticAndFinal();  // Count is: 1
        StaticAndFinal c2 = new StaticAndFinal();  // Count is: 2
        StaticAndFinal c3 = new StaticAndFinal();  // Count is: 3
        
    }
}