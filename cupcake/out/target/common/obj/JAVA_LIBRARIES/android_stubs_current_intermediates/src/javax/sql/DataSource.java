package javax.sql;
public interface DataSource
{
public abstract  java.sql.Connection getConnection() throws java.sql.SQLException;
public abstract  java.sql.Connection getConnection(java.lang.String theUsername, java.lang.String thePassword) throws java.sql.SQLException;
public abstract  int getLoginTimeout() throws java.sql.SQLException;
public abstract  java.io.PrintWriter getLogWriter() throws java.sql.SQLException;
public abstract  void setLoginTimeout(int theTimeout) throws java.sql.SQLException;
public abstract  void setLogWriter(java.io.PrintWriter theWriter) throws java.sql.SQLException;
}
