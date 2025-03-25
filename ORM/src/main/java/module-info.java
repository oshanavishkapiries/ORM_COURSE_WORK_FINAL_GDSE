module com.org.orm {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.hibernate.orm.core;
    requires static lombok;
    requires jakarta.persistence;
    requires java.naming;
    requires modelmapper;
    requires bcrypt;
    requires java.desktop;
    opens com.org.orm.entity to org.hibernate.orm.core;
    opens com.org.orm.config to jakarta.persistence;


    opens com.org.orm.controller to javafx.fxml;
    exports com.org.orm;
}