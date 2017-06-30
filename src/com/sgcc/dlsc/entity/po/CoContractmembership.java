package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * CoContractmembership的POJO类
 *
 * @author  djdeng  [Wed Feb 19 16:12:13 CST 2014]
 * 
 */
public class CoContractmembership implements Serializable{

    /** 
     * 属性contracttypeid
     */
    private String contracttypeid;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性participantid
     */
    private String participantid;
	
    /** 
     * 属性displaytype
     */
    private BigDecimal displaytype;
	
    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性updatetime
     */
    private Date updatetime;
	
    /** 
     * 属性updatepersonid
     */
    private String updatepersonid;
	
    /**
     * CoContractmembership构造函数
     */
    public CoContractmembership() {
        super();
    }  
	
    /**
     * CoContractmembership完整的构造函数
     */  
    public CoContractmembership(String contracttypeid,String marketid,String participantid,BigDecimal displaytype,String guid){
        this.contracttypeid = contracttypeid;
        this.marketid = marketid;
        this.participantid = participantid;
        this.displaytype = displaytype;
        this.guid = guid;
    }
 
    /**
     * 属性 contracttypeid 的get方法
     * @return String
     */
    public String getContracttypeid(){
        return contracttypeid;
    }
	
    /**
     * 属性 contracttypeid 的set方法
     * @return
     */
    public void setContracttypeid(String contracttypeid){
        this.contracttypeid = contracttypeid;
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
    public void setUpdatetime(Date updatetime){
        this.updatetime = updatetime;
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
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof CoContractmembership))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        CoContractmembership other = (CoContractmembership) o;	        
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
            .append("contracttypeid"+":"+getContracttypeid())
            .append("marketid"+":"+getMarketid())
            .append("participantid"+":"+getParticipantid())
            .append("displaytype"+":"+getDisplaytype())
            .append("guid"+":"+getGuid())
            .append("updatetime"+":"+getUpdatetime())
            .append("updatepersonid"+":"+getUpdatepersonid())
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