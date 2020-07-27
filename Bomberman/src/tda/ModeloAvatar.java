/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tda;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * Clase que carga la vista del avatar que usará el jugador.
 * @author cajas
 */
class ModeloAvatar {
    protected ImageView avatar;
    /**
     * Crea la vista del avatar que el usuario eligio
     * @param avatarIMG path de la imagen del avatar elegido
     */
    public ModeloAvatar(String avatarIMG){
        FileInputStream f=null;
        try {
            f= new FileInputStream(avatarIMG);
        } catch (FileNotFoundException e) {
            emergentes.VentanasEmergentes.crearError("Alerta","No se encontro el recurso: " +avatarIMG );
        }
        Image img=new Image(f);
        this.avatar=new ImageView(img);
        avatar.setFitWidth(Constantes.ANCHO);
        avatar.setFitHeight(Constantes.ALTO);
    }

    public ImageView getAvatar() {
        return avatar;
    }

    public void setAvatar(ImageView avatar) {
        this.avatar = avatar;
    }
    
}
