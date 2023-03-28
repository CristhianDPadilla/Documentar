/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

/**
 *
 * @author Cristhian Padilla
 * @class en al cual se crea los metodos que se van a utilizar enla clase controladorLogin
 */
public interface DAOLogin {
    //Evitamos que accedan directamente a los metodos mediante el dao 
    // Protegemos los metodos de la clase ControladorLogin 
    public boolean VerificarUsuarios(String usuario, String contrasenia);
    public String getUsuario();
    public boolean CambiarContrasenia(String contrasenia);
    
}
    