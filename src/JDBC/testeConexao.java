package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class testeConexao {
    public static void main(String[] args) throws SQLException {
//        String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
//        String user = "root";
//        final String senha = "Phmkfxop15!";
//
//        Connection conexao = DriverManager.getConnection(url, user, senha);
        Connection conexao = Conexoes.getConexao();

        Statement stmt = conexao.createStatement();
        stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");
//        stmt.execute("DROP DATABASE IF EXISTS curso-java");

        System.out.println("connected");
        conexao.close();
    }
}
