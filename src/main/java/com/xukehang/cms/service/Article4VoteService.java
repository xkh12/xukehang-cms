package com.xukehang.cms.service;

import java.util.List;

import com.xukehang.cms.entity.Article4Vote;
import com.xukehang.cms.entity.VoteStatic;

/**
 * 
 * @author xukehang
 *
 */
public interface Article4VoteService {
	
	int publish(Article4Vote av);
	
	List<Article4Vote>  list();
	
	Article4Vote  findById(Integer id);
	
	int vote(Integer userId, Integer articleId,Character option);
	
	List<VoteStatic> getVoteStatics(Integer articleId);
	 
	
	

}
