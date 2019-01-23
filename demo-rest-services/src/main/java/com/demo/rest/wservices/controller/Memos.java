package com.demo.rest.wservices.controller;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.demo.rest.wservices.utils.PaginationMultiTypeValuesHelper;
import com.demo.rest.wservices.domain.Adjustment;
import com.demo.rest.wservices.services.AdjustmentService;

@RestController
public class Memos {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    private AdjustmentService adjService;
    
	@GetMapping("/hello")
	public String HelloWorld() {
		return "Hello World!!";
	}
	
	@GetMapping("/Adjustments")
	public Adjustment getAdjustments() {
		Adjustment bean = new Adjustment("WDGS",new BigDecimal("124567890.0987654321"),"Western Digital",true,"dev","another","OP");
		return bean;
	}

	@GetMapping("/memo/{adjId}/adjustments")
	public Adjustment getAllAdjustments(@PathVariable(value  = "adjId") Long adjId) {
		logger.info("Adjustment is {}",adjId);
		Adjustment bean = new Adjustment("WDGS",new BigDecimal("124567890.0987654321"),"Western Digital",true,"dev","another","OP");
		return bean;
	} 
	
	@GetMapping("/memo/{adjId}")
	public List<Adjustment> getAllAdjustments() {
		return adjService.findAll();
	 }
	

//http://localhost:8080/memos/search/criteria?search=cNumber:000008,vNumber:901,memoDate>01/01/2018,memoDate<10/20/2018&page=1&limit=50&sortBy=id&sortOrder=DESC 
	
	@ResponseBody
	@GetMapping("/memos/search/criteria")
	public Map<String, PaginationMultiTypeValuesHelper> searchMemosBasedOnCriteria(@RequestParam(value = "search") String searchCriteria,
			@RequestParam(value = "page", required = false, defaultValue = "0") int pages,
			@RequestParam(value = "limit", required = false, defaultValue = "50") int limit,
			@RequestParam(value = "sortBy", required = false, defaultValue = "id") String sortBy,
			@RequestParam(value = "sortOrder", required = false, defaultValue="DESC") String sortOrder) {
		return adjService.findMemosByCriteria(searchCriteria, pages, limit, sortBy, sortOrder);
	}
}
