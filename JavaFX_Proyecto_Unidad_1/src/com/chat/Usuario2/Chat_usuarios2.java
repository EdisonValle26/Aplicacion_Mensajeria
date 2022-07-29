package com.chat.Usuario2;

import java.util.Date;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class Chat_usuarios2 {
	
	MessageRepository2 messageRepository = new MessageRepository2();
	ImagenRepository2 imaRp = new ImagenRepository2();

	ScrollPane scrollPane = new ScrollPane();
	Button btnSend = new Button("Send");
	TextField txtSend = new TextField();
	Date date = new Date();

	Label lbladmin1 = new Label("Usuario 2");

	// Creacion de los labels del flowPane de la parte de arriba
	Label labelTopRight1 = new Label();
	Label labelTopRight2 = new Label();
	Label labelTopRight3 = new Label();

	// Creacion de botones
	Button btn1 = new Button("   Fernanda   ");
	Button btn2 = new Button("   Jose   ");
	Button btn3 = new Button("   Pepito   ");

	// creacion de los StackPane
	StackPane stackPaneuser1 = new StackPane();
	StackPane stackPaneuser2 = new StackPane();
	StackPane stackPaneuser3 = new StackPane();

	public Chat_usuarios2() {

		// Agrego stilos a la imagen y al texto del ADMIN 1

		lbladmin1.setTranslateX(20);
		lbladmin1.setFont(Font.font("Times New Roman", 30));
		lbladmin1.setStyle("-fx-text-fill: White;");
		imaRp.fimaadmin2.setTranslateX(5);

		// Ubico las imagenes de los botones
		imaRp.fUser1.setTranslateX(-65);
		imaRp.fUser2.setTranslateX(-65);
		imaRp.fUser3.setTranslateX(-65);

		// Agrego las imagenes y el contenido del ultimo mensaje al boton 1
		List<Message2> result1 = messageRepository.getMessages("Me", "Fernanda");
		int i1 = 0;
		for (Message2 msg : result1) {
			if (i1++ == result1.size() - 1) {

				Label lblUsertex1 = new Label(msg.getContent());
				lblUsertex1.setFont(Font.font("Times New Roman", 10));
				lblUsertex1.setStyle("-fx-text-fill: midnightblue;");
				lblUsertex1.setMaxWidth(110);
				lblUsertex1.setTranslateY(24);
				lblUsertex1.setTranslateX(20);
				stackPaneuser1.getChildren().addAll(btn1, imaRp.fUser1, lblUsertex1);
			}
		}

		// Agrego las imagenes y el contenido del ultimo mensaje al boton 2
		List<Message2> result2 = messageRepository.getMessages("Me", "Jose");
		int i2 = 0;
		for (Message2 msg : result2) {
			if (i2++ == result2.size() - 1) {

				Label lblUsertex2 = new Label(msg.getContent());
				lblUsertex2.setFont(Font.font("Times New Roman", 10));
				lblUsertex2.setStyle("-fx-text-fill: midnightblue;");
				lblUsertex2.setMaxWidth(110);
				lblUsertex2.setTranslateY(24);
				lblUsertex2.setTranslateX(20);
				stackPaneuser2.getChildren().addAll(btn2, imaRp.fUser2, lblUsertex2);
			}
		}

		// Agrego las imagenes y el contenido del ultimo mensaje al boton 3
		List<Message2> result3 = messageRepository.getMessages("Me", "Pepito");
		int i3 = 0;
		for (Message2 msg : result3) {
			if (i3++ == result3.size() - 1) {

				Label lblUsertex3 = new Label(msg.getContent());
				lblUsertex3.setFont(Font.font("Times New Roman", 10));
				lblUsertex3.setStyle("-fx-text-fill: midnightblue;");
				lblUsertex3.setMaxWidth(110);
				lblUsertex3.setTranslateY(24);
				lblUsertex3.setTranslateX(20);
				stackPaneuser3.getChildren().addAll(btn3, imaRp.fUser3, lblUsertex3);
			}
		}

		// Añado un efecto HOVER para que al pasar encima del boton 1 se ponga de otro
		// color

		btn1.setPrefHeight(70);
		btn1.setPrefWidth(185);
		btn1.setFont(Font.font("Times New Roman", 20));
		btn1.setStyle("-fx-background-color: White;-fx-text-fill: black;");
		btn1.setOnMouseEntered(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent t) {
				btn1.setStyle("-fx-background-color: gray;");
			}
		});
		btn1.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent t) {
				btn1.setStyle("-fx-background-color: White;-fx-text-fill: black;");
			}
		});

		// Añado un efecto HOVER para que al pasar encima del boton 2 se ponga de otro
		// color
		btn2.setPrefHeight(70);
		btn2.setPrefWidth(185);
		btn2.setFont(Font.font("Times New Roman", 20));
		btn2.setStyle("-fx-background-color: White;-fx-text-fill: black;");
		btn2.setOnMouseEntered(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent t) {
				btn2.setStyle("-fx-background-color: gray;");
			}
		});
		btn2.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent t) {
				btn2.setStyle("-fx-background-color: White;-fx-text-fill: black;");
			}
		});

		// Añado un efecto HOVER para que al pasar encima del boton 3 se ponga de otro
		// color
		btn3.setPrefHeight(70);
		btn3.setPrefWidth(185);
		btn3.setFont(Font.font("Times New Roman", 20));
		btn3.setStyle("-fx-background-color: White;-fx-text-fill: black;");
		btn3.setOnMouseEntered(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent t) {
				btn3.setStyle("-fx-background-color: gray;");
			}
		});
		btn3.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent t) {
				btn3.setStyle("-fx-background-color: White;-fx-text-fill: black;");
			}
		});


