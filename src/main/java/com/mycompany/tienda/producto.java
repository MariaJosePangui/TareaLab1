package com.mycompany.tienda;


public class producto {
    private String marca;
    private String color;
    private int precio;
    private int stock;
    
    public producto(){}
    public producto( String marca, String color,int precio, int stock ){
    this.marca = marca;
    this.color = color;
    this.precio = precio;
    this.stock = stock;
   }

    @Override
    public String toString() {
        return "producto{" + "marca=" + marca + ", color=" + color + ", precio=" + precio +"$"+ ", stock=" + stock + '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
}
