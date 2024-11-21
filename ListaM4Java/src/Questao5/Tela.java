package Questao5;
import java.awt.*;
import javax.swing.*;

public class Tela extends JFrame {
    public Tela(String titulo) {
        super(titulo);
        setSize(600, 370);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel painel = new JPanel(new BorderLayout());
        painel.add(new Lado1(), BorderLayout.WEST);
        painel.add(new Lado2(), BorderLayout.EAST);

        add(painel);
        setVisible(true);
    }
}

class Lado1 extends JPanel {
    public Lado1() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        campo1();
        campo2();
        campo3();
        campo4();
        botao();
    }

    public void campo1() {
        JPanel painel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 0;
        painel.add(new JLabel("Campo 1: "), gbc);

        gbc.gridx = 1;
        painel.add(new JTextField(10), gbc);

        add(painel);
    }

    public void campo2() {
        JPanel painel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 0;
        painel.add(new JLabel("Campo 2: "), gbc);

        gbc.gridx = 1;
        painel.add(new JTextField(10), gbc);

        add(painel);
    }

    public void campo3() {
        JPanel painel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 0;
        painel.add(new JLabel("Campo 3: "), gbc);

        gbc.gridx = 1;
        painel.add(new JTextField(10), gbc);

        add(painel);
    }

    public void campo4() {
        JPanel painel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 0;
        painel.add(new JLabel("Campo 4: "), gbc);

        gbc.gridx = 1;
        painel.add(new JTextField(10), gbc);

        add(painel);
    }

    public void botao() {
        JPanel painel = new JPanel();
        painel.add(new JButton("Salvar"));
        add(painel);
    }
}
class Lado2 extends JPanel {
    public Lado2() {
        setLayout(new BorderLayout());
        titulo();
        textoCentral();
        add(colocarImagem(), BorderLayout.WEST);
        add(colocarImagem(), BorderLayout.EAST);
        rodape();
    }

    public void titulo() {
        JLabel label = new JLabel("Título", SwingConstants.CENTER);
        label.setOpaque(true);
        label.setBackground(new Color(211, 211, 211));
        label.setForeground(Color.BLACK);
        label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(label, BorderLayout.NORTH);
    }

    public void textoCentral() {
        JTextArea textArea = new JTextArea(
            "Lorem ipsum dolor sit amet, consectetur adipisci elit, sed eiusmod tempor incidunt ut labore et dolore magna aliqua. "
            + "Ut enim ad minim veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur."
        );
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);
        textArea.setBackground(new Color(211, 211, 211));
        textArea.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(textArea, BorderLayout.CENTER);
    }

    public JLabel colocarImagem() {
        JLabel label = new JLabel("Coloque imagem aqui", SwingConstants.CENTER);
        label.setOpaque(true);
        label.setBackground(new Color(211, 211, 211));
        label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        return label;
    }

    public void rodape() {
        JLabel label = new JLabel("Rodapé", SwingConstants.CENTER);
        label.setOpaque(true);
        label.setBackground(new Color(211, 211, 211));
        label.setForeground(Color.BLACK);
        label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(label, BorderLayout.SOUTH);
    }
}
