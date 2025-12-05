package actividadferroviaria;

public class Locomotora {
    int matricula;
    int potencia;
    int añoDeFabricacion;
    Mecanicos mecanicoQueLoRepara;

    public Locomotora(){}

    public Locomotora(int matricula, int potencia, int añoDeFabricacion,Mecanicos mecanicoQueLoRepara){
        this.matricula=matricula;
        this.potencia=potencia;
        this.añoDeFabricacion=añoDeFabricacion;
        this.mecanicoQueLoRepara=mecanicoQueLoRepara;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getAñoDeFabricacion() {
        return añoDeFabricacion;
    }

    public void setAñoDeFabricacion(int añoDeFabricacion) {
        this.añoDeFabricacion = añoDeFabricacion;
    }

    public Mecanicos getMecanicoQueLoRepara() {
        return mecanicoQueLoRepara;
    }

    public void setMecanicoQueLoRepara(Mecanicos mecanicoQueLoRepara) {
        this.mecanicoQueLoRepara = mecanicoQueLoRepara;
    }

    @Override
    public String toString() {
        return "Locomotora [matricula=" + matricula + ", potencia=" + potencia + ", añoDeFabricacion="
                + añoDeFabricacion + ", mecanicoQueLoRepara=" + mecanicoQueLoRepara + "]";
    }

    

    
    
}
