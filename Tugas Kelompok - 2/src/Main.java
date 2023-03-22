import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        generateOddEven(20, "even");
        printl("");
        generateOddEven(20, "odd");
        printl("");
        generateFibo(20);
    }

    public static void generateOddEven(int num, String type) {
        int[] arr = new int[num];
        int total = 0;
        int j = 0;
        String bilanganType = type == "even" ? "Genap" : "Ganjil";
        int mod = type == "even" ? 0 : 1;

        for (int i = 0; i < 2 * num; i++) {
            int number = i + 1;

            if (number % 2 == mod) {
                arr[j] = number;
                total += number;
                
                if (j < num - 1) {
                    j++;
                }
            }
        }

        printResult(bilanganType, arr, total);
    }

    public static void generateFibo(int num) {
        int[] arr = new int[num];
        int total = 0;

        for (int i = 0; i < num; i++) {
            if (i == 0 || i == 1) {
                arr[i] = 1;
            } else {
                arr[i] = arr[i-1] + arr[i-2];
            }

            total += arr[i];
        }

        printResult("Fibonacci", arr, total);
    }

    public static void printResult(String bilanganType, int[] arrNumber, int total){
        String numbers = "";
        for (int i = 0; i < arrNumber.length; i++) {
            numbers += arrNumber[i] + " ";
        }

        printl(arrNumber.length + " Bilangan " + bilanganType);
        printl(numbers);
        printl("Hasil penjumlahan: " + total);
    }

    public static void print(String param) {

        System.out.print(param);
    }

    public static void printl(String param) {

        System.out.println(param);
    }

    public static void printf(String param) {

        System.out.printf(param);
    }
}
