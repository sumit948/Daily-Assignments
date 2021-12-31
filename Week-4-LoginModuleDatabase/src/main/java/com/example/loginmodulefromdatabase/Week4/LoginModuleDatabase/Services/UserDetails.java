package com.example.loginmodulefromdatabase.Week4.LoginModuleDatabase.Services;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserDetails {
	public Collection<? extends GrantedAuthority> getAuthorities();
	 
    public String getPassword();
 
    public String getUsername();
 
    public boolean isAccountNonExpired();
 
    public boolean isAccountNonLocked();
 
    public boolean isCredentialsNonExpired();
 
    public boolean isEnabled();


}
