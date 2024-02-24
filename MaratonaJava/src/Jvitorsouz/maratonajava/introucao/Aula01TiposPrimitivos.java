package Jvitorsouz.maratonajava.introucao;

public class Aula01TiposPrimitivos {

    public static void main(String[] args) {
        
        //Criando um espaço na memoria do tipo int
        int age = 1;

        //Imprimindo ela, 
        System.out.println("the age is " + age);

        //Outros tipos de primitivas
        long numeroGrande = 100000;
        double salarioDouble = 2000;
        float salarioFloat = 2500;
        byte idadeByte = -18;
        short idadeShort =10;
        boolean verdadeiro = true;
        char caracter = 'c';

        //Imprime um caracter da tabela ASCC
        char caracter1 = 87;
        System.out.println(caracter1); //W

        //String é um reference type e não um tipo primitivo
        String name = "My name is João Vitor";
        System.out.println(name);

      
        
        
    }
    
}
