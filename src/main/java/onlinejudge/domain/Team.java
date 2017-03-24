package onlinejudge.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;

public class Team {
	@Id
	private String id;
	private String name;
	private List<User> listMember;
	private String idContest;
	private List<ProblemForTeam> listProblem;
	
	public Team() {
		listProblem = new ArrayList<ProblemForTeam>();
	}
	
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
	public List<User> getListMember() {
		return listMember;
	}
	public void setListMember(List<User> listMember) {
		this.listMember = listMember;
	}
	public String getIdContest() {
		return idContest;
	}
	public void setIdContest(String idContest) {
		this.idContest = idContest;
	}
	public List<ProblemForTeam> getListProblem() {
		return listProblem;
	}
	public void setListProblem(List<ProblemForTeam> listProblem) {
		this.listProblem = listProblem;
	}
	public void updateListProblem(List<ProblemForContest> listProblemForContest){
		listProblem.clear();
		for (ProblemForContest problemForContest : listProblemForContest) {
			listProblem.add(new ProblemForTeam(problemForContest));
		}
	}
	
}
