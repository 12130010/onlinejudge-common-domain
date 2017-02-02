package onlinejudge.domain;

import java.math.BigInteger;
import java.util.List;

public class Team {
	private BigInteger id;
	private String name;
	private List<User> listMenber;
	private BigInteger idContest;
	private List<ProblemForTeam> listProblem;
}
