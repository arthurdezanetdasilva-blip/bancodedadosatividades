package dal;

import java.sql.*;

public class Mod_conexao {
    public static Connection conector() {
        java.sql.Connection conexao = null;
        // ATENÇÃO: O nome do banco aqui deve ser o mesmo que você criou no passo 1
        String url = "jdbc:mysql://localhost:3306/banco_de_dados_java"; 
        String user = "root"; // Seu usuário do MySQL
        String password = ""; // Sua senha do MySQL (geralmente vazia ou 'root')

        try {
            // Carrega o driver do MySQL
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            // Se der erro, mostra no console
            System.out.println("Erro na conexão: " + e.getMessage());
            return null;
        }
    }
}