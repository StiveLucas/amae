public class Main {

    public static void main(String[] args) {
        
        Roupa roupa = new Roupa("Goku", "30", 3, 50, 100);

        Financeiro financeiro = new Financeiro(200, 90);


         // Limpa o terminal no Windows
         System.out.print("\033[H\033[2J");
         System.out.flush();

        //System.out.println(roupa + "\nValor de lucro: R$ "+roupa.porcentagemDeLucro()+ "\nValor da porcentagem de lucro: "+roupa.porcentagemDeLucroEmPorcentagem()+"%");

        System.out.println(financeiro+ "\nValor de lucro: R$ "+financeiro.lucroFinal());
    }
}