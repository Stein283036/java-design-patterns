package com.guhe.one;

/**
 * @author njl
 * @date 2023/2/8
 */
public class App {
	public static void main(String[] args) {
		FacadeForCompany facadeForCompany = new FacadeForCompany();
		Company microsoft = facadeForCompany.createCompany("Microsoft");
		System.out.println("microsoft = " + microsoft);
	}
}
