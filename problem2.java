import java.util.*;
class problem2{
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        int x[]={0,1,2,3,4,5,6,7,8,9,10,16},t_no=0,len=0,s_no=0;
        while(len<x.length){
            for(int i=0;i<x[len];i++){
                s_no=(int)Math.pow(2, i);
                System.out.println("s number"+s_no);
                System.out.println("Array number"+x[len]);
                if(s_no==x[len]){
                    t_no++;
                }
            }

            len++;
        }
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }
        System.out.println("t="+t_no);

    }
}