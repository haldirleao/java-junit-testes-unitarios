package one.digital.innovation.junit;

public class TransferenciaEntreContas {
    
    public void tranferir(Conta contaOrigem, Conta contaDestino, int valor){
        if(valor <= 0) {
            throw new IllegalArgumentException("Exceção: Valor deve ser maior que zero");
        }
    }

}
