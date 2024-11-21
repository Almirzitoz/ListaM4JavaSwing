package Questao4;

import java.awt.*;
import javax.swing.*;

public class Tela extends JFrame{
    public Tela(String nome){
        super(nome);
        setSize(550, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        add(new Botoes(), BorderLayout.NORTH);



        setVisible(true);
    }
}

class Botoes extends JPanel{
    public Botoes(){
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(new JButton("Botão 1"));
        add(new JButton("Botão 2"));
        add(new JButton("Botão 3"));
        add(new JButton("Botão 4"));
        add(new JButton("Botão 5"));
        add(new JButton("Botão 6"));
        add(new JButton("Botão 7"));
    }
}
