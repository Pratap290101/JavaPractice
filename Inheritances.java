class Car{
    public int mileage=20;
    String cname="ferarri";
    void showDetails(){
        System.out.println(" from car class car mileage = "+mileage+" car name = "+cname);        
    }
}
class ferrari extends Car{
    int mileage=443;
    ferrari(){
        System.out.println(" from fer class car mileage = "+mileage+" car name = "+cname);
        System.out.println(" from fer class car mileage = "+super.mileage+" car name = "+cname);

        showDetails();
        super.showDetails();
    }
    void showDetails(){
        System.out.println(" from fer class and method car mileage = "+mileage+" car name = "+cname);
    }
}
public class Inheritances {
    public static void main(String[] args) {
        System.out.println("hello charlie");
        ferrari f=new ferrari();
    }
}
