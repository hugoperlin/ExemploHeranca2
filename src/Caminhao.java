public class Caminhao extends Veiculo{

    private int qtdeEixos;
    private double pesoCarga;

    public Caminhao(String placa,
                    String cor,
                    double qtdeKm,
                    double qtdeCombustivel,
                    int qtdeEixos,
                    double maxCarga) {

        super(placa,cor,qtdeKm,qtdeCombustivel);

        this.qtdeEixos = qtdeEixos;
        this.pesoCarga = maxCarga;
    }

    @Override
    public void abastecer(double qtdeCombustivel){

        System.out.println("Colocando diesel no caminhão!");
        this.qtdeCombustivel += qtdeCombustivel;

    }


    public void carregar(double qtdeCarga){
        this.pesoCarga += qtdeCarga;
    }

    public void descarregar(double qtdeCarga){
        if(this.pesoCarga >= qtdeCarga){
            this.pesoCarga -= qtdeCarga;
        }
    }

    @Override
    public String toString() {
        return "Caminhao{" +
                "placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", qtdeKm=" + kilometragem +
                ", qtdeCombustivel=" + qtdeCombustivel +
                ", qtdeEixos=" + qtdeEixos +
                ", pesoCarga=" + pesoCarga +
                '}';
    }
}
