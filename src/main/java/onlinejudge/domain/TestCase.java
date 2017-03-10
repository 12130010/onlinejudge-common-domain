package onlinejudge.domain;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;

public class TestCase {
	@Id
	private String id;
	private String idProblem;
	private String inputFilePath;
	private String outputFilePath;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getIdProblem() {
		return idProblem;
	}
	public void setIdProblem(String idProblem) {
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
