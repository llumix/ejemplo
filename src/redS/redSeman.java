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
public class redSeman {
    
    private nodored inicio;
    private  ArrayList<nodored> nodos;
    private  ArrayList<relacion> relacion;
    private  ArrayList<relacion> caracteristicas;
    
    redSeman(){
    
        inicio=null;
        nodos=new ArrayList<>();
        relacion=new ArrayList<>();
        caracteristicas=new ArrayList<>();
    }
    
    public void insertarNodored(nodored nuevo){
    
        boolean repetido=false;
        
        if(getNodos().size() == 0){
            getNodos().add(nuevo);
        }
        else{
            int cont=0;
            while(repetido==false && (cont < getNodos().size())){
            
                if(getNodos().get(cont).getInfor().equals(nuevo.getInfor())){//si son iguales
                
                    repetido=true;
                }
                cont=cont+1;
            }
            if(repetido==false){
            
                getNodos().add(nuevo);
            }
        
        }
    }
    
    public void insertarRealcion(nodored origen, nodored dest, String info, int tipoR){
    
        relacion re=new relacion();
        re.setOrigen(origen);
        re.setDest(dest);
        re.setInfo(info);
        re.setTipoR(tipoR);
        
            for(nodored lnodos:getNodos()){
            
                if(lnodos.getInfor().equals(origen)){
                
                    lnodos.insertarRelacion(origen, dest, info, tipoR);
                    getRelacion().add(re);
                }
            }
                
    }
    
    public ArrayList<relacion> sig(nodored sig){
    
        ArrayList<relacion> lrelac=new ArrayList<>();
        for(relacion lis:getRelacion()){
            if(lis.getOrigen().getInfor().equals(sig.getInfor())){
            
                lrelac.add(lis);
            }
        }
        return lrelac;
    }
    
    
    public void busquedaARec(nodored nodo){
    
        if(sig(nodo).size() > 0){
        
            ArrayList<relacion> nlRela=sig(nodo);
            for(relacion lis:nlRela){
            
                getCaracteristicas().add(lis);
                busquedaARec(lis.getDest());
            }
        }
    }
    
    public ArrayList<relacion> busquedaAd(nodored aux){//adelante
    
        getCaracteristicas().clear();
        busquedaARec(aux);
        return getCaracteristicas();
    }
    
    
    public ArrayList<relacion> ant(nodored nodoO){
    
        ArrayList<relacion> lants=new ArrayList<>();
        for(relacion lrnats:getRelacion()){
        
            if(lrnats.getOrigen().getInfor().equals(nodoO.getInfor())){
            
                lants.add(lrnats);
            }
        }
        return lants;
    }
    
    public void busquedaAtRec(nodored nodoA){
    
        if(ant(nodoA).size() > 0){
        
            ArrayList<relacion> ants=ant(nodoA);
            for(relacion ante:ants){
            
                getCaracteristicas().add(ante);
                busquedaAtRec(ante.getOrigen());
            }
        }
    }
    
    public ArrayList<relacion> buscaAt(nodored aux2){//atras
    
        getCaracteristicas().clear();
        busquedaAtRec(aux2);
        return getCaracteristicas();
    }
    
    public void limpiar(){
    
        getNodos().clear();
        getRelacion().clear();
    }
    
    public void visualizar(){
    
        for(nodored lnodos:getNodos()){
            System.out.println(lnodos.getInfor());
        }
    }

    /**
     * @return the inicio
     */
    public nodored getInicio() {
        return inicio;
    }

    /**
     * @param inicio the inicio to set
     */
    public void setInicio(nodored inicio) {
        this.inicio = inicio;
    }

    /**
     * @return the nodos
     */
    public ArrayList<nodored> getNodos() {
        return nodos;
    }

    /**
     * @param nodos the nodos to set
     */
    public void setNodos(ArrayList<nodored> nodos) {
        this.nodos = nodos;
    }

    /**
     * @return the relacion
     */
    public ArrayList<relacion> getRelacion() {
        return relacion;
    }

    /**
     * @param relacion the relacion to set
     */
    public void setRelacion(ArrayList<relacion> relacion) {
        this.relacion = relacion;
    }

    /**
     * @return the caracteristicas
     */
    public ArrayList<relacion> getCaracteristicas() {
        return caracteristicas;
    }

    /**
     * @param caracteristicas the caracteristicas to set
     */
    public void setCaracteristicas(ArrayList<relacion> caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    
    
}
