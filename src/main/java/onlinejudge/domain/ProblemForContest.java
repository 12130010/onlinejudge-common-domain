package onlinejudge.domain;

import java.math.BigInteger;

public class ProblemForContest {
	private BigInteger id;
	private Problem problem; //DBRef
	private byte index;
	private String color;
	private int score;
	private String nameDisplay;
}
