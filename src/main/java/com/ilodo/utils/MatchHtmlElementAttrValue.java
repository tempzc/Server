package com.ilodo.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @use 获取指定HTML标签的指定属性的值
 * @Author 常学军
 * @Date 2015-12-16 下午16:27:24 </br>
 * @JDK 1.8 </br>
 * @Version 1.0 </br>
 */
public class MatchHtmlElementAttrValue {
	
	  /** 
     * 获取指定HTML标签的指定属性的值 
     * @param source 要匹配的源文本 
     * @param element 标签名称 
     * @param attr 标签的属性名称 
     * @return 属性值列表 
     */  
    public static List<String> match(String source, String element, String attr) {  
        List<String> result = new ArrayList<String>();  
        String reg = "<" + element + "[^<>]*?\\s" + attr + "=['\"]?(.*?)['\"]?\\s.*?>";  
        Matcher m = Pattern.compile(reg).matcher(source);  
        while (m.find()) {  
            String r = m.group(1);  
            result.add(r);  
        }  
        return result;  
    }

	public static List<String> match(String source, String attr,String attrValue,String attr2) {
		List<String> result = new ArrayList<String>();
		String reg = attr + "=['\"]+" + attrValue + "['\"]+\\s+" + attr2 + "=['\"]+(.*?)['\"]+";
		Matcher m = Pattern.compile(reg).matcher(source);
		while (m.find()) {
			String r = m.group(1);
			result.add(r);
		}
		return result;
	}
	
//	public static void main(String[] args) {
////		String source = "<input type=\"hidden\" name=\"state\" value=\"111\"> <input type=\"hidden\" name=\"code\" value=\"cfd2075491bc3c70197422feee9a9a1b|631568\">";
//		String source = "<a title=中国体育报 href=''>aaa</a><a title='北京日报\' href='http://www.sina.com.cn\'>bbb</a>";
//		System.out.println(source);
//		List<String> list = match(source,"title","北京日报","href");
////		List<String> list = match(source,"a","title");
//		System.out.println(list);
//	}
}