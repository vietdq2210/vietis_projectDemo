package com.vietis.vietis_projectdemo.security;

import com.vietis.vietis_projectdemo.models.entities.User;
import com.vietis.vietis_projectdemo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserDetailsService {
    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("Khong tim thay user voi username: " + username));

        List<User> roleUser = userRepository.findRoleByUsername(username);
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        if(roleUser!=null){
                for(User role : roleUser){
                    GrantedAuthority authority = new SimpleGrantedAuthority(role.getRole().getRole());
                    grantedAuthorities.add(authority);
                }
        }
        System.out.println("Authorities: " +grantedAuthorities);

        return new CustomUser
    }
}
