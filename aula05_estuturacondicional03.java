package academy.aulas.maratonajava.introducao;
//Operador Ternario.
public class aula05_estuturacondicional03 {
    public static void main(String[] args) {
        double salario = 60;
        String MensagemDoar = "Eu vou doar 500 pra Felipe";
        String MensagemNãoDoar = "Ainda não tenho condições";
        //String resultado = (condicao) ? verdadeiro : falso;
        String resultado = (salario > 5000) ? MensagemDoar : MensagemNãoDoar;
        System.out.println(resultado);
    }
    }
