package infra.datasource;

import java.sql.Connection;

public abstract interface DataSource {
	public DataSource getInstace();
	public Connection getConnection();
}
