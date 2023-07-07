package com.crayon.note.service;

import com.crayon.note.domain.BizNote;

import java.util.List;

public interface CrNoteService {
    List<BizNote> queryByNoteId(String noteId);
}
