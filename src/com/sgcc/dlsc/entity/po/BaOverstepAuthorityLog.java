package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaOverstepAuthorityLog的POJO类
 *
 * @author  开发部  [Sat Mar 15 17:17:27 CST 2014]
 * 
 */
public class BaOverstepAuthorityLog implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性userId
     */
    private String userId;
	
    /** 
     * 属性userName
     */
    private String userName;
	
    /** 
     * 属性sessionId
     */
    private String sessionId;
	
    /** 
     * 属性url
     */
    private String url;
	
    /** 
     * 属性overstepDate
     */
    private Timestamp overstepDate;
	
    /**
     * BaOverstepAuthorityLog构造函数
     */
    public BaOverstepAuthorityLog() {
        super();
    }  
	
    /**
     * BaOverstepAuthorityLog完整的构造函数
     */  
    public BaOverstepAuthorityLog(String guid){
        this.guid = guid;
    }
 
    /**
     * 属性 guid 的get方法
     * @return String
     */
    public String getGuid(){
        return guid;
    }
	
    /**
     * 属性 guid 的set方法
     * @return
     */
    public void setGuid(String guid){
        if(guid != null && guid.trim().length() == 0){
            this.guid = null;
        }else{
            this.guid = guid;
        }
    } 
	
    /**
     * 属性 userId 的get方法
     * @return String
     */
    public String getUserId(){
        return userId;
    }
	
    /**
     * 属性 userId 的set方法
     * @return
     */
    public void setUserId(String userId){
        this.userId = userId;
    } 
	
    /**
     * 属性 userName 的get方法
     * @return String
     */
    public String getUserName(){
        return userName;
    }
	
    /**
     * 属性 userName 的set方法
     * @return
     */
    public void setUserName(String userName){
        this.userName = userName;
    } 
	
    /**
     * 属性 sessionId 的get方法
     * @return String
     */
    public String getSessionId(){
        return sessionId;
    }
	
    /**
     * 属性 sessionId 的set方法
     * @return
     */
    public void setSessionId(String sessionId){
        this.sessionId = sessionId;
    } 
	
    /**
     * 属性 url 的get方法
     * @return String
     */
    public String getUrl(){
        return url;
    }
	
    /**
     * 属性 url 的set方法
     * @return
     */
    public void setUrl(String url){
        this.url = url;
    } 
	
    /**
     * 属性 overstepDate 的get方法
     * @return Timestamp
     */
    public Timestamp getOverstepDate(){
        return overstepDate;
    }
	
    /**
     * 属性 overstepDate 的set方法
     * @return
     */
    public void setOverstepDate(Timestamp overstepDate){
        this.overstepDate = overstepDate;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaOverstepAuthorityLog))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaOverstepAuthorityLog other = (BaOverstepAuthorityLog) o;	        
	    return new EqualsBuilder()
            .append(this.getGuid(), other.getGuid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("guid"+":"+getGuid())
            .append("userId"+":"+getUserId())
            .append("userName"+":"+getUserName())
            .append("sessionId"+":"+getSessionId())
            .append("url"+":"+getUrl())
            .append("overstepDate"+":"+getOverstepDate())
            .toString(); 
			
    } 
   

    /**
     * hashcode方法
     * @return int
     * 
     */
    @Override
    public int hashCode(){
		return super.hashCode();
	}

}