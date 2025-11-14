// [Produto Concreto] Implementação do Relatório Semanal.
public class RelatorioSemanal implements Relatorio {

    @Override
    public String preparar() {
        // Justificativa do Padrão: Novo produto adicionado sem modificar a classe de Creator Abstrata.
        
        StringBuilder content = new StringBuilder();
        content.append("--- RELATÓRIO OPERACIONAL SEMANAL ---\n");
        content.append("Fontes de Dados: Banco de Dados Histórico Consolidado.\n");
        content.append("Priorização: Análise de custo por rota e produtividade.\n");
        content.append("Formato: Tabela detalhada com gráficos de tendência.\n");
        return content.toString();
    }
}