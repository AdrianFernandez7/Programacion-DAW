package actividadferroviaria;

public class Tren {
    Locomotora locomotora;
    Vagon vagones;
    Maquinista maquinista;
    

    public Tren(){}

    public Tren(Locomotora locomotora, Vagon vagones, Maquinista maquinista){
        this.locomotora=locomotora;
        this.vagones=vagones;
        this.maquinista=maquinista;
    }

    public Locomotora getLocomotora() {
        return locomotora;
    }

    public void setLocomotora(Locomotora locomotora) {
        this.locomotora = locomotora;
    }

    public Vagon getVagones() {
        return vagones;
    }

    public void setVagones(Vagon vagones) {
        this.vagones = vagones;
    }

    public Maquinista getMaquinista() {
        return maquinista;
    }

    public void setMaquinista(Maquinista maquinista) {
        this.maquinista = maquinista;
    }

    @Override
    public String toString() {
        return "Tren [locomotora=" + locomotora + ", vagones=" + vagones + ", maquinista=" + maquinista + "]";
    }

    
}
