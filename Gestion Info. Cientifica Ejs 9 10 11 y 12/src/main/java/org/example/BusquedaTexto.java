package org.example;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BusquedaTexto {
    private static final Logger LOGGER = Logger.getLogger(BusquedaTexto.class.getName());

    public boolean buscarPalabraLineal(String rutaArchivo, String palabraBuscada) {
        try {
            FileReader fr = new FileReader(rutaArchivo);
            BufferedReader br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.contains(palabraBuscada)) {
                    return true;
                }
            }

            br.close();
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, e.getMessage(), e);
        }

        return false;
    }

    public boolean buscarPalabraBinaria(String rutaArchivo, String palabraBuscada) {
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
            int indice = Collections.binarySearch(lineas, palabraBuscada);
            return indice >= 0;
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, e.getMessage(), e);
        }

        return false;
    }
}