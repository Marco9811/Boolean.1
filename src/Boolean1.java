
public class Boolean1 {

    public static void main(String[] args) {

       boolean A = (2 <= 2 && !true); // La risposta è False
        System.out.println(A);

        boolean B =(!false && 3 > 2); // La risposta è vera
        System.out.println(B);

        boolean C = (/*considerando ciò t=falsee f=true:*/!(!true || false)); // La risposta è vera
        System.out.println(C);

        boolean D = (6 > 6 ^ !(true && true)); // La risposta è falsa
        System.out.println(D);

    }
}