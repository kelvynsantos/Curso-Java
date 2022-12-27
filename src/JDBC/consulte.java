package JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class consulte {

    public static void main(String[] args) throws SQLException {

        Connection conexao = Conexoes.getConexao();
        String sql = "SELECT * FROM  pessoas";
        Statement stmt = conexao.createStatement();
         ResultSet result = stmt.executeQuery(sql);

        List<person> pessoas = new ArrayList<>();

        while (result.next()) {
            int codigo = result.getInt("Codigo");
            String nome = result.getString("nome");
            pessoas.add(new person(codigo, nome));
        }
        for (person p : pessoas) {
            System.out.println(p.getCodigo()+"==>" + p.getNome());
        }
        stmt.close();
        conexao.close();
    }
}
