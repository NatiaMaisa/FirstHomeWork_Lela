package org.example;


public class While {
    public static void main(String[] args) {
        String printChar = "I Love Automation Software Testing";
        int i = 2; //
        while (i < printChar.length()) {
            System.out.print(printChar.charAt(i));
            if (printChar.charAt(i) == 'z') {
                break;
            }
            i += 3;
        }
    }
}