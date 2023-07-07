package com.crayon.note.mapper;

import com.crayon.note.domain.Salgrade;
import com.crayon.note.domain.SalgradeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface SalgradeMapper {
    long countByExample(SalgradeExample example);

    int deleteByExample(SalgradeExample example);

    int insert(Salgrade row);

    int insertSelective(Salgrade row);

    List<Salgrade> selectByExample(SalgradeExample example);

    int updateByExampleSelective(@Param("row") Salgrade row, @Param("example") SalgradeExample example);

    int updateByExample(@Param("row") Salgrade row, @Param("example") SalgradeExample example);
}