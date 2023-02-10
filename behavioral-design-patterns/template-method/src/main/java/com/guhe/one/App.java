package com.guhe.one;

/**
 * @author njl
 * @date 2023/2/10
 */
public class App {
	public static void main(String[] args) {
		// 模板方法模式使得客户端只需要与对不同类型的产品封装后的模板通信即可
		// 而不变去要了解多个产品具体如何使用
		// 模板模式定义了对这些产品的算法骨架 将算法部分功能的实现延迟到子类中
		JdbcDriverTemplate jdbcDriverTemplate1 = new MySQLConnection();
		Connection mysqlConn = jdbcDriverTemplate1.getConn();

		JdbcDriverTemplate jdbcDriverTemplate2 = new OracleConnection();
		Connection oracleConn = jdbcDriverTemplate2.getConn();
	}
}
