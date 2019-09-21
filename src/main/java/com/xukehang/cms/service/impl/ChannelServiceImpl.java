package com.xukehang.cms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xukehang.cms.dao.ChannelMapper;
import com.xukehang.cms.entity.Channel;
import com.xukehang.cms.service.ChannelService;

@Service
public class ChannelServiceImpl implements ChannelService{

	@Autowired
	ChannelMapper channelMapper;
	
	@Override
	public List<Channel> getChannels() {
		// TODO Auto-generated method stub
		return channelMapper.getChannels();
	}
	

}
