import java.util.Scanner;

public class floresSandra {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        System.out.print("ponga el dinero: ");
        double dinero = escaner.nextDouble();

        int ramo1 = (int)dinero / 70;

        int ramo2 = (int)dinero / 120;

        System.out.println(String.format( "Puedes compar %s ramos de 70 $ pesos ", ramo1));

        System.out.println(String.format( "Y %s ramos de 120 $", ramo2));
    }
}
