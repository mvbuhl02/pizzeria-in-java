package pizza;

import java.util.Arrays;
import javax.swing.JOptionPane;
/**
 *
 * author Marcos
 */
public class Pizza {
    private String sabor;
    private double valor;

    public void pizza() {
        Object[] opcoes = {"Salgada", "Doce", "Mista"};

        int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Opções",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);

        switch (escolha) {
            case 0:
                salgada();
                break;
            case 1:
                doce();
                break;
            case 2:
                mista();
                break;
            default:
                break;
        }
    }


    public String salgada() {
        Object[] opcoes = {"Calabresa", "Mussarela", "Frango com Catupiry", "Margherita",
                "Portuguesa", "Quatro Queijos", "Bacon", "Pepperoni",
                "Atum", "Escarola com Bacon"};
        double[] valores = {30.12, 35.44, 40.77, 33.55, 42.98, 44.23, 38.66, 30.89, 45.99, 32.76};

        Object selectedValue = JOptionPane.showInputDialog(null, "Escolha um sabor de pizza", "Opções",
                JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

        if (selectedValue != null) {
            int index = Arrays.asList(opcoes).indexOf(selectedValue);
            setSabor(opcoes[index].toString());
            setValor(valores[index]);
            System.out.println("Opção selecionada: " + getSabor());
            System.out.println("Valor correspondente: " + getValor());
            return getSabor();
        }
        return null;
    }

    public String doce() {
        Object[] opcoes = {"Banana com açúcar e canela", "Brigadeiro", "Churros",
                "Doce de leite", "Floresta negra", "Nutella com morango", "Prestígio",
                "Romeu e Julieta", "Sonho de valsa", "Ricota com damasco"};
        double[] valores = {32.50, 37.90, 43.75, 30.20, 44.99, 35.80, 45.50, 33.10, 40.00, 38.25};

        Object selectedValue = JOptionPane.showInputDialog(null,
                "Escolha um sabor de pizza", "Opções",
                JOptionPane.INFORMATION_MESSAGE, null,
                opcoes, opcoes[0]);

        if (selectedValue != null) {
            int index = Arrays.asList(opcoes).indexOf(selectedValue);
            setSabor((String) selectedValue);
            setValor(valores[index]);
            System.out.println("Opção selecionada: " + getSabor());
            System.out.println("Valor correspondente: " + getValor());
            return getSabor();
        }
        return null;
    }
    
    public String[] mista(){
    String[] sabores = new String[2];
    Object[] opcoes = {"Salgada", "Doce"};
    double valor = 46.00;
    for (int i = 0; i < 2; i++) {
        int escolha = JOptionPane.showOptionDialog(null, "Escolha o sabor para a metade" + i, "Opções",
            JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);
        
        switch (escolha) {
            case 0:
                    sabores[i] = salgada();
                break;
            case 1:
                    sabores[i] = doce();
                break;
            default:
                return null;
        }
    }
    if (sabores != null) {
        String mensagem = "Sabores escolhidos: " + sabores[0] + " e " + sabores[1] + "Valor: " + valor;
        JOptionPane.showMessageDialog(null, mensagem);
    } else {
        JOptionPane.showMessageDialog(null, "Escolha inválida.");
    }
    return sabores;
    }
    
    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}