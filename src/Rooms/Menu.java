package Rooms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Menu extends Room {

    private final int PANNING = 10;
    private final int BORDER_X = 65;
    private final int BORDER_Y = 50;

    private void aggiungiPrenotazione() { System.out.println("Aggiungi prenotazione"); };
    private void visualizzaPrenotazioni() { System.out.println("Visualizza prenotazione"); };
    private void eliminaPrenotazioni() { System.out.println("Elimina prenotazione"); };

    private enum ACTIONS_TYPE {
        AGGIUNGI_PRENOTAZIONE,
        VISUALIZZA_PRENOTAZIONE,
        ELIMINZA_PRENOTAZIONE,
    }

    private final ActionListener[] actions = {
            e -> { aggiungiPrenotazione(); },
            e -> { visualizzaPrenotazioni(); },
            e -> { eliminaPrenotazioni(); },
    };

    private final ImageIcon BTN_ICON = new ImageIcon("src/Assets/tasto.png");
    private final int BTN_H = BTN_ICON.getIconHeight();
    private final int BTN_Y = 300;

    public Menu(String _title, int _w, int _h, ImageIcon icon) {
        super(_title, _w, _h, icon);

        for (ACTIONS_TYPE a : ACTIONS_TYPE.values()) {
            int i = a.ordinal();
            String txt = "";
            switch (a) {
                case AGGIUNGI_PRENOTAZIONE -> { txt = "Aggiungi prenotazione"; }
                case VISUALIZZA_PRENOTAZIONE -> { txt = "Visualizza prenotazione"; }
                case ELIMINZA_PRENOTAZIONE -> { txt = "Elimina prenotazione";}
            }
            createButton(txt, BTN_ICON, BORDER_X, BTN_Y + (PANNING + BTN_H) * i, actions[i]);
        }
    }
}