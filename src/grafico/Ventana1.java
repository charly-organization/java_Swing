/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafico;

/**
 *
 * @author Carlos
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class Ventana1 extends JFrame{
    
    JButton button;
    JLabel jLabel;
    JPanel jPanel;
    public Ventana1() {
        button = new JButton();
        jLabel = new JLabel();
        jPanel = new JPanel();
        
        this.add(jPanel);
        jPanel.add(jLabel);
        jPanel.add(button);
        
        jLabel.setText("Hola");
        button.setText("Saludar");
        
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hola");
            }
            
        });
    }
    
    
    
    
}
