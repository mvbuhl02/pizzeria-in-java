package pizza;
import java.util.Arrays;
import javax.swing.JOptionPane;
/**
 *
 * author Marcos
 */
public class Bebida {
    private String nome;
    private double valor;

    public String Bebida() {
        Object[] opcoes = {"Coca-cola", "Pepsi", "Guaraná Antártica", "Fanta Laranja", "Sprite"};
        double[] valores = {5.00, 4.50, 4.00, 4.00, 3.50};

        Object selectedValue = JOptionPane.showInputDialog(null,
                "Escolha um refrigerante", "Opções",
                JOptionPane.INFORMATION_MESSAGE, null,
                opcoes, opcoes[0]);

        if (selectedValue != null) {
            int index = Arrays.asList(opcoes).indexOf(selectedValue);
            setNome((String) selectedValue);
            setValor(valores[index]);
            return (String) selectedValue;
        }
        return null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
