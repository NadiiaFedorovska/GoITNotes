package com.example.notes.repositories;

import com.example.notes.entities.NoteEntity;

import java.util.List;

public interface INoteService {
    List<NoteEntity> listAll();

    NoteEntity add(NoteEntity noteEntity);

    void deleteById(long id);

    NoteEntity update(NoteEntity noteEntity);

    NoteEntity getById(long id);
}
