package com.lingtong.test;

enum Signal{
	GREEN,YELLOW,RED;
}
/**
 * switch����е�enum
 * switch�����һ��ֻ��ʹ������ֵ  (jdk 7�п������ַ���)  ����ö��ʵ�������;߱�����ֵ�Ĵ���
 * ������switch��ʹ��ö��ֵ ����Ȼ�Ǳ�����Ϊ���ǽ������Ż�  ��ͨ��ordinal()����ȡ����ö��ֵ�Ķ������
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
