package com.lingtong.test;

import java.util.Random;

enum Activity{
	SITTING,LYING,STANDING,HOPPING,RUNNING,DODGING,JUMPING,FALLING,FLYING;
}
/**
 * 随机获取枚举类中的一个枚举实例
 * @author wly
 *
 */
public class Enums {
   
	private static Random rand = new Random(47);
	
	public static <T extends Enum<T>> T random(Class<T> ec){
		return random(ec.getEnumConstants());
	}
	
	public static <T> T random(T[] values){
		return values[rand.nextInt(values.length)];
	}
	
	
	public static void main(String[] args) {
		
		for(int i = 0;i <= 20 ; i++){
			System.out.println(Enums.random(Activity.class));
		}
		
	}
}
