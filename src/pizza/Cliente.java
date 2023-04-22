package pizza;
import javax.swing.JOptionPane;
/**
 *
 * author Marcos
 */
public class Cliente {
    
    private String nome;    
    private String telefone;
    private String email;
    private String endereco;
    private String numCartao;
    private String dataValidade;
    private String codigoSeguranca;
    private String tipoPagamento; // cartaoCredito, cartaoDebito, pix
    private String pix;
    
    public void cadastro(){
        String scanNome;
        String scanTelefone;
        String scanEmail;
        String scanEndereco;
        String scanTipoPagamento;
        
        JOptionPane.showMessageDialog(null, "Criação de cadastro");

        scanNome  = JOptionPane.showInputDialog(null, "Insira o seu nome");
        setNome(scanNome); 

        scanTelefone  = JOptionPane.showInputDialog(null, "Insira o seu Telefone");
        setTelefone(scanTelefone); 

        scanEmail  = JOptionPane.showInputDialog(null, "Insira o seu email");
        setEmail(scanEmail); 

        scanEndereco  = JOptionPane.showInputDialog(null, "Insira o seu endereço");
        setEndereco(scanEndereco); 
        
        scanTipoPagamento = JOptionPane.showInputDialog(null, "Selecione o tipo de pagamento: \n1 - Cartão de crédito \n2 - Cartão de débito \n3 - PIX");
        switch(scanTipoPagamento) {
            case "1":
                setTipoPagamento("cartaoCredito");
                setNumCartao(JOptionPane.showInputDialog(null, "Insira o número do cartão de crédito"));
                setDataValidade(JOptionPane.showInputDialog(null, "Insira a data de validade do cartão (MM/AAAA)"));
                setCodigoSeguranca(JOptionPane.showInputDialog(null, "Insira o código de segurança do cartão (CVV)"));
                break;
            case "2":
                setTipoPagamento("cartaoDebito");
                setNumCartao(JOptionPane.showInputDialog(null, "Insira o número do cartão de débito"));
                break;
            case "3":
                setTipoPagamento("pix");
                setPix(JOptionPane.showInputDialog(null, "Insira a sua chave Pix"));
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida");
        }
    }
    
    public Cliente(String nome, String email, String telefone, String endereco) {
        this.nome = nome;        
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }
    
    public Cliente(){
        
    }
    
    public String getNome() {
    return nome;
}

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getCodigoSeguranca() {
        return codigoSeguranca;
    }

    public void setCodigoSeguranca(String codigoSeguranca) {
        this.codigoSeguranca = codigoSeguranca;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
    
    public void setPix(String pix) {
        this.pix = pix;
    }

    public String getPix() {
        return pix;
    }

}