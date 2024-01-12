/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pescaoggetti;

/**
 * La classe Giocatore serve per creare i giocatori all'interno della classe
 * partita
 * @author Riccardo e Danilo
 */
public class Giocatore {
    private String nickname;    
    private Integer punteggio;
    
    /**
     * Costruttore della classe Giocatore
     * @param nickname nome del giocatore
     * @throws Exception se il parametro e' nullo o vuoto
     */
    public Giocatore(String nickname) throws Exception{
        setNickname(nickname);
        this.punteggio = 0;
    }
    
    /**
     * Ritorna il nome del giocatore
     * @return nome del giocatore
     */
    public final String getNickname() {
        return nickname;
    }
    
    /**
     * Imposta il nome del giocatore
     * @param nickname nome del giocatore
     * @throws Exception se il parametro e' nullo o vuoto
     */
    public final void setNickname(String nickname) throws Exception {
        if (nickname == null)
            throw new Exception("Il nickname non può essere null");
        if (nickname.isBlank())
            throw new Exception("Il nome non può essere vuoto");
        this.nickname = nickname;
    }
    
    /**
     * Ritorna il punteggio del giocatore
     * @return punteggio del giocatore
     */
    public final Integer getPunteggio() {
        return punteggio;
    }
    
    /**
     * Aggiunge dei punti al punteggio del giocatore
     * @param punti punti da aggiungere
     */
    public void aggiungiPunti(Integer punti) {
        this.punteggio = this.punteggio.intValue() + punti.intValue();
    }
    
    /**
     * Toglie dei punti al punteggio del giocatore
     * @param punti punti da togliere
     */
    public void togliPunti(Integer punti) {
        this.punteggio -= punti.intValue();
    }
    
    /**
     * toString
     * @return 
     */
    @Override
    public String toString() {
        return "Giocatore{" + "nickname=" + nickname + ", punteggio=" + punteggio + '}';
    } 
}
