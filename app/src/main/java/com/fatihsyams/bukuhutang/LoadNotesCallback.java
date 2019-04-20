package com.fatihsyams.bukuhutang;

import com.fatihsyams.bukuhutang.model.Note;

import java.util.ArrayList;

public interface LoadNotesCallback {
    void preExecute();
    void postExecute(ArrayList<Note> notes);
}
