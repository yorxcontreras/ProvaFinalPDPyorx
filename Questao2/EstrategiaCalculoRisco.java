// [Interface - Strategy] Define a interface comum para todos os algoritmos de cálculo.
public interface EstrategiaCalculoRisco {
    /**
     * Calcula o perfil de risco do cliente com base nos dados fornecidos.
     * @param pontuacaoBase Pontuação inicial ou dados de entrada do cliente.
     * @return O perfil de risco final calculado.
     */
    String calcularRisco(int pontuacaoBase);
}