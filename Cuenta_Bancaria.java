public class Cuenta_Bancaria {
   private String titular;
   private String numeroCuenta; 
   private double saldo; 

   public Cuenta_Bancaria (String titular, String numeroCuenta, double saldo) 
   {
    this.titular = titular;
    this.numeroCuenta = numeroCuenta;
    this.saldo = saldo;
   }

   public void depositar(double monto)
   {
     if (monto > 0)
        {
         saldo = saldo + monto;
        }
   }
   
   public boolean retirar(double monto)
   {
        if (monto > 0)
        {
            if (saldo >= monto)
            {
                saldo = saldo - monto;
                return true;
            }
        }
        return false;
   }

   public double consultarSaldo()
   {
     return saldo;
   }
}
