package com.mycompany.tienda;

import java.util.Scanner;

public class Tienda {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       producto a1= new producto("Smartphone Redmi Note 11 Pro" ,"Blanco" ,258490, 17);
       producto a2=new producto("Smartphone Xiaomi 12T","Negro", 499490,28);
       producto a3=new producto ("Smartphone Redmi 10A ", "Gris" , 113890,9);
       producto a4=new producto("Epson EcoTank ET-3830","Blanco" , 650980,21);
       producto a5=new producto("SAMSUNG ","Azul", 329990,36);
       producto a6=new producto("RCA TV","Negro" ,148990,5);
       producto a7=new producto ("Epson Workforce Pro WF-4820", "Negro" ,340980,33);
       producto a8=new producto("SMART TV  ", "Negro", 349990,39);
       producto a9=new producto("Supersonic SC-1911 ","Negro", 25990,1);
       producto a10=new producto ("Pantum P2502W", "Blanco" , 198270,11);
       
       System.out.println("Bienvenido a nuestra tienda electronica");
        System.out.println("----- Seleccione un numero-----");
        System.out.println("1.Ver la lista de productos de nuestra tienda");
        System.out.println("2.Buscar por categorias");
        System.out.println("3.Agregar un producto a la lista");
        System.out.println("4.Modificar informacion de la lista");
        System.out.println("5.Eliminar un producto de la lista");
        System.out.println("6.Realizar la compra");
        String teclado = leer.nextLine();
        
        if(teclado.equals("1")){
            System.out.println("1."+a1.toString());
            System.out.println("2."+a2.toString());
            System.out.println("3."+a3.toString());
            System.out.println("4."+a4.toString());
            System.out.println("5."+a5.toString());
            System.out.println("6."+a6.toString());
            System.out.println("7."+a7.toString());
            System.out.println("8."+a8.toString());
            System.out.println("9."+a9.toString());
            System.out.println("10."+a10.toString());
    
        }else if(teclado.equals("2")){
            System.out.println("Escriba el producto de su preferencia:(Celulares,Impresoras, Televisores)");
             String selec = leer.nextLine();
             if(selec.equals("Celulares")){
             System.out.println("1."+a1.toString());
             System.out.println("2."+a2.toString());
             System.out.println("3."+a3.toString());
             
             }else if(selec.equals("Impresoras")){
             System.out.println("4."+a4.toString());
             System.out.println("7."+a7.toString());
             System.out.println("10."+a10.toString());
             
             }else if(selec.equals("Televisores")){
              System.out.println("5."+a5.toString());
              System.out.println("6."+a6.toString());
              System.out.println("8."+a8.toString());
              System.out.println("9."+a9.toString());
             }
        }
       
        
    }
}
