package com.example.service;

import com.example.model.Libraries;
import com.example.repository.LibrariesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibrariesService {

    @Autowired
    LibrariesRepository librariesRepository;

    public List<Libraries> getLibrariesList(){
        return librariesRepository.findAll();
    }

    public void saveLibraries(Libraries libraries) {
        librariesRepository.save(libraries);
    }

    public void deleteLibraries(Libraries libraries){
        librariesRepository.delete(libraries);
    }

    public Libraries findLibrariesById(Libraries libraries){
        return librariesRepository.findById(libraries.getId()).get();
    }
}
