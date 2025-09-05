package kr.ac.mokwon.team_d.front.board.dao.impl;


import kr.ac.mokwon.team_d.front.board.dao.FrontBoardDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Transactional
@Repository
public class FrontBoardDAOImpl implements FrontBoardDAO {

    @Autowired
    private FrontBoardDAO frontBoardDAO;

    @Override
    public List<Map<String, Object>> selectBoardList(Map<String, Object> m) {
        return frontBoardDAO.selectBoardList(m);
    }
}
