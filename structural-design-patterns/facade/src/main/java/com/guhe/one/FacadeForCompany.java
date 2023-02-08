package com.guhe.one;

/**
 * @author njl
 * @date 2023/2/8
 */
// 创建公司的步骤很复杂 因此客户端只与这个创建公司门面打交道 告诉它(declarative)我要一个创建好的公司 它就会帮助我们隐藏了创建公司流程的复杂性
// 通过关联创建公司所需要的其它对象将创建公司的责任委托给它们 所以它看起来像个中介 这里也可以考虑使用装饰者模式改写 对创建公司的各个阶段进行
// 行为增强
public class FacadeForCompany {
	// 下面这些对象的创建可以根据创建公司的场景不同 比如省份/政策/注册资本/规模/业务范围/类型等 可以使用简单工厂或者抽象工厂来获取不同的工商局/银行/纳税局
	private Administration administration = new Administration();
	private Bank bank = new Bank();
	private Taxation taxation = new Taxation();

	public Company createCompany(String name) {
		return taxation.applyTaxCode(bank.openAccount(administration.register(name))); // 这段代码可以考虑装饰者
	}
}
