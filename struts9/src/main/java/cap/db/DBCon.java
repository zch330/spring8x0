package cap.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBCon {
    private String dirver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/cap";
    private String username = "root";
    private String password ="12456";
    private Connection connection;

    public Connection getConnection() {
        try{
            Class.forName(dirver);
            connection = DriverManager.getConnection(url,username,password);
        }catch (Exception e){
            e.printStackTrace();
        }
        return connection;
    }

    public ResultSet doQuery(String sql,Object[] params){
        ResultSet resultSet = null;
        connection = this.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            for(int i = 0; i< params.length;i++){
                preparedStatement.setObject(i + 1,params[i]);
            }
            resultSet = preparedStatement.executeQuery();
        }catch (Exception e){
            e.printStackTrace();
        }
        return resultSet;
    }

    public int doUpdate(String sql,Object[] params){
        int result = -1;
        connection = this.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            for(int i = 0; i< params.length;i++){
                preparedStatement.setObject(i + 1,params[i]);
            }
            result = preparedStatement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    public  void close(){
        try {
            if(connection != null)
                connection.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
