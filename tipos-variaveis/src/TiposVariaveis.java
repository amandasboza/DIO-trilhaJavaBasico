public class TiposVariaveis {
   
    public static void main(String[] args) throws Exception {
        
        // Declaração de Variáveis

            // Os oito tipos primitivos em Java são:
                // int, byte, short, long, float, double, boolean e char – esses tipos não são considerados objetos e portanto representam valores brutos. Eles são armazenados diretamente na pilha de memória. (Memory stack)

        byte idade = 123;
		short ano = 2021;
		int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
		long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
		float pi = 3.14F; // precisa ter o F no final para o Java reconhecer o float    
		double salario = 1275.33;

        int numero = 1;
        numero = 10;
        System.out.print(numero);

    }
}
