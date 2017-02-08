package onlinejudge.domain;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Problem {
	private BigInteger id;
	public String name;
	private BigInteger idOwner; // User's id
	private String filePath;
	private List<TestCase> listTestCase;
	private double percentToPass; //0 < x <= 100
	private int timeLimit;
	
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigInteger getIdOwner() {
		return idOwner;
	}
	public void setIdOwner(BigInteger idOwner) {
		this.idOwner = idOwner;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public List<TestCase> getListTestCase() {
		if(listTestCase == null)
			listTestCase = new ArrayList<TestCase>();
		return listTestCase;
	}
	public void setListTestCase(List<TestCase> listTestCase) {
		this.listTestCase = listTestCase;
	}
	public double getPercentToPass() {
		return percentToPass;
	}
	public void setPercentToPass(double percentToPass) {
		this.percentToPass = percentToPass;
	}
	public int getTimeLimit() {
		return timeLimit;
	}
	public void setTimeLimit(int timeLimit) {
		this.timeLimit = timeLimit;
	}
	
}
