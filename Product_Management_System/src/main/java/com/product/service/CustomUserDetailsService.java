/*
 * package com.product.service;
 * 
 * import com.product.entity.User; import com.product.repository.userrepository;
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.security.core.userdetails.*; import
 * org.springframework.stereotype.Service;
 * 
 * import java.util.Collections;
 * 
 * @Service public class CustomUserDetailsService implements UserDetailsService
 * {
 * 
 * @Autowired private userrepository userRepository;
 * 
 * @Override public UserDetails loadUserByUsername(String username) throws
 * UsernameNotFoundException { User user = userRepository.findByEmail(username)
 * .orElseThrow(() -> new UsernameNotFoundException("User not found"));
 * 
 * return new org.springframework.security.core.userdetails.User(
 * user.getUsername(), user.getPassword(), Collections.emptyList() ); } }
 */