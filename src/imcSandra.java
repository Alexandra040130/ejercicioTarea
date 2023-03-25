import java.util.Scanner;

public class imcSandra {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double peso = entrada.nextDouble();
        double altura = entrada.nextDouble();
        double imc = peso / (Math.pow(altura, 2));

        if (imc < 18.5){
            System.out.println("Su indice de masa corporal está por de bajo de lo normal");
        }else if(imc >= 18.5 && imc <= 24.9){
            System.out.println("Su indice de masa corporal es correcto.");
        }else if(imc >= 25 && imc < 30){
            System.out.println("Su indice de masa corporal está en el rango de sobrepeso");
        }else {
            System.out.println("Su indice de masa corporal esta esta en el rango de obecidad");
        }
    }
}
