/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pescaoggetti;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;

class PulsantePersonalizzato extends JButton {
    private int riga;
    private int colonna;
    

    public PulsantePersonalizzato(int riga, int colonna, JFrame frame) {
        this.riga = riga;
        this.colonna = colonna;
        Font customFont = new Font("Arial", Font.BOLD,16);
        // Imposta il font del JButton
        setFont(customFont);
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Schermata.p.cercaCella(riga, colonna)) {
                    setText(Schermata.p.stampaPescata());
                    Schermata.p.cambiaTurno();
                    Schermata.initSchermata(frame);
                    
                }
            }
        });
    }
}

public class Schermata extends JFrame {
    
    protected static Partita p;
    private JPanel panel;
    private static JLabel punteggio;
    

    public Schermata(java.util.List<Giocatore> giocatori, int righe, int colonne) throws Exception{
        setTitle("PescaOggetti");
        setIconImage(AvvioGioco.icon);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Imposta il layout manager del frame
        setLayout(new BorderLayout());

        panel = new JPanel(new GridLayout(righe, colonne));
        // Imposta la dimensione preferita del pannello
        panel.setPreferredSize(new Dimension(getWidth()-200, getHeight()));
        
        
        
        // Crea e aggiungi i pulsanti personalizzati al pannello
        for (int riga = 0; riga < righe; riga++) {
            for (int colonna = 0; colonna < colonne; colonna++) {
                PulsantePersonalizzato button = new PulsantePersonalizzato(riga, colonna, this);
                panel.add(button);
            }
        }
        
        
        punteggio = new JLabel();
        punteggio.setPreferredSize(new Dimension(400, getHeight()));
        punteggio.setFont(new Font("Arial", Font.BOLD,25));
        punteggio.setAlignmentY(CENTER_ALIGNMENT);

        // Aggiungi il pannello al centro del frame
        add(panel, BorderLayout.CENTER);
        add(punteggio, BorderLayout.EAST);
        pack();
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setResizable(false);
        try {
            p =  new Partita(giocatori, righe, colonne);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        initSchermata(this);
        
    }
    
    
    
    protected static void initSchermata(JFrame frame) {
        setTesto();
        if(p.isFinish()) {
            JOptionPane.showMessageDialog(null, "La partita è finita", "Fine", JOptionPane.OK_OPTION);
            FineGUI f = new FineGUI();
            f.setVisible(true);
            frame.dispose(); 
        }
    }

    protected static void setTesto() {
        String t = "<html>" + p.turno() + "<br>";
        t += "<br>" + p.stampaPunteggiSchermata()+ "<br></html>";
        punteggio.setText(t);
    }
    
    public static List<String> getRisultati() {
        List<String> temp = new ArrayList<>();
        temp.add(p.stampaPunteggiSchermata());
        temp.add(aggiungiEsecutoreMossa(p.stampaMosseEseguiteSchermata()));
        return temp;
    }
    
    private static String aggiungiEsecutoreMossa(List<String> temp) {
        String t = "";
        int j = 0;
        for (int i = 0; i < temp.size(); i++) {
            t += "Mossa eseguita da: " + p.getNicknameGiocatori().get(j) + " " + temp.get(i) + "<br>";
            j++;
            if (j == p.getNicknameGiocatori().size()) {
               j = 0; 
            }
        }
        return t;
    }
    
    
}
