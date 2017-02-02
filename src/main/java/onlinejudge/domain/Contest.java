package onlinejudge.domain;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

public class Contest {
	private BigInteger id;
	private String shortName;
	private String longName;
	private String description;
	private User admin; //DBRef
	private Date startDate;
	private Date endDate;
	private Date freezeDate;
	private boolean isSelfRegister;
	private List<Team> listTeam;
	private List<User> listJudge;
	private List<ProblemForContest> listProblem;
	private byte numberMemPerTeam;
}
