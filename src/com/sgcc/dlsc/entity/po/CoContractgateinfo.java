package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * CoContractgateinfo的POJO类
 *
 * @author  thinpad  [Fri Feb 07 17:43:51 CST 2014]
 * 
 */
public class CoContractgateinfo implements Serializable{

    /** 
     * 属性contractid
     */
    private String contractid;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性gateid
     */
    private String gateid;
	
    /** 
     * 属性gatename
     */
    private String gatename;
	
    /** 
     * 属性displaytype
     */
    private BigDecimal displaytype;
	
    /** 
     * 属性participantid
     */
    private String participantid;
	
    /** 
     * 属性busiunitid
     */
    private String busiunitid;
	
    /** 
     * 属性updatetime
     */
    private Date updatetime;
	
    /** 
     * 属性updatepersonid
     */
    private String updatepersonid;
	
    /** 
     * 属性guid
     */
    private String guid;
	
    /**
     * CoContractgateinfo构造函数
     */
    public CoContractgateinfo() {
        super();
    }  
	
    /**
     * CoContractgateinfo完整的构造函数
     */  
    public CoContractgateinfo(String contractid,String gateid,String guid){
        this.contractid = contractid;
        this.gateid = gateid;
        this.guid = guid;
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
     * 属性 gateid 的get方法
     * @return String
     */
    public String getGateid(){
        return gateid;
    }
	
    /**
     * 属性 gateid 的set方法
     * @return
     */
    public void setGateid(String gateid){
        this.gateid = gateid;
    } 
	
    /**
     * 属性 gatename 的get方法
     * @return String
     */
    public String getGatename(){
        return gatename;
    }
	
    /**
     * 属性 gatename 的set方法
     * @return
     */
    public void setGatename(String gatename){
        this.gatename = gatename;
    } 
	
    /**
     * 属性 displaytype 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDisplaytype(){
        return displaytype;
    }
	
    /**
     * 属性 displaytype 的set方法
     * @return
     */
    public void setDisplaytype(BigDecimal displaytype){
        this.displaytype = displaytype;
    } 
	
    /**
     * 属性 participantid 的get方法
     * @return String
     */
    public String getParticipantid(){
        return participantid;
    }
	
    /**
     * 属性 participantid 的set方法
     * @return
     */
    public void setParticipantid(String participantid){
        this.participantid = participantid;
    } 
	
    /**
     * 属性 busiunitid 的get方法
     * @return String
     */
    public String getBusiunitid(){
        return busiunitid;
    }
	
    /**
     * 属性 busiunitid 的set方法
     * @return
     */
    public void setBusiunitid(String busiunitid){
        this.busiunitid = busiunitid;
    } 
	
    /**
     * 属性 updatetime 的get方法
     * @return Date
     */
    public Date getUpdatetime(){
        return updatetime;
    }
	
    /**
     * 属性 updatetime 的set方法
     * @return
     */
    public void setUpdatetime(Date date){
        this.updatetime = date;
    } 
	
    /**
     * 属性 updatepersonid 的get方法
     * @return String
     */
    public String getUpdatepersonid(){
        return updatepersonid;
    }
	
    /**
     * 属性 updatepersonid 的set方法
     * @return
     */
    public void setUpdatepersonid(String updatepersonid){
        this.updatepersonid = updatepersonid;
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
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof CoContractgateinfo))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        CoContractgateinfo other = (CoContractgateinfo) o;	        
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
            .append("contractid"+":"+getContractid())
            .append("marketid"+":"+getMarketid())
            .append("gateid"+":"+getGateid())
            .append("gatename"+":"+getGatename())
            .append("displaytype"+":"+getDisplaytype())
            .append("participantid"+":"+getParticipantid())
            .append("busiunitid"+":"+getBusiunitid())
            .append("updatetime"+":"+getUpdatetime())
            .append("updatepersonid"+":"+getUpdatepersonid())
            .append("guid"+":"+getGuid())
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