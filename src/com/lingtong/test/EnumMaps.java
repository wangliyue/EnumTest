package com.lingtong.test;

import java.util.EnumMap;
import java.util.Map;

interface Command {
	void action();
}
/**
 * EnumMap   
 * @author wly
 *
 */
public class EnumMaps {
   
	public static void main(String[] args) {
		EnumMap<AlarmPoints, Command> em = new EnumMap<AlarmPoints, Command>(AlarmPoints.class);
		
		em.put(AlarmPoints.KITCHEN, new Command() {
			
			@Override
			public void action() {
				System.out.println("Kitchen fire!");
			}
		});
		
		em.put(AlarmPoints.BATHROOM, new Command() {
			
			@Override
			public void action() {
				System.out.println("Bathroom alert!");
			}
		});
		
		for(Map.Entry<AlarmPoints, Command>  e : em.entrySet()){
			System.out.println(e.getKey()+":");
			e.getValue().action();
		}
	}
}
