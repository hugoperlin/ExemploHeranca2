public class Veiculo {

    protected String placa;
    protected String cor;
    protected double kilometragem;
    protected double qtdeCombustivel;


    public Veiculo(String placa,
                   String cor,
                   double kilometragem,
                   double qtdeCombustivel) {
        this.placa = placa;
        this.cor = cor;
        this.kilometragem = kilometragem;
        this.qtdeCombustivel = qtdeCombustivel;
    }

    public void abastecer(double qtdeCombustivel){
        System.out.println("Colocando combustivel no veiculo...!");
        this.qtdeCombustivel += qtdeCombustivel;
    }

    public void andar(double kms){
        this.kilometragem += kms;
    }

}
