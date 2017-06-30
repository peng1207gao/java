package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * CoContractaccessory的POJO类
 *
 * @author  djdeng  [Thu Feb 13 10:18:31 CST 2014]
 * 
 */
public class CoContractaccessory implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性contractid
     */
    private String contractid;
	
    /** 
     * 属性contractrole
     */
    private BigDecimal contractrole;
	
    /** 
     * 属性participantid
     */
    private String participantid;
	
    /** 
     * 属性unitid
     */
    private String unitid;
	
    /**
     * CoContractaccessory构造函数
     */
    public CoContractaccessory() {
        super();
    }  
	
    /**
     * CoContractaccessory完整的构造函数
     */  
    public CoContractaccessory(String guid,String contractid,BigDecimal contractrole){
        this.guid = guid;
        this.contractid = contractid;
        this.contractrole = contractrole;
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
     * 属性 contractrole 的get方法
     * @return BigDecimal
     */
    public BigDecimal getContractrole(){
        return contractrole;
    }
	
    /**
     * 属性 contractrole 的set方法
     * @return
     */
    public void setContractrole(BigDecimal contractrole){
        this.contractrole = contractrole;
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
     * 属性 unitid 的get方法
     * @return String
     */
    public String getUnitid(){
        return unitid;
    }
	
    /**
     * 属性 unitid 的set方法
     * @return
     */
    public void setUnitid(String unitid){
        this.unitid = unitid;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof CoContractaccessory))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        CoContractaccessory other = (CoContractaccessory) o;	        
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
            .append("contractid"+":"+getContractid())
            .append("contractrole"+":"+getContractrole())
            .append("participantid"+":"+getParticipantid())
            .append("unitid"+":"+getUnitid())
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