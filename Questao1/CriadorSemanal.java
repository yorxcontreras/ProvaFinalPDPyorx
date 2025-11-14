// [Creator Concreto] Define qual produto concreto será instanciado.
public class CriadorSemanal extends CriadorRelatorio {

    @Override
    protected Relatorio criarRelatorio() {
        // Justificativa do Padrão: Permite adicionar um novo tipo de relatório
        // (ex: Emergencial) apenas criando um novo Produto e um novo Criador Concreto,
        // sem tocar no Criador Abstrato.
        return new RelatorioSemanal();
    }
}