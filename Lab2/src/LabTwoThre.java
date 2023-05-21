import java.util.Scanner;

public class LabTwoThre {
    static Scanner sc;
    public static void fillMas(int[]arr, int i) {
        if(i!=arr.length){
            arr[i] = sc.nextInt();
            fillMas(arr, ++i);
        }
    }
    public static void printMas(int[]arr, int i) {
        if(i!=arr.length){
            System.out.print(arr[i]);
            printMas(arr, ++i);
        }
    }

    public static void main(String [] args){
        sc = new Scanner(System.in);
        System.out.println("count");
        int count = sc.nextInt();
        int[] arr = new int[count];
        System.out.println("Заполнение массива");
        fillMas(arr,0);
        System.out.println("Вывод массива");
        printMas(arr,0);
    }
}
