package com.guhe.two;

import java.util.ArrayList;
import java.util.List;

/**
 * @author njl
 * @date 2023/1/17
 */
public class Employees implements Cloneable {
	private List<String> empList;

	public Employees() {
		empList = new ArrayList<>();
	}

	public Employees(List<String> empList) {
		this.empList = empList;
	}

	public void loadData() {
		// read all employees from database and put into the list
		empList.add("Pankaj");
		empList.add("Raj");
		empList.add("David");
		empList.add("Lisa");
	}

	public List<String> getEmpList() {
		return empList;
	}

	@Override
	public Employees clone() {
		// the default behavior of Object.clone() is implemented with shallow copy.
		// empList.forEach(clonedEmpList::add);
		// empList.forEach(emp -> clonedEmpList.add(emp));
//		for (String emp : empList) {
//			clonedEmpList.add(emp);
//		}
		List<String> clonedEmpList = new ArrayList<>(empList);
		// TODO: copy mutable state here, so the clone can't change the internals of the original
		return new Employees(clonedEmpList);
	}
}
