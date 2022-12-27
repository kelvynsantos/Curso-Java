package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class update {
    public static void main(String[] args) throws SQLException {
        Scanner input = new Scanner(System.in);
        Connection conexao = Conexoes.getConexao();

        System.out.println("Informe o código da pessoa:");
        int codigo = input.nextInt();

        String sql = "SELECT codigo, nome FROM pessoas WHERE codigo = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1,codigo);
        ResultSet r = stmt.executeQuery();

        if (r.next()){
            person p = new person(r.getInt(1),r.getString(2));
            System.out.println("O nome atual é " + p.getNome());
            input.nextLine();
            System.out.println("Informe novo nome:");
            String newName = input.nextLine();
            stmt.close();

            String update = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
            stmt = conexao.prepareStatement(update);
            stmt.setString(1,newName);
            stmt.setInt(2,codigo);
            stmt.execute();
            System.out.println("Alterado!");
        }
        conexao.close();
        input.close();
    }
}
