package Questao7;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
public class Tela extends JFrame{
    public Tela(String titulo){
        super(titulo);
        setSize(400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new Titulo(),BorderLayout.NORTH);
        panel.add(new Lado1(), BorderLayout.WEST);
        panel.add(new Lado2(),BorderLayout.EAST);







        add(panel);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Tela("Tela");
    }
}

class Titulo extends JPanel{
    public Titulo(){
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Titulo",SwingConstants.CENTER);
        Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
        setBorder(border);
        panel.add(label);
        add(panel);
    }
}

class Lado1 extends JPanel{
    public Lado1(){
        JPanel panel = new JPanel(new BorderLayout());
        JLabel label = new JLabel("Titulo do texto",SwingConstants.CENTER);
        JTextArea texto = texto();
        JPanel a = botoes();
        panel.add(texto,BorderLayout.CENTER);
        panel.add(label,BorderLayout.NORTH);
        panel.add(a,BorderLayout.SOUTH);
        add(panel);
    }
    public JTextArea texto(){
        JTextArea textArea = new JTextArea(
            "Lorem ipsum dolor sit amet, consectetur adipisci elit, sed eiusmod tempor incidunt ut labore et dolore magna aliqua. "
            + "Ut enim ad minim veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur."
        );
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);
        Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
        textArea.setBorder(border);
        return textArea;
    }

    public JPanel botoes(){
        JPanel label = new JPanel();
        label.setLayout(new BoxLayout(label,BoxLayout.X_AXIS));
        label.add(new JButton("Salvar"));
        label.add(new JButton("Cancelar"));
        label.add(new JButton("Voltar"));


        return label;
    }
}

class Lado2 extends JPanel{
    public Lado2(){
        JPanel panel = new JPanel(new BorderLayout());
        JTextArea texto = texto();
        JButton button = new JButton("Carregar imagem");
        panel.add(texto,BorderLayout.CENTER);
        panel.add(button,BorderLayout.SOUTH);
        add(panel);
    }

    public JTextArea texto(){
        JTextArea textArea = new JTextArea("Colocar imagem");
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);
        Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
        textArea.setBorder(border);
        return textArea;
    }
}
