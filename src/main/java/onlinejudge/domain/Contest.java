package onlinejudge.domain;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Contest {
	private BigInteger id;
	private String shortName;
	private String longName;
	private String description;
	private User admin; //DBRef
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss", timezone="Asia/Ho_Chi_Minh")
	private Date startDate;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss", timezone="Asia/Ho_Chi_Minh")
	private Date endDate;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss", timezone="Asia/Ho_Chi_Minh")
	private Date freezeDate;
	private boolean isSelfRegister;
	private List<Team> listTeam;
	private List<User> listJudge;
	private List<ProblemForContest> listProblem;
	private byte numberMemPerTeam;
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getLongName() {
		return longName;
	}
	public void setLongName(String longName) {
		this.longName = longName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public User getAdmin() {
		return admin;
	}
	public void setAdmin(User admin) {
		this.admin = admin;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Date getFreezeDate() {
		return freezeDate;
	}
	public void setFreezeDate(Date freezeDate) {
		this.freezeDate = freezeDate;
	}
	public boolean isSelfRegister() {
		return isSelfRegister;
	}
	public void setSelfRegister(boolean isSelfRegister) {
		this.isSelfRegister = isSelfRegister;
	}
	public List<Team> getListTeam() {
		if(listTeam == null)
			listTeam = new ArrayList<Team>();
		return listTeam;
	}
	public void setListTeam(List<Team> listTeam) {
		this.listTeam = listTeam;
	}
	public List<User> getListJudge() {
		if(listJudge == null)
			listJudge = new ArrayList<User>();
		return listJudge;
	}
	public void setListJudge(List<User> listJudge) {
		this.listJudge = listJudge;
	}
	public List<ProblemForContest> getListProblem() {
		if(listProblem == null)
			listProblem = new ArrayList<ProblemForContest>();
		return listProblem;
	}
	public void setListProblem(List<ProblemForContest> listProblem) {
		this.listProblem = listProblem;
	}
	public byte getNumberMemPerTeam() {
		return numberMemPerTeam;
	}
	public void setNumberMemPerTeam(byte numberMemPerTeam) {
		this.numberMemPerTeam = numberMemPerTeam;
	}
	
	
}
