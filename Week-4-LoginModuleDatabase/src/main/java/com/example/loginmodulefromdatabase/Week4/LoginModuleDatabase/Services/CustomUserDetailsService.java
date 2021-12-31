package com.example.loginmodulefromdatabase.Week4.LoginModuleDatabase.Services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.loginmodulefromdatabase.Week4.LoginModuleDatabase.Entitys.CompanyUser;
import com.example.loginmodulefromdatabase.Week4.LoginModuleDatabase.Repositories.UserRepository;


@Service
public class CustomUserDetailsService implements UserDetailsService {
	@Autowired
    private UserRepository userRepo;

	@Override
    public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        CompanyUser user = userRepo.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return new CustomUserDetails(user);
    }

	
}	
