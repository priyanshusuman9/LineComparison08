package com.bridgelabz;

public class EqualsToMethod {
    static String str1, str2;
    public void checkEqualMethod(){
        System.out.println("Check with Equal Method");
        if (str1.equals(str2)) {   // Check the Lines are equal or not
            System.out.println("Two Lines are Equals");
        }
        else
            System.out.println("Two Lines are Not Equals\n");
    }

    public static void main(String[] args) {
        EqualsToMethod e=new EqualsToMethod();
        e.checkEqualMethod();
    }
}
