package org.example;

import javax.swing.*;
import java.awt.*;

public class MainHerramientas {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Herramientas de Análisis Numérico");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1450, 350);
        frame.setLayout(new GridLayout(3, 2, 10, 10));

        frame.setLocationRelativeTo(null);

        // Panel para el Ejercicio 1
        JPanel panel1 = new JPanel(new GridLayout(2, 2, 10, 10));
        JLabel label1 = new JLabel("Sumatoria de los primeros n números naturales:");
        JTextField textField1 = new JTextField();
        JButton btn1 = new JButton("Calcular Sumatoria");
        JTextArea textArea1 = new JTextArea();

        btn1.addActionListener(e -> {
            int n = Integer.parseInt(textField1.getText());
            int resultado = SumatorioYListado.sumatorio(n);
            textArea1.setText("Sumatoria de los primeros " + n + " números naturales: " + resultado);
        });

        panel1.add(label1);
        panel1.add(textField1);
        panel1.add(btn1);
        panel1.add(textArea1);
        frame.add(panel1);

        // Panel para el Ejercicio 2
        JPanel panel2 = new JPanel(new GridLayout(2, 2, 10, 10));
        JLabel label2 = new JLabel("Listar números en un rango [inicio, fin]:");
        JTextField textField2a = new JTextField();
        JTextField textField2b = new JTextField();
        JButton btn2 = new JButton("Listar Números");
        JTextArea textArea2 = new JTextArea();

        btn2.addActionListener(e -> {
            int inicio = Integer.parseInt(textField2a.getText());
            int fin = Integer.parseInt(textField2b.getText());
            StringBuilder sb = new StringBuilder();
            SumatorioYListado.listarNumeros(inicio, fin, sb);
            textArea2.setText(sb.toString());
        });

        panel2.add(label2);
        panel2.add(textField2a);
        panel2.add(textField2b);
        panel2.add(btn2);
        panel2.add(textArea2);
        frame.add(panel2);

        // Panel para el Ejercicio 3
        JPanel panel3 = new JPanel(new GridLayout(2, 2, 10, 10));
        JLabel label3 = new JLabel("Cálculo de Potencias (base^exponente):");
        JTextField textField3a = new JTextField();
        JTextField textField3b = new JTextField();
        JButton btn3 = new JButton("Calcular Potencia");
        JTextArea textArea3 = new JTextArea();

        btn3.addActionListener(e -> {
            int base = Integer.parseInt(textField3a.getText());
            int exponente = Integer.parseInt(textField3b.getText());
            int resultado = SumatorioYListado.potencia(base, exponente);
            textArea3.setText(base + " elevado a " + exponente + " es: " + resultado);
        });

        panel3.add(label3);
        panel3.add(textField3a);
        panel3.add(textField3b);
        panel3.add(btn3);
        panel3.add(textArea3);
        frame.add(panel3);

        // Panel para el Ejercicio 4
        JPanel panel4 = new JPanel(new GridLayout(2, 2, 10, 10));
        JLabel label4 = new JLabel("Encontrar el Valor Máximo (Separados por comas):");
        JTextField textField4 = new JTextField();
        JButton btn4 = new JButton("Encontrar Máximo");
        JTextArea textArea4 = new JTextArea();

        btn4.addActionListener(e -> {
            String[] strDatos = textField4.getText().split(",");
            int[] datos = new int[strDatos.length];
            for (int i = 0; i < strDatos.length; i++) {
                datos[i] = Integer.parseInt(strDatos[i].trim());
            }
            int resultado = SumatorioYListado.encontrarMaximo(datos, datos.length);
            textArea4.setText("El valor máximo es: " + resultado);
        });

        panel4.add(label4);
        panel4.add(textField4);
        panel4.add(btn4);
        panel4.add(textArea4);
        frame.add(panel4);

        // Panel para el Ejercicio 5
        JPanel panel5 = new JPanel(new GridLayout(2, 2, 10, 10));
        JLabel label5 = new JLabel("Cálculo del Promedio (Separados por comas):");
        JTextField textField5 = new JTextField();
        JButton btn5 = new JButton("Calcular Promedio");
        JTextArea textArea5 = new JTextArea();

        btn5.addActionListener(e -> {
            String[] strDatos = textField5.getText().split(",");
            int[] datos = new int[strDatos.length];
            for (int i = 0; i < strDatos.length; i++) {
                datos[i] = Integer.parseInt(strDatos[i].trim());
            }
            double resultado = SumatorioYListado.calcularPromedio(datos, datos.length);
            textArea5.setText("El promedio de los datos ingresados es: " + resultado);
        });

        panel5.add(label5);
        panel5.add(textField5);
        panel5.add(btn5);
        panel5.add(textArea5);
        frame.add(panel5);

        frame.setVisible(true);
    }
}
