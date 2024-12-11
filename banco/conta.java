class conta{

    int id = 1;
    String nome;
    double deposito;
    double saldo;
    double sdt;
    double saque;
    double salt;
    
    
    conta(){
        
        }
        
        
    void updateSaque(){
        sdt = saldo + deposito - saque - 3;
    }

}
