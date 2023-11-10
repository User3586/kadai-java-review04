
public class Review01 {

    public static void main(String[] args) {
            int num1 = 100;
            double num2 = 0.1;
            double result;
            result = tax(num1, num2);
            System.out.println(num1+"円の税込価格は"+(result + num1)+"円(消費税は"+result+"円)" );
        }

        public static double tax(int num1, double num2) {
            double result = num1 * num2;
            return result;


    }

}
