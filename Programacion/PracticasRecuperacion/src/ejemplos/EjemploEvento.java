package ejemplos;

import javax.swing.*;
import java.awt.event.*;
public class EjemploEvento extends JFrame implements ActionListener {
 JButton boton;
 public EjemploEvento() {
 boton = new JButton("Haz clic");
 boton.addActionListener(this); // Registrar el oyente
 add(boton);
 setSize(200, 200);
 setLayout(null);
 boton.setBounds(50, 80, 100, 30);
 setVisible(true);
 setDefaultCloseOperation(EXIT_ON_CLOSE);
 }
 @Override
 public void actionPerformed(ActionEvent e) {
 JOptionPane.showMessageDialog(this, "¡Botón pulsado!");
 }
 public static void main(String[] args) {
 new EjemploEvento();
 }
}
