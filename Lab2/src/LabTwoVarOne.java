// Ознакомиться с теорией и исследовать работу программы для нахождения корней нелинейного уравнения методом
// Ньютона и методом деления отрезка пополам, описанную в приложении 1 лабораторного практикума. Выполнить
// собственную реализацию методов с помощью рекурсии и проверить их на уравнениях, приведенных в табл. 2.1
// согласно заданному варианту
//x3 – 4х2 – 7х + 10 = 0, корни: 1; -2; 5
public class LabTwoVarOne {
    public static double f(double x) {
        return x*x*x-4*x*x-7*x+10;
    }
    static double eps = 0.00000001;
    public static void x_div(double a, double b) {
        double x = (a + b) / 2;
        System.out.println(x);
        if(Math.abs(a-b)>eps){
            if(f(a)*f(x)>0){
                a=x;
            }
            else{
                b = x;
            }
            x_div(a,b);
        }

    }
    public static void main(String[] args) {
        x_div(-10,-0.5);
    }
}
