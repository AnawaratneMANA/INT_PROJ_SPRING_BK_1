package com.example.demo.controller;
import com.example.demo.model.AuthenticationRequest;
import com.example.demo.model.AuthenticationResponse;
import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.userDetails;
import com.example.demo.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    public EmployeeController(AuthenticationManager authenticationManager){
        this.authenticationManager = authenticationManager;
    }

    private AuthenticationManager authenticationManager;

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private userDetails userDetailsService;

    @Autowired
    private JwtUtil jwtUtil;

    //GET EMPLOYEES
    @GetMapping("/employees")
    public ResponseEntity<?> getUser(){
        return employeeService.getAllUser();
    }
    //GET EMPLOYEE BY ID
    @GetMapping("/employees/{id}")
    public ResponseEntity<?> getUserById(@PathVariable long id){
        return employeeService.getSpecificUser(id);
    }

    //SAVE EMPLOYEE
    @PostMapping("/employee")
    public ResponseEntity<?> createEmployee(@RequestBody Employee employee){
        return employeeService.setUser(employee);
    }
    //UPDATE EMPLOYEE
    @PutMapping("employee/{id}")
    public ResponseEntity<?> updateEmployee(@PathVariable(value = "id") Long employeeId, @RequestBody Employee updatedEmployee){
            return employeeService.updateUser(employeeId, updatedEmployee);
    }

    //DELETE EMPLOYEE

    //AUTHENTICATION - RETURN JWT
    @PostMapping("/employee/auth")
    public ResponseEntity<?> createAuthToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authenticationRequest.getUserName(),
                            authenticationRequest.getPassword(),
                            new ArrayList<>()
                    )
            );
        }
        catch (BadCredentialsException e) {
            throw new Exception("Incorrect username or password", e);
        }
        final UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getUserName());
        final String jwt = jwtUtil.generateToken(userDetails);
        return ResponseEntity.ok(new AuthenticationResponse(jwt));
    }
}
