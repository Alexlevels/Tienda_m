package com.tienda.services;

import com.tienda.domain.Usuario;
import jakarta.mail.MessagingException;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

public interface RegistroService {
    
    
    //Metodo para crear inicialmente un usuario de manera parcial
    public Model crearUsuario(Model model, Usuario usuario) 
            throws MessagingException;
    
     //Metodo para activar un usuario desde el enlace de correo enviado
    public Model activarUsuario(Model model, 
            String username, 
            String clave);
    
    //Metodo para habilitar completamente un usuario
    public void habilitaUsuario(Usuario usuario, 
            MultipartFile imagenFile);
    
     //Metodo para recordar clave de un usuario
    public Model recordarUsuario(Model model, Usuario usuario) 
            throws MessagingException;
}
