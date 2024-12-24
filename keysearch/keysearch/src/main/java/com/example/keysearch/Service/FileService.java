package com.example.keysearch.Service;

import com.example.keysearch.Entity.File;
import com.example.keysearch.Repository.FileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FileService {
    @Autowired
    private FileRepo fileRepo;

    public File saveDetails(File file){
        return fileRepo.save(file);
    }

    public File getFileDetailsByKey(int key){
        return fileRepo.findById(key).orElse(null);
    }
}
