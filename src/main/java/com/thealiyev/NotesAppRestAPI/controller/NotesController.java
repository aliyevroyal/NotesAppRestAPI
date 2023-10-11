package com.thealiyev.NotesAppRestAPI.controller;

import com.thealiyev.NotesAppRestAPI.model.Note;
import com.thealiyev.NotesAppRestAPI.service.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class NotesController {
    @Autowired
    private NotesService notesService;

    @GetMapping("/readNotes")
    public ResponseEntity<List<Note>> readNotes() {
        return notesService.readNotes();
    }

    @PostMapping("/createNote")
    public ResponseEntity<Note> createNote(@RequestBody Note note) {
        return notesService.createNote(note);
    }

    @GetMapping("/notes/{id}")
    public ResponseEntity<Note> readNote(@PathVariable Long id) {
        return notesService.readNote(id);
    }

    @DeleteMapping("/notes/{id}")
    public ResponseEntity<HttpStatus> deleteNote(@PathVariable Long id) {
        return notesService.deleteNote(id);
    }

    @PutMapping("/notes")
    public ResponseEntity<Note> updateNote(@RequestBody Note note) {
        return notesService.updateNote(note);
    }
}
