package com.crayon.note.controller;

import com.alibaba.fastjson2.JSONObject;
import com.crayon.note.common.CrResult;
import com.crayon.note.domain.BizNote;
import com.crayon.note.service.impl.CrNoteServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("note")
@Slf4j
public class CrNoteController {

    @Resource
    private CrNoteServiceImpl crNoteService;

    @PostMapping("queryByNoteId")
    @ResponseBody
    public CrResult<List<BizNote>> queryByNoteId(@RequestBody String noteId){
        JSONObject jsonObject = JSONObject.parseObject(noteId);
        String string = jsonObject.getString("noteId");
        List<BizNote> bizNotes = crNoteService.queryByNoteId(string);
        if (CollectionUtils.isEmpty(bizNotes)){
            return CrResult.fail("99999999","查询结果为空");
        }
        log.info("CrNoteController接口请求成功，结果列表长度为：{}",bizNotes.size());
        return CrResult.success(bizNotes);
    }


}
