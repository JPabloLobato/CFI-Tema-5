package org.example;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Main {
    private static final String RUTA_CARPETA = "Textos/";

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Gestión de Información Científica");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 200);
            frame.setLayout(new GridLayout(3, 1));

            JButton btnOrganizarDocumentos = new JButton("Organización de Documentos");
            JButton btnBuscarTexto = new JButton("Búsqueda de Texto");
            JButton btnGestionarFechas = new JButton("Gestión de Fechas");

            btnOrganizarDocumentos.addActionListener(e -> {
                String nombreArchivo = pedirArchivo("Introduce el nombre del archivo para organizar:");
                if (nombreArchivo != null) {
                    new OrganizacionDocumentos().ordenarDocumentos(RUTA_CARPETA, nombreArchivo);
                    JOptionPane.showMessageDialog(null, "Documentos organizados.");
                }
            });

            btnBuscarTexto.addActionListener(e -> {
                String nombreArchivo = pedirArchivo("Introduce el nombre del archivo para buscar:");
                if (nombreArchivo != null) {
                    String palabraBuscada = JOptionPane.showInputDialog("Introduce la palabra a buscar:");
                    BusquedaTexto busqueda = new BusquedaTexto();
                    boolean encontrado = busqueda.buscarPalabraBinaria(RUTA_CARPETA + nombreArchivo, palabraBuscada);
                    if (encontrado) {
                        JOptionPane.showMessageDialog(null, "Palabra encontrada.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Palabra no encontrada.");
                    }
                }
            });

            btnGestionarFechas.addActionListener(e -> {
                new GestorFechas();
            });

            frame.add(btnOrganizarDocumentos);
            frame.add(btnBuscarTexto);
            frame.add(btnGestionarFechas);

            frame.setVisible(true);
        });
    }

    private static String pedirArchivo(String mensaje) {
        File carpeta = new File(RUTA_CARPETA);
        JFileChooser fileChooser = new JFileChooser(carpeta);
        fileChooser.setDialogTitle(mensaje);
        int seleccion = fileChooser.showOpenDialog(null);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivoSeleccionado = fileChooser.getSelectedFile();
            return archivoSeleccionado.getName();
        }
        return null;
    }
}
