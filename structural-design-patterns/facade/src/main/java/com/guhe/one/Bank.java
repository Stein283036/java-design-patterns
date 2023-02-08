package com.guhe.one;

/**
 * @author njl
 * @date 2023/2/8
 */
public class Bank {
	private Company company;

	public Company openAccount(Company company) {
		company.setAccount("account WANBigDecimal1234 for " + company.getName());
		return company;
	}
}
