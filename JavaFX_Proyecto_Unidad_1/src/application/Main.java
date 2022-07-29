package application;

import java.util.List;

import com.chat.Usuario2.Escenario2;
import com.chat.domain.Usuarios_Password;
import com.chat.escenario.Escenario;
import com.chat.repository.UserRepository;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.image.ImageView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Main extends Application {

	UserRepository user_pass = new UserRepository();

	@Override
	public void start(Stage primaryStage) {

		// Ventana principal del login
		VBox root = new VBox(20);

		ImageView imaLogin = new ImageView(
				"file:///C:/Users/Andres/eclipse-workspace/JavaFX_Proyecto_Unidad_1/src/imagenes/Login.png");
		ImageView imaUser = new ImageView(
				"file:///C:/Users/Andres/eclipse-workspace/JavaFX_Proyecto_Unidad_1/src/imagenes/747545.png");
		ImageView imaPass = new ImageView(
				"file:///C:/Users/Andres/eclipse-workspace/JavaFX_Proyecto_Unidad_1/src/imagenes/5617976.png");

		Text welcomeTxt = new Text("Bienvenido");
		welcomeTxt.setFont(Font.font("Times New Roman", 20));
		welcomeTxt.setStyle("-fx-fill: White; -fx-font-size: 30pt;");

		TextField txtUser = new TextField();
		txtUser.setPromptText("         Username");
		txtUser.setFont(Font.font("Times New Roman", 20));
		txtUser.setMaxWidth(300);
		txtUser.setPrefHeight(40);

		PasswordField pswUser = new PasswordField();
		pswUser.setPromptText("         Password");
		pswUser.setFont(Font.font("Times New Roman", 20));
		pswUser.setMaxWidth(300);
		pswUser.setPrefHeight(40);

		Button btn = new Button("Login");
		btn.setFont(Font.font("Times New Roman", 20));
		btn.setPrefWidth(300);
		btn.setPrefHeight(40);
		btn.setStyle("-fx-background-color: skyblue;-fx-text-fill: Black;");

		imaUser.setTranslateY(-170);
		imaUser.setTranslateX(-170);

		imaPass.setTranslateY(-150);
		imaPass.setTranslateX(-170);

		Text erroTxt = new Text("Bienvenido");
		erroTxt.setFont(Font.font("Times New Roman", 15));
		erroTxt.setStyle("-fx-fill: Red; -fx-font-size: 20pt;");
		erroTxt.setTranslateY(-50);

		root.setAlignment(Pos.CENTER);
		root.setPadding(new Insets(10));

		root.getChildren().add(imaLogin);
		root.getChildren().add(welcomeTxt);
		root.getChildren().add(txtUser);
		root.getChildren().add(pswUser);
		root.getChildren().add(btn);
		root.getChildren().add(imaUser);
		root.getChildren().add(imaPass);

		root.setStyle("-fx-background-color: dodgerblue;");
		Scene scene = new Scene(root, 500, 550);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Login");
		primaryStage.show();

		// Accion del boton de login
		btn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {

				// Validacion de los Usuarios y sus contraseñas
				List<Usuarios_Password> result = user_pass.getUsuarios_Password(txtUser.getText(), pswUser.getText());
				for (Usuarios_Password msg : result) 
				{
					if (msg.getUsuario().equals(txtUser.getText()) && msg.getPassword().equals(pswUser.getText())) 
					{
						if (txtUser.getText().equals("Usuario1") && pswUser.getText().equals("123")) 
						{
							Escenario escen = new Escenario(primaryStage);
							escen.getClass();
							primaryStage.hide();

						}
						if (txtUser.getText().equals("Usuario2") && pswUser.getText().equals("456")) 
						{
							Escenario2 escen2 = new Escenario2(primaryStage);
							escen2.getClass();
							primaryStage.hide();

						}

					}
				}
			}
		});

	}

	public static void main(String[] args) {
		launch(args);
	}
}
