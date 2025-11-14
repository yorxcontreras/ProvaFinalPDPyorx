public class TesteStrategy {

    public static void main(String[] args) {
        int pontuacaoBaseCliente = 70; // Exemplo de dados do cliente

        // 1. Cliente configurado inicialmente com o Modelo Agressivo
        PlataformaAnalise plataforma = new PlataformaAnalise(
            pontuacaoBaseCliente, 
            new ModeloAgressivo()
        );
        
        System.out.println("\n--- Cenário 1: Cálculo com Modelo Agressivo ---");
        String resultado1 = plataforma.analisarPerfilDeRisco();
        System.out.println("Perfil: " + resultado1);
        
        // 2. O consultor altera o modelo de cálculo para Conservador em tempo de execução
        plataforma.setEstrategia(new ModeloConservador());
        
        System.out.println("\n--- Cenário 2: Cálculo com Modelo Conservador (Estratégia Alterada) ---");
        String resultado2 = plataforma.analisarPerfilDeRisco();
        System.out.println("Perfil: " + resultado2);
        
        // 3. Extensão Futura: Se for criado um 'ModeloModerado', basta injetá-lo.
        // plataforma.setEstrategia(new ModeloModerado());
    }
}