package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/*Validação de Dados
 * Nesta actividade vamos usar a scene criada no exercicio 8
 * para, na região central, criar textfields a ser preenchidos por texto,
 * numeros e email e onde a ação de um botão irá  validar os dados aí inseridos, atravez de métodos
 * da classe global Utils
 * 
 * Passo1: copiar a classe main do exercicio 8
 * Passo2: criar os gráficos:
 * 		-criar um set de layouts que permita dispor as seguintes
 * 			labels e respetivos textfields
 * 		-numero fiscal, nome, morada, cidade, cpostal, dt de nascimento
 * Passo3:Criar 2 botões: validar e cancelar (fecha o programa)
 * Passo4:O projeto estará disponivel em share repository
 * 
 * */

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//TOP layout
			HBox layoutTop = new HBox(10);			//CRIA O LAYOUT hBOX COM 20 PX ESPACAMENTO ENTRE OBJETOS
			layoutTop.setBackground(null); 
			layoutTop.setPadding(new Insets(15, 12, 15, 12));	//DISTANCIA DETE LAYOUT AO ROOT LAYOUT
			layoutTop.setStyle("-fx-background-color: #336699;");
			
			Button btnTopMenu1 = new Button("File");
			Button btnTopMenu2 = new Button("Edit");
			Button btnTopMenu3 = new Button("View");
			layoutTop.getChildren().addAll(btnTopMenu1, btnTopMenu2, btnTopMenu3);
			
			//leftLayout - Menu
			VBox layoutLeft = new VBox(10);
			layoutLeft.setBackground(null); 
			layoutLeft.setPadding(new Insets(15, 12, 15, 12));	//DISTANCIA DETE LAYOUT AO ROOT LAYOUT
			layoutLeft.setStyle("-fx-background-color: #336633;");
			
			
			Button btnLeftMenu1 = new Button("opção1");
			Button btnLeftMenu2 = new Button("opção2");
			Button btnLeftMenu3 = new Button("opção3");
			layoutLeft.getChildren().addAll(btnLeftMenu1, btnLeftMenu2, btnLeftMenu3);
			
			BorderPane root = new BorderPane();
			root.setTop(layoutTop);
			root.setLeft(layoutLeft);
			Scene scene = new Scene(root,400,400);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
