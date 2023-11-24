package academy.aulas.maratonajava.introducao;

public class aula05_estuturacondicional02 {
    public static void main(String[] args) {
        //idade <15 categoria infantil
        //idade >= 15 && idade <18 categoria juvenil
        //idade >=18 categoria adulto
        int idade = 19;
        if (idade < 15){
            System.out.println("Categoria Infantil");
        }
        else if (idade >= 15 && idade <18){
            System.out.println("Categoria Juvenil");
        }
        else {
            System.out.println("Categoria Adulto");

        }
    }
}
