package JDBC;

import java.sql.*;
import java.util.Scanner;

public class exclude {
    public static void main(String[] args) throws SQLException {
        Scanner input = new Scanner(System.in);
        Connection conexao = Conexoes.getConexao();
        System.out.println("Informe o código");
        int codigo = input.nextInt();
        String sql = "DELETE FROM pessoas WHERE codigo = ? ";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1,codigo);

        if (stmt.executeUpdate() > 0) {
            System.out.println("Pessoa excluida com sucesso");
        }else {
            System.out.println("Exclusão não realizada");
        }
        conexao.close();
        input.close();
    }
}
