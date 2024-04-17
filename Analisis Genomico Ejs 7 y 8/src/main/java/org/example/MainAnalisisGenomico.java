package org.example;

import javax.swing.*;
import java.awt.*;

public class MainAnalisisGenomico {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Conteo de Genes y Combinaciones");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 250);

        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel label = new JLabel("Ingrese una cadena de ADN (debe empezar por ATG, por ejemplo ATGCGTAAATGCGTGAATAG):");
        JTextField textField = new JTextField(20);
        JButton button = new JButton("Calcular");

        JTextArea resultArea = new JTextArea(5, 20);
        resultArea.setEditable(false);

        button.addActionListener(e -> {
            String dna = textField.getText();
            int geneCount = ConteoGenes.contarGenes(dna);
            int uniqueCodons = dna.length() / 3;
            int combinations = CalculoCombinaciones.calcularCombinacionesUnicas(uniqueCodons);

            resultArea.setText("Número de genes encontrados: " + geneCount + "\nNúmero de combinaciones únicas de codones: " + combinations);
        });

        JPanel inputPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        inputPanel.add(label);
        inputPanel.add(textField);
        inputPanel.add(button);
        inputPanel.add(resultArea);

        panel.add(inputPanel, BorderLayout.NORTH);
        panel.add(new JScrollPane(resultArea), BorderLayout.CENTER);

        frame.add(panel);
        frame.setVisible(true);
    }
}