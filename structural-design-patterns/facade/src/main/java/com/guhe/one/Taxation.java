package com.guhe.one;

/**
 * @author njl
 * @date 2023/2/8
 */
public class Taxation {
	private Company company;

	public Company applyTaxCode(Company company) {
		company.setTaxCode("taxCode for " + company.getName());
		return company;
	}
}
