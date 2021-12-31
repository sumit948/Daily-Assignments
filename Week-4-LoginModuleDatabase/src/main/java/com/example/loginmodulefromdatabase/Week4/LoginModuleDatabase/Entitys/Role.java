package com.example.loginmodulefromdatabase.Week4.LoginModuleDatabase.Entitys;

import javax.persistence.Embeddable;

@Embeddable
public enum Role {
	 ROLE_ADMIN,   /// constants
	    ROLE_USER,ADMIN , CANDIDATE , ASSIGNER;

	    public Role getRole() {
	        return ROLE_ADMIN;
	    }
}

class SamepleProgram{
    public static void main(String[] a) {
        Role r= Role.valueOf("ADMIN");
        System.out.println(r);
    }
}
