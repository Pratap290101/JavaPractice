class z{
    public int[] zz(int[] c){
        int df=0;
        for(int i=0;i<c.length;i++){
            for(int j=i+1;j<c.length;j++){
                int x=5;
                if(x==c[j]+c[i]){
                    df++;
                    System.out.println(c[j]+" and "+c[j-i]);
                    System.out.println(df);
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
public class x {
    public static void main(String ar[]){
        int y[]={1,2,3,4,5};
        z Z=new z();
        int zzz[]=Z.zz(y);
        for(int i=0;i<zzz.length;i++){
            System.out.print("  "+y[zzz[i]]);
        }
    }
}
