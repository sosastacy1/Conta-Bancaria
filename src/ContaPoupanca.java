public class ContaPoupanca {

        public String cliente;
        public String numeroConta;
        public String numeroAgencia;
        public double saldo;

        public void sacar(double saque){
            if (saldo - saque < 0){
                System.out.println("Saldo Insuficiente");
            }else{
                saldo = saldo - saque;
                System.out.println("Saldo Suficiente");
            }
        };

        public void depositar (double deposito){
            saldo = saldo + deposito;
        }

        @Override
        public String toString() {
            return "ContaPoupanca{" +
                    "cliente='" + cliente + '\'' +
                    ", numeroConta='" + numeroConta + '\'' +
                    ", numeroAgencia='" + numeroAgencia + '\'' +
                    ", saldo=" + saldo +
                    '}';
        }
    }