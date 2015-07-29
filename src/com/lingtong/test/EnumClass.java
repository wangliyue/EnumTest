package com.lingtong.test;

enum Shrubbery{
	GROUND,CRAWLING,HANGING;
}

public class EnumClass {
     
	public static void main(String[] args) {
		for(Shrubbery s : Shrubbery.values()){
			
			System.out.println(s + " ordinal: " +s.ordinal());
			System.out.println(s.compareTo(Shrubbery.CRAWLING));
			System.out.println(s.equals(Shrubbery.CRAWLING) );
			System.out.println(s == Shrubbery.CRAWLING);
			System.out.println(s.getDeclaringClass());
			System.out.println(s.name());
			System.out.println("---------------------------------");
		}
		//Produce an enum value from a string name;
		for(String s : "HANGING CRAWLING GROUND HHH".split(" ")){
			Shrubbery shrub = Enum.valueOf(Shrubbery.class, s);     //根据指定的名字 返回得到的枚举实例
			System.out.println(shrub);
		}
	}
}
