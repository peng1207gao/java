package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * ZxjcProaccessLog的POJO类
 *
 * @author  Administrator  [Wed Apr 23 15:22:39 CST 2014]
 * 
 */
public class ZxjcProaccessLog implements Serializable{

    /** 
     * 属性sheetid
     */
    private String sheetid = "sys_guid()";
	
    /** 
     * 属性exTime
     */
    private String exTime = "to_char(sysdate,'yyyy-mm-dd hh24:mi:ss')";
	
    /** 
     * 属性marketidSource
     */
    private String marketidSource;
	
    /** 
     * 属性marketidTarget
     */
    private String marketidTarget;
	
    /** 
     * 属性tablename
     */
    private String tablename;
	
    /** 
     * 属性wherecondtion
     */
    private String wherecondtion;
	
    /** 
     * 属性userid
     */
    private String userid;
	
    /** 
     * 属性username
     */
    private String username;
	
    /** 
     * 属性fireDate
     */
    private String fireDate;
	
    /** 
     * 属性vitype
     */
    private String vitype;
	
    /** 
     * 属性issuc
     */
    private String issuc;
	
    /** 
     * 属性failinfo
     */
    private String failinfo;
	
    /**
     * ZxjcProaccessLog构造函数
     */
    public ZxjcProaccessLog() {
        super();
    }  
	
    /**
     * ZxjcProaccessLog完整的构造函数
     */  
    public ZxjcProaccessLog(String sheetid){
        this.sheetid = sheetid;
    }
 
    /**
     * 属性 sheetid 的get方法
     * @return String
     */
    public String getSheetid(){
        return sheetid;
    }
	
    /**
     * 属性 sheetid 的set方法
     * @return
     */
    public void setSheetid(String sheetid){
        if(sheetid != null && sheetid.trim().length() == 0){
            this.sheetid = null;
        }else{
            this.sheetid = sheetid;
        }
    } 
	
    /**
     * 属性 exTime 的get方法
     * @return String
     */
    public String getExTime(){
        return exTime;
    }
	
    /**
     * 属性 exTime 的set方法
     * @return
     */
    public void setExTime(String exTime){
        this.exTime = exTime;
    } 
	
    /**
     * 属性 marketidSource 的get方法
     * @return String
     */
    public String getMarketidSource(){
        return marketidSource;
    }
	
    /**
     * 属性 marketidSource 的set方法
     * @return
     */
    public void setMarketidSource(String marketidSource){
        this.marketidSource = marketidSource;
    } 
	
    /**
     * 属性 marketidTarget 的get方法
     * @return String
     */
    public String getMarketidTarget(){
        return marketidTarget;
    }
	
    /**
     * 属性 marketidTarget 的set方法
     * @return
     */
    public void setMarketidTarget(String marketidTarget){
        this.marketidTarget = marketidTarget;
    } 
	
    /**
     * 属性 tablename 的get方法
     * @return String
     */
    public String getTablename(){
        return tablename;
    }
	
    /**
     * 属性 tablename 的set方法
     * @return
     */
    public void setTablename(String tablename){
        this.tablename = tablename;
    } 
	
    /**
     * 属性 wherecondtion 的get方法
     * @return String
     */
    public String getWherecondtion(){
        return wherecondtion;
    }
	
    /**
     * 属性 wherecondtion 的set方法
     * @return
     */
    public void setWherecondtion(String wherecondtion){
        this.wherecondtion = wherecondtion;
    } 
	
    /**
     * 属性 userid 的get方法
     * @return String
     */
    public String getUserid(){
        return userid;
    }
	
    /**
     * 属性 userid 的set方法
     * @return
     */
    public void setUserid(String userid){
        this.userid = userid;
    } 
	
    /**
     * 属性 username 的get方法
     * @return String
     */
    public String getUsername(){
        return username;
    }
	
    /**
     * 属性 username 的set方法
     * @return
     */
    public void setUsername(String username){
        this.username = username;
    } 
	
    /**
     * 属性 fireDate 的get方法
     * @return String
     */
    public String getFireDate(){
        return fireDate;
    }
	
    /**
     * 属性 fireDate 的set方法
     * @return
     */
    public void setFireDate(String fireDate){
        this.fireDate = fireDate;
    } 
	
    /**
     * 属性 vitype 的get方法
     * @return String
     */
    public String getVitype(){
        return vitype;
    }
	
    /**
     * 属性 vitype 的set方法
     * @return
     */
    public void setVitype(String vitype){
        this.vitype = vitype;
    } 
	
    /**
     * 属性 issuc 的get方法
     * @return String
     */
    public String getIssuc(){
        return issuc;
    }
	
    /**
     * 属性 issuc 的set方法
     * @return
     */
    public void setIssuc(String issuc){
        this.issuc = issuc;
    } 
	
    /**
     * 属性 failinfo 的get方法
     * @return String
     */
    public String getFailinfo(){
        return failinfo;
    }
	
    /**
     * 属性 failinfo 的set方法
     * @return
     */
    public void setFailinfo(String failinfo){
        this.failinfo = failinfo;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof ZxjcProaccessLog))
	        return false; 
			
        if(getSheetid() == null) 
	        return false;

        ZxjcProaccessLog other = (ZxjcProaccessLog) o;	        
	    return new EqualsBuilder()
            .append(this.getSheetid(), other.getSheetid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("sheetid"+":"+getSheetid())
            .append("exTime"+":"+getExTime())
            .append("marketidSource"+":"+getMarketidSource())
            .append("marketidTarget"+":"+getMarketidTarget())
            .append("tablename"+":"+getTablename())
            .append("wherecondtion"+":"+getWherecondtion())
            .append("userid"+":"+getUserid())
            .append("username"+":"+getUsername())
            .append("fireDate"+":"+getFireDate())
            .append("vitype"+":"+getVitype())
            .append("issuc"+":"+getIssuc())
            .append("failinfo"+":"+getFailinfo())
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