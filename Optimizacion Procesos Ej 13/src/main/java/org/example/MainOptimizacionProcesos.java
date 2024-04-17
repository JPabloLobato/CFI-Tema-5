package org.example;

import javax.swing.*;
import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainOptimizacionProcesos {

    private final JFrame frame;
    private final JTextField inputField;
    private final JTextArea outputArea;

    public MainOptimizacionProcesos() {

        frame = new JFrame("Ordeador de Fechas");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setLocationRelativeTo(null);

        inputField = new JTextField();
        JButton sortButton = new JButton("Ordenar");
        outputArea = new JTextArea();

        JPanel inputPanel = new JPanel(new BorderLayout());
        inputPanel.add(new JLabel("Ingrese fechas (separadas por como):"), BorderLayout.NORTH);
        inputPanel.add(inputField, BorderLayout.CENTER);
        inputPanel.add(sortButton, BorderLayout.EAST);

        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(new JScrollPane(outputArea), BorderLayout.CENTER);

        sortButton.addActionListener(e -> {
            String input = inputField.getText();
            String[] dateStrings = input.split(",");
            int[] dates = new int[dateStrings.length];

            try {
                for (int i = 0; i < dateStrings.length; i++) {
                    dates[i] = Integer.parseInt(dateStrings[i].trim());
                }

                org.example.OptimizacionProcesos.quicksort(dates);

                StringBuilder sortedDates = new StringBuilder();
                for (int date : dates) {
                    sortedDates.append(date).append("\n");
                }
                outputArea.setText("Fechas ordenadas:\n" + sortedDates.toString());

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Formato de fecha incorrecto. Ingrese fechas en formato YYYYMMDD separadas por comas.");
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MainOptimizacionProcesos::new);
    }
}

