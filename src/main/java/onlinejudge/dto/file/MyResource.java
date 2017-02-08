package onlinejudge.dto.file;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.math.BigInteger;

public class MyResource {
	public static String RESOURCE_TYPE_PROBLEM = "problem";
	public static String RESOURCE_TYPE_TESTCASE_INPUT = "testcaseInput";
	public static String RESOURCE_TYPE_TESTCASE_OUTPUT = "testcaseOutput";
	public static String RESOURCE_TYPE_SUBMIT = "submit";
	
	private BigInteger id;
	private String resourceType;
	private String fileName;
	private byte[] data =  {1};
	public MyResource() {
	}
	public MyResource(BigInteger id, String resourceType, String fileName, byte[] data) {
		super();
		this.id = id;
		this.resourceType = resourceType;
		this.fileName = fileName;
		this.data = data;
	}
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getResourceType() {
		return resourceType;
	}
	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public byte[] getData() {
		if(data == null)
			data = new byte[0];
		return data;
	}
	public void setData(byte[] data) {
		this.data = data;
	}
	
	public InputStream inputStream(){
			return new ByteArrayInputStream(getData());
	}
}
