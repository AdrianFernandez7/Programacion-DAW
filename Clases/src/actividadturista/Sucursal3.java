package actividadturista;

public class Sucursal3 {
    int id, telefono;
    String direccion, ciudad, provincia;

    public Sucursal3(){}

    public Sucursal3(int id, int telefono, String direccion, String ciudad, String provincia){
        this.id = id;
        this.telefono = telefono;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.provincia = provincia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "Sucursal3 [id=" + id + ", telefono=" + telefono + ", direccion=" + direccion + ", ciudad=" + ciudad
                + ", provincia=" + provincia + "]";
    }

    

    
}
