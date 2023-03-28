/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import DAO.DAOLogin;

/**
 *
 * @author Cristhian Padilla
 * @version 1.0
 */
public class ControladorLogin implements DAOLogin{

    /**
     * @author Cristhian padilla
     * Creamos atributos para la contraseña, usuario y Controlador como privado 
     */
    
    private static ControladorLogin controladorLogin;
    private String usuario;
    private String contrasenia;
    
    /**
     * Se inicializa el constructor
     */
    private ControladorLogin() {
        
        
    }
    /**
     * creamos getControladorLogin como static para una solo instancia utilizando el singleton 
     * @return controladorLogin  
     */
    public static ControladorLogin getControladorLogin(){
        if(controladorLogin==null)
            controladorLogin=new ControladorLogin();
        
        return controladorLogin;
    }
    /**
     * 
     * @param usuario
     * @param contrasenia
     * @return estado 
     * Verificar el usuario y contraseña para entrar
     */
    @Override
    public boolean VerificarUsuarios(String usuario, String contrasenia) {
        boolean estado=false;
        
        if((usuario.equals("daniel"))&&(contrasenia.equals("12345")))
            estado=true;
        
        return estado;
    }
    
    /**
     * 
     * @return usuario
     * Para iniciar el usuario
     */

    @Override
    public String getUsuario() {
        return this.usuario;
    }
    /**
     * 
     * @param contrasenia
     * @return estado
     * Sirve para verificar la contraseña
     */

    @Override
    public boolean CambiarContrasenia(String contrasenia) {
        boolean estado=true;        
        this.contrasenia=contrasenia;
        return estado;
        
    }
    
    
    
    
    
}
