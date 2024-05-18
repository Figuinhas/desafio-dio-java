public class Main {
    public static void main(String[] args) {

        Cliente guilherme = new Cliente();
        guilherme.setNome("Guilherme");
        Conta contaCorrente = new ContaCorrente(guilherme);
        contaCorrente.depositar(500);
        Conta contaPoupanca = new ContaPoupanca(guilherme);
        contaCorrente.transferir(49, contaPoupanca);
       
            
        //contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
        contaCorrente.sacar(49);

        



        
    }
}
