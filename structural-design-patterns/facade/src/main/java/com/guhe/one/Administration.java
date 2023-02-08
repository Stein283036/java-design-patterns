package com.guhe.one;

/**
 * @author njl
 * @date 2023/2/8
 */
public class Administration {
	private Company company = new Company();

	public Company register(String name) {
		System.out.println("register company for " + name);
		company.setName(name);
		company.setId(1L);
		return company;
	}
}
