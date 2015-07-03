/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redS;
import java.util.ArrayList;
/**
 *
 * @author mmoreno
 */
public class nodored {
    private String infor;
    private ArrayList<relacion> relaciones;
    
    nodored(){
    
        this.infor=null;
        this.relaciones=new ArrayList<>();
    }
    
    public void insertarRelacion(nodored origen, nodored destino, String info, int tipoR){
    
        relacion nuevo=new relacion();
        nuevo.setOrigen(origen);
        nuevo.setDest(destino);
        nuevo.setInfo(info);
        nuevo.setTipoR(tipoR);
        getRelaciones().add(nuevo);
    }
    
    
    public ArrayList<relacion> devolverProp(ArrayList<relacion> lr){
    
        
        if(relaciones.size() > 0){
        for(relacion re:relaciones){
        
            if(re.getDest()!=null){
            
                lr.add(re);
            }
        }
        }
        return lr;
    }
    
    

    /**
     * @return the infor
     */
    public String getInfor() {
        return infor;
    }

    /**
     * @param infor the infor to set
     */
    public void setInfor(String infor) {
        this.infor = infor;
    }

    /**
     * @return the relaciones
     */
    public ArrayList<relacion> getRelaciones() {
        return relaciones;
    }

    /**
     * @param relaciones the relaciones to set
     */
    public void setRelaciones(ArrayList<relacion> relaciones) {
        this.relaciones = relaciones;
    }
    
}
