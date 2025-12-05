package actividadturista;

public class Turista {
    int id;
    String direccion;
    String nombre;
    String apellidos;
    int telefono;
    
    public Turista(){}

    public Turista(int id, String direccion, String nombre, String apellidos, int telefono){
        this.id = id;
        this.direccion = direccion;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Turista [id=" + id + ", direccion=" + direccion + ", nombre=" + nombre + ", apellidos=" + apellidos
                + ", telefono=" + telefono + "]";
    }

    
    
}
