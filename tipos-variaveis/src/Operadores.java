public class Operadores {
    
    public static void main(String[] args) throws Exception {

        // Operadores

            // Atribuição
                // Representado pelo símbolo de igualdade "=".
                // O operador de atribuição é utilizado para definir o valor inicial ou sobrescrever o valor de uma variável. em Java, definimos um tipo, nome e opcionalmente atribuímos um valor à variável através do operador de atribuição. Exemplos abaixo:

                    //classe Operadores.java
                    String nome = "GLEYSON";
                    int idade2 = 22;
                    double peso = 68.5;
                    char sexo = 'M';
                    boolean doadorOrgao = false;

        // Aritméticos
            // O operador aritmético, é utilizado para realizar operações matemáticas entre valores numéricos, podendo se tornar ou não uma expressão mais complexa.

                    //classe Operadores.java
                    double soma = 10.5 + 15.7;
                    int subtração = 113 - 25;
                    int multiplicacao = 20 * 7;
                    int divisao = 15 / 3;
                    int modulo = 18 % 3;
                    double resultado = (10 * 7) + (20/4);

                     System.out.print(soma);


                    //classe Operadores.java
                    String nomeCompleto = "LINGUAGEM " + "JAVA";
                    
                    System.out.print(nomeCompleto);

                    //qual o resultado das expressoes abaixo?
                    String concatenacao ="?"; 

                    concatenacao = 1+1+1+"1";
                    System.out.print(concatenacao);

                    concatenacao = 1+"1"+1+1;
                    System.out.print(concatenacao);

                    concatenacao = 1+"1"+1+"1";
                    System.out.print(concatenacao);

                    concatenacao = "1"+1+1+1;
                    System.out.print(concatenacao);

                    concatenacao = "1"+(1+1+1);
                    System.out.print(concatenacao);

    // Unários
        // Esses operadores, são aplicados juntamente com um outro operador aritmético. Eles realizam alguns trabalhos básicos como incrementar, decrementar, inverter valores numéricos e booleanos.
            // (+) Operador unário de valor positivo – números são positivos sem esse operador explicitamente;
            // (-) Operador unário de valor negativo – nega um número ou expressão aritmética;
            // (++) Operador unário de incremento de valor – incrementa o valor em 1 unidade;
            // (--) Operador unário de decremento de valor – decrementa o valor em 1 unidade;
            //  (!) Operador unário lógico de negação – nega o valor de uma expressão booleana.


    // Sistema de repetição e inversão
       // numero = numero + 1 == numero++;
       // numero = numero - 1 == numero--;


        boolean variavel = true;
        variavel = !variavel; // ! vale como a negação no caso booleano

        System.out.println(!variavel);

    // Relacionais
      //  Os operadores relacionais, avaliam a relação entre duas variáveis ou expressões. Neste caso, mais precisamente, definem se o operando à esquerda é igual, diferente, menor, menor ou igual, maior, maior ou igual ao da direita, retornando um valor booleano como resultado.
        //  == Quando desejamos verificar se uma variável é IGUAL A outra.
        //  != Quando desejamos verificar se uma variável é DIFERENTE da outra.
        //  => Quando desejamos verificar se uma variável é MAIOR QUE a outra.
        //  >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.
        //  < Quando desejamos verificar se uma variável é MENOR QUE outra.
        //  <= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.


}       
    }
	
    
