package javax.sql;
public interface ConnectionPoolDataSource
{
public abstract  int getLoginTimeout() throws java.sql.SQLException;
public abstract  java.io.PrintWriter getLogWriter() throws java.sql.SQLException;
public abstract  javax.sql.PooledConnection getPooledConnection() throws java.sql.SQLException;
public abstract  javax.sql.PooledConnection getPooledConnection(java.lang.String theUser, java.lang.String thePassword) throws java.sql.SQLException;
public abstract  void setLoginTimeout(int theTimeout) throws java.sql.SQLException;
public abstract  void setLogWriter(java.io.PrintWriter theWriter) throws java.sql.SQLException;
}
