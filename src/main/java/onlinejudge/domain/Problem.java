package onlinejudge.domain;

import java.math.BigInteger;
import java.util.List;

public class Problem {
	private BigInteger id;
	public String name;
	private BigInteger idOwner;
	private String filePath;
	private List<TestCase> listTestCase;
	private double percentToPass; //0 < x <= 100
	private int timeLimit;
}
