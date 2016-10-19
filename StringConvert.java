/**
* @developer： WangY
* @时间：2016年10月19日 下午3:14:03
* @项目名：demo
*  高弗特 goFirst
*/
package com.goFirst.demo;

public class StringConvert {

	public static void main(String[] args) {
		///字符串中只能是数字
		int intDemo = Integer.parseInt("123");
		System.out.println(intDemo);
		
		String stringDemo = intDemo + "";
		
		///转化字符不是true全部为false
		boolean booleanFlag = Boolean.parseBoolean("true");
		System.out.println(booleanFlag);
		if (!booleanFlag) {
			System.out.println("abc");
		}
		
		////short 转化
		short shortDemo = Short.parseShort("12");
		System.out.println(shortDemo);
		
	}

}

