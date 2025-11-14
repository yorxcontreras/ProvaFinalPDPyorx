// [Contexto] Mantém uma referência à Estratégia e delega a execução.
// Esta classe é o fluxo principal de análise e não precisa saber qual algoritmo
// está sendo executado, apenas que ele implementa a interface EstrategiaCalculoRisco.
public class PlataformaAnalise {
    
    // Referência à interface da Estratégia.
    private EstrategiaCalculoRisco estrategia;
    private int pontuacaoCliente;

    public PlataformaAnalise(int pontuacaoCliente, EstrategiaCalculoRisco estrategia) {
        // Justificativa do Padrão: A estratégia é injetada no Contexto.
        this.pontuacaoCliente = pontuacaoCliente;
        this.estrategia = estrategia;
    }

    /**
     * Altera a estratégia (modelo de cálculo) dinamicamente em tempo de execução.
     */
    public void setEstrategia(EstrategiaCalculoRisco novaEstrategia) {
        this.estrategia = novaEstrategia;
    }

    /**
     * Executa o cálculo de risco, delegando-o à Estratégia configurada.
     */
    public String analisarPerfilDeRisco() {
        System.out.println("Iniciando análise de perfil para cliente com pontuação base: " + pontuacaoCliente);
        // Delegação da operação
        return estrategia.calcularRisco(pontuacaoCliente);
    }
}