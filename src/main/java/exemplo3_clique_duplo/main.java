package exemplo3_clique_duplo;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemplo Clique Duplo");
        JButton button = new JButton("Clique duas vezes");

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Verifica se foi o botão esquerdo e se é clique duplo
                if (e.getClickCount() == 2 && SwingUtilities.isLeftMouseButton(e)) {
                    System.out.println("Clique Duplo Detectado!");
                }
            }
        });

        frame.add(button);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}