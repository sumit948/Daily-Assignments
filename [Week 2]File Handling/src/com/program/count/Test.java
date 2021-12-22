package com.program.count;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		FileReader f = new FileReader("C:\\Users\\sumit\\eclipse(Enterprise&Web)-workspace\\File Handling\\src\\Untitled.txt");
        int l,w,ch;
        l=w=ch=0;
        int c;
        while((c=f.read())!=-1)
        {    if(c==' ')
                w++;
            else if(c=='\n')
            {    l++; w++;
            }
            else
                ch++;
        }
        System.out.println("Lines: "+l+" Words:"+w+"  Characters:"+ch);
	}

}
