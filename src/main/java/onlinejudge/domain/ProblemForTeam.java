package onlinejudge.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import onlinejudge.anotation.customcascade.CascadeSave;

public class ProblemForTeam {
	@Id
	private String id;
	@DBRef
	private ProblemForContest problemForContest;
	private boolean isResolve;
	private int timeResolve;
	private int score;
	@CascadeSave
	@DBRef
	private List<Submit> listSubmit;
	private byte index;
	
	public ProblemForTeam() {
		listSubmit = new ArrayList<Submit>();
	}

	public ProblemForTeam(ProblemForContest problemForContest) {
		this();
		this.problemForContest = problemForContest;
		index = problemForContest.getIndex();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ProblemForContest getProblemForContest() {
		return problemForContest;
	}

	public void setProblemForContest(ProblemForContest problemForContest) {
		this.problemForContest = problemForContest;
	}

	public boolean isResolve() {
		return isResolve;
	}

	public void setResolve(boolean isResolve) {
		this.isResolve = isResolve;
	}

	public int getTimeResolve() {
		return timeResolve;
	}

	public void setTimeResolve(int timeResolve) {
		this.timeResolve = timeResolve;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public List<Submit> getListSubmit() {
		return listSubmit;
	}

	public void setListSubmit(List<Submit> listSubmit) {
		this.listSubmit = listSubmit;
	}

	public byte getIndex() {
		return index;
	}

	public void setIndex(byte index) {
		this.index = index;
	}
	
}
