class F1{
    public static void main(String[] args) {
        System.out.println("Hello Charlie");
        // type casting 
        // implicit TypeCasting
        byte x=127;
        int y=x;
        System.out.println(y);
        // explicit TypeCasting
        int a=1234567890;
        byte b=(byte)a;
        System.out.println(b);
        // code
        double i=1,z=0;
        while(i>0){
            System.out.println(z+"="+i);
            i/=2;
            z++;
        }
        System.out.println(z);
         
    }
}