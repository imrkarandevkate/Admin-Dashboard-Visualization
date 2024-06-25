package mypackage.service;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mypackage.model.Dashboard;
import mypackage.repository.dashboardRepository;

@Service
public class dashbaordservice {
		 
		@Autowired
		 private dashboardRepository dashboardRepository;

	    public List<Dashboard> getAllData() {
	        return dashboardRepository.findAll();
	    }

	    public List<Dashboard> getFilteredDashboards(String sector, String topic, String region, String pestle, 
	                                                 String source, String swot, String country, String city) {
	        return dashboardRepository.findByFilters(sector, topic, region, pestle, source, swot, country, city);
	    }

	   
}

