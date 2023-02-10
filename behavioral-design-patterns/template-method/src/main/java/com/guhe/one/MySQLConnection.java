package com.guhe.one;

/**
 * @author njl
 * @date 2023/2/10
 */
public class MySQLConnection extends JdbcDriverTemplate implements Connection {

	@Override
	protected void readConfigFile() {
		System.out.println("MySQLConnection readConfigFile");
	}

	@Override
	protected void setConnProp() {
		System.out.println("MySQLConnection setConnProp");
	}

	@Override
	protected Connection getConn0() {
		return new MySQLConnection();
	}
}
