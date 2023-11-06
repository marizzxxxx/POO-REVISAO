
public class Empregado {

    private String nome;
    private String sobrenome;
    private double salarioMensal;

    public Empregado(String nome, String sobrenome, double salarioMensal) {

        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
    }

    public void cadastrar(String nome, String sobrenome, double salarioMensal) {

        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
    }

    public double calcs() {

        return salarioMensal * 12;
    }

    public void aumentocon(double percentual) {

        salarioMensal *= (1 + (percentual / 100));
    }

    public void info() {

        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Salário Mensal: $" + salarioMensal);
        System.out.println("Salário Anual: $" + calcs());
    }

        public static void main(String[] args) {

            Empregado empregado1 = new Empregado("Maria Eduarda", "C. Aires", 4000.0);
            Empregado empregado2 = new Empregado("Maria Eduarda", "F. Batista", 3500.0);
    
            System.out.println("Informações dos Empregados antes do aumento salarial:");
            System.out.println("Empregado 1:");
            empregado1.info();

            System.out.println("\nEmpregado 2:");
            empregado2.info();
    
            empregado1.aumentocon(10);
            empregado2.aumentocon(10);
    
            System.out.println("\nInformações dos Empregados após o aumento salarial:");
            System.out.println("Empregado 1:");
            empregado1.info();

            System.out.println("\nEmpregado 2:");
            empregado2.info();
        }
    }