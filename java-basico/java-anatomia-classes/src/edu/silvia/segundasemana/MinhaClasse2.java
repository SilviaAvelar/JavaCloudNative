package edu.silvia.segundasemana;
public class MinhaClasse2 {
    public static void main(String[] args) {

        String primeiroNome = "Silvia";
        String segundoNome = "Avelar";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }

}
