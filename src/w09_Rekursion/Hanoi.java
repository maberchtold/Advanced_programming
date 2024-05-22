package w09_Rekursion;

public class Hanoi {
    public static void main(String[] args) {
        int n = 60;
        //s = source, t = temp, d = destination
        hanoi(n,1,3,2);
    }

    public static void hanoi(int n, int s, int d, int t){
        if (n==1){
            System.out.println("Bewege von "+s+" nach "+d);
        }else {
            hanoi(n-1,s,t,d);
            System.out.println("Bewege von "+s+" nach "+d);
            hanoi(n-1,t,d,s);
        }
    }
}
