package src.SWING;

import javax.swing.*;
import java.awt.*;

public class Observador {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Observador");
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setSize(600, 200);
        janela.setLayout(new FlowLayout());
        janela.setLocationRelativeTo(null);


        JButton botao = new JButton("Clicar");
        janela.add(botao);
        // botao.addActionListener(new ActionListener(){
        //     public void actionPerformed(ActionEvent e){
        //         System.out.println("event done");
        //     }
        // });
        botao.addActionListener(e -> {
            System.out.println("Event done");
        });
        janela.setVisible(true);
    }
}
