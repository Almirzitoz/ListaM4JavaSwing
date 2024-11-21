package Questao3;
import java.awt.*;
import javax.swing.*;
public class Tela extends JFrame{
    public Tela(String titulo){
        super(titulo);
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel painel = new JPanel(new GridLayout(3,2));
        JButton botao1 =new JButton("Botão 1");
        JButton botao2 = new JButton("Botão 2");
        JButton botao3 = new JButton("Botão 3");
        JButton botao4 = new JButton("Botão 4");
        JButton botao5 = new JButton("Botão 5");
        painel.add(botao1);
        painel.add(botao2);
        painel.add(botao3);
        painel.add(botao4);
        painel.add(botao5);
        add(painel);





        setVisible(true);
    }

}
