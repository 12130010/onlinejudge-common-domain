package onlinejudge.domain;

public class ProblemForContest {
	private String id;
	private Problem problem; //DBRef
	private byte index;
	private String color;
	private int score;
	private String nameDisplay;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Problem getProblem() {
		return problem;
	}
	public void setProblem(Problem problem) {
		this.problem = problem;
	}
	public byte getIndex() {
		return index;
	}
	public void setIndex(byte index) {
		this.index = index;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getNameDisplay() {
		return nameDisplay;
	}
	public void setNameDisplay(String nameDisplay) {
		this.nameDisplay = nameDisplay;
	}
	
	
}
