import java.util.Scanner;
public class banco{
    public static void main(String args[]){
    Scanner entrada = new Scanner(System.in);
    conta c1 = new conta();
    

    
    while (true) {
            System.out.println("Digite seu nome: ");
            c1.nome = entrada.nextLine();
            if (c1.nome.trim().isEmpty()) { 
                System.out.println("O nome da conta não pode ser vazio. Por favor, insira um nome válido.");
            } else {
                break;
            }
        }
    
    
    
    System.out.println("Deseja fazer deposito inicial se sim digite '1', se não digite '2'");
    String dp = entrada.nextLine();
    if (dp.equals( "1" )){
    System.out.println("Digite o valor do deposito inicial: ");
    c1.saldo = entrada.nextDouble();}
    else 
        c1.deposito=0;
        c1.sdt = c1.saldo + c1.deposito;
        System.out.println("Nome da conta é:" + c1.nome);
        System.out.println("Saldo Total da conta:" + c1.sdt);
        System.out.println("Numero da conta:" + c1.id);
                System.out.println("  ");
                System.out.println("  ");
        
    while (true){     
        System.out.println("Qual opcao voce deseja realizar agora?");
                System.out.println("1 Deposito");
                System.out.println("2 Saque");
                System.out.println("3 Extrato");
                System.out.println("4 Alterar Nome do Titular");
                System.out.println("5 Sair");
                System.out.println("  ");
                System.out.println("  ");

    
                
        int escolha = entrada.nextInt();
        switch(escolha){
        
            case 1:
                System.out.println("Digite o valor do deposito: ");
                c1.deposito = entrada.nextDouble();
                c1.sdt += c1.deposito;
                System.out.println("Saldo Total da conta: " + c1.sdt);
                System.out.println("  ");
                System.out.println("  ");
            
            break;
            
            case 2:
                System.out.println("Digite o valor do saque: ");
                c1.saque = entrada.nextDouble();
                c1.updateSaque();
                System.out.println("Saldo Total da conta: " + c1.sdt);
                System.out.println("  ");
                System.out.println("  ");
                
                break;
                
            case 3:
                if(c1.sdt ==0){
                System.out.println("Saldo Total da conta: " + c1.saldo);
                System.out.println("Nome Atual da conta: " + c1.nome);
                System.out.println("Numero da Conta: " + c1.id);
                System.out.println("  ");
                System.out.println("  ");
            
            }
                else{
                System.out.println("Saldo Total da conta: " + c1.sdt);
                System.out.println("Nome Atual da conta: " + c1.nome);
                System.out.println("Numero da Conta: " + c1.id);
                System.out.println("  ");
                System.out.println("  ");
                
                }
                
                break;
            
            case 4:
              while (true) {
                        
                        String novoNome = entrada.nextLine();
                        if (novoNome.trim().isEmpty()) {
                            System.out.println("O novo nome da conta não pode ser vazio. Por favor, insira um nome válido:");
                        } else {
                            c1.nome = novoNome;
                            System.out.println("Novo nome da conta: " + c1.nome);
                            System.out.println("  ");
                            System.out.println("  ");
                            
                            break;
                        }
                    }
                    break;
                
            case 5:
                System.out.println("Finalizando processos...");
                entrada.close();
                return;
                
                
            default:
                System.out. println("Opção Invalida, Tente Novamente.");
                
            
        
        
        
                }
        }
    }
    }













