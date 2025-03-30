public class Roupa{

    private String tipo;
    private String tamanho;
    private int quantidade;
    private double valorDeCusto;
    private double valorDeVenda;

    public Roupa(String tipo, String tamanho, int quantidade, double valorDeCusto, double valorDeVenda){
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
        this.valorDeCusto = valorDeCusto;
        this.valorDeVenda = valorDeVenda;

    }

    public String getTipo(){
        return tipo;

    }

    public String getTamanho(){
        return tamanho;

    }

    public int getQuantidade(){
        return quantidade;

    }

    public double getValorDeCusto(){
        return valorDeCusto;

    }

    public double getValorDeVenda(){
        return valorDeVenda;

    }

    public void setTipo(String tipo){
        this.tipo = tipo;

    }

    public void setTamanho(String tamanho){
        this.tamanho = tamanho;

    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;

    }

    public void setValorDeCusto(double valorDeCusto){
        this.valorDeCusto = valorDeCusto;

    }

    public void setValorDeVenda(double valorDeVenda){
        this.valorDeVenda = valorDeVenda;

    }

    public double porcentagemDeLucro(){
        return valorDeVenda - valorDeCusto;

    }

    public double porcentagemDeLucroEmPorcentagem(){
        return (porcentagemDeLucro() / valorDeCusto) * 100;
    }

    public String toString(){
        return "Roupa: \nTipo: "+getTipo()+"\nTamanho: "+getTamanho()+"\nQuantidade: "+getQuantidade()+"\nValor de custo: R$ "+getValorDeCusto()+"\nValor de Venda: R$ "+getValorDeVenda();
    }
}