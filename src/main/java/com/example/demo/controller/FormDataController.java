package com.example.demo.controller;
import com.example.demo.model.RequestForm;
import com.example.demo.model.RequestFormResponse;
import com.example.demo.service.FormDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class FormDataController {

    @Autowired
    FormDataService formDataService;

    //SAVE EMPLOYEE
    @PostMapping("/form")
    public ResponseEntity<?> setFormData(@RequestBody RequestFormResponse formData){
        System.out.println(formData);
        try{
            for(RequestForm requestForm: formData.getArray()){
                formDataService.setFormData(requestForm);
            }
            return new ResponseEntity<>("Items Added Successfully", HttpStatus.OK);
        } catch (Exception e){
            System.out.println("Error Inserting Data");
            return new ResponseEntity<>("Error Inserting Items", HttpStatus.NOT_FOUND);
        }
    }

}
