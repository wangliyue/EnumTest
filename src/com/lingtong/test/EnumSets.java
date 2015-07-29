package com.lingtong.test;

import java.util.EnumSet;

enum AlarmPoints{
	STAIR1,STAIR2,LOBBY,OFFICE1,OFFICE2,OFFICE3,
	OFFICE4,BATHROOM,UTILITY,KITCHEN
}
/**
 * 专门为Enum的 EnumSet
 * @author wly
 *
 */
public class EnumSets {
    public static void main(String[] args) {
		EnumSet<AlarmPoints> points= EnumSet.noneOf(AlarmPoints.class);
    	
		points.add(AlarmPoints.BATHROOM);
		System.out.println(points);
		
		points.addAll(EnumSet.of(AlarmPoints.STAIR1,AlarmPoints.STAIR2,AlarmPoints.KITCHEN));
		System.out.println(points);
		
		points = EnumSet.allOf(AlarmPoints.class);
		System.out.println(points);
		
		points.removeAll(EnumSet.of(AlarmPoints.STAIR1,AlarmPoints.STAIR2,AlarmPoints.KITCHEN));
		System.out.println(points);
		
		points.removeAll(EnumSet.range(AlarmPoints.OFFICE1,AlarmPoints.OFFICE4));
		System.out.println(points);
		
		points = EnumSet.complementOf(points);
		System.out.println(points);
		
	}
}
