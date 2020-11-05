package gui;

import flujoTrabajo.Tarea;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class flujoDeTrabajoGUI extends JFrame{
    private JButton botonAgregar;
    private JComboBox comboBoxArchivo;
    private JList listaAtrasado;
    private JList listaTrabajando;
    private JList listaPrioridad;
    private JList listaTerminado;
    private JPanel panelRaiz;
    private JTextField descripcionTarea;
    private JComboBox comboBoxFase;
    private JLabel labelDescripcion;
    private ArrayList<Tarea> tareas = new ArrayList<Tarea>();
    private DefaultListModel listaBufferAtrasada = new DefaultListModel();
    private DefaultListModel listaBufferPrioridad = new DefaultListModel();
    private DefaultListModel listaBufferTrabajando = new DefaultListModel();
    private DefaultListModel listaBufferTerminado = new DefaultListModel();


    public flujoDeTrabajoGUI() {
        //frame pincipal
        add(panelRaiz);
        setTitle("Mapa Canvas");
        setSize(800,600);
        setLocationRelativeTo(null);


        comboBoxFase.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {

            }
        });
        botonAgregar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Tarea tareas = new Tarea(descripcionTarea.getText(),comboBoxFase.getSelectedItem().toString());

                if(tareas.getFase() == "Atrasado"){
                    listaBufferAtrasada.addElement(tareas);
                    listaAtrasado.setModel(listaBufferAtrasada);
                }
                if(tareas.getFase() == "Prioridad"){
                    listaBufferPrioridad.addElement(tareas);
                    listaPrioridad.setModel(listaBufferPrioridad);
                }
                if(tareas.getFase() == "Trabajando"){
                    listaBufferTrabajando.addElement(tareas);
                    listaTrabajando.setModel(listaBufferTrabajando);
                }
                if(tareas.getFase() == "Terminado"){
                    listaBufferTerminado.addElement(tareas);
                    listaTerminado.setModel(listaBufferTerminado);
                }

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
