package Modelo;

public class Producto {
    private int idproducto;
    private int codigo;
    private String nombre;
    private int cantidad;
    private double costo;
    private String estado;
    
    //Constructor Vacio
    public Producto(){ 
    }
    public Producto(int codigo, String nombre, int cantidad, double costo,  String estado){ 
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
    
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getCosto() {
        return costo;
    }
    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
   
    
}
