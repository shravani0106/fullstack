package com.codewithshravani.fullstackbackend.controller;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/files")
public class FileController {

    @GetMapping("/{filename}")
    public Resource getFile(@PathVariable String filename) throws Exception {

        Path path = Paths.get("uploads").resolve(filename);
        return new UrlResource(path.toUri());
    }
}