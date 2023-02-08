package com.guhe.one;

/**
 * @author njl
 * @date 2023/2/8
 */
public class Company {
	private Long id;
	private String name;

	private String account;

	private String taxCode;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getTaxCode() {
		return taxCode;
	}

	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Company{" +
				"id=" + id +
				", name='" + name + '\'' +
				", account='" + account + '\'' +
				", taxCode='" + taxCode + '\'' +
				'}';
	}
}
