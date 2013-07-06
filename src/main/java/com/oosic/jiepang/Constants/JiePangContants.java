package com.oosic.jiepang.Constants;

public class JiePangContants {
	public static final String APPID = "100989";
	public static final String APPSECRET = "a9875016647fc6f64d785bb1684374fc"; 
	
	
	//Implicit Grant
//	public static final String OAUTH_PATH = "https://jiepang.com/oauth/authorize";
	
	
	//https://jiepang.com/oauth/authorize?response_type=code&client_id=%20100989&redirect_uri=http://shaman.farbox.com
	public static final String OAUTH_PATH = "jiepang.com";
	public static final String GET_AUTH_PATH = "http://jiepang.com/oauth/authorize?response_type=code&client_id=%20100989&redirect_uri=http://180.168.145.238:8080/JiePang/GetToken?openid=123";
	//http://jiepang.com/oauth/authorize?response_type=code&client_id=%20100989&redirect_uri=http://180.168.145.238:8080/jiepang/GetToken?
	
	public static final String JIEPANG_HOST = "api.jiepang.com";
}
