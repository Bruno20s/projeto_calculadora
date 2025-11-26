package Calculadora;

/**
 * <p><strong>Projeto Calculadora - Documentação</strong></p>
 *
 * <p>Esta classe implementa operações aritméticas fundamentais utilizadas em
 * aplicações simples e didáticas. O objetivo é demonstrar o uso de métodos
 * puros, tratamento de exceções e um método controlador que delega a execução
 * conforme o operador informado.</p>
 *
 * <p><strong>Principais conceitos envolvidos:</strong></p>
 * <ul>
 *     <li>Uso de funções determinísticas</li>
 *     <li>Validação de parâmetros de entrada</li>
 *     <li>Refatoração e organização de código</li>
 *     <li>Documentação utilizando Javadoc</li>
 * </ul>
 *
 * <p>Após a documentação, este código pode ser utilizado para gerar automaticamente
 * páginas informativas sobre sua API, facilitando revisão e testes.</p>
 *
 * @author Seu Nome
 * @version 1.0
 */
public class Calculadora {

    /**
     * <p>Realiza a soma entre dois valores inteiros.</p>
     *
     * @param a primeiro número
     * @param b segundo número
     * @return resultado da soma entre {@code a} e {@code b}
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * <p>Subtrai o segundo valor informado do primeiro.</p>
     *
     * @param a valor inicial
     * @param b valor que será subtraído
     * @return resultado da operação {@code a - b}
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * <p>Executa a multiplicação entre dois inteiros.</p>
     *
     * @param a primeiro fator
     * @param b segundo fator
     * @return produto da multiplicação entre os fatores
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * <p>Efetua a divisão entre dois números inteiros.</p>
     *
     * <p><strong>Atenção:</strong> divisão por zero não é permitida e gera exceção.</p>
     *
     * @param a dividendo
     * @param b divisor
     * @return resultado da divisão {@code a / b}
     * @throws IllegalArgumentException caso o divisor seja igual a zero
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida");
        }
        return a / b;
    }

    /**
     * <p>Processa a operação matemática desejada com base no símbolo informado.</p>
     *
     * <p><strong>Operadores aceitos:</strong></p>
     * <ul>
     *     <li>"+" → soma</li>
     *     <li>"-" → subtração</li>
     *     <li>"*" → multiplicação</li>
     *     <li>"/" → divisão</li>
     * </ul>
     *
     * <p>Qualquer operador diferente dos listados gera uma exceção.</p>
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @param operador símbolo da operação desejada
     * @return resultado da operação solicitada
     * @throws IllegalArgumentException caso o operador seja inválido
     */
    public int calcular(int a, int b, String operador) {
        return switch (operador) {
            case "+" -> somar(a, b);
            case "-" -> subtrair(a, b);
            case "*" -> multiplicar(a, b);
            case "/" -> dividir(a, b);
            default -> throw new IllegalArgumentException("Operador inválido: " + operador);
        };
    }
}
