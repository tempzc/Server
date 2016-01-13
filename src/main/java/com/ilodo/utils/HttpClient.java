package com.ilodo.utils;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Executor;
import org.apache.http.client.fluent.Request;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.LaxRedirectStrategy;
import org.apache.http.message.BasicNameValuePair;
import org.springframework.web.bind.annotation.RequestParam;

import com.ilodo.constant.RequestURL;

/**
 * ApacheHttpClientFluent
 * @author 常学军
 * 2015.11.18 10：56
 *
 */
public class HttpClient {
	public static String get(String url) {
		String result = null;
		try {
			result = Request.Get(url)
           .connectTimeout(20000)  
           .socketTimeout(20000)  
           .execute().returnContent().asString();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return result;
	}

	public static String get(String url,NameValuePair[] params) {
		String result = null;
		try {
			result = Request.Get(url).bodyForm(params)
					.connectTimeout(20000)  
					.socketTimeout(20000)  
					.execute().returnContent().asString();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	public static String post(String url,NameValuePair[] params) {
		String result = null;
		try {
			Request request = Request.Post(url).bodyForm(params)  
					.connectTimeout(20000)  
					.socketTimeout(20000);
			result = request.execute().returnContent().asString();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public static String getToken(String emailAddress,String password){
		String ret = null;
		CloseableHttpClient httpClient = HttpClientBuilder.create().setRedirectStrategy(new LaxRedirectStrategy()).build();
		Executor exec = Executor.newInstance(httpClient);
		
		NameValuePair[] params = new NameValuePair[3];
		params[0] = new BasicNameValuePair("response_type","code"); 
		params[1] = new BasicNameValuePair("client_id","a8c977504e8285696a9b58bd229fa4a1"); 
		params[2] = new BasicNameValuePair("redirect_uri","http://laikang.enn.cn:8080/loginback"); 
		String codeURL = RequestURL.Authorize.getName()+"?"+URLEncodedUtils.format(Arrays.asList(params),"UTF-8");
		try {
			ret = exec.execute(Request.Get(codeURL).connectTimeout(20000).socketTimeout(20000)).returnContent().asString();
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String code = MatchHtmlElementAttrValue.match(ret, "name", "code","value").get(0);

		params = new NameValuePair[8];
		params[0] = new BasicNameValuePair("response_type","code"); 
		params[1] = new BasicNameValuePair("client_id","a8c977504e8285696a9b58bd229fa4a1"); 
		params[2] = new BasicNameValuePair("redirect_uri","http://laikang.enn.cn:8080/loginback"); 
		params[3] = new BasicNameValuePair("nickname",emailAddress); 
		params[4] = new BasicNameValuePair("password",password); 
		params[5] = new BasicNameValuePair("authorizeUser","true");
		params[6] = new BasicNameValuePair("state","");
		params[7] = new BasicNameValuePair("code",code);
		
		try {
			ret = exec.execute(Request.Post(codeURL).bodyForm(params).connectTimeout(20000).socketTimeout(20000)).returnContent().asString();
		} catch (ClientProtocolException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return ret;
	}
	
	public static Map<String,String> getTokenMap(String code){
		NameValuePair[] params = new NameValuePair[4];
		params[0] = new BasicNameValuePair("grant_type","authorization_code");
		params[1] = new BasicNameValuePair("client_id","a8c977504e8285696a9b58bd229fa4a1"); 
		params[2] = new BasicNameValuePair("client_secret","889accf5f908d0675dfe8f83a243c0c8"); 
		params[3] = new BasicNameValuePair("code",code);
		String ret = post(RequestURL.AuthorizeResponse.getName(),params);
		Map map = null;
		if (ret != null && !"".equals(ret)) {
			try {
				map = ConvertUtils.jsonToBean(ret, Map.class);
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
		return map;
	}
	
	public static Map<String,String> getRefreshTokenMap(String refreshToken){
		NameValuePair[] params = new NameValuePair[4];
		params[0] = new BasicNameValuePair("grant_type","authorization_code");
		params[1] = new BasicNameValuePair("client_id","a8c977504e8285696a9b58bd229fa4a1"); 
		params[2] = new BasicNameValuePair("client_secret","889accf5f908d0675dfe8f83a243c0c8"); 
		params[3] = new BasicNameValuePair("refresh_token",refreshToken);
		params[3] = new BasicNameValuePair("redirect_uri","http://laikang.enn.cn:8080/refreshTokenBack");
		String ret = post(RequestURL.AuthorizeResponse.getName(),params);
		Map map = null;
		if (ret != null && !"".equals(ret)) {
			try {
				map = ConvertUtils.jsonToBean(ret, Map.class);
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
		return map;
	}
	
	public static String api(String token,String uri){
		String url = RequestURL.API.getName()+uri;
		System.out.println(url);
		return get(url);
	}
	
}
