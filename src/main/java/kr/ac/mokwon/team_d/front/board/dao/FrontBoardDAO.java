package kr.ac.mokwon.team_d.front.board.dao;


import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface FrontBoardDAO {
    List<Map<String, Object>> selectBoardList(Map<String, Object> m);
}
