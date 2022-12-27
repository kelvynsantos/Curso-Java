package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class newPessoa {
    public static void main(String[] args) throws SQLException {
        Scanner input = new Scanner(System.in);
        Connection conexao = Conexoes.getConexao();
        System.out.println("Informe o nome:");
        String nome = input.next();
        String sql = "INSERT INTO pessoas (nome) VALUES(?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1,nome);
        stmt.execute();
        System.out.println("confirmed");
        input.close();
    }
}
