package com.os.web.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.os.web.dao.AddrDAO;

@Service
public class AddrServiceImpl implements com.os.web.service.AddrService {
	@Autowired
	private AddrDAO adao;
	
	public List<Map<String, String>> selectAddrList() {
		return adao.selectAddrList();
	}

}
