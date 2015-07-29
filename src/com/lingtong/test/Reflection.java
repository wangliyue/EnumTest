package com.lingtong.test;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.TreeSet;

/**
 * values()的神秘之处 ：   
 * 编译器为你创建的enum类都继承自Enum类 ，然而Enum类并没有values()方法
 * 可以我们明明可以通过 Explore.values()来得到枚举实例数组   
 * @author wly
 *
 */
enum Explore{
	HERE,THERE;
}
public class Reflection {
   
	public static Set<String> analyze(Class<?> enumClass){
		System.out.println("--------Analyzing "+enumClass+" -------");
		System.out.println("Interfaces:");
		for(Type t:enumClass.getGenericInterfaces()){
			System.out.println(t);
		}
		
		System.out.println("Base: " +enumClass.getSuperclass());
		
		System.out.println("Method:");
		Set<String> methods = new TreeSet<String>();
		for(Method m :enumClass.getMethods()){
		   methods.add(m.getName());
		}
		System.out.println(methods);
		return methods;
	}
	
	public static void main(String[] args) {
		Set<String> exploreMethods = analyze(Explore.class);
		Set<String> enumMethods = analyze(Enum.class);
		
		System.out.println("--------------------------------");
		System.out.println("Explore.containAll(enumMethods)?"+exploreMethods.containsAll(enumMethods));
		
		System.out.println("Explore.removeAll(enumMethods)?"+exploreMethods.removeAll(enumMethods));
		
		System.out.println(exploreMethods);
	}
}
