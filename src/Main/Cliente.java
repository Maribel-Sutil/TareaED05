public class Cliente {
    /**
     * Paso de método publico a privado
     */
    boolean esVip;
    private String nombre;
    private int id;

    /**
     * Cambio el valor vip por esVip para mantener el código más homogéneo
     */

    public Cliente(boolean esVip, String nombre, int id) {
        this.esVip = esVip;
        this.nombre = nombre;
        this.id = id;
    }
    /**
     *  Realizo los encapsulamientos, en el caso del boolean esVip me aconseja usar is en vez de get
     *  ya que por convención es "más correcto".
     */

    public boolean isEsVip() {
        return esVip;
    }
    public void setEsVip(boolean esVip) {
        this.esVip = esVip;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
