
/**
 * Escreva uma descrição da classe Conta aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Conta
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int Id;
    private int Numero;
    private int Saldo;
    private String NomeUsuario;

    /**
     * Construtor para objetos da classe Conta
     */
    public Conta(int Id, int Numero)
    {
        // inicializa variáveis de instância
        this.Id = Id;
        this.Numero = Numero;
        this.Saldo = 0;
    }

    public int getId()
    {
        return this.Id;
    }
    
    public int getNumero()
    {
        return this.Numero;
    }
    
    public int getSaldo()
    {
        return this.Saldo;
    }
    
    private void efetuarTransacao(int Valor){
        this.Saldo += Valor;
    }
    
    public void depositar(int Valor){
        //Lógicas adicionais de seguranca
        if (Valor <= 0) {
            return;
        }
        this.efetuarTransacao(Valor);
    }
    
    public void retirar(int Valor){
        if (Valor <= 0) {
            return;
        }
        if (this.getSaldo() < Valor) {
            return;
        }
        this.efetuarTransacao(Valor * -1);
    }
}
