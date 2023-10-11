package com.thealiyev.NotesAppRestAPI.service;

import com.thealiyev.NotesAppRestAPI.model.Note;
import com.thealiyev.NotesAppRestAPI.repository.NotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotesServicesImpl implements NotesService {
    @Autowired
    private NotesRepository notesRepository;

    @Override
    public ResponseEntity<List<Note>> readNotes() {
        return new ResponseEntity<>(notesRepository.findAll(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Note> createNote(Note note) {
        return new ResponseEntity<>(notesRepository.save(note), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Note> readNote(Long id) {
        return new ResponseEntity<>(notesRepository.findById(id).get(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<HttpStatus> deleteNote(Long id) {
        notesRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @Override
    public ResponseEntity<Note> updateNote(Note note) {
        return new ResponseEntity<>(notesRepository.save(note), HttpStatus.OK);
    }
}
