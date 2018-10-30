package br.ufg.inf.invscp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoUtil {

    private static ConexaoUtil conexaoUtil;

    public  static ConexaoUtil getInstance() {
        if (conexaoUtil == null) {
            conexaoUtil = new ConexaoUtil();
        }
        return  conexaoUtil;
    }

    public Connection getConnection() throws ClassNotFoundException, SQLException {
//        Class.forName("com.mysql.jdbc.Driver");
//        return DriverManager.getConnection("jdbc:mysql://sql173.main-hosting.eu/u613749268_invsc?user=u613749268_grupo&password=grupo4321");

        try{

            String url = "jdbc:mysql://sql173.main-hosting.eu/u613749268_invsc";

            String usuario = "u613749268_grupo";

            String senha = "grupo4321";

            Connection conexao = DriverManager.getConnection(url, usuario, senha);

            return conexao;

        }catch(SQLException sqle){

            sqle.printStackTrace();

        }

        return null;

    }

    public static void main(String[] args) {
        ConexaoUtil conexaoUtil = new ConexaoUtil();
        try {
            Connection connection = conexaoUtil.getConnection();
            boolean reachable = connection.isValid(10);
            if (reachable) {
                System.out.printf("1");
            } else {
                System.out.printf("0");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}


