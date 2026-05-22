module joao.projetos.geradordesenhasjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens joao.projetos.geradordesenhasjavafx to javafx.fxml;
    exports joao.projetos.geradordesenhasjavafx;
}