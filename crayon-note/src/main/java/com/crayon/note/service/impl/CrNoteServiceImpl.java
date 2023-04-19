package com.crayon.note.service.impl;

import com.crayon.note.common.CrResult;
import com.crayon.note.domain.BizNote;
import com.crayon.note.mapper.BizNoteMapper;
import com.crayon.note.service.CrNoteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CrNoteServiceImpl implements CrNoteService {
    @Resource
    private BizNoteMapper bizNoteMapper;
    @Override
    public List<BizNote> queryByNoteId(String noteId) {
        return bizNoteMapper.selectByNoteId(noteId);
    }
}
