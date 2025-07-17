/*
 * package com.product.service;
 * 
 * import com.product.entity.User; import com.product.repository.userrepository;
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder; import
 * org.springframework.stereotype.Service;
 * 
 * import java.util.Optional;
 * 
 * @Service public class UserService {
 * 
 * @Autowired private userrepository userRepository;
 * 
 * private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
 * 
 *//**
	 * Registers a new user. Returns the saved User if successful, or null if email
	 * already exists.
	 */
/*
 * public User registerUser(User user) { // Check if email already exists
 * Optional<User> existingUser = userRepository.findByEmail(user.getEmail()); if
 * (existingUser.isPresent()) { return null; // Email already in use }
 * 
 * // Encrypt the password before saving
 * user.setPassword(passwordEncoder.encode(user.getPassword()));
 * 
 * // Save and return the new user return userRepository.save(user); }
 * 
 *//**
	 * Authenticates a user with email and raw password. Returns User if
	 * authentication is successful, otherwise null.
	 *//*
		 * public User authenticateUser(String username, String rawPassword) {
		 * Optional<User> userOpt = userRepository.findByUsername(username);
		 * 
		 * if (userOpt.isPresent()) { User user = userOpt.get(); // Match raw password
		 * with encrypted password if (passwordEncoder.matches(rawPassword,
		 * user.getPassword())) { return user; // Authentication successful } }
		 * 
		 * return null; // Authentication failed }
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * }
		 * 
		 * 
		 */