public class CarroPasseio extends Veiculo{

    private double tamanhoPortaMalas;


    //método construtor = inicalizar os atributos do objeto
    public CarroPasseio(String placa,
                        String cor,
                        double qtdeKm,
                        double qtdeCombustivel,
                        double tamanhoPortaMalas) {

        super(placa,cor,qtdeKm,qtdeCombustivel);
        this.tamanhoPortaMalas = tamanhoPortaMalas;
    }


    @Override
    public void abastecer(double qtdeCombustivel){
        System.out.println("Colocando Gasolina ou Alcool no tanque do carro...");
        this.qtdeCombustivel += qtdeCombustivel;
    }

    @Override
    public String toString() {
        return "CarroPasseio{" +
                "placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", qtdeKm=" + kilometragem +
                ", qtdeCombustivel=" + qtdeCombustivel +
                ", tamanhoPortaMalas=" + tamanhoPortaMalas +
                '}';
    }
}
