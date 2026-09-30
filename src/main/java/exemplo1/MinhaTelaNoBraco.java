package exemplo1;

import javax.swing.*;
import java.awt.*;

public class MinhaTelaNoBraco extends JFrame {

    public MinhaTelaNoBraco() {
        // 1. Título da Janela
        super("Exemplo no Braço");

        // 2. Definir Layout
        setLayout(new FlowLayout());

        // 3. Criar Componentes
        JLabel label = new JLabel("Nome:");
        JTextField campoTexto = new JTextField(15);
        JButton botao = new JButton("Enviar");

        // 4. Adicionar ao JFrame
        add(label);
        add(campoTexto);
        add(botao);

        // 5. Configurações da Janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null); // Centraliza na tela
        setVisible(true);
        botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoActionPerformed(evt);
            }
        });
        
        
        
    }

    private void botaoActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        JOptionPane.showMessageDialog(null, "Enviado");
        //System.exit(0);
        Check_1 check = new Check_1(null, true);
        check.setVisible(true);
    }  
    
    public static void main(String[] args) {
        // Executar a interface na thread correta
        SwingUtilities.invokeLater(() -> new MinhaTelaNoBraco());
    }
}

