package com.acorn.racket.match.repository;

import java.util.List;



import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.acorn.racket.match.domain.Club;
import com.acorn.racket.match.domain.badmintonDTO;
import com.acorn.racket.match.domain.tabletennisDTO;
import com.acorn.racket.match.domain.tennisDTO;

@Repository
public class MatchRepository {

	@Autowired // root설정파일에 있는 빈을 주입
	private SqlSession session;
	private static String namespace = "com.acorn.MatchMapper.";
	String ns ="com.acorn.matchJoinMapper.";
	
	/* 클럽 부분 */
	
	// 클럽 조회하기
	public List<Club> selectAll() {
		List<Club> result = session.selectList(namespace + "selectAll");
		return result;
	}
	
	 // 조회수 업데이트
    public void updateViews(int p_num) {
        session.update(namespace + "updateViews", p_num);
    }

    //인기 모집 공고
    public List<Club> selectTopClubs(int count) {
        return session.selectList(namespace + "selectTopClubs", count);
    }
    
    //상세페이지
    public Club selectDetail(int p_num) {
        return session.selectOne(namespace + "selectDetail", p_num);
    }
    
    
   /* 매치 부분 */
    
    //테니스
    
    public List<tennisDTO> selectTennis(){
    	
    	List<tennisDTO> list = session.selectList(ns+"tennis");
    	
    	return list;
    }
    //탁구
    
    public List<tabletennisDTO> selectTableTennis(){
    	 List<tabletennisDTO> list = session.selectList(ns+"tabletennis");
    	 
    	 return list;
    }
    
    //배드민턴
    
    public List<badmintonDTO> selectBadminton(){
    	
    	List<badmintonDTO> list = session.selectList(ns+"badminton");
    	
    	return list;
    }
    
}


