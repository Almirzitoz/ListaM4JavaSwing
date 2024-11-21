package Questao6;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Tela extends JFrame {
    public Tela(String titulo) {
        super(titulo);
        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new BorderLayout());

        panel.add(new Titulo(), BorderLayout.NORTH);
        panel.add(new Conteudo(), BorderLayout.CENTER);
        panel.add(new LadoEsquerdo(), BorderLayout.WEST);
        panel.add(new Propaganda(), BorderLayout.EAST);
        panel.add(new Rodape(), BorderLayout.SOUTH);

        add(panel);
        
        setVisible(true);
    }

    public static void main(String[] args) {
        new Tela("Blog");
    }
}

class Titulo extends JPanel {
    public Titulo() {
        setLayout(new BorderLayout());
        JLabel label = new JLabel("Titulo", SwingConstants.CENTER);
        add(label, BorderLayout.CENTER);
        Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
        setBorder(border);
    }
}

class Conteudo extends JPanel {
    public Conteudo() {
        setLayout(new GridLayout(2, 2));
        add(post());
        add(post());
        add(post());
        add(post());
    }

    private JPanel post() {
        JPanel panel = new JPanel(new BorderLayout());
        Border border = BorderFactory.createLineBorder(Color.BLACK, 2);

        JLabel titulo = new JLabel("Titulo", SwingConstants.CENTER);
        JLabel postagem = new JLabel("Postagem", SwingConstants.CENTER);
        JLabel autor = new JLabel("Autor", SwingConstants.CENTER);

        titulo.setBorder(border);
        postagem.setBorder(border);
        autor.setBorder(border);

        panel.add(titulo, BorderLayout.NORTH);
        panel.add(postagem, BorderLayout.CENTER);
        panel.add(autor, BorderLayout.SOUTH);

        return panel;
    }
}

class LadoEsquerdo extends JPanel {
    public LadoEsquerdo() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
        setBorder(border);

        add(cliente());
        add(produto());
        add(vendas());
        add(arquivos());
    }

    private JButton cliente() {
        return new JButton("Cliente");
    }

    private JButton produto() {
        return new JButton("Produto");
    }

    private JButton vendas() {
        return new JButton("Vendas");
    }

    private JButton arquivos() {
        return new JButton("Arquivos");
    }
}

class Propaganda extends JPanel {
    public Propaganda() {
        setLayout(new BorderLayout());
        JLabel label = new JLabel("Area de propaganda", SwingConstants.CENTER);
        add(label, BorderLayout.CENTER);
        Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
        setBorder(border);
    }
}

class Rodape extends JPanel {
    public Rodape() {
        setLayout(new BorderLayout());
        JLabel label = new JLabel("Rodapé", SwingConstants.CENTER);
        add(label, BorderLayout.CENTER);
        Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
        setBorder(border);
    }
}
