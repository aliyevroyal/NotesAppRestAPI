package com.thealiyev.NotesAppRestAPI.controller;

import com.thealiyev.NotesAppRestAPI.model.Note;
import com.thealiyev.NotesAppRestAPI.repository.NotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class NotesController {
    @Autowired
    private NotesRepository notesRepository;

    @GetMapping("/notes")
    public ResponseEntity<List<Note>> readNotes() {
        return new ResponseEntity<>(notesRepository.findAll(), HttpStatus.OK);
    }
}
