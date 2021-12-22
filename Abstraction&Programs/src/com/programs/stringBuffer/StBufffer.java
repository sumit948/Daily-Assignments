package com.programs.stringBuffer;

public class StBufffer {

	public static void main(String[] args) {
		
		StringBuffer s=new StringBuffer("nohJ"); 
		System.out.println(s.reverse());
		
		StringBuffer s1,s2,s3;
        s1=new StringBuffer(100);  //initially 16
        s2=new StringBuffer ("I LOVE MY INDIA");
        s3=new StringBuffer(50);
        System.out.println(s1.capacity());
        System.out.println(s2.capacity());
        System.out.println(s3.capacity());
        System.out.println(s1.capacity()+s2.capacity()+s3.capacity());
        
        
        
        String s4=new String("JHONWEAKBOOGYMAN");
        StringBuffer stb = new StringBuffer(s4);
        stb.reverse();
        System.out.println("Reverse is:"+stb);
        System.out.println("capacity is:"+stb.capacity());
        System.out.println("character at:"+stb.charAt(3));
        System.out.println("delete 2,4:"+stb.delete(2,4));
        System.out.println("delete char at:"+stb.deleteCharAt(3));
        System.out.println("Insert at:"+stb.insert(2,'o'));
             System.out.println("replace:"+stb.replace(2,3,"sr"));
	}

}
