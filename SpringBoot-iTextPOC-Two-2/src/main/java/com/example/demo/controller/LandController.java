package com.example.demo.controller;

import java.io.ByteArrayInputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.Land;
import com.example.demo.service.LandService;
import com.example.demo.utils.LandAssignmentPdf;


@Controller
public class LandController {
	
	@Autowired
	private LandService sServ;
	
	@RequestMapping(value = "/landpdfreport", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_PDF_VALUE)
    public ResponseEntity<InputStreamResource> sampleReport() {

        var sample = (List<Land>) sServ.findAll();

        ByteArrayInputStream bis = LandAssignmentPdf.sampleReport(sample);

        var headers = new HttpHeaders();
        headers.add("Content-Disposition", "inline; filename=landreport.pdf");

        return ResponseEntity
                .ok()
                .headers(headers)
                .contentType(MediaType.APPLICATION_PDF)
                .body(new InputStreamResource(bis));
    }

}
