package onlinejudge.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class User{
	private String id;
	private String email;
	private String password;
	private String displayName;
	private Date dateOfBirth;
	private String avatar;
	private String address;
	private Date createdDate;
	@JsonIgnore
	private boolean isVerify;
	@JsonIgnore
	private boolean isLock;
	@JsonIgnore
	private String verifyCode;
	@JsonIgnore
	private Date deadlineVerify;
	private List<String> roles;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public boolean isVerify() {
		return isVerify;
	}
	public void setVerify(boolean isVerify) {
		this.isVerify = isVerify;
	}
	public boolean isLock() {
		return isLock;
	}
	public void setLock(boolean isLock) {
		this.isLock = isLock;
	}
	public String getVerifyCode() {
		return verifyCode;
	}
	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}
	public Date getDeadlineVerify() {
		return deadlineVerify;
	}
	public void setDeadlineVerify(Date deadlineVerify) {
		this.deadlineVerify = deadlineVerify;
	}
	public List<String> getRoles() {
		if(roles == null)
			return new ArrayList<String>();
		return roles;
	}
	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	
}
