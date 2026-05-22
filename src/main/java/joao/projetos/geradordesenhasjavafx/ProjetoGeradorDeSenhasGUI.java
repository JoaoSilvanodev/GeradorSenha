package joao.projetos.geradordesenhasjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Insets;

import java.io.IOException;


public class ProjetoGeradorDeSenhasGUI extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Gerador de Senhas");

        Label labelTamanhoSenha = new Label("Tamanho da Senha:");
        TextField campoTamanhoSenha = new TextField();
        campoTamanhoSenha.setText("8");

        Label labelSenhaGerada = new Label("Senha Gerada:");
        TextField campoSenhaGerada = new TextField();
        campoSenhaGerada.setEditable(false);
        campoSenhaGerada.setStyle("-fx-text-fill: cyan; -fx-background-color: black;");

        Button botaoGerar = new Button("Gerar Senha");
        botaoGerar.setOnAction(e -> {
            try {
                int tamanhoSenha = Integer.parseInt(campoTamanhoSenha.getText());
                String senhaGerada = GeradorDeSenhas.gerarSenha(tamanhoSenha);
                campoSenhaGerada.setText(senhaGerada);
            } catch (NumberFormatException ex) {
                campoSenhaGerada.setText("Erro: Digite um número válido!");
            }
        });

        VBox vbox = new VBox(10, labelTamanhoSenha, campoTamanhoSenha, botaoGerar, labelSenhaGerada, campoSenhaGerada);
        vbox.setPadding(new Insets(20));
        vbox.setSpacing(10);

        Scene scene = new Scene(vbox, 400, 250);
        stage.setScene(scene);
        stage.show();
    }

}
