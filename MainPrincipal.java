import org.example.MainAnalisisGenomico;
import org.example.MainHerramientas;
import org.example.MainInfo;
import org.example.MainOptimizacionProcesos;

import javax.swing.*;
import java.awt.*;

public class MainPrincipal extends JFrame {

    public MainPrincipal() {
        setTitle("Interfaz Principal");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new GridLayout(0, 1, 10, 10)); // GridLayout para organizar los botones verticalmente


        JButton itemAnalisisGenomico = new JButton("Abrir Analizador Genómico");
        itemAnalisisGenomico.addActionListener(e -> {
            MainAnalisisGenomico.main(new String[]{});
        });
        menuPanel.add(itemAnalisisGenomico);

        JButton itemInfoCientifico = new JButton("Abrir Gestor de Información Científica");
        itemInfoCientifico.addActionListener(e -> {
            MainInfo.main(new String[]{});
        });
        menuPanel.add(itemInfoCientifico);

        JButton itemAnalisisNumerico = new JButton("Abrir Herramientas de Análisis Numérico");
        itemAnalisisNumerico.addActionListener(e -> {
            MainHerramientas.main(new String[]{});
        });
        menuPanel.add(itemAnalisisNumerico);

        JButton itemOptimizacion = new JButton("Optimización de Procesos quicksort");
        itemOptimizacion.addActionListener(e -> {
            MainOptimizacionProcesos.main(new String[]{});
        });
        menuPanel.add(itemOptimizacion);

        this.add(menuPanel, BorderLayout.CENTER);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new MainPrincipal();
    }
}