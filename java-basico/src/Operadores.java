public class Operadores {
    public static void main(String[] args) {
        // Exercício 1: Concatenação
        System.out.println("\n--- Exercício 1: Concatenação ---");
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println("Nome Completo: " + nomeCompleto);

        String concatenacao = "?";
        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);
        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);
        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);
        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);
        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);

        System.out.println("\n--- Exercício 2: Operadores Unários ---");
        int numero = 5;
        System.out.println("Número negativo: " + (-numero));
        numero++;
        System.out.println("Número incrementado: " + numero);
        System.out.println("Número pós-incremento: " + numero++);
        System.out.println("Número atualizado: " + numero);
        System.out.println("Número pré-incremento: " + (++numero));

        boolean verdadeiro = true;
        System.out.println("Inversão booleana: " + !verdadeiro);

        System.out.println("\n--- Exercício 3: Operador Ternário ---");
        int a = 5, b = 6;
        String resultado = (a == b) ? "verdadeiro" : "falso";
        System.out.println("Resultado da comparação: " + resultado);

        System.out.println("\n--- Exercício 4: Comparação de Números ---");
        int numero1 = 1, numero2 = 2;
        System.out.println("Número 1 maior que Número 2? " + (numero1 > numero2));
        System.out.println("Número 1 menor que Número 2? " + (numero1 < numero2));
        System.out.println("Número 1 maior ou igual que Número 2? " + (numero1 >= numero2));
        System.out.println("Número 1 menor ou igual que Número 2? " + (numero1 <= numero2));
        System.out.println("Número 1 é diferente de Número 2? " + (numero1 != numero2));

        System.out.println("\n--- Exercício 5: Comparação de Strings ---");
        String nome1 = "JAVA";
        String nome2 = "JAVA";
        System.out.println("nome1 == nome2: " + (nome1 == nome2)); // true

        String nome3 = new String("JAVA");
        System.out.println("nome1 == nome3: " + (nome1 == nome3)); // false

        String nome4 = nome3;
        System.out.println("nome3 == nome4: " + (nome3 == nome4)); // true

        // Comparação usando equals
        System.out.println("nome1.equals(nome2): " + nome1.equals(nome2));
        System.out.println("nome2.equals(nome3): " + nome2.equals(nome3));
        System.out.println("nome3.equals(nome4): " + nome3.equals(nome4));

        System.out.println("\n--- Exercício 6: Comparação Avançada com Integers ---");
        int numero3 = 130, numero4 = 130;
        System.out.println("numero3 == numero4: " + (numero3 == numero4)); // true

        Integer numero5 = 130, numero6 = 130;
        System.out.println("numero5 == numero6: " + (numero5 == numero6)); // false
        System.out.println("numero5.equals(numero6): " + numero5.equals(numero6)); // true

        System.out.println("\n--- Exercício 7: Operadores Lógicos ---");
        boolean condicao1 = true, condicao2 = false;
        System.out.println("Condicao1 && Condicao2: " + (condicao1 && condicao2));
        System.out.println("Condicao1 || Condicao2: " + (condicao1 || condicao2));

        if (condicao1 && condicao2) {
            System.out.println("Os dois valores precisam ser verdadeiros");
        }

        if (condicao1 || condicao2) {
            System.out.println("Um dos valores precisa ser verdadeiro");
        }

        System.out.println("\n--- Fim da Execução ---");
    }
}

