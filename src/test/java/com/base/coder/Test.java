package com.base.coder;

public class Test {
	@org.junit.Test
	public void name() {
		this.getClass().getResource("application.yml").getFile();
	}

	@org.junit.Test
	public void test() {
		String str1 = "/aa/aabbbcccaa/";
		String str2 = "/";
		boolean flag = true;
		boolean flag1 = true;

		do {
			int index = str1.indexOf(str2) == 0 ? 1 : 0;
			int index2 = str1.lastIndexOf(str2) + 1 == str1.length() ? str1.lastIndexOf(str2) : str1.length();
			str1 = str1.substring(index, index2);
			flag = str1.indexOf(str2) == 0;
			flag1 = str1.lastIndexOf(str2) + 1 == str1.length();
		} while (flag || flag1);

		System.out.println(str1);

	}
}
