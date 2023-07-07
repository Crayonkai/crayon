package com.crayon.note.controller;

import com.crayon.note.common.CrResult;
import com.crayon.note.domain.BizNote;
import com.crayon.note.service.CrInsertTestDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("test")
public class CrInsertTestDataController {

    @Autowired
    private CrInsertTestDataService crInsertTestDataService;

    @GetMapping("insertTestData")
    @ResponseBody
    public CrResult insertTestData(@RequestBody String noteId) {
        int flag = crInsertTestDataService.insert500WData();

        return flag == 1 ? CrResult.success(null) : CrResult.fail("999999", "插入失败");
    }
}
