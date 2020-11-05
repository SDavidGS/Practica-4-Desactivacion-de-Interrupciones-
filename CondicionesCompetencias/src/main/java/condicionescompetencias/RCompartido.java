package condicionescompetencias;
import java.util.ArrayList;

public class RCompartido {
    private String rc;
    private ArrayList<Interrupcion> Ainterrupciones;
    
    RCompartido(){
        rc="";
        Ainterrupciones = new ArrayList<Interrupcion>();
        for(int i=0; i<4; i++){
            Ainterrupciones.add(new Interrupcion());
        }
    }
    
    public void bloquear(){
        for(Interrupcion i:Ainterrupciones)
            i.setInter(false);
    }
    
    public void desbloquear(){
        for(Interrupcion i:Ainterrupciones)
            i.setInter(true);
    }
    
    public String getrc() {/*
        String aux="En espera...";
            if(isEntra()){
                bloquear();
                aux=rc;
                desbloquear();
            }
        return aux;*/
        return rc;
    }
    
    public boolean isEntra(){
        boolean ban = false;
        for(Interrupcion i:Ainterrupciones)
            if(i.isInter()){
                ban=true;
            }
            else{
                return false;
            }
        return ban;
    }
    
    public void setrc(String rc) {
        this.rc = rc;
    }
    
    public ArrayList<Interrupcion> getAinterrupciones() {
        return Ainterrupciones;
    }
    public void setAinterrupciones(ArrayList<Interrupcion> Ainterrupciones) {
        this.Ainterrupciones = Ainterrupciones;
    }
}
