package com.services;

import com.db.dao.UserRepository;
import model.entities.Role;
import model.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Robert on 2015-11-04.
 */
@Service
public class ServiceUser implements UserDetailsService{

    @Autowired
    private UserRepository userRepository;

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @Transactional
    public void addUser(User user) {
        userRepository.saveAndFlush(user);
    }

    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(final String s) throws UsernameNotFoundException {
        model.entities.User user = userRepository.findUserByName(s);

        List<GrantedAuthority> authorities =
                buildUserAuthority(user.getRoles());

        return buildUserForAuthentication(user, authorities);
    }

    private org.springframework.security.core.userdetails.User buildUserForAuthentication(model.entities.User user,
        List<GrantedAuthority> authorities){
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), user.isEnabled(), true, true, true, authorities);
    }

    private List<GrantedAuthority> buildUserAuthority(Set<Role> userRoles){
        Set<GrantedAuthority> setAuths = new HashSet<GrantedAuthority>();

        for(Role userRole : userRoles){
            setAuths.add(new SimpleGrantedAuthority(userRole.getRole()));
        }

        List<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>(setAuths);
        return grantedAuthorities;
    }


}
