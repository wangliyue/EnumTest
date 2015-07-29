package com.lingtong.test;

enum Signal{
	GREEN,YELLOW,RED;
}
/**
 * switch语句中的enum
 * switch语句中一般只能使用整数值  (jdk 7中可以是字符串)  ，而枚举实例天生就具备整数值的次序
 * 可以在switch中使用枚举值 ，显然是编译器为我们进行了优化  ，通过ordinal()方法取得了枚举值的定义次序
 * @author wly
 *
 */
public class TrafficLight {
    Signal color = Signal.RED;
	
    public void change(){
    	switch (color) {
		case RED: color = Signal.GREEN;
			 break;
		case GREEN: color = Signal.YELLOW;
		            break;
		case YELLOW: color = Signal.RED;
		             break;
		default:
			break;
		}
    }
    
    public String toString(){
         return "The traffic light is " +color;    	
    }
	public static void main(String[] args) {
		TrafficLight t = new TrafficLight();
		for(int i = 0;i<7;i++){
			System.out.println(t);
			t.change();
		}
		
	}

}
