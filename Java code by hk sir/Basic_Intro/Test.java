// take purchase amt and calaculate payable amt if ....


public class Test {
    public static void main (String ar[]){
        double a=20000;
        if (a>25000) {
            double p=a-(a*10/100);
            System.out.println(p);
        }
        else{
            double p=a-(a*5/100);
            System.out.println(p);
        }
    }

    
}
