package com.crayon.note.mapper;

import com.crayon.note.domain.Dept;
import com.crayon.note.domain.DeptExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface DeptMapper {
    long countByExample(DeptExample example);

    int deleteByExample(DeptExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Dept row);

    int insertSelective(Dept row);

    List<Dept> selectByExample(DeptExample example);

    Dept selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") Dept row, @Param("example") DeptExample example);

    int updateByExample(@Param("row") Dept row, @Param("example") DeptExample example);

    int updateByPrimaryKeySelective(Dept row);

    int updateByPrimaryKey(Dept row);
}