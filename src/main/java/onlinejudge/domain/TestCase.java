package onlinejudge.domain;

import java.math.BigInteger;

public class TestCase {
	private BigInteger id;
	private BigInteger idProblem;
	private String inputFilePath;
	private String outputFilePath;
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public BigInteger getIdProblem() {
		return idProblem;
	}
	public void setIdProblem(BigInteger idProblem) {
		this.idProblem = idProblem;
	}
	public String getInputFilePath() {
		return inputFilePath;
	}
	public void setInputFilePath(String inputFilePath) {
		this.inputFilePath = inputFilePath;
	}
	public String getOutputFilePath() {
		return outputFilePath;
	}
	public void setOutputFilePath(String outputFilePath) {
		this.outputFilePath = outputFilePath;
	}
	
	
}
