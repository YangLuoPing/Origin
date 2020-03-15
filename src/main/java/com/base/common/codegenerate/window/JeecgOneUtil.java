//
// Source code recreated from dataType .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.base.common.codegenerate.window;

import com.base.common.codegenerate.generate.impl.CodeGenerateOne;
import com.base.common.codegenerate.generate.pojo.TableVo;

public class JeecgOneUtil {
	public JeecgOneUtil() {
	}

	public static void main(String[] args) {
		TableVo var1 = new TableVo();
		var1.setEntityName("Dsemo");
		var1.setEntityPackage("test");
		var1.setFtlDescription("测试表");
		var1.setTableName("demo");

		try {
			String var2 = "E:\\111";
			String var3 = "/codegenerte/code-template-online/";
			(new CodeGenerateOne(var1)).generateCodeFile(var2, var3, "one");
		} catch (Exception var4) {
			var4.printStackTrace();
		}

	}
}
