import java.util.Scanner;


public class Main {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String placa;
        String cor;
        double qtdeKms;
        double qtdeCombustivel;
        double tamanhoPortamala;


        System.out.println("Digite a placa:");
        placa = scan.nextLine();
        System.out.println("Digite a cor:");
        cor = scan.nextLine();
        System.out.println("Kilometragem:");
        qtdeKms = scan.nextDouble();
        System.out.println("Quantidade de combustivel no tanque:");
        qtdeCombustivel = scan.nextDouble();
        System.out.println("Qual o tamanho do portamalas:");
        tamanhoPortamala = scan.nextDouble();


        CarroPasseio carroPasseio = new CarroPasseio(placa,cor,qtdeKms,qtdeCombustivel,tamanhoPortamala);


        System.out.println(carroPasseio.toString());


    }


}
