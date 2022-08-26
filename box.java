import java.io.*;
class box {
    static void box_printing(int k, int l)
    {
        int a, b;

        for (a = 1; a <= k; a++) {
            for (b = 1; b <= l; b++) {

                if (a == 1 || a == k || b == 1 || b == l)

                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int rows = 8, columns = 22;
 
        box_printing(rows, columns);
    }
}
