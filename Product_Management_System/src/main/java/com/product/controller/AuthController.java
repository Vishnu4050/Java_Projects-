/*
 * 
 * 
 * package com.product.controller;
 * 
 * import com.product.entity.User; import com.product.service.*; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.http.*; import org.springframework.web.bind.annotation.*;
 * 
 * @RestController
 * 
 * @RequestMapping("/auth") public class AuthController {
 * 
 * @Autowired private UserService userService;
 * 
 * // Signup API
 * 
 * @PostMapping("/signup") public ResponseEntity<?> register(@RequestBody User
 * user) {
 * 
 * if (user.getEmail() == null || user.getEmail().isEmpty() ||
 * user.getPassword() == null || user.getPassword().isEmpty() ||
 * user.getUsername() == null || user.getUsername().isEmpty()) {
 * 
 * return ResponseEntity.badRequest().
 * body("Email, password, and username are required."); }
 * 
 * User createdUser = userService.registerUser(user);
 * 
 * if (createdUser != null) { return
 * ResponseEntity.ok("User registered successfully."); } else { return
 * ResponseEntity.status(HttpStatus.CONFLICT).body("Email already exists."); } }
 * 
 * // Signin API
 * 
 * @PostMapping("/login") public ResponseEntity<?> login(@RequestParam String
 * username, @RequestParam String password) {
 * 
 * User user = userService.authenticateUser(username, password);
 * 
 * if (user != null) { return ResponseEntity.ok("Login successful."); } else {
 * return ResponseEntity.status(HttpStatus.UNAUTHORIZED).
 * body("Invalid username or password."); } } }
 */