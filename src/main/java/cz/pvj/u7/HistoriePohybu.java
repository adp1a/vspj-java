package cz.pvj.u7;

import java.util.List;

public class HistoriePohybu {

    // Vypočítá geometrickou vzdálenost mezi body
    public static double spocetiVzdalenost(List<Souradnice> historie) {
        double vzdalenost = 0.0;
        for (int i = 1; i < historie.size(); i++) {
            Souradnice predchozi = historie.get(i - 1);
            Souradnice soucasna = historie.get(i);
            // Euklidovská vzdálenost
            double dx = soucasna.getX() - predchozi.getX();
            double dy = soucasna.getY() - predchozi.getY();
            vzdalenost += Math.sqrt(dx * dx + dy * dy);
        }
        return vzdalenost;
    }

    // Sestaví řetězec reprezentující celou cestu
    public static String sestavVyslednouCestu(List<Souradnice> historie) {
        StringBuilder cesta = new StringBuilder();
        for (Souradnice souradnice : historie) {
            cesta.append("(").append(souradnice.getX()).append(", ").append(souradnice.getY()).append(") ");
        }
        return cesta.toString().trim();
    }
}