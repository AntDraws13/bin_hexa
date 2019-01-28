package app;

import java.util.Scanner;


/* 

authors ant & mónica

*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int n = in.nextInt();
        System.out.println("Base 2: "+toBinary(n, ""));
        System.out.println("Base 16: "+toHex(n));
    }

    public static String toBinary(int N, String bin) {
        if (N == 0) {
            if (bin.isEmpty()) {
                return "0";
            } else {
                return bin;
            }
        } else {
            if (N % 2 == 0) {
                bin = "0" + bin;
            } else {
                bin = "1" + bin;
            }
            return toBinary(N / 2, bin);
        }
    }

    public static String toHex(int bin) {
        String result = "";
        int remainder = bin % 16;
        if (bin == 0) {
            return "";
        } else {
            switch (remainder) {
                case 10:
                    result = "A";
                    break;
                case 11:
                    result = "B";
                    break;
                case 12:
                    result = "C";
                    break;
                case 13:
                    result = "D";
                    break;
                case 14:
                    result = "E";
                    break;
                case 15:
                    result = "F";
                    break;
                default:
                    result = remainder + result;
                    break;
            }
            return toHex((bin / 16)) + result;
        }
    }

}