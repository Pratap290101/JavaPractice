import java.util.*;
public class Array {
    public static void main(String ar[]){
        basicArray();
        //two array adding
        twoArrayAdd();
        // multidimension array
        multidimensionArray();

    }
    public static void basicArray(){
        char a[]=new char[3];
        a[0]='a';
        a[1]='b';
        a[2]='c';
        for(int i=0;i<3;i++){
            System.out.println(a[i]);
        }
    }
       
    public static void twoArrayAdd(){
        int x[]={1,2,3,4,5},y[]={5,4,3,2,1};
        for(int i=0;i<5;i++){
            System.out.println(x[i]+"+"+y[i]+"="+(x[i]+y[i]));
        }
    }
    public static void multidimensionArray(){
        System.out.println("hello Multidimension Charlie");
        char[][] x=new char[3][3];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("enter character");
                x[i][j]=sc.next().charAt(0);
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(x[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
