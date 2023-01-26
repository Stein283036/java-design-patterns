package com.guhe.two;

import org.junit.Test;

import java.util.List;

/**
 * @author njl
 * @date 2023/1/17
 */
public class PrototypePatternTest {
	@Test
	public void testClone() {
		Employees emps = new Employees();
		emps.loadData();

		Employees empsCopy1 = emps.clone();
		Employees empsCopy2 = emps.clone();

		List<String> list1 = empsCopy1.getEmpList();
		list1.add("John");
		List<String> list2 = empsCopy2.getEmpList();
		list2.remove("Pankaj");

		System.out.println("emps List: " + emps.getEmpList());
		System.out.println("empsNew List: " + list2);
		System.out.println("empsNew1 List: " + list2);

	}
}
