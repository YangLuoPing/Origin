//
// Source code recreated from dataType .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.base.common.codegenerate.window;

import com.base.common.codegenerate.generate.impl.CodeGenerateOne;
import com.base.common.codegenerate.generate.pojo.TableVo;

public class JeecgOneTest {
	public JeecgOneTest() {
	}

	public static void main(String[] args) {
		TableVo tableVo = new TableVo();
		// 表明
		tableVo.setTableName("demo");
		//序列号生成方式
		tableVo.setPrimaryKeyPolicy("uuid");
		// 实体的包名
		tableVo.setEntityPackage("demo");
		//实体名
		tableVo.setEntityName("Demo");
		// 行字段数目
		tableVo.setFieldRowNum(1);
		// 序列号 主键生成策略为sequence时，序列号不能为空！
		tableVo.setSequenceCode("");
		// 描述
		tableVo.setFtlDescription("测试");
		try {
			//工程存放位置
			String projectPath = "D:/";
			//模板位置
			String templatePath = "/codegenerte/code-template/dongan";
			// 样式
			String stylePath = "";
			//(new CodeGenerateOne(tableVo)).generateCodeFile((String) null);
			(new CodeGenerateOne(tableVo)).generateCodeFile(projectPath, templatePath, stylePath);
		} catch (Exception exc) {
			exc.printStackTrace();
		}

	}
}