//ACCION DEL  USUARIO 1

		btn1.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {

				mensajes("Me", "Fernanda");

				FlowPane flow1 = new FlowPane();
				ImageView fUser1i = new ImageView(
						"file:///C:/Users/Andres/eclipse-workspace/JavaFX_Proyecto_Unidad_1/src/imagenes/Imagenuser1.png");
				fUser1i.setTranslateY(5);
				fUser1i.setTranslateX(5);

				Label lblUsertext1 = new Label("Fernanda");
				lblUsertext1.setTranslateY(5);
				lblUsertext1.setTranslateX(30);
				lblUsertext1.setFont(Font.font("Times New Roman", 30));
				lblUsertext1.setStyle("-fx-text-fill: White;");

				flow1.getChildren().addAll(fUser1i, lblUsertext1);

				labelTopRight1.setGraphic(flow1);

				imagen(1);

			}
		});

//ACCION DEL  USUARIO 2	
		btn2.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {

				mensajes("Me", "Jose");

				FlowPane flow2 = new FlowPane();
				ImageView fUser2i = new ImageView(
						"file:///C:/Users/Andres/eclipse-workspace/JavaFX_Proyecto_Unidad_1/src/imagenes/Imagenuser2.png");
				fUser2i.setTranslateY(5);
				fUser2i.setTranslateX(5);

				Label lblUsertext2 = new Label("Jose");
				lblUsertext2.setTranslateY(5);
				lblUsertext2.setTranslateX(30);
				lblUsertext2.setFont(Font.font("Times New Roman", 30));
				lblUsertext2.setStyle("-fx-text-fill: White;");

				flow2.getChildren().addAll(fUser2i, lblUsertext2);

				labelTopRight2.setGraphic(flow2);
				imagen(2);

			}
		});

// ACCION DEL USUARIO 3
		btn3.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {

				mensajes("Me", "Pepito");

				FlowPane flow3 = new FlowPane();
				ImageView fUser3i = new ImageView(
						"file:///C:/Users/Andres/eclipse-workspace/JavaFX_Proyecto_Unidad_1/src/imagenes/Imagenuser3.png");
				fUser3i.setTranslateY(5);
				fUser3i.setTranslateX(5);

				Label lblUsertext3 = new Label("Pepito");
				lblUsertext3.setTranslateY(5);
				lblUsertext3.setTranslateX(30);
				lblUsertext3.setFont(Font.font("Times New Roman", 30));
				lblUsertext3.setStyle("-fx-text-fill: White;");

				flow3.getChildren().addAll(fUser3i, lblUsertext3);

				labelTopRight3.setGraphic(flow3);
				imagen(3);

			}
		});
	}

