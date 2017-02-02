package onlinejudge.domain;

import java.math.BigInteger;
import java.util.Date;

public class Submit {
	private BigInteger id;
	private BigInteger idTeam;
	private BigInteger idContest;
	private ProblemForTeam problemForTeam;
	private String filePath;
	private String status;
	private Date dateSubmit;
	private int score;
	private boolean isResolve;
	private int timeToRun;
	private boolean isballoon;
}
