package com.demo.rest.wservices.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.demo.rest.wservices.domain.Adjustment;
import com.demo.rest.wservices.utils.PaginationMultiTypeValuesHelper;

@Service
public class AdjustmentService {

	private static List<Adjustment> adjs = new ArrayList<>();

	static {
		adjs.add(new Adjustment("WDGS",new BigDecimal("124567890.0987654321"),"Western Digital",false,"dev","another","OP"));
		adjs.add(new Adjustment("SIRI",new BigDecimal("890.0987654321"),"SIRISXM",true,"dev","another","OP"));
		adjs.add(new Adjustment("GOOGLE",new BigDecimal("1890.0987654321"),"Google",true,"dev","another","WP"));
		
	}

		public List<Adjustment> findAll(){
			return adjs;
		}
		
		public Map<String, PaginationMultiTypeValuesHelper> findMemosByCriteria(String searchCriteria, int pages,
				int limit, String sortBy, String sortOrder) {
			Map<String, PaginationMultiTypeValuesHelper> results = new HashMap<>();
			return results;
		}


}