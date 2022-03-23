package com.test.sprongboot.catalogo.controller;

import java.util.List;

import com.test.sprongboot.catalogo.entity.History;
import com.test.sprongboot.catalogo.repository.HistoryRepository;
import com.test.sprongboot.catalogo.service.HistoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/history")
public class HistoryController {

    @Autowired
    private HistoryService studentService;
    
    @GetMapping(path = "/list")
    public ResponseEntity<List<History>> list(){
        List<History> list = studentService.findAll();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
}
