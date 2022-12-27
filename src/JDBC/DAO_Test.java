package JDBC;

public class DAO_Test {
    public static void main(String[] args) {
        DAO dao = new DAO();
        String sql = "INSERT INTO pessoas (nome) VALUES (?)";
//        dao.incluir(sql,"João Batista de Oliveira");
//        dao.incluir(sql,"Fátima Bezerra");

//        dao.incluir(sql,"Maria Neuza dos SantOS", 33);
//        System.out.println(dao.incluir(sql,"Fátima Bezerra"));
        dao.close();
    }
}