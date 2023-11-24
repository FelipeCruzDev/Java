package academy.aulas.maratonajava.introducao;

public class aula04_operadores {
    public static void main(String[] args) {
        //Temos 4 operadores logicos: + , - , / , *, %
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01-numero02;
        System.out.println(resultado);

        //Temos 2 operadores Relacionais: < >, <= >=, ==, != (SEMPRE RETORNAM VALORES BOOLEANOS)

        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println(isDezMaiorQueVinte);

        //Operador Logico de comparação: AND(&&), OR(||), OR EXCLUSIVO (XOR ^ ), NOT (!)

        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade  >= 30 && salario > 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario > 3381;
        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupança = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente >= valorPlaystation || valorTotalContaPoupança > valorPlaystation;
        System.out.println(isPlaystationCincoCompravel);

        // Operadores de atribuição: =, +=, -=, *=, /=, %=
        double bonus = 1800; //1800
        bonus += 1000; //2800
        bonus -= 1000;//1800
        bonus *=2; //3600
        bonus /=2; //1800
        System.out.println(bonus);

        // Operadores Unarios: (variavel)++, ++(variavel), (variavel)--, --(variavel)
        int contador =0;
        contador +=1;
        System.out.println(contador);



    }
}
