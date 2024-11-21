package Questao2;
import java.awt.*;
import javax.swing.*;
public class Tela extends JFrame {
    public Tela(String titulo){
        super(titulo);
        setSize(200, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel painel = new JPanel(new BorderLayout());
        JButton botao1 = new JButton("Botão 1");
        JButton botao2 = new JButton("Botão 2");
        JButton botao3 = new JButton("Botão 3");
        JButton botao4 = new JButton("Botão 4");
        JButton botao5 = new JButton("Botão 5");


        painel.add(botao1, BorderLayout.NORTH);
        painel.add(botao2,BorderLayout.CENTER);
        painel.add(botao3,BorderLayout.WEST);
        painel.add(botao4,BorderLayout.SOUTH);
        painel.add(botao5,BorderLayout.EAST);
        add(painel);




        setVisible(true);
    }
}