//Metodo de Mostrar los mensajes 
	public void mensajes(String user, String userselect) {

		VBox vContent = new VBox(10);

		// Mensajes del Repositorio de Mensajes
		List<Message2> result = messageRepository.getMessages(user, userselect);

		// Mensajes que salen por pantalla

		for (Message2 msg : result) {
			FlowPane fMessage = new FlowPane(10, 10);
			BorderPane age1 = new BorderPane();
			BorderPane age2 = new BorderPane();
			Label lblUser = new Label(msg.getFrom() + ":");
			Label lblMessage = new Label("\n" + msg.getContent());
			Label lbldate = new Label(msg.getDate());
			fMessage.getChildren().addAll(age1, age2);
			vContent.getChildren().add(fMessage);
			if (msg.getFrom().equals("Me")) {

				Label lblUser1 = new Label(msg.getFrom() + ":");
				Label lblMessage1 = new Label("\n" + msg.getContent());
				Label lbldate1 = new Label(msg.getDate());

				lblUser1.setMaxWidth(200);
				lblUser1.setMaxHeight(300);
				lblUser1.setLayoutX(10);
				lblUser1.setLayoutY(115);
				lblUser1.setFont(Font.font("Verdana", 15));

				lblMessage1.setFont(Font.font("Verdana", 20));
				lblMessage1.setMaxWidth(300);
				lblMessage1.setMaxHeight(300);
				lblMessage1.setWrapText(true);
				lblMessage1.setStyle("-fx-text-fill: White;");

				lbldate1.setFont(Font.font("Verdana", 10));
				lbldate1.setMaxWidth(200);
				lbldate1.setAlignment(Pos.BOTTOM_RIGHT);

				age1.setStyle("-fx-background-color: cornflowerblue;-fx-background-radius: 8px;");
				age1.setTranslateX(350);
				age1.setTop(lblUser1);
				age1.setLeft(lblMessage1);
				age1.setBottom(lbldate1);

			}
			if (msg.getFrom().equals("Me") == false) {
				age2.setTop(lblUser);
				age2.setLeft(lblMessage);
				age2.setBottom(lbldate);
			}

			lblUser.setMaxWidth(200);
			lblUser.setMaxHeight(300);
			lblUser.setLayoutX(10);
			lblUser.setLayoutY(115);
			lblUser.setFont(Font.font("Verdana", 15));

			lblMessage.setFont(Font.font("Verdana", 20));
			lblMessage.setMaxWidth(300);
			lblMessage.setMaxHeight(300);
			lblMessage.setWrapText(true);

			lbldate.setFont(Font.font("Verdana", 10));
			lbldate.setMaxWidth(200);
			lbldate.setAlignment(Pos.BOTTOM_RIGHT);

			age2.setStyle("-fx-background-color: lightseagreen;-fx-text-fill: White;-fx-background-radius: 8px;");
			lblMessage.setStyle("-fx-text-fill: White;");
		}

		scrollPane.setContent(vContent);
		scrollPane.setVbarPolicy(ScrollBarPolicy.ALWAYS);

		AnchorPane.setLeftAnchor(scrollPane, 200.0);
		AnchorPane.setRightAnchor(scrollPane, 0.0);
		AnchorPane.setTopAnchor(scrollPane, 50.0);
		AnchorPane.setBottomAnchor(scrollPane, 50.0);

		// Accion del boton

		btnSend.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				FlowPane fMessage = new FlowPane(10, 10);
				BorderPane age3 = new BorderPane();
				Label lblUser = new Label("Me: ");
				Label lblMessage = new Label("\n" + txtSend.getText());
				fMessage.getChildren().addAll(age3);
				vContent.getChildren().add(fMessage);

				// Asigno la hora y los minutos locales dentro del label tranformandolos a
				// string
				@SuppressWarnings("deprecation")
				Label lbldate1 = new Label(String.valueOf(date.getHours() + ":" + date.getMinutes()));

				lbldate1.setFont(Font.font("Verdana", 10));
				lbldate1.setMaxWidth(200);
				lbldate1.setAlignment(Pos.BOTTOM_RIGHT);

				age3.setTop(lblUser);
				age3.setLeft(lblMessage);
				age3.setBottom(lbldate1);

				age3.setTranslateX(350);

				lblUser.setMaxWidth(200);
				lblUser.setMaxHeight(300);
				lblUser.setLayoutX(10);
				lblUser.setLayoutY(115);
				lblUser.setFont(Font.font("Verdana", 15));

				lblMessage.setFont(Font.font("Verdana", 20));
				lblMessage.setMaxWidth(300);
				lblMessage.setMaxHeight(300);
				lblMessage.setWrapText(true);
				lblMessage.setStyle("-fx-text-fill: White;");

				age3.setStyle("-fx-background-color: cornflowerblue;-fx-background-radius: 8px;");

				txtSend.clear();

			}
		});
	}

	public void imagen(int i) {

		if (i == 1) {
			labelTopRight1.setVisible(true);
			labelTopRight2.setVisible(false);
			labelTopRight3.setVisible(false);
		}
		if (i == 2) {
			labelTopRight2.setVisible(true);
			labelTopRight1.setVisible(false);
			labelTopRight3.setVisible(false);
		}
		if (i == 3) {
			labelTopRight3.setVisible(true);
			labelTopRight2.setVisible(false);
			labelTopRight1.setVisible(false);
		}

	}

}
