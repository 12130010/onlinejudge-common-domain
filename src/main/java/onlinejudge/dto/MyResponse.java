package onlinejudge.dto;

public class MyResponse {
	public static final int CODE_SUCCESS = 1;
	public static final int CODE_FAIL = 0;
	public static final String MESSAGE_SUCCESS = "success";
	public static final String MESSAGE_FAIL = "fail";
	
	private int code;
	private String message;
	private Object obj;
	private MyResponse(int code, String message, Object obj) {
		super();
		this.code = code;
		this.message = message;
		this.obj = obj;
	}
	private MyResponse(int code, String message) {
		this(code, message, null);
	}
	
	private MyResponse() {
		this(CODE_SUCCESS, MESSAGE_SUCCESS);
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	
	public static Builder builder(){
		return new Builder();
	}
	public static class Builder{
		private MyResponse response = new MyResponse();
		public Builder success(){
			response.setCode(CODE_SUCCESS);
			response.setMessage(MESSAGE_SUCCESS);
			return  this;
		}
		public Builder fail(){
			response.setCode(CODE_FAIL);
			response.setMessage(MESSAGE_FAIL);
			return  this;
		}
		public Builder setObj(Object obj){
			response.setObj(obj);
			return this;
		}
		public MyResponse build(){
			return response;
		}
	}
}
