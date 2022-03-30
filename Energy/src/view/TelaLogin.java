/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Olga Mutisse
 */
public class TelaLogin extends JFrame implements ActionListener {
    
    ImageIcon imagemLogin = new ImageIcon("src\\Imagens\\LoGiN.jpg");
    JLabel lblFundo = new JLabel(imagemLogin);
    JTextField txtUsuario = new JTextField();
    JTextField txtSenha = new JPasswordField();
    JLabel lblUsername = new JLabel(" Username ");
    JLabel lblPasseword = new JLabel(" Digite a Senha ");
    JButton JBEntrar = new JButton(" Login ");
    JButton JBSair = new JButton(" Sair ");

    // Decclarar um construttor para criar as funcionalidade basicas como
    //sair do programa, minimizar ou maximizar , aumentare dimunuir a tela.
    public TelaLogin() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // funcao para fechar a tela do programa.
        setVisible(true); // faz com que a tela fique visivel.
        setLocationRelativeTo(null); // Reposicciona a tela do programa.
        setResizable(false);//  faz com que a tela minimize ou maximize.
        setSize(989, 612); // As Dimencoes da tela 
        setTitle("Tela de Login"); //  Titulo da tela.
    } // fim de contruttor

    public void gui() {

        setLayout(null); // ajusta a tela do usuario.
        lblFundo.setBounds(0, 0, 989, 612);; // lebal para foto de 
        // As declaracoes abaixo serva para dar dimecoes as botoes e as lebol.
        txtUsuario.setBounds(400, 90, 200, 25); // para caixa de entradada.
        lblUsername.setBounds(400, 65, 200, 25); //  mensagem que sera exibida.
        lblUsername.setForeground(Color.white); // cor de texto.
        lblPasseword.setForeground(Color.white);
        txtSenha.setBounds(400, 150, 200, 25);
        lblPasseword.setBounds(400, 120, 100, 30);
        JBEntrar.setBounds(510, 225, 95, 25); // para butao de enter.
        JBSair.setBounds(400, 225, 95, 25);// para butao de sair.

        //Adicionar na tela as componentes abaixo
        add(lblUsername); // caixa de teXto para escrever a mensagem.
        add(txtUsuario);// caixa de intrucao.
        add(txtSenha); // texto dde senha.
        add(lblPasseword); // tetoo da palavra chave 
        add(JBEntrar); // para entrar
        add(JBSair); // para sair.S
        add(lblFundo); // lebol de fundo.

        //Dar vida aos botões e/ou os textfiel
        JBEntrar.addActionListener(this);
        JBSair.addActionListener(this);
        txtUsuario.addActionListener(this);
        txtSenha.addActionListener(this);

    } // metodo  que adciona infomacos na tela de de usuario. 

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == (JBEntrar)) {

            if ((txtUsuario.getText().equals("Em")) && (txtSenha.getText().equals("1697"))) {
                dispose();
                JOptionPane.showMessageDialog(null, " Seja Bem vindo!!");
                dispose();
               

            } else {
                dispose();
                JOptionPane.showMessageDialog(null, "Dados Incorrectos");
                dispose();
               

            }// if de botao de entrada.     
        }// e.getSource

        if (e.getSource() == (JBSair)) {
            dispose();// e para fechar a tela quando clicar para siar funciomna como limpa tela.
            JOptionPane.showMessageDialog(null, "  Fim de execucao, Ate breve!! "); //mensagem de despedida

        }// if de botao de sair. 

    }//ationEvente

    public static void main(String[] args) {

        new  TelaLogin().gui();

    }//  Metodo
    
}
