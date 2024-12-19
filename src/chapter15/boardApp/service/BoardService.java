package chapter15.boardApp.service;

import chapter15.boardApp.dto.BoardResponseDto;
import chapter15.boardApp.dto.BoardRequestDto;
import java.util.List;

public interface BoardService {
    List<BoardResponseDto> findAll();
    BoardResponseDto findById(long id);
    void save(BoardRequestDto boardRequestDto);
    void update(long id, BoardRequestDto baoardRequestDto);
    void delete(long id);
}