package exemplo1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Check_1 extends javax.swing.JDialog{
    final Color FOREGROUND =  new java.awt.Color(102, 102, 102);
    final Color BACKGROUND =  new java.awt.Color(204, 204, 204);
    
    private int countHospede, countQuarto, countVaga, countServico, countProduto;
    
    private JButton botaoNovo, botaoGravar, 
            botaoCancelar, botaoPesquisar, botaoSair;
    private JButton[] botoes = {botaoNovo, botaoGravar,
            botaoCancelar, botaoPesquisar, botaoSair};
    
    private JLabel reservaLabel, hospedeLabel, quartosLabel, 
            vagaLabel, dataCadastroLabel, checkInLabel, checkOutLabel,
            statusLabel, obsLabel, nomeLabel, telefoneLabel, 
            celularLabel, emailLabel, dataNascimentoLabel, cpfCnpjLabel;
    private JLabel[] labels = {reservaLabel, hospedeLabel, quartosLabel, 
            vagaLabel, dataCadastroLabel, checkInLabel, checkOutLabel,
            statusLabel, obsLabel, nomeLabel, telefoneLabel, 
            celularLabel, emailLabel, dataNascimentoLabel, cpfCnpjLabel};
    
    private JComboBox<String> status;
    private JTextField reserva, hospede, quartos, vaga, cpfCnpj,
            obs, nome, email;
    private JTextField[] inputsTextos = {reserva, hospede, quartos, vaga, cpfCnpj,
            obs, nome, email};
    
    private JFormattedTextField telefone, celular, dataCadastro,dataCheckIn, dataNascimento, dataCheckOut;
    private JFormattedTextField[] inputsFormatados = {telefone, celular, dataCadastro,dataCheckIn, dataNascimento, dataCheckOut};

    public Check_1(Frame parent, boolean modal) {
        super(parent, modal);
        setTitle("Tela 1");
        
        //JDialog dialog = new JDialog();
        //setTitle("Tela 1");
        // Obtém o tamanho da tela
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Define o tamanho do JDialog para o tamanho da tela
        //
                setSize(screenSize.width, screenSize.height);

        // Opcional: Para não cobrir a barra de tarefas do Windows
        int width = (int) screenSize.getWidth();;
        int height = (int) screenSize.getHeight() - 40; // Ajuste conforme necessário
        //
        setSize(width, height);

        initComponents();
        
        //
                setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        //
                setVisible(true);
    }

    private void initComponents() {
        for (JButton botao : botoes) {
            botao = new JButton();
            botao.setForeground(FOREGROUND);
            add(botao);
        }
        for (JLabel label : labels) {
            label = new JLabel();
            label.setForeground(FOREGROUND);
            add(label);
        }
        for (JFormattedTextField inputFormatado : inputsFormatados) {
            inputFormatado = new JFormattedTextField();
            inputFormatado.setForeground(FOREGROUND);
            add(inputFormatado);
        } 
        for (JTextField inputTexto : inputsTextos) {
            inputTexto = new JTextField();
            inputTexto.setForeground(FOREGROUND);
            add(inputTexto);
        }
        status = new JComboBox<>();
        add(status);
    }
    
}
