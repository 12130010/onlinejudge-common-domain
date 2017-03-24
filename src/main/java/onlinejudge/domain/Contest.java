package onlinejudge.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.DBRef;

import com.fasterxml.jackson.annotation.JsonFormat;

import onlinejudge.anotation.customcascade.CascadeSave;

public class Contest {
	public static final int NOT_START = 1;
	public static final int STARTED = 2;
	public static final int FREEZED = 3;
	public static final int END = 4;
	private String id;
	private String shortName;
	private String longName;
	private String description;
	private String adminID; //DBRef
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy HH:mm:ss", timezone="Asia/Ho_Chi_Minh")
	private Date startDate;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy HH:mm:ss", timezone="Asia/Ho_Chi_Minh")
	private Date endDate;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy HH:mm:ss", timezone="Asia/Ho_Chi_Minh")
	private Date freezeDate;
	private int status;
	private boolean isSelfRegister;
	@CascadeSave
	@DBRef
	private List<Team> listTeam;
	private List<String> listJudgeID;
	@CascadeSave
	@DBRef
	private List<ProblemForContest> listProblem;
	private byte numberMemPerTeam;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	
	public String getAdminID() {
		return adminID;
	}
	public void setAdminID(String adminID) {
		this.adminID = adminID;
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
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
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
	
	public List<String> getListJudgeID() {
		if(listJudgeID == null)
			listJudgeID = new ArrayList<String>();
		return listJudgeID;
	}
	public void setListJudgeID(List<String> listJudgeID) {
		this.listJudgeID = listJudgeID;
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
