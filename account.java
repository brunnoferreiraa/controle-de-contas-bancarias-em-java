import src.Program.necessarios.necessarios;

public class account {

    private static int accountCounter = 1;

    private int numeroConta;
    private NomeDaPessoa pessoa;
    private Double saldo = 0.0;


    public Conta(omeDaPessoa pessoa) {
        this.numerodaConta = Conta.accountCounter;
        this.NomeDaPessoa = pessoa;
        this.attSaldo();
        Conta.accountCounter += 1;
    }


    public int getNumeroConta() {
        return numeroConta;
    }
    public NomeDaPessoa getClient() {
        return pessoa;
    }
    public void colClient(NomeDaPessoa pessoa) {
        this.pessoa = pessoa;
    }
    public Double pSaldo() {
        return saldo;
    }
    public void colSaldo(Double saldo) {
        this.saldo = saldo;
    }

    private void attSaldo() {
        this.saldo = this.getSaldo();
    }

    public String toString() {

        return "\nBank account: " + this.getNumeroConta() +
                "\nCliente: " + this.NomeDaPessoa.getName() +
                "\nCPF: " + this.NomeDaPessoa.getCpf() +
                "\nEmail: " + this.NomeDaPessoa.getEmail() +
                "\nSaldo: " + necessarios.doubleToString(this.getSaldo()) +
                "\n" ;
    }

    public void depositarvalores(Double valor) {
        if(valor > 0) {
            setSaldo(getSaldo() + valor);
            System.out.println("Depósito foi realizado com sucesso!");
        }else {
            System.out.println("Não foi possível realizar seu depósito!");
        }
    }

    public void sacarvalores(Double valor) {
        if(valor > 0 && this.getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque realizado com sucesso!");
        }else {
            System.out.println("Não foi possível realizar o saque!");
        }
    }

    public void transferirvalores(Conta contaPDeposito, Double valor) {
        if(valor > 0 && this.getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
            contaDeposito.saldo = contaDeposito.getSaldo() + valor;
            System.out.println("Transferência realizada com sucesso!");
        }else {
            System.out.println("Não foi possível realizar sua tranferência");
        }

    }

}