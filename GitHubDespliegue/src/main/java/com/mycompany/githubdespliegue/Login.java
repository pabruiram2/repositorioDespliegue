package com.mycompany.githubdespliegue;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * Método de login
 * 
 * @author Pablo Ruiz Ramos
 */
public class Login {

    public boolean autenticar(String usuario, String contrasena) {
        
        return usuario.equals("admin") && contrasena.equals("1234");
        
    }

}
