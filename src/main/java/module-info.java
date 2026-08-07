module utng.gtid323.adla {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens utng.gtid323.adla to javafx.fxml;
    exports utng.gtid323.adla;
}