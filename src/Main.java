void main (){

    ContaCorrente cc = new ContaCorrente();
    cc.sacar (50);
    cc.depositar (3000);
    System.out.println(cc.MostrarSaldo());

    cc.taxa = 50;
    cc.taxaMensal(cc.taxa);

    System.out.println(cc.MostrarSaldo());
}