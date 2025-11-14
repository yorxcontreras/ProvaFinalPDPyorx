// [Estratégia Concreta] Implementa a lógica de cálculo do Modelo Conservador.
public class ModeloConservador implements EstrategiaCalculoRisco {

    @Override
    public String calcularRisco(int pontuacaoBase) {
        // Justificativa do Padrão: Permite adicionar novos modelos (como Moderado)
        // apenas implementando esta interface, sem alterar o Contexto.
        // FÓRMULA: Pontuação com peso baixo (x0.8), resultando em perfis menos arriscados.
        double riscoCalculado = pontuacaoBase * 0.8;
        
        String perfil = (riscoCalculado < 40) ? "BAIXO - Investidor Conservador" : "MÉDIO - Conservador Moderado";
        
        return String.format("Cálculo Conservador (Peso 0.8): Pontuação %.1f -> %s", riscoCalculado, perfil);
    }
}