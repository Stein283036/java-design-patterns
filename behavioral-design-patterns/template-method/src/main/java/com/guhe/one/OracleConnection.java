package com.guhe.one;

/**
 * @author njl
 * @date 2023/2/10
 */
public class OracleConnection extends JdbcDriverTemplate implements Connection {

	@Override
	protected void readConfigFile() {
		System.out.println("OracleConnection readConfigFile");
	}

	@Override
	protected void setConnProp() {
		System.out.println("OracleConnection setConnProp");
	}

	@Override
	protected Connection getConn0() {
		return new OracleConnection();
	}
}
