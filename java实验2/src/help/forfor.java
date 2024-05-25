package help;

public class forfor {
    public static void main(String[] args) {
        int i[] = { 0, 1, 2, 3, 4, 5, 6 };
        for (int j = 0; j < i.length; j++) {
            System.out.print(i[j]);
        }
        System.out.println("\n---------");
        for (int a : i) {
            System.out.print(a);
        }
    }

}
