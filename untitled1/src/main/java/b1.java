import java.util.Scanner;

public class b1 {
    static char[] s2 = new char[]{'r', 'e', 'd'};

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String s4 = "";
        a:
        while (true) {
            for (int i = 0; i < 3; i++) {
                s4 += s2[i];
                if (s4.length() == x) break a;
            }
        }
        System.out.print(s4);

    }
}