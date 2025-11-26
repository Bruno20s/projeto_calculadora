package Calculadora;

/**
 * <p><strong>Classe de Testes da Calculadora</strong></p>
 *
 * <p>Esta classe contém um conjunto de execuções simples destinadas a validar
 * o funcionamento da classe {@link Calculadora}. O objetivo deste arquivo é
 * demonstrar, de forma prática, como os métodos da calculadora se comportam
 * em diferentes cenários, incluindo erros esperados.</p>
 *
 * <p><strong>Cenários abordados:</strong></p>
 * <ul>
 *     <li>Operações básicas: soma, subtração, multiplicação e divisão</li>
 *     <li>Tratamento de exceções em caso de divisão por zero</li>
 *     <li>Validação do comportamento para operadores inválidos</li>
 * </ul>
 *
 * <p>Esta classe não utiliza frameworks de teste, pois seu propósito é apenas
 * demonstrativo. No entanto, ela pode ser adaptada futuramente para JUnit ou
 * outras ferramentas de testes automatizados.</p>
 *
 * @author Seu Nome
 * @version 1.0
 */
public class TesteCalculadora {

    /**
     * <p>Método principal responsável por executar e exibir os resultados das
     * operações da calculadora. Cada teste é ilustrado por uma chamada direta
     * ao método <code>calcular</code>, permitindo verificar saídas corretas e
     * mensagens de erro.</p>
     *
     * @param args argumentos de execução (não utilizados)
     */
    public static void main(String[] args) {

        // Instância utilizada nos testes
        Calculadora calc = new Calculadora();

        // Testes de operações válidas
        System.out.println(calc.calcular(2, 3, "+"));
        System.out.println(calc.calcular(10, 4, "-"));
        System.out.println(calc.calcular(3, 5, "*"));
        System.out.println(calc.calcular(8, 2, "/"));

        // Teste de divisão por zero
        try {
            System.out.println(calc.calcular(8, 0, "/"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Teste de operador inválido
        try {
            System.out.println(calc.calcular(5, 5, "x"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}