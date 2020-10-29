package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class flujoDeTrabajoGUI extends JFrame{
    private JButton botonAgregar;
    private JComboBox comboBoxArchivo;
    private JList listaAtrasado;
    private JList listaTrabajando;
    private JList listaPrioridad;
    private JList listaTerminado;
    private JPanel panelRaiz;

    public flujoDeTrabajoGUI() {
        //frame pincipal
        add(panelRaiz);
        setTitle("Mapa Canvas");
        setSize(800,600);

        botonAgregar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        comboBoxArchivo.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {

            }
        });
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                flujoDeTrabajoGUI tablero = new flujoDeTrabajoGUI();
                tablero.setVisible(true);
            }
        });
    }




}
