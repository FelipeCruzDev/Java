package academy.aulas.maratonajava.introducao;

public class aula02_tiposprimitivos {
    public static void main(String[] args) {
        //8 no total: int, double, float, char, byte, short, long, boolean
        int idade = 19;
        long numeroGrande=100000; //Numeros inteiros maiores.
        double SalarioDouble = 2000.0D; // POR PADRÃO JA É NAO PRECISA COLOCAR. numeros decimais maiores indentificando que é um double
        float SalarioFloat = (float) 2500.0; //Numeros decimais indentificando que é um FLOAT.
        byte IdadeByte = -128; //Dentro de um Bite podemos por 8 Bits que é equivalente a o valor 127(nao pode ter mais que 127 EXETO NEGATIVO) ou -128
        short idadeShort = 19; //É o tipo de dado que é capaz de armazenar números inteiros de 16 bits, ou seja, um número inteiro entre -32.768 e 32.767.
        String texto = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.\n"+
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer\n"+
                "ook a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries\n"+
                "but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s\n"+
                "with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software\n"+
                "like Aldus PageMaker including versions of Lorem Ipsum.";
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';
        System.out.println("Tenho " +idade+" anos.");
        System.out.println(falso);
        System.out.println(caractere);
        System.out.println(SalarioFloat);
        System.out.println(texto);
    }
}
