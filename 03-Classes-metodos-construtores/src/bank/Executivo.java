package bank;

public class Executivo implements Transacao {
    public void transacaoOk() {
        System.out.println("Realizando Transacao!");
    }

    public void transacaoNaoOk() {
        System.out.println("Transacao nao efetuada");
    }

    public void deposito(boolean transacao) {
        if (transacao == true) {
            transacaoOk();
        } else {
            transacaoNaoOk();
        }
    }
}
