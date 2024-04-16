package org.example;

import java.text.*;
import java.util.*;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestorFechas {
    private static final Logger LOGGER = Logger.getLogger(GestorFechas.class.getName());
    public GestorFechas() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<Date> fechas = new ArrayList<>();

        try {
            while (true) {
                String input = JOptionPane.showInputDialog("Introduce una fecha (dd/MM/yyyy) o 'fin' para salir:");
                if ("fin".equalsIgnoreCase(input)) {
                    break;
                }

                Date fecha = sdf.parse(input);
                fechas.add(fecha);
            }

            Collections.sort(fechas);

            StringBuilder fechasOrdenadas = new StringBuilder("Fechas ordenadas:\n");
            for (Date fecha : fechas) {
                fechasOrdenadas.append(sdf.format(fecha)).append("\n");
            }

            JOptionPane.showMessageDialog(null, fechasOrdenadas.toString());

        } catch (ParseException e) {
            LOGGER.log(Level.SEVERE, e.getMessage(), e);
            JOptionPane.showMessageDialog(null, "Error en el formato de fecha.");
        }
    }
}

