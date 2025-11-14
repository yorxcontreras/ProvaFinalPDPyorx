// [Produto] Interface comum para todos os tipos de relatórios.
// O Creator (fábrica) e o cliente (sistema de logística) trabalharão com esta interface.
public interface Relatorio {
    /**
     * Define a operação principal que cada relatório deve executar (preparação).
     * @return O conteúdo textual do relatório.
     */
    String preparar();
}