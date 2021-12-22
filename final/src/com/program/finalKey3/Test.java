package com.program.finalKey3;

public class Test {

	public static void main(String[] args) {
		final int MONDAY = 1;
        final int TUESDAY = 2;
        final int WEDNESDAY = 3;
        final int THURSDAY = 4;
        final int FRIDAY = 5;
        final int SATURDAY = 6;
        final int SUNDAY = 7;
        boolean isHoliday = true;
        int today = SUNDAY;   
        if((today==MONDAY||today==WEDNESDAY||today==FRIDAY)&&!isHoliday)
        {    System.out.println("Iam teaching today");
        }
        else
        {    System.out.println("Iam not teaching today");
        }
	}

}
