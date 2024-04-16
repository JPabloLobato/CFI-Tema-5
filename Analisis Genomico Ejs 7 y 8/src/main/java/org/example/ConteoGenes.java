package org.example;

public class ConteoGenes {
    public static int contarGenes(String dna) {
        if (dna.length() < 3) {
            return 0;
        } else if (dna.startsWith("ATG")) {
            return 1 + contarGenes(dna.substring(3));
        } else {
            return contarGenes(dna.substring(1));
        }
    }
}

