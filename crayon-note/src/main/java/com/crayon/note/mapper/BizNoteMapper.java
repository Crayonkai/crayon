package com.crayon.note.mapper;

import com.crayon.note.common.CrResult;
import com.crayon.note.domain.BizNote;
import com.crayon.note.domain.BizNoteExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BizNoteMapper {
    long countByExample(BizNoteExample example);

    int deleteByExample(BizNoteExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BizNote row);

    int insertSelective(BizNote row);

    List<BizNote> selectByExampleWithBLOBs(BizNoteExample example);

    List<BizNote> selectByExample(BizNoteExample example);

    BizNote selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") BizNote row, @Param("example") BizNoteExample example);

    int updateByExampleWithBLOBs(@Param("row") BizNote row, @Param("example") BizNoteExample example);

    int updateByExample(@Param("row") BizNote row, @Param("example") BizNoteExample example);

    int updateByPrimaryKeySelective(BizNote row);

    int updateByPrimaryKeyWithBLOBs(BizNote row);

    int updateByPrimaryKey(BizNote row);

    List<BizNote> selectByNoteId(String noteId);
}