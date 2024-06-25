package mypackage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mypackage.model.Dashboard;
import mypackage.repository.dashboardRepository;
import mypackage.service.dashbaordservice;



@RestController
@RequestMapping("dashboard")
@CrossOrigin(origins="*",allowedHeaders = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE} )
public class dashboardcontroller {
	
	 @Autowired
	    private dashbaordservice dashboardService;

	    @GetMapping("")
	    public List<Dashboard> getAlldata() {
	        return dashboardService.getAllData();
	    }

	    @GetMapping("/filtered")
	    public List<Dashboard> getFilteredDashboards(@RequestParam(required = false) String sector,
	                                                 @RequestParam(required = false) String topic,
	                                                 @RequestParam(required = false) String region,
	                                                 @RequestParam(required = false) String pestle,
	                                                 @RequestParam(required = false) String source,
	                                                 @RequestParam(required = false) String swot,
	                                                 @RequestParam(required = false) String country,
	                                                 @RequestParam(required = false) String city) {
	        return dashboardService.getFilteredDashboards(sector, topic, region, pestle, source, swot, country, city);
	    }

	   
}
