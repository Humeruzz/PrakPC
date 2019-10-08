package Prak5;

public class Main {
    public static void main(String [] args){
        System.out.println(recursion1(3,2));
    }

    public static String recursion(String s) {
        if (s.length() == 1) {
            return "YES";
        } else {
            if (s.substring(0, 1) == s.substring(s.length() - 1, s.length())) {
                if (s.length() == 2) {
                    return "YES";
                }
                return recursion(s.substring(1, s.length() - 1));
            } else {
                return "NO";
            }
        }
    }

    public static int recursion(int x, int y) {
        if (x==0){
            return y;
        }
        else{
            return recursion( x/10, y*10 + x%10 );
        }
    }

    public static boolean recursion1(int n, int i) {
        if (n < 2) {
            return false;
        }
        else if (n == 2) {
            return true;
        }
        else if (n % i == 0) {
            return false;
        }
        else if (i < n / 2) {
            return recursion1(n, i + 1);
        } else {
            return true;
        }
    }
}
