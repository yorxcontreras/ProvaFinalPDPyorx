public class TesteFactory {
    
    public static void main(String[] args) {
        
        // Cenário 1: Criando o Relatório Diário
        CriadorRelatorio criadorDiario = new CriadorDiario();
        System.out.println("\n--- Gerando Relatório Diário ---");
        String relatorio1 = criadorDiario.gerar();
        System.out.println(relatorio1);

        // Cenário 2: Criando o Relatório Semanal
        // Agora CriadorSemanal será resolvido porque está no mesmo pacote padrão.
        CriadorRelatorio criadorSemanal = new CriadorSemanal();
        System.out.println("\n--- Gerando Relatório Semanal ---");
        String relatorio2 = criadorSemanal.gerar();
        System.out.println(relatorio2);
    }
}