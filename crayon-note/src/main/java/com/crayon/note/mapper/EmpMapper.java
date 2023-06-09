package com.crayon.note.mapper;

import com.crayon.note.domain.Emp;
import com.crayon.note.domain.EmpExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface EmpMapper {
    long countByExample(EmpExample example);

    int deleteByExample(EmpExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Emp row);

    int insertSelective(Emp row);

    List<Emp> selectByExample(EmpExample example);

    Emp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") Emp row, @Param("example") EmpExample example);

    int updateByExample(@Param("row") Emp row, @Param("example") EmpExample example);

    int updateByPrimaryKeySelective(Emp row);

    int updateByPrimaryKey(Emp row);
}