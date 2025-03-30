public class Financeiro {
    private double porcentagemParaVenda;
    private double valorDaVenda;

    public Financeiro(double porcentagemParaVenda, double valorDaVenda){
        this.porcentagemParaVenda = porcentagemParaVenda;
        this.valorDaVenda = valorDaVenda;

    }

    public double getPorcentagemParaVenda(){
        return porcentagemParaVenda;

    }

    public double getValorDaVenda(){
        return valorDaVenda;

    }

    public void setPorcentagemParaVenda(double porcentagemParaVenda){
        this.porcentagemParaVenda = porcentagemParaVenda;

    }

    public void setValorDaVenda(double valorDaVenda){
        this.valorDaVenda = valorDaVenda;

    }

    public double valorDaPorcentagem(){
        return (porcentagemParaVenda / 100) * valorDaVenda + valorDaVenda;
    }

    public double lucroFinal(){
        return valorDaPorcentagem() - valorDaVenda;

    }

    public String toString(){
        return "Valor do custo: R$ "+valorDaVenda+ "\n\nPorcentagem para venda: "+porcentagemParaVenda+ "%\nValor de venda: R$ "+valorDaPorcentagem();
    }
    
}
