// [Estratégia Concreta] Implementa a lógica de cálculo do Modelo Agressivo.
public class ModeloAgressivo implements EstrategiaCalculoRisco {

    @Override
    public String calcularRisco(int pontuacaoBase) {
        // Justificativa do Padrão: Encapsulamento de uma fórmula/lógica específica.
        // FÓRMULA: Pontuação com peso alto (x1.5), resultando em perfis mais arriscados.
        double riscoCalculado = pontuacaoBase * 1.5;
        
        String perfil = (riscoCalculado > 60) ? "ALTO - Investidor Agressivo" : "MÉDIO - Agressivo Modificado";
        
        return String.format("Cálculo Agressivo (Peso 1.5): Pontuação %.1f -> %s", riscoCalculado, perfil);
    }
}