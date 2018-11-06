package br.ufg.inf.invscp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static ConnectionFactory connectionFactory;

    public  static ConnectionFactory getInstance() {
        if (connectionFactory == null) {
            connectionFactory = new ConnectionFactory();
        }
        return connectionFactory;
    }

    public Connection getConnection() throws ClassNotFoundException, SQLException {

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
        ConnectionFactory connectionFactory = new ConnectionFactory();
        try {
            Connection connection = connectionFactory.getConnection();
            boolean reachable = connection.isValid(10);
            if (reachable) {
                System.out.printf("1");
            } else {
                System.out.printf("0");
            }
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}


