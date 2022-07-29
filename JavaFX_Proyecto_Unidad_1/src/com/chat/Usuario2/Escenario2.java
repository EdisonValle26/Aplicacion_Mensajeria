package com.chat.Usuario2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Escenario2 {
	
public Escenario2(Stage primaryStage) {
		
		// Ventana principal

		AnchorPane root = new AnchorPane();

		// Clase Chat_usuarios
		Chat_usuarios2 chat_usua = new Chat_usuarios2();
		ImagenRepository2 imaRp = new ImagenRepository2();
//PARTE DERECHA	

		// Ventana del ScrollPane
		ScrollPane scrollPaneRigth = new ScrollPane();
		VBox vContentRigth = new VBox();
		Button btnSalir = new Button("CERRAR SESION");
		
		scrollPaneRigth.setContent(vContentRigth);
		scrollPaneRigth.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		AnchorPane.setLeftAnchor(scrollPaneRigth, 200.0);
		AnchorPane.setRightAnchor(scrollPaneRigth, 0.0);
		AnchorPane.setTopAnchor(scrollPaneRigth, 50.0);
		AnchorPane.setBottomAnchor(scrollPaneRigth, 50.0);
		
		// Parte de arriba
		StackPane stackPaneTopRight = new StackPane();
		stackPaneTopRight.setPrefHeight(50);
		stackPaneTopRight.setStyle("-fx-background-color: deepskyblue;");
		stackPaneTopRight.setAlignment(Pos.TOP_LEFT);
		
		stackPaneTopRight.getChildren().addAll(
		chat_usua.labelTopRight3, chat_usua.labelTopRight2,
		chat_usua.labelTopRight1);

		// Posiciono el flowpane de la parte de arriba

		AnchorPane.setTopAnchor(stackPaneTopRight, 0.0);
		AnchorPane.setLeftAnchor(stackPaneTopRight, 200.0);
		AnchorPane.setRightAnchor(stackPaneTopRight, 0.0);
		AnchorPane.setTopAnchor(stackPaneTopRight, 0.0);
		
		//Parte de abajo, con el boton de enviar, Boton de mensaje y Caja de Texto para enviar mensajes

		FlowPane flowPaneBottom = new FlowPane();
		flowPaneBottom.setPrefHeight(50);
		flowPaneBottom.setStyle("-fx-background-color: deepskyblue;");

		// Estilo de color y posicion de caja de texto de enviar mensaje
		chat_usua.txtSend.setTranslateX(250);
		chat_usua.txtSend.setTranslateY(10);
		chat_usua.txtSend.setStyle("-fx-background-color: White; ");
		chat_usua.txtSend.setPromptText("Escribe un mensaje aqui");
		chat_usua.txtSend.setPrefHeight(30);
		chat_usua.txtSend.setPrefWidth(500);

		// Estilo de color y posicion al boton de enviar mensaje
		chat_usua.btnSend.setTranslateX(300);
		chat_usua.btnSend.setTranslateY(10);
		chat_usua.btnSend.setStyle("-fx-background-color: White; ");
		chat_usua.btnSend.setMaxHeight(150);
		chat_usua.btnSend.setMaxWidth(150);
		
		// Estilo de color y posicion al boton de salir
		btnSalir.setTranslateX(-530);
		btnSalir.setTranslateY(10);
		btnSalir.setStyle("-fx-background-color: White; ");
		btnSalir.setMaxHeight(300);
		btnSalir.setPrefWidth(150);

		// Añado el boton y la caja de texto
		flowPaneBottom.getChildren().add(chat_usua.txtSend);
		flowPaneBottom.getChildren().add(chat_usua.btnSend);
		flowPaneBottom.getChildren().add(btnSalir);
		
		// Posiciono el flowpane de la parte de abajo abajo
		AnchorPane.setBottomAnchor(flowPaneBottom, 0.0);
		AnchorPane.setLeftAnchor(flowPaneBottom, 0.0);
		AnchorPane.setRightAnchor(flowPaneBottom, 0.0);
		AnchorPane.setBottomAnchor(flowPaneBottom, 0.0);
		
//PARTE IZQUIERDA	
		
		// Ventana del Lista de Usuarios
		ScrollPane scrollPaneLeft = new ScrollPane();
		VBox vContentLeft = new VBox(2);

		
		// Añado a mi contenido izquierdo los botones de los usuarios
		vContentLeft.getChildren().addAll(
		chat_usua.stackPaneuser1, chat_usua.stackPaneuser2, 
		chat_usua.stackPaneuser3);
			
		// Muestro el contenido en el aldo izquierdo
		scrollPaneLeft.setContent(vContentLeft);
		scrollPaneLeft.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		vContentLeft.setStyle("-fx-background-color: deepskyblue;");

		vContentLeft.setPrefHeight(1000);
		AnchorPane.setLeftAnchor(scrollPaneLeft, 0.0);
		AnchorPane.setRightAnchor(scrollPaneLeft, 700.0);
		AnchorPane.setTopAnchor(scrollPaneLeft, 50.0);
		AnchorPane.setBottomAnchor(scrollPaneLeft, 50.0);

		// Parte de arriba
		FlowPane flowPaneTopLeft = new FlowPane();
		flowPaneTopLeft.setPrefHeight(50);
		flowPaneTopLeft.setStyle("-fx-background-color: deepskyblue;");
		flowPaneTopLeft.setAlignment(Pos.CENTER_LEFT);
		flowPaneTopLeft.getChildren().addAll(imaRp.fimaadmin2, chat_usua.lbladmin1);			

		// Posiciono el flowpane de la parte de arriba
		AnchorPane.setTopAnchor(flowPaneTopLeft, 0.0);
		AnchorPane.setLeftAnchor(flowPaneTopLeft, 0.0);
		AnchorPane.setRightAnchor(flowPaneTopLeft, 701.0);
		AnchorPane.setTopAnchor(flowPaneTopLeft, 0.0);

		// Se agregan las pantallas dentro de la principal
		root.getChildren().add(scrollPaneRigth);
		root.getChildren().add(chat_usua.scrollPane);
		root.getChildren().add(stackPaneTopRight);
		root.getChildren().add(flowPaneBottom);
		root.getChildren().add(flowPaneTopLeft);
		root.getChildren().add(scrollPaneLeft);
		
		// Se muestra la pantalla principal

		Scene scene = new Scene(root, 900, 800);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.setTitle("Mensajeria Proyecto 1");
		stage.show();
		
		//Accion del boton Salir
		btnSalir.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {

				primaryStage.show();
				stage.hide();

			}
		});
			
	}

}
