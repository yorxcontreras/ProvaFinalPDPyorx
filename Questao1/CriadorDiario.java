// [Creator Concreto] Define qual produto concreto ser? instanciado.
public class CriadorDiario extends CriadorRelatorio {

    @Override
    protected Relatorio criarRelatorio() {
        // Justificativa do Padr?o: Aqui est? a l?gica de cria??o espec?fica
        // para o Relat?rio Di?rio. Isolando a instancia??o.
        return new RelatorioDiario();
    }
}