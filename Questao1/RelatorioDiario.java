// [Produto Concreto] Implementação do Relatório Diário.
public class RelatorioDiario implements Relatorio {
    
    @Override
    public String preparar() {
        // Justificativa do Padrão: Este encapsula a lógica de preparação do produto específico.
        // O Factory Method garante que o cliente não precise saber desta classe.
        
        StringBuilder content = new StringBuilder();
        content.append("--- RELATÓRIO OPERACIONAL DIÁRIO ---\n");
        content.append("Fontes de Dados: Sistema de Rastreamento em Tempo Real.\n");
        content.append("Priorização: Entregas urgentes do dia.\n");
        content.append("Formato: Resumo executivo (apenas métricas essenciais).\n");
        return content.toString();
    }
}