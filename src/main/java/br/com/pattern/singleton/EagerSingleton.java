package br.com.pattern.singleton;

/**
 * Criará a instância no momento em que a JVM executar a leitura da classe.
 * Neste caso não é necessário utilizar synchronized no método que retorna 
 * a instância da classe.
 * Avaliar o custo do processo de criação da instância para decidir a 
 * melhor abordagem.
 */
public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }    
}
