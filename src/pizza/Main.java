package pizza;
import java.text.DecimalFormat;
import static java.lang.System.out;
import pizza.Cliente;
import pizza.Pizza;
import pizza.Bebida;
import javax.swing.JOptionPane;
/**
 *
 * author Marcos
 */
public class Main {
    public static void main(String args[]) { 
    Cliente clie = new Cliente();
    Pizza pizza = new Pizza();
    Bebida bebi = new Bebida();
    
        Object[] opcoes = {"Delivery", "Balcão", "aLacarte", "Bebidas"};
        double taxa = 0;
        int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Opções",
            JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);
        switch (escolha) {
            case 0:
                    JOptionPane.showMessageDialog(null, "Opção selecionada: Delivery");
                    clie.cadastro();
                    pizza.pizza();
                    bebi.Bebida();
                    taxa = 10;
                break;
            case 1:
                    JOptionPane.showMessageDialog(null, "Opção selecionada: Balcão");
                    clie.cadastro();
                    pizza.pizza();
                    bebi.Bebida();
                break;
            case 2:
                    JOptionPane.showMessageDialog(null, "Opção selecionada: aLacarte");
                    pizza.pizza();
                    bebi.Bebida();
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Opção selecionada: Bebidas");
                bebi.Bebida();
            break;
            
        }
        
        double total = pizza.getValor() + bebi.getValor() + taxa;
        String resultadoFormatado = String.format("%.2f", total);

        JOptionPane.showMessageDialog(null,"nome: "+ clie.getNome() + "\n telefone: " + clie.getTelefone() + "\n endereço: " + clie.getEndereco() + " \n email: " + clie.getEmail() + " \n pizza sabor: " + pizza.getSabor() + " \n valor pizza: " + pizza.getValor() + " \n bebida: " + bebi.getNome() + " \n bebida valor: " +  bebi.getValor() + "  \n taxa de entrega: " + taxa + " \n **************** " + " \n Total: " + resultadoFormatado) ;

    }
}