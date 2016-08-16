package v1.utils.retcat;

import java.util.HashMap;
import java.util.HashSet;

public class SuggestionItem {
	
	private String url = "";
	private String id = "";
	private String schemeTitle = "";
	private String schemeURI = "";
	private HashSet<String> labels = new HashSet();
	private HashSet<String> altLabels = new HashSet();
	private HashSet<String> descriptions = new HashSet();
	private HashSet<HashMap<String,String>> broaderTerms = new HashSet<HashMap<String,String>>();
	private HashSet<HashMap<String,String>> narrowerTerms = new HashSet<HashMap<String,String>>();

	public SuggestionItem(String URL) {
		url = URL;
	}
	
	public String getURL() {
		return url;
	}

	public void setURL(String url) {
		this.url = url;
	}

	public HashSet<HashMap<String, String>> getBroaderTerms() {
		return broaderTerms;
	}

	public void setBroaderTerm(HashMap<String, String> broader) {
		this.broaderTerms.add(broader);
	}

	public HashSet<HashMap<String, String>> getNarrowerTerms() {
		return narrowerTerms;
	}

	public void setNarrowerTerm(HashMap<String, String> narrower) {
		this.narrowerTerms.add(narrower);
	}

	public String getSchemeTitle() {
		return schemeTitle;
	}

	public void setSchemeTitle(String schemeTitle) {
		this.schemeTitle = schemeTitle;
	}

	public HashSet<String> getLabels() {
		return labels;
	}

	public void setLabel(String label) {
		this.labels.add(label);
	}
	
	public HashSet<String> getAltLabels() {
		return altLabels;
	}

	public void setAltLabel(String label) {
		this.altLabels.add(label);
	}

	public HashSet<String> getDescriptions() {
		return descriptions;
	}

	public void setDescription(String description) {
		this.descriptions.add(description);
	}

	public String getSchemeURI() {
		return schemeURI;
	}

	public void setSchemeURI(String schemeURI) {
		this.schemeURI = schemeURI;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}