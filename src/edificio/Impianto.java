/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edificio;

import devescovi.Data;

/**
 *
 * @author rikid
 */
public class Impianto {
    private double dimensione;
    private double potenza;
    private Data controlloAnnuale;
    private Data controlloFumi;
    private boolean isAcquaCalda;
    private String modello;
    private String marca;
    private Data annoDiProduzione;
    private String tipoCombustibile;

    public Impianto(double dimensione, double potenza, boolean isAcquaCalda, String modello, String marca, String tipoCombustibile) {
        this.dimensione = dimensione;
        this.potenza = potenza;
        this.controlloAnnuale = new Data();
        this.controlloFumi = new Data();
        this.isAcquaCalda = isAcquaCalda;
        this.modello = modello;
        this.marca = marca;
        this.annoDiProduzione = new Data();
        this.tipoCombustibile = tipoCombustibile;
    }
    
    public Impianto(Impianto imp){
        this.dimensione = imp.dimensione;
        this.potenza = imp.potenza;
        this.controlloAnnuale = new Data(imp.controlloAnnuale);
        this.controlloFumi = new Data(imp.controlloFumi);
        this.isAcquaCalda = imp.isAcquaCalda;
        this.modello = imp.modello;
        this.marca = imp.marca;
        this.annoDiProduzione = new Data(imp.annoDiProduzione);
        this.tipoCombustibile = imp.tipoCombustibile;
    }

    public String getAnnoDiProduzione() throws Exception {
        return annoDiProduzione.getData();
    }

    public String getControlloAnnuale() throws Exception {
        return controlloAnnuale.getData();
    }

    public String getControlloFumi() throws Exception {
        return controlloFumi.getData();
    }

    public double getDimensione() {
        return dimensione;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public double getPotenza() {
        return potenza;
    }

    public String getTipoCombustibile() {
        return tipoCombustibile;
    }

    public boolean isIsAcquaCalda() {
        return isAcquaCalda;
    }
    
    
    aiaia
            lok dis filing iea iu nou uele aim lusing al de gioché cos dele is megic in mai bons
    
    
    
}
