
package ipfinder;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



public class IPFinderJava {

  
    
    public static void main(String[] args) {
        
        
              //Top level container
        JFrame jframe = new JFrame("IP Finder Program");
        jframe.setBounds(100, 100, 1000, 100);
        jframe.setVisible(true);
        
        
        // IP Finder Program
        JLabel label = new JLabel("Enter URL");
        label.setBounds(50, 70, 150, 20);
        
        JTextField textField = new JTextField();
        textField.setBounds(50, 100, 200, 20);
        
        JButton button = new JButton("Find IP");
        button.setBounds(50, 150, 80, 30);
        
        
        // Add actionListener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
          
                String url = textField.getText();
                
                try {
                    InetAddress ia = InetAddress.getByName(url);
                    String ip = ia.getHostName();
                    JOptionPane.showMessageDialog(jframe, ip);
                    
                } 
                catch (UnknownHostException unknownHostException) {
                    unknownHostException.printStackTrace();
                }
            }
        });
        
        jframe.add(label);
        jframe.add(button);
        jframe.add(textField);
        jframe.setLayout(new GridLayout());
        
    }
    
}
