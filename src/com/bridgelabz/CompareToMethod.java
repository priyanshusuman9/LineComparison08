package com.bridgelabz;

public class CompareToMethod {
    static String str1, str2;
    public double CheckComputeToMethod() {
        System.out.println("\n * Check with Equal Method");
        double check = str1.compareTo(str2);
        if (check == 0)
            System.out.println("The two lines are equal\n");
        else if (check < 0.0)
            System.out.println("Line1 is smaller than Line2\n");
        else
            System.out.println("Line1 is greater than Line2\n");
        return( check);
    }

    public static void main(String[] args) {
        CompareToMethod c=new CompareToMethod();
        c.CheckComputeToMethod();
    }
}
