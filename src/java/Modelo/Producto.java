package Modelo;

public class Producto {
    private int idproducto;
    private String codigo;
    private String nombre;
    private String cantidad;
    private String costo;
    private String estado;
    
    //Constructor Vacio
    public Producto(){ 
    }
    public Producto(String codigo, String nombre, String cantidad, String costo,  String estado){ 
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.costo = costo;
        this.estado = estado;
    }

    public int getIdproducto() {
        return idproducto;
    }
    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }
    
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantidad() {
        return cantidad;
    }
    public void setCantidad(String apellidos) {
        this.cantidad = cantidad;
    }

    public String getCosto() {
        return costo;
    }
    public void setCosto(String dni) {
        this.costo = costo;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
   
    
}
