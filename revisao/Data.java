
public class Data {

    private int mes;
    private int dia;
    private int ano;

    public Data(int mes, int dia, int ano) {

        this.mes = mes;
        this.dia = dia;
        this.ano = ano;
    }

    public void cadastrar(int mes, int dia, int ano) {

        this.mes = mes;
        this.dia = dia;
        this.ano = ano;
    }

    public void displayData() {

        System.out.println(dia + " / " + mes + " / " + ano);
    }

    public String dataa() {

        String[] meses = {
            "Janeiro", "Fevereiro", "Março", "Abril",
            "Maio", "Junho", "Julho", "Agosto",
            "Setembro", "Outubro", "Novembro", "Dezembro"
        };
        return dia + " de " + meses[mes - 1] + " de " + ano;
    }
        public static void main(String[] args) {

            Data data1 = new Data(10, 15, 2023);
            Data data2 = new Data(12, 25, 2024);
    
            System.out.println("Data 1:");
            data1.displayData();
            System.out.println("Data por extenso: " + data1.dataa());
            System.out.println("\nData 2:");
            data2.displayData();
            System.out.println("Data por extenso: " + data2.dataa());
        }
    }
    