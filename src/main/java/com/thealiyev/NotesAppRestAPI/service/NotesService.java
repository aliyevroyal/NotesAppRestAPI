package com.thealiyev.NotesAppRestAPI.service;

import com.thealiyev.NotesAppRestAPI.model.Note;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface NotesService {
    ResponseEntity<Note> createNote(Note note);

    ResponseEntity<List<Note>> readNotes();

    ResponseEntity<Note> readNote(Long id);

    ResponseEntity<HttpStatus> deleteNote(Long id);

    ResponseEntity<Note> updateNote(Note note);
}
