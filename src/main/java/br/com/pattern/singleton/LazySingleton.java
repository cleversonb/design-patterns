package br.com.pattern.singleton;


/**
 * Só criará a instância depois da primeira requisição.
 * Tomar cuidado pois é necessário utilizar o synchronized 
 * no método que retorna a instância e isso deixará a 
 * execução muito mais lenta.
 * Avaliar o custo do processo de criação da instância para 
 * decidir a melhor abordagem.
 */
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
    }

    public static synchronized LazySingleton getInstance() {
        if(instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }    
}
