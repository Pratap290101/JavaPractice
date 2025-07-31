public class Strings {
    public static void main(String ar[]){
        String a=" Hello Charlie ";
        String b=new String("hello world");
        System.out.println(a);
        System.out.println(b);
        // length()
        System.out.println(a.length());
        // upper and lower Case
        System.out.println(a.toUpperCase());
        System.out.println(b.toLowerCase());
        // trim string
        System.out.println(a.trim());
        // starts and end With
        System.out.println(a.startsWith(" "));
        System.out.println(b.startsWith("H"));
        // valueOF
        int x=10;
        // String y=x; gives erro
        String y=String.valueOf(x);
        System.out.println(y);
        // replace
        String str1=a.replace("charlie", "world");
        System.out.println(str1);
    }
}
