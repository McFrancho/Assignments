import java.lang.Math;
public class Quadratic {

    public static void main(String[] args) {

        int a = 2;
        int b = 4;
        int c =2 ;
       double firstRoot;
       double secondRoot;

        firstRoot = (-b + Math.sqrt((b*b) - 4*a*c))/(2*a);
        secondRoot = (-b - (Math.sqrt((b*b) - 4*a*c)))/(2*a);
        System.out.println("The roots of the quadratic equation " +a+"x^2 +" +b+"x" +
                " + " +c +" = 0 are : \n First Root : " +firstRoot+ "\n Second Root : "+secondRoot);

    }
}

