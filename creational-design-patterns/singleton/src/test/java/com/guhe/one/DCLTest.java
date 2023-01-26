package com.guhe.one;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author njl
 * @date 2023/1/17
 */
public class DCLTest {
	@Test
	public void testGetInstance() {
		DCLSingleton instance1 = DCLSingleton.getInstance();
		DCLSingleton instance2 = DCLSingleton.getInstance();
		Assert.assertEquals(instance1, instance2);
	}
}
