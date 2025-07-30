public class Array {
    public static void main(String ar[]){
        basicArray();
        //two array adding
        twoArrayAdd();

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
}
