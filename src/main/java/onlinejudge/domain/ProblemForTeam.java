package onlinejudge.domain;

import java.util.List;

public class ProblemForTeam {
	private String id;
	private ProblemForContest problemForContest;
	private boolean isResolve;
	private int timeResolve;
	private int score;
	private List<Submit> listSubmit;
	private byte index;
}
