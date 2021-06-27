package com.example.demo.controller;
import com.example.demo.model.RequestForm;
import com.example.demo.model.RequestFormResponse;
import com.example.demo.service.FormDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class FormDataController {

    @Autowired
    FormDataService formDataService;

    //SAVE EMPLOYEE
    @PostMapping("/form")
    public String setFormData(@RequestBody RequestFormResponse formData){
        try{
            for(RequestForm requestForm: formData.getArray()){
                formDataService.setFormData(requestForm);
            }
            return "Data Inserted";
        } catch (Exception e){
            System.out.println("Error Inserting Data");
        }
        return "400";
    }

}
