package onlinejudge.domain;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class Submit {
	@Id
	private String id;
	private String idTeam;
	private String idContest;
	private String idProblemForTeam;
	private String filePath;
	private Date dateSubmit;
	
	private String status;
	private String errorMessage;
	private int score;
	private boolean isResolve;
	private long timeToRun;
	
	private boolean isballoon;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIdTeam() {
		return idTeam;
	}
	public void setIdTeam(String idTeam) {
		this.idTeam = idTeam;
	}
	public String getIdContest() {
		return idContest;
	}
	public void setIdContest(String idContest) {
		this.idContest = idContest;
	}
	
	public String getIdProblemForTeam() {
		return idProblemForTeam;
	}
	public void setIdProblemForTeam(String idProblemForTeam) {
		this.idProblemForTeam = idProblemForTeam;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getDateSubmit() {
		return dateSubmit;
	}
	public void setDateSubmit(Date dateSubmit) {
		this.dateSubmit = dateSubmit;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public boolean isResolve() {
		return isResolve;
	}
	public void setResolve(boolean isResolve) {
		this.isResolve = isResolve;
	}
	public boolean isIsballoon() {
		return isballoon;
	}
	public void setIsballoon(boolean isballoon) {
		this.isballoon = isballoon;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public long getTimeToRun() {
		return timeToRun;
	}
	public void setTimeToRun(long timeToRun) {
		this.timeToRun = timeToRun;
	}
	
}
