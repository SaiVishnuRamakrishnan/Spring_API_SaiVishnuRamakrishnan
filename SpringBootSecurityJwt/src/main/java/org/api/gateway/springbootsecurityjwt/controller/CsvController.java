package org.api.gateway.springbootsecurityjwt.controller;

import org.api.gateway.springbootsecurityjwt.service.CsvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/csv")
public class CsvController {

    @Autowired
    private CsvService csvService;

    @GetMapping("/data")
    public List<String[]> getCsvData() throws IOException {
        return csvService.readCsv("path/to/your/file.csv");
    }
}
