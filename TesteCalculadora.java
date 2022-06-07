import java.util.Scanner;
public class TesteCalculadora {
    public static void main(String[] args) {
        // 1. Instanciar a classe Calculadora
        //ou seja, construir um objeto do tipo Calculadora

        //2. Obter dois inteiros junto ao usuário
        Scanner leitor = new Scanner(System.in);
        var calc = new Calculadora();

        System.out.println("Digite um valor");
        var a = leitor.nextInt();
        System.out.println("Digite um valor");
        var b = leitor.nextInt();
        //3. Somar os dois inteiros utilizando o método somar da calculadora
        var resultado = calc.somar(a, b);
        //4. Exibir o resultado
        System.out.println("A soma dos valores é: " + resultado);
    }
    
}
