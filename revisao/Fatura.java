
public class Fatura {

    private String numero;
    private String descricao;
    private int quantidade;
    private double precoPorItem;

    public Fatura(String numero, String descricao, int quantidade, double precoPorItem) {

        this.numero = numero;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precoPorItem = precoPorItem;
    }

    public void cadastrar(String numero, String descricao, int quantidade, double precoPorItem) {

        this.numero = numero;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precoPorItem = precoPorItem;
    }

    public double totalFatura() {

        if (quantidade < 0) {
            quantidade = 0;
        }
        if (precoPorItem < 0.0) {
            precoPorItem = 0.0;
        }
        return quantidade * precoPorItem;
    }
    public static void main(String[] args) {

        Fatura fatura1 = new Fatura("12345", "Teclado", 2, 25.0);
        Fatura fatura2 = new Fatura("67890", "Mouse", -1, -10.0);

        System.out.println("Fatura 1:");
        exibirFatura(fatura1);

        System.out.println("\nFatura 2:");
        exibirFatura(fatura2);
    }

    public static void exibirFatura(Fatura fatura) {

        System.out.println("Número da fatura: " + fatura.numero);
        System.out.println("Descrição: " + fatura.descricao);
        System.out.println("Quantidade: " + fatura.quantidade);
        System.out.println("Preço por item: $" + fatura.precoPorItem);
        System.out.println("Total da fatura: $" + fatura.totalFatura());
    }
}