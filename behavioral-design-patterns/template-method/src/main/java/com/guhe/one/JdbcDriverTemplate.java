package com.guhe.one;

/**
 * @author njl
 * @date 2023/2/10
 */
public abstract class JdbcDriverTemplate {
	public Connection getConn() {
		readConfigFile();
		setConnProp();
		return getConn0();
	}

	protected abstract void readConfigFile();

	protected abstract void setConnProp();

	protected abstract Connection getConn0();
}
