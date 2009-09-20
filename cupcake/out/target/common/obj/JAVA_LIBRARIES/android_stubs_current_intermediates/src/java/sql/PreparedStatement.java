package java.sql;
public interface PreparedStatement
  extends java.sql.Statement
{
public abstract  void addBatch() throws java.sql.SQLException;
public abstract  void clearParameters() throws java.sql.SQLException;
public abstract  boolean execute() throws java.sql.SQLException;
public abstract  java.sql.ResultSet executeQuery() throws java.sql.SQLException;
public abstract  int executeUpdate() throws java.sql.SQLException;
public abstract  java.sql.ResultSetMetaData getMetaData() throws java.sql.SQLException;
public abstract  java.sql.ParameterMetaData getParameterMetaData() throws java.sql.SQLException;
public abstract  void setArray(int parameterIndex, java.sql.Array theArray) throws java.sql.SQLException;
public abstract  void setAsciiStream(int parameterIndex, java.io.InputStream theInputStream, int length) throws java.sql.SQLException;
public abstract  void setBigDecimal(int parameterIndex, java.math.BigDecimal theBigDecimal) throws java.sql.SQLException;
public abstract  void setBinaryStream(int parameterIndex, java.io.InputStream theInputStream, int length) throws java.sql.SQLException;
public abstract  void setBlob(int parameterIndex, java.sql.Blob theBlob) throws java.sql.SQLException;
public abstract  void setBoolean(int parameterIndex, boolean theBoolean) throws java.sql.SQLException;
public abstract  void setByte(int parameterIndex, byte theByte) throws java.sql.SQLException;
public abstract  void setBytes(int parameterIndex, byte[] theBytes) throws java.sql.SQLException;
public abstract  void setCharacterStream(int parameterIndex, java.io.Reader reader, int length) throws java.sql.SQLException;
public abstract  void setClob(int parameterIndex, java.sql.Clob theClob) throws java.sql.SQLException;
public abstract  void setDate(int parameterIndex, java.sql.Date theDate) throws java.sql.SQLException;
public abstract  void setDate(int parameterIndex, java.sql.Date theDate, java.util.Calendar cal) throws java.sql.SQLException;
public abstract  void setDouble(int parameterIndex, double theDouble) throws java.sql.SQLException;
public abstract  void setFloat(int parameterIndex, float theFloat) throws java.sql.SQLException;
public abstract  void setInt(int parameterIndex, int theInt) throws java.sql.SQLException;
public abstract  void setLong(int parameterIndex, long theLong) throws java.sql.SQLException;
public abstract  void setNull(int parameterIndex, int sqlType) throws java.sql.SQLException;
public abstract  void setNull(int paramIndex, int sqlType, java.lang.String typeName) throws java.sql.SQLException;
public abstract  void setObject(int parameterIndex, java.lang.Object theObject) throws java.sql.SQLException;
public abstract  void setObject(int parameterIndex, java.lang.Object theObject, int targetSqlType) throws java.sql.SQLException;
public abstract  void setObject(int parameterIndex, java.lang.Object theObject, int targetSqlType, int scale) throws java.sql.SQLException;
public abstract  void setRef(int parameterIndex, java.sql.Ref theRef) throws java.sql.SQLException;
public abstract  void setShort(int parameterIndex, short theShort) throws java.sql.SQLException;
public abstract  void setString(int parameterIndex, java.lang.String theString) throws java.sql.SQLException;
public abstract  void setTime(int parameterIndex, java.sql.Time theTime) throws java.sql.SQLException;
public abstract  void setTime(int parameterIndex, java.sql.Time theTime, java.util.Calendar cal) throws java.sql.SQLException;
public abstract  void setTimestamp(int parameterIndex, java.sql.Timestamp theTimestamp) throws java.sql.SQLException;
public abstract  void setTimestamp(int parameterIndex, java.sql.Timestamp theTimestamp, java.util.Calendar cal) throws java.sql.SQLException;
public abstract  void setUnicodeStream(int parameterIndex, java.io.InputStream theInputStream, int length) throws java.sql.SQLException;
public abstract  void setURL(int parameterIndex, java.net.URL theURL) throws java.sql.SQLException;
}