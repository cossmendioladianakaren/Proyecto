/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author dianakaren
 */
public class DinoCarHerb extends JFrame {

    private JTextField textField1;
    private JButton botoncito;
    private JButton botoncito2;
    private JTextArea textArea1;

    public DinoCarHerb() throws HeadlessException {
        super("¡Bienvenido al Mundo de los Dinos!");
        super.setSize(450, 600);
        this.getContentPane().setLayout(new FlowLayout());
        textField1 = new JTextField(10);
        botoncito.addMouseListener(
                new MouseAdapter() {

                    @Override
                    public void mouseClicked(MouseEvent e
                    ) {

                        int resp = JOptionPane.showConfirmDialog(null,
                                "¿Quieres continuar?",
                                "Responde:",
                                JOptionPane.YES_NO_OPTION,
                                JOptionPane.QUESTION_MESSAGE
                        ); 
                        if (resp == JOptionPane.YES_OPTION)
                        {
                            System.out.println("Respondiste SI");
                        }
                        if (resp == JOptionPane.NO_OPTION) 
                        {
                            System.out.println("Respondiste NO ):");
                        }
                        if (resp == JOptionPane.CANCEL_OPTION) 
                        {
                            System.out.println("Respondiste CANCEL");
                        }
                        

                    }

                }
        );
          super.addWindowListener(
                new WindowAdapter() {

                    @Override
                    public void windowClosing(WindowEvent e
                    ) {
                        System.exit(0);
                    }

                }
        );

    }

}