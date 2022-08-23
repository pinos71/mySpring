package kr.spring.board.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import kr.spring.board.vo.BoardCommand;

@Mapper
public interface BoardMapper {
	public void insertBoard(BoardCommand board);
	@Select("SELECT COUNT(*) FROM aboard")
	public int getBoardCount();
	public List<BoardCommand> getBoardList(Map<String,Object> map);
	@Select("SELECT * FROM aboard WHERE num=#{num}")
	public BoardCommand getBoard(int num);
	@Update("UPDATE aboard SET writer=#{writer},title=#{title},content=#{content} WHERE num=#{num}")
	public void updateBoard(BoardCommand board);
	public void deleteBoard(int num);
}








