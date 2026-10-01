public class ContaCorrente {

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "numeroConta='" + numeroConta + '\'' +
                ", numeroAgencia='" + numeroAgencia + '\'' +
                ", cliente='" + cliente + '\'' +
                ", saldo=" + saldo +
                ", taxa=" + taxa +
                '}';
    }
    public String numeroConta;
    public String numeroAgencia;
    public String cliente;
    private double saldo;
    public double taxa;

    public void sacar(double saque){
        if (saldo - saque < 0){
            System.out.println("Saldo insuficiente");
        }else {
            saldo = saldo - saque;
            System.out.println("Saldo suficiente");
        }
    };

    public void depositar (double deposito){
        saldo = saldo + deposito;
    }
    public String MostrarSaldo(){
        return "O seu saldo atualmente é de: " + saldo;
    };
    public void taxaMensal(double taxaM){
        saldo = saldo - taxaM;
    }
}