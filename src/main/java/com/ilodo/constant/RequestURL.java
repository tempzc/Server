package com.ilodo.constant;

public enum RequestURL {
	Authorize("https://lfconnect.com/web/oauthAuthorize",1),
	AuthorizeResponse("https://lfconnect.com/web/authorizeresponse",2),
	API("https://lfconnect.com/web/api2",3),
	RefreshAccess("https://lfconnect.com/web/refreshaccess",4),
	Revoke("https://lfconnect.com/web/revoke",5);
//	Authorize("https://vtqa.lfconnect.com/web/oauthAuthorize",1),
//	AuthorizeResponse("https://vtqa.lfconnect.com/web/authorizeresponse",2),
//	API("https://vtqa.lfconnect.com/web/api2",3),
//	RefreshAccess("https://vtqa.lfconnect.com/web/refreshaccess",4),
//	Revoke("https://vtqa.lfconnect.com/web/revoke",5);
	
	private String name;
	private int index;
	
	private RequestURL(String name,int index){
		this.name = name;
		this.index = index;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public static String getName(int index) {
		for(RequestURL url :RequestURL.values()){
			if(url.getIndex() == index){
				return url.getName();
			}
			
		}
		return null;
	}
}
