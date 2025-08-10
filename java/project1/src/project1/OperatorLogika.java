

public class OperatorLogika {
    public static void main(String[] args) {
        boolean a = true, b= false, c;

        // konjungsi (dan)
        c = a && b;
        System.out.println( "true && false: "+c);

        // konjungsi(atau)
        c = a || b;
        System.out.println("true || false: "+c);

        // konjungsi (bukan/negasi/kebalikan)
        System.out.println("Negasi, !true: "+!a);

    }
}
