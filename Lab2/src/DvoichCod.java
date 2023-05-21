public class DvoichCod {
    public static void decToBinOne(int n) {
        if (n != 0) {
            System.out.print(n % 2);
            decToBinOne(n / 2);
            System.out.println(n % 2);
        }
        return;
    }

    public static void main(String[] args) {
        decToBinOne(86);
    }
}
