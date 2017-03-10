package onlinejudge.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import onlinejudge.anotation.customcascade.CascadeSave;

public class Problem {
	@Id
	private String id;
	public String name;
	private String idOwner; // User's id
	private String filePath;
	@DBRef
	@CascadeSave
	private List<TestCase> listTestCase;
	private double percentToPass; //0 < x <= 100
	private int timeLimit;
	private Date createdDate;
	private Date updateDate;
	private int version;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getIdOwner() {
		return idOwner;
	}
	public void setIdOwner(String idOwner) {
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
	
	public void clearAllTestCase(){
		listTestCase.clear();
	}
	
	public void addTestCase(TestCase testCase){
		listTestCase.add(testCase);	
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public void increaseVersion(){
		this.version++;
	}
}
