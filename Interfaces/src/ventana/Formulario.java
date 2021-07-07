package ventana;

import javax.swing.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario extends JFrame implements ActionListener {

    private JTextField texto;
    private JLabel label;
    private JButton boton;

    public Formulario() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        label = new JLabel("Mensaje");
        label.setBounds(15, 10, 100, 30);
        add(label);

        texto = new JTextField();
        texto.setBounds(80, 16, 190, 20);
        add(texto);

        boton = new JButton("Mostrar");
        boton.setBounds(10, 60, 100, 30);
        boton.addActionListener(this);
        add(boton);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == boton){
            
            String cadena = texto.getText();
            JOptionPane.showMessageDialog(null, cadena);
        }
    }
    
    public static void main(String[] args) {
        Formulario form = new Formulario();
        form.setBounds(0, 0, 300, 150);
        form.setVisible(true);
        form.setLocationRelativeTo(null);
    }

}
