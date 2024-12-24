package com.example.keysearch.Controller;

import com.example.keysearch.Entity.File;
import com.example.keysearch.Service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FileController {
    @Autowired
    private FileService fileService;
    @PostMapping("/addFile")
    public File postDetails(@RequestBody File file){
        return fileService.saveDetails(file);
    }
    @GetMapping("/getFileByKey/{id}")
    public File fetchDetailsByKey(@PathVariable int id){
        return fileService.getFileDetailsByKey(id);
    }
}
