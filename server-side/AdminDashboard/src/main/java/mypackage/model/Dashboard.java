package mypackage.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="insights")
public class Dashboard {
 
	  	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;
	    private Integer end_year;
	    private Double cityLng;
	    private Double cityLat;
	    private Integer intensity;
	    private String sector;
	    private String topic;
	    private String insight;
	    private String swot;
	    private String url;
	    private String region;
	    private Integer start_year;
	    private String impact;
	    private String added;
	    private String published;
	    private String city;
	    private String country;
	    private Integer relevance;
	    private String pestle;
	    private String source;
	    private String title;
	    private Integer likelihood;
	    
		public Dashboard() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public Dashboard(Integer id, Integer end_year, Double cityLng, Double cityLat, Integer intensity, String sector,
				String topic, String insight, String swot, String url, String region, Integer start_year, String impact,
				String added, String published, String city, String country, Integer relevance, String pestle,
				String source, String title, Integer likelihood) {
			super();
			this.id = id;
			this.end_year = end_year;
			this.cityLng = cityLng;
			this.cityLat = cityLat;
			this.intensity = intensity;
			this.sector = sector;
			this.topic = topic;
			this.insight = insight;
			this.swot = swot;
			this.url = url;
			this.region = region;
			this.start_year = start_year;
			this.impact = impact;
			this.added = added;
			this.published = published;
			this.city = city;
			this.country = country;
			this.relevance = relevance;
			this.pestle = pestle;
			this.source = source;
			this.title = title;
			this.likelihood = likelihood;
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public Integer getEnd_year() {
			return end_year;
		}
		public void setEnd_year(Integer end_year) {
			this.end_year = end_year;
		}
		public Double getCityLng() {
			return cityLng;
		}
		public void setCityLng(Double cityLng) {
			this.cityLng = cityLng;
		}
		public Double getCityLat() {
			return cityLat;
		}
		public void setCityLat(Double cityLat) {
			this.cityLat = cityLat;
		}
		public Integer getIntensity() {
			return intensity;
		}
		public void setIntensity(Integer intensity) {
			this.intensity = intensity;
		}
		public String getSector() {
			return sector;
		}
		public void setSector(String sector) {
			this.sector = sector;
		}
		public String getTopic() {
			return topic;
		}
		public void setTopic(String topic) {
			this.topic = topic;
		}
		public String getInsight() {
			return insight;
		}
		public void setInsight(String insight) {
			this.insight = insight;
		}
		public String getSwot() {
			return swot;
		}
		public void setSwot(String swot) {
			this.swot = swot;
		}
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public String getRegion() {
			return region;
		}
		public void setRegion(String region) {
			this.region = region;
		}
		public Integer getStart_year() {
			return start_year;
		}
		public void setStart_year(Integer start_year) {
			this.start_year = start_year;
		}
		public String getImpact() {
			return impact;
		}
		public void setImpact(String impact) {
			this.impact = impact;
		}
		public String getAdded() {
			return added;
		}
		public void setAdded(String added) {
			this.added = added;
		}
		public String getPublished() {
			return published;
		}
		public void setPublished(String published) {
			this.published = published;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public Integer getRelevance() {
			return relevance;
		}
		public void setRelevance(Integer relevance) {
			this.relevance = relevance;
		}
		public String getPestle() {
			return pestle;
		}
		public void setPestle(String pestle) {
			this.pestle = pestle;
		}
		public String getSource() {
			return source;
		}
		public void setSource(String source) {
			this.source = source;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public Integer getLikelihood() {
			return likelihood;
		}
		public void setLikelihood(Integer likelihood) {
			this.likelihood = likelihood;
		} 
	    
	    
		
	
}
