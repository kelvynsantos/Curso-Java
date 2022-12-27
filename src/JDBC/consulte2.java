package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class consulte2 {
    public static void main(String[] args) throws SQLException {
        Scanner input = new Scanner(System.in);
        Connection conexao = Conexoes.getConexao();
        String sql = "SELECT * FROM pessoas WHERE nome like ?";
        System.out.println("Informe o valor para pesquisa");
        String pesquisa = input.nextLine();

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1,"%"+ pesquisa +"%");
        ResultSet result = stmt.executeQuery();

        List<person> pessoas = new ArrayList<>();
        while(result.next()){
            int codigo = result.getInt("codigo");
            String nome = result.getString("nome");
            pessoas.add(new person(codigo,nome));
        }
        for (person p: pessoas) {
            System.out.println(p.getCodigo()+"===>"+ p.getNome());
        }
        stmt.close();
        conexao.close();
        input.close();
    }
}
