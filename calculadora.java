import java.util.Scanner;

public class calculadora {
	public static void main(String[] args) {
		
		System.out.print(" ***** CALCULADORA  ***** \n\n");
			System.out.print("Utilizar as nomenclaturas (a) para adição.\n");
			System.out.print("Utilizar as nomenclaturas (s) para subtração.\n");
			System.out.print("Utilizar as nomenclaturas (m) para multiplicação.\n");
			System.out.print("Utilizar as nomenclaturas (d) para divisão.\n");
			
            try (Scanner sc = new Scanner(System.in)) {
                
            while(true) {

		System.out.println("\nDigite a operação que deseja realizar:");
			String operacao = sc.next();

            if(operacao.equals("a")){
                System.out.println("Digite o primeiro número:");
                    int num1 = sc.nextInt();
                System.out.println("Digite o segundo número:");
                    int num2 = sc.nextInt();
                        int ad = num1 + num2;
                System.out.printf("O resultado da operação é: %d\n", ad);

             }else if(operacao.equals("s")){
                System.out.println("Digite o primeiro número:");
                    int num1 = sc.nextInt();
                System.out.println("Digite o segundo número:");
                    int num2 = sc.nextInt();
                        int sub = num1 - num2;
                System.out.printf("O resultado da operaçõe é: %d\n", sub);

             }else if(operacao.equals("m")){
                System.out.println("Digite o primeiro número");
                    int num1 = sc.nextInt();
                System.out.println("Digite o segundo número:");
                    int num2 = sc.nextInt();
                        int mul = num1 * num2;
                System.out.printf("O resultado da operação é: %d\n", mul);

             }else if(operacao.equals("d")){
                System.out.println("Digite o primeiro número:");
                    int num1 = sc.nextInt();
                System.out.println("Digite o segundo número:");
                    int num2 = sc.nextInt();
                        int div = num1 / num2;
                System.out.printf("O resultado da operação é: %d\n", div);

             }else{
                System.out.print("Operação inválida. Digite uma operação válida para prosseguir.");

               
                }	 
		    } 
        }  
	}
}
