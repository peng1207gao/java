package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * CoContractbusiflowinfo的POJO类
 *
 * @author  DELL  [Tue Jan 21 17:13:38 CST 2014]
 * 
 */
public class CoContractbusiflowinfo implements Serializable{

    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性contractid
     */
    private String contractid;
	
    /** 
     * 属性versionid
     */
    private String versionid;
	
    /** 
     * 属性busiflowid
     */
    private String busiflowid;
	
    /** 
     * 属性busiflowstate
     */
    private BigDecimal busiflowstate;
	
    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性startdate
     */
    private Date startdate;
	
    /** 
     * 属性enddate
     */
    private Date enddate;
	
    /**
     * CoContractbusiflowinfo构造函数
     */
    public CoContractbusiflowinfo() {
        super();
    }  
	
    /**
     * CoContractbusiflowinfo完整的构造函数
     */  
    public CoContractbusiflowinfo(String marketid,String contractid,String versionid,String guid){
        this.marketid = marketid;
        this.contractid = contractid;
        this.versionid = versionid;
        this.guid = guid;
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
     * 属性 contractid 的get方法
     * @return String
     */
    public String getContractid(){
        return contractid;
    }
	
    /**
     * 属性 contractid 的set方法
     * @return
     */
    public void setContractid(String contractid){
        this.contractid = contractid;
    } 
	
    /**
     * 属性 versionid 的get方法
     * @return String
     */
    public String getVersionid(){
        return versionid;
    }
	
    /**
     * 属性 versionid 的set方法
     * @return
     */
    public void setVersionid(String versionid){
        this.versionid = versionid;
    } 
	
    /**
     * 属性 busiflowid 的get方法
     * @return String
     */
    public String getBusiflowid(){
        return busiflowid;
    }
	
    /**
     * 属性 busiflowid 的set方法
     * @return
     */
    public void setBusiflowid(String busiflowid){
        this.busiflowid = busiflowid;
    } 
	
    /**
     * 属性 busiflowstate 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBusiflowstate(){
        return busiflowstate;
    }
	
    /**
     * 属性 busiflowstate 的set方法
     * @return
     */
    public void setBusiflowstate(BigDecimal busiflowstate){
        this.busiflowstate = busiflowstate;
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
     * 属性 startdate 的get方法
     * @return Date
     */
    public Date getStartdate(){
        return startdate;
    }
	
    /**
     * 属性 startdate 的set方法
     * @return
     */
    public void setStartdate(Date startdate){
        this.startdate = startdate;
    } 
	
    /**
     * 属性 enddate 的get方法
     * @return Date
     */
    public Date getEnddate(){
        return enddate;
    }
	
    /**
     * 属性 enddate 的set方法
     * @return
     */
    public void setEnddate(Date enddate){
        this.enddate = enddate;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof CoContractbusiflowinfo))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        CoContractbusiflowinfo other = (CoContractbusiflowinfo) o;	        
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
            .append("marketid"+":"+getMarketid())
            .append("contractid"+":"+getContractid())
            .append("versionid"+":"+getVersionid())
            .append("busiflowid"+":"+getBusiflowid())
            .append("busiflowstate"+":"+getBusiflowstate())
            .append("guid"+":"+getGuid())
            .append("startdate"+":"+getStartdate())
            .append("enddate"+":"+getEnddate())
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