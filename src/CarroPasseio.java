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
