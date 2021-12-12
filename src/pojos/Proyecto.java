package pojos;

/**
 *
 * @author deysh
 */
public class Proyecto {

    int idProyecto;
    String cliente; 
    String coordinador;
    String zona; 
    String tipo; 
    int idEquipo;

    public Proyecto() {
    }

    public Proyecto(int idProyecto, String cliente, String coordinador, String zona, String tipo, int idEquipo) {
        this.idProyecto = idProyecto;
        this.cliente = cliente;
        this.coordinador = coordinador;
        this.zona = zona;
        this.tipo = tipo;
        this.idEquipo = idEquipo;
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCoordinador() {
        return coordinador;
    }

    public void setCoordinador(String coordinador) {
        this.coordinador = coordinador;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }
    
         
   
    
}
