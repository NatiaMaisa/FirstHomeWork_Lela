package org.example;


public class Main {
    public static void main(String[] args) {
        int[] array = {1, 5, 7, 9, -1, -8};
        int evens = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evens++;
            }
        }
        if (evens == 0) {
            System.out.println("მასივში არ არის ლუწი რიცხვი");
        } else {
            System.out.println("ამ მასივში არის " + evens + " ლუწი რიცხვი ");
        }

        checkNumber(1);
        checkNumber(0);
        checkNumber(-1);

//        hasTeen(1, 2, 3);
//        hasTeen(13, 2, 3);
//        hasTeen(1, 2, 19);
//        hasTeen(12, 2, 30);
//        hasTeen(14, 17, 18);

        hasTeen1(1, 62, 3);
        hasTeen1(13, 92, 93);
        hasTeen1(1, 2, 19);
        hasTeen1(12, 2, 30);
        hasTeen1(14, 17, 18);
    }

    static void checkNumber(int x) {
        if (x == 0) {
            System.out.println("ნული");
        } else if (x > 0) {
            System.out.println("დადებითი");
        } else {
            System.out.println("უარყოფითი");
        }
    }

    static void hasTeen(int x, int y, int z) {
        boolean[] b = new boolean[3];
        if (x >= 13 && x <= 19) {
            b[0] = true;
        }
        if (y >= 13 && y <= 19) {
            b[1] = true;
        }
        if (z >= 13 && z <= 19) {
            b[2] = true;
        }

        boolean result = b[0] || b[1] || b[2];
        if (result) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    static void hasTeen1(int x, int y, int z) {
        if ((x >= 13 && x <= 19) || (y >= 13 && y <= 19) || (z >= 13 && z <= 19)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}








