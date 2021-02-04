import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String placa;
        //String cor;
        double qtdeKms;
        //double qtdeCombustivel;

        System.out.println("Digite a placa do carro:");
        placa = scan.nextLine();

        System.out.printf("Digite a kilometragem do carro:");
        qtdeKms = scan.nextDouble();

        //declarando
        CarroPasseio carro;

        //instanciar
        carro = new CarroPasseio(placa,"preto",qtdeKms,15,250);

        System.out.println(carro.toString());

        Caminhao caminhao;
        caminhao = new Caminhao("BBB-1122","vermelho",250000,120,3,1500);

        System.out.println(caminhao.toString());

        caminhao.carregar(2000);
        caminhao.abastecer(50);

        System.out.println(caminhao.toString());

        System.out.println(caminhao instanceof Caminhao);
        System.out.println(caminhao instanceof Veiculo);

    }


}
