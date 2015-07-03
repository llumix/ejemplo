/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redS;

/**
 *
 * @author mmoreno
 */
public class relacion {
    private String info;
    private int tipoR;
    private nodored origen;
    private nodored dest;
    
    
    public relacion(){
    
        info="";
        tipoR=0;
        origen=null;
        dest=null;
    }
    
    public void insertarRelacion(String info1, int tipoR1, nodored origen1,nodored destino1){
    
        setInfo(info1);
        setTipoR(tipoR1);
        setOrigen(origen1);
        setDest(destino1);
    }

    /**
     * @return the info
     */
    public String getInfo() {
        return info;
    }

    /**
     * @param info the info to set
     */
    public void setInfo(String info) {
        this.info = info;
    }

    /**
     * @return the tipoR
     */
    public int getTipoR() {
        return tipoR;
    }

    /**
     * @param tipoR the tipoR to set
     */
    public void setTipoR(int tipoR) {
        this.tipoR = tipoR;
    }

    /**
     * @return the origen
     */
    public nodored getOrigen() {
        return origen;
    }

    /**
     * @param origen the origen to set
     */
    public void setOrigen(nodored origen) {
        this.origen = origen;
    }

    /**
     * @return the dest
     */
    public nodored getDest() {
        return dest;
    }

    /**
     * @param dest the dest to set
     */
    public void setDest(nodored dest) {
        this.dest = dest;
    }
    
}
