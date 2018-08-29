package com.bcol.vtd.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

@DynamoDBDocument
public class Dispositivo {
	@DynamoDBAttribute
	private String ip;
	
	@DynamoDBAttribute
	private String deviceBrowser;
	
	@DynamoDBAttribute
	private String userAgent;
	
	@DynamoDBAttribute
	private String so;
	
	@DynamoDBAttribute
	private String versionSO;
	
	@DynamoDBAttribute
	private String device;
	
	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getDeviceBrowser() {
		return deviceBrowser;
	}

	public void setDeviceBrowser(String deviceBrowser) {
		this.deviceBrowser = deviceBrowser;
	}

	public String getUserAgent() {
		return userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	public String getSo() {
		return so;
	}

	public void setSo(String so) {
		this.so = so;
	}

	public String getVersionSO() {
		return versionSO;
	}

	public void setVersionSO(String versionSO) {
		this.versionSO = versionSO;
	}

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}
}
