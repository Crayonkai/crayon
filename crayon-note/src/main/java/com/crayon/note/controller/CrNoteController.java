package com.crayon.note.controller;

import com.crayon.note.common.CrResult;
import com.crayon.note.domain.BizNote;
import com.crayon.note.service.impl.CrNoteServiceImpl;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("note")
public class CrNoteController {

    @Resource
    private CrNoteServiceImpl crNoteService;

    @PostMapping("queryByNoteId")
    @ResponseBody
    public CrResult<List<BizNote>> queryByNoteId(@RequestBody String noteId){
        List<BizNote> bizNotes = crNoteService.queryByNoteId(noteId);
        if (CollectionUtils.isEmpty(bizNotes)){
            return CrResult.fail("99999999","查询结果为空");
        }
        return CrResult.success(bizNotes);
    }
}
