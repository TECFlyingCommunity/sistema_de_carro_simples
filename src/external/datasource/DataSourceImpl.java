package external.datasource;

import java.sql.Connection;
import java.sql.DriverManager;


public class DataSourceImpl  {

	private static DataSourceImpl instance = null;
	
	private Connection con = null;
	
	private DataSourceImpl(){
	
	}
	
	public static DataSourceImpl getInstace() {
		if(instance == null) {
			instance= new DataSourceImpl();
		}
		return instance;
		
	}
	

	public Connection getConnection() {
		if(this.con == null) {
			String url ="jdbc:mysql://localhost:3306/aluguel_de_carro?useTimezone=true&serverTimezone=UTC";
			String user = "root";
			String senha = "1234";
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				this.con = DriverManager.getConnection(url,user,senha);
				System.out.println("Conexão realizada");
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return this.con;
	}
	

}


