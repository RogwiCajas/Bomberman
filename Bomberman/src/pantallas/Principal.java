/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

/**
 * Pantalla de menus principal
 * @author cajas
 */
public class Principal {
    private Button nuevoJuego;
    private Button historial;
    private Button salir;
    private Label titulo;
    private VBox contenedor;
    private Pane root;
    private Scene scene;
    
   public Principal(){
       iniciar();
   }
   /**
    * Inicia los componentes graficos de la ventana.
    */
   private void iniciar(){
       this.contenedor=new VBox(40);
       this.root=new StackPane(contenedor);
       this.titulo=new Label("BOMBERMAN");
       this.nuevoJuego=new Button("Juego Nuevo");
       this.historial=new Button("Mejores puntuaciones");
       this.salir=new Button("Salir");
       estilos();
       contenedor.getChildren().addAll(titulo,nuevoJuego,historial,salir);
              
   }
   /**
    * Da formato a los componentes de la ventana.
    */
   private void estilos(){
       contenedor.setPadding(new Insets(100,70,70,100));
       contenedor.setAlignment(Pos.CENTER);
       salir.setPrefSize(240, 40);
       nuevoJuego.setPrefSize(240, 40);
       historial.setPrefSize(240, 40);
       
       
       
   }

    public Scene getScene() {
        this.scene=new Scene(root,1216,672);
        
        scene.getStylesheets().add
                ("recursos/estilos.css");
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }
   
    
   
}
