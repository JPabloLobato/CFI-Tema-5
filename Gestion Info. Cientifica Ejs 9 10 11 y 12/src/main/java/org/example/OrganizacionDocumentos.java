package org.example;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OrganizacionDocumentos {
    private static final Logger LOGGER = Logger.getLogger(OrganizacionDocumentos.class.getName());
    public void ordenarDocumentos(String rutaCarpeta, String nombreArchivo) {
        String rutaArchivo = rutaCarpeta + nombreArchivo;
        try {
            FileReader fr = new FileReader(rutaArchivo);
            BufferedReader br = new BufferedReader(fr);
            List<String> lineas = new ArrayList<>();

            String linea;
            while ((linea = br.readLine()) != null) {
                lineas.add(linea);
            }

            br.close();

            Collections.sort(lineas);
            FileWriter fw = new FileWriter(rutaArchivo);
            BufferedWriter bw = new BufferedWriter(fw);

            for (String l : lineas) {
                bw.write(l);
                bw.newLine();
            }

            bw.close();
            JOptionPane.showConfirmDialog(null, "Documentos ordenados correctamente.");
        } catch (IOException e) {
             LOGGER.log(Level.SEVERE, e.getMessage(), e);
             JOptionPane.showMessageDialog(null, "Error al ordenar los documentos.");
        }
    }
}