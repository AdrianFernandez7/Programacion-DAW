package actividadferroviaria;


public class Mecanicos {
    String DNI;
    int telefono;
    Especialidad especialidad;

    public Mecanicos(){}

    public Mecanicos(String DNI, int telefono, Especialidad especialidad){
        this.DNI=DNI;
        this.telefono=telefono;
        this.especialidad=especialidad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String dNI) {
        DNI = dNI;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Mecanicos [DNI=" + DNI + ", telefono=" + telefono + ", especialidad=" + especialidad + "]";
    }

    
    
    
}
