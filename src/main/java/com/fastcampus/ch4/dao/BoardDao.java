package com.fastcampus.ch4.dao;

import com.fastcampus.ch4.domain.BoardDto;

import java.util.List;

public interface BoardDao {
    BoardDto select(int bno) throws Exception;

    List<BoardDto> selectAll() throws Exception;

    int insert(BoardDto boardDto) throws Exception;

    int update(BoardDto boardDto) throws Exception;

    int delete(Integer bno, String writer) throws Exception;

    int deleteAll() throws Exception;

    int count() throws Exception;
}
