package com.starwar.domain;

import java.io.Serializable;
import java.util.List;

public class SearchResults extends BaseDTO implements Serializable{
	
	private static final long serialVersionUID = -2705085300512933333L;
	String type ;
	String name;
	
	String count ;
	List<SearchResultDTO> results;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public List<SearchResultDTO> getResults() {
		return results;
	}
	public void setResults(List<SearchResultDTO> results) {
		this.results = results;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((count == null) ? 0 : count.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((results == null) ? 0 : results.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof SearchResults))
			return false;
		SearchResults other = (SearchResults) obj;
		if (count == null) {
			if (other.count != null)
				return false;
		} else if (!count.equals(other.count))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (results == null) {
			if (other.results != null)
				return false;
		} else if (!results.equals(other.results))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "SearchResults [type=" + type + ", name=" + name + ", count=" + count + ", results=" + results + "]";
	}
	
	

}
