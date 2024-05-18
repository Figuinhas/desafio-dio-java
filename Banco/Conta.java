public abstract class Conta implements iConta{

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    private static final double SAQUE_MINIMO = 50;
    private static final double VALOR_LIMITE_POR_DEPOSITO = 500;
    private static final double VALOR_LIMITE_POR_TRANSFERENCIA = 1000;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    


    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO ;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if(valor <= VALOR_LIMITE_POR_DEPOSITO){
            saldo += valor;
        }else{
            System.out.println("Valor ultrapassa o limite por depósito permitido - R$ 500,00");
        }
      
        
    }

    public void sacar(double valor) {
        if(valor < SAQUE_MINIMO){
            System.out.println("### Operação não concluida - Saque mínimo: R$ 50,00 ###");
        }
        else if(saldo >= valor){
            saldo -= valor; 
        }
        else{
            System.out.println("### Você não possui saldo o suficiente para realizar o valor solicitado ###");
        }
        
    }


    public void transferir(double valor, Conta contaDestino) {
        if(this.getSaldo() > valor){
            this.sacar(valor);//sacando da conta que está transferindo
            contaDestino.depositar(valor);//depositando na conta destino
        }
        else if(valor > VALOR_LIMITE_POR_TRANSFERENCIA){
            System.out.println("Valor ultrapassa o limite de transferência permitido - R$ 1000,00");
        }
        else if(this.getSaldo() < valor){
            System.out.println("Você não possui saldo para realizar essa transferência.");
        }
        
        
    }

    protected void imprimirInfosComuns(){
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }


}
