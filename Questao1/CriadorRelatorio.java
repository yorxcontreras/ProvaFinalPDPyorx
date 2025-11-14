// [Creator] Classe abstrata que declara o Método de Fábrica e define a lógica
// principal de geração (que pode ser comum a todos, se necessário).
public abstract class CriadorRelatorio {

    /**
     * [MÉTODO DE FÁBRICA]
     * Este método é o núcleo do padrão. As subclasses (Creators Concretos)
     * são responsáveis por implementar este método e decidir qual Relatorio Concreto
     * será instanciado (a lógica de criação).
     */
    protected abstract Relatorio criarRelatorio();

    /**
     * Método operacional que usa o Método de Fábrica.
     * O Criador não sabe qual Relatorio Concreto está sendo criado, apenas que
     * ele implementa a interface Relatorio.
     */
    public String gerar() {
        Relatorio relatorio = criarRelatorio(); // O Factory Method é invocado
        System.out.println("Criador inicializado. Criando instância do relatório...");
        return relatorio.preparar();
    }
}