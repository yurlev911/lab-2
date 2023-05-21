//x^3 - 3.5x^2 + 0.5x + 5 = 0
public class Primer {
    public static double x_div2(double a, double b, double e) {
        while (b - a > e) {
            double c = (a + b) / 2;
            if ((a) * (c) < 0)
                b = c;
            else if((a) * (c) > 0)
                a = c;
            else
                return c;
        }
        return (a + b) / 2;
    }
    //Мои попытки привели меня к такому варианту:

    public static double x_div(double a, double b, double e) {
        double c = (a + b) / 2;
        if (b - a <= e) {
            return c;
        }
        if (b - a > e) {
            if ((a) * (c) < 0)
                b = c;
            else if ((a) * (c) > 0)
                a = c;
            else
                return c;
        }
        return x_div(a, c, e);
    }

    public static void main(String[] args) {

        System.out.println(x_div(2,5,3));

        System.out.println(x_div2(5,2,3));
    }
}

