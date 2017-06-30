package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * PubReleaseRole的POJO类
 *
 * @author  zndw1  [Wed Jan 22 19:39:54 CST 2014]
 * 
 */
public class PubReleaseRole implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性subjectguid
     */
    private String subjectguid;
	
    /** 
     * 属性roleid
     */
    private String roleid;
	
    /** 
     * 属性isvalid
     */
    private String isvalid;
	
    /** 
     * 属性bak1
     */
    private String bak1;
	
    /** 
     * 属性bak2
     */
    private String bak2;
	
    /** 
     * 属性bak3
     */
    private String bak3;
	
    /** 
     * 属性bak4
     */
    private String bak4;
	
    /**
     * PubReleaseRole构造函数
     */
    public PubReleaseRole() {
        super();
    }  
	
    /**
     * PubReleaseRole完整的构造函数
     */  
    public PubReleaseRole(String guid,String marketid,String subjectguid,String roleid){
        this.guid = guid;
        this.marketid = marketid;
        this.subjectguid = subjectguid;
        this.roleid = roleid;
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
     * 属性 marketid 的get方法
     * @return String
     */
    public String getMarketid(){
        return marketid;
    }
	
    /**
     * 属性 marketid 的set方法
     * @return
     */
    public void setMarketid(String marketid){
        this.marketid = marketid;
    } 
	
    /**
     * 属性 subjectguid 的get方法
     * @return String
     */
    public String getSubjectguid(){
        return subjectguid;
    }
	
    /**
     * 属性 subjectguid 的set方法
     * @return
     */
    public void setSubjectguid(String subjectguid){
        this.subjectguid = subjectguid;
    } 
	
    /**
     * 属性 roleid 的get方法
     * @return String
     */
    public String getRoleid(){
        return roleid;
    }
	
    /**
     * 属性 roleid 的set方法
     * @return
     */
    public void setRoleid(String roleid){
        this.roleid = roleid;
    } 
	
    /**
     * 属性 isvalid 的get方法
     * @return String
     */
    public String getIsvalid(){
        return isvalid;
    }
	
    /**
     * 属性 isvalid 的set方法
     * @return
     */
    public void setIsvalid(String isvalid){
        this.isvalid = isvalid;
    } 
	
    /**
     * 属性 bak1 的get方法
     * @return String
     */
    public String getBak1(){
        return bak1;
    }
	
    /**
     * 属性 bak1 的set方法
     * @return
     */
    public void setBak1(String bak1){
        this.bak1 = bak1;
    } 
	
    /**
     * 属性 bak2 的get方法
     * @return String
     */
    public String getBak2(){
        return bak2;
    }
	
    /**
     * 属性 bak2 的set方法
     * @return
     */
    public void setBak2(String bak2){
        this.bak2 = bak2;
    } 
	
    /**
     * 属性 bak3 的get方法
     * @return String
     */
    public String getBak3(){
        return bak3;
    }
	
    /**
     * 属性 bak3 的set方法
     * @return
     */
    public void setBak3(String bak3){
        this.bak3 = bak3;
    } 
	
    /**
     * 属性 bak4 的get方法
     * @return String
     */
    public String getBak4(){
        return bak4;
    }
	
    /**
     * 属性 bak4 的set方法
     * @return
     */
    public void setBak4(String bak4){
        this.bak4 = bak4;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof PubReleaseRole))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        PubReleaseRole other = (PubReleaseRole) o;	        
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
            .append("marketid"+":"+getMarketid())
            .append("subjectguid"+":"+getSubjectguid())
            .append("roleid"+":"+getRoleid())
            .append("isvalid"+":"+getIsvalid())
            .append("bak1"+":"+getBak1())
            .append("bak2"+":"+getBak2())
            .append("bak3"+":"+getBak3())
            .append("bak4"+":"+getBak4())
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