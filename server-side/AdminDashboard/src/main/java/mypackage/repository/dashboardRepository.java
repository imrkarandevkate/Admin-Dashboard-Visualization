package mypackage.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import mypackage.model.Dashboard;


@Repository
public interface dashboardRepository extends JpaRepository<Dashboard,Integer> {
	
	    
	    @Query("SELECT d FROM Dashboard d WHERE " +
	            "(:sector IS NULL OR d.sector = :sector) AND " +
	            "(:topic IS NULL OR d.topic = :topic) AND " +
	            "(:region IS NULL OR d.region = :region) AND " +
	            "(:pestle IS NULL OR d.pestle = :pestle) AND " +
	            "(:source IS NULL OR d.source = :source) AND " +
	            "(:swot IS NULL OR d.swot = :swot) AND " +
	            "(:country IS NULL OR d.country = :country) AND " +
	            "(:city IS NULL OR d.city = :city)")
	     List<Dashboard> findByFilters(@Param("sector") String sector, @Param("topic") String topic, 
	                                   @Param("region") String region, @Param("pestle") String pestle, 
	                                   @Param("source") String source, @Param("swot") String swot, 
	                                   @Param("country") String country, @Param("city") String city);
	}


