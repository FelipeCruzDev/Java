package academy.aulas.maratonajava.introducao;
/*
PRATICA
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem.

Eu <nome>,morando no endereço <endereço>,
Confirmo que recebi o salario de <salario>,na data <data>
 */
public class aula03_tiposprimitivosexercicios {
    public static void main(String[] args) {
        String nome ="Felipe";
        String endereco = "Rua Manuel de Medeiros Nº200,Dois irmãos,Recife";
        double salario = 2500.03;
        String data = "28/09/2023";
        String relatorio = "Eu "+nome+" ,morando no endereço "+endereco+"\nConfirmo que recebi o salario de "+salario+",na data "+data;
        System.out.println(relatorio);


    }

}
