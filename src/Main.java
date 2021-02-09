import java.util.Scanner;


public class Main {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int qtdeCarros = 0;
        int qtdeCaminhoes = 0;
        int op=1;
        int tipo;

        CarroPasseio[] carros = new CarroPasseio[5];
        Caminhao[] caminhoes = new Caminhao[5];

        CarroPasseio carroPasseio;
        Caminhao caminhao;

        String placa;
        String cor;
        double qtdeKms;
        double qtdeCombustivel;
        double tamanhoPortamala;
        double pesoCarga;
        int qtdeEixos;

        //Veiculo generico = new Veiculo("XXX-0000","azul",1000,10); //não pode instanciar veículo pois é abstrato.

        while(op != 0){

            System.out.println("O que você quer cadastrar? 1 - Carro, 2 - Caminhao");
            tipo = scan.nextInt();

            scan.nextLine(); // limpando o buffer

            System.out.println("Digite a placa:");
            placa = scan.nextLine();
            System.out.println("Digite a cor:");
            cor = scan.nextLine();
            System.out.println("Kilometragem:");
            qtdeKms = scan.nextDouble();
            System.out.println("Quantidade de combustivel no tanque:");
            qtdeCombustivel = scan.nextDouble();

            if(tipo == 1){
                System.out.println("Qual o tamanho do portamalas:");
                tamanhoPortamala = scan.nextDouble();

                carroPasseio = new CarroPasseio(placa,cor,qtdeKms,qtdeCombustivel,tamanhoPortamala);

                carros[qtdeCarros] = carroPasseio;
                qtdeCarros += 1;

            }else if(tipo == 2){
                System.out.println("Qual o máximo de carga do caminhão:");
                pesoCarga = scan.nextDouble();
                System.out.println("Qual a quantidade de eixos:");
                qtdeEixos = scan.nextInt();

                caminhao = new Caminhao(placa,cor,qtdeKms,qtdeCombustivel,qtdeEixos,pesoCarga);
                caminhoes[qtdeCaminhoes] = caminhao;
                qtdeCaminhoes += 1;

            }else{
                System.out.println("Opção inválida!!!");
            }

            System.out.println("Continuar? 1- Sim, 0-Não");
            op = scan.nextInt();
        }


        for(int i=0;i<carros.length;i++){
            if(carros[i] != null){
                System.out.println(carros[i].toString());
            }
        }

        for(int i=0;i<caminhoes.length;i++){
            if(caminhoes[i] != null){
                System.out.println(caminhoes[i].toString());
            }
        }






    }


}
