package com.guhe.one;

/**
 * @author njl
 * @date 2023/1/28
 */
public class Client {
	public static void main(String[] args) {
		Computer pc = ComputerFactory.makeComputer("PC", "2GB", "500GB", "2.4GHz");
		Computer server = ComputerFactory.makeComputer("Server", "16GB", "1TB", "2.95GHz");
		System.out.println("pc = " + pc);
		System.out.println("server = " + server);
	}
}
