package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.sql.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * IrTablegroupsGrant的POJO类
 *
 * @author  zhen  [Sun Oct 20 16:12:47 CST 2013]
 * 
 */
public class IrTablegroupsGrant implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性marketId
     */
    private String marketId;
	
    /** 
     * 属性groupId
     */
    private String groupId;
	
    /** 
     * 属性jydyId
     */
    private String jydyId;
	
    /** 
     * 属性regDate
     */
    private Date regDate;
	
    /**
     * IrTablegroupsGrant构造函数
     */
    public IrTablegroupsGrant() {
        super();
    }  
	
    /**
     * IrTablegroupsGrant完整的构造函数
     */  
    public IrTablegroupsGrant(String guid,String marketId,String groupId){
        this.guid = guid;
        this.marketId = marketId;
        this.groupId = groupId;
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
     * 属性 marketId 的get方法
     * @return String
     */
    public String getMarketId(){
        return marketId;
    }
	
    /**
     * 属性 marketId 的set方法
     * @return
     */
    public void setMarketId(String marketId){
        this.marketId = marketId;
    } 
	
    /**
     * 属性 groupId 的get方法
     * @return String
     */
    public String getGroupId(){
        return groupId;
    }
	
    /**
     * 属性 groupId 的set方法
     * @return
     */
    public void setGroupId(String groupId){
        this.groupId = groupId;
    } 
	
    /**
     * 属性 jydyId 的get方法
     * @return String
     */
    public String getJydyId(){
        return jydyId;
    }
	
    /**
     * 属性 jydyId 的set方法
     * @return
     */
    public void setJydyId(String jydyId){
        this.jydyId = jydyId;
    } 
	
    /**
     * 属性 regDate 的get方法
     * @return Date
     */
    public Date getRegDate(){
        return regDate;
    }
	
    /**
     * 属性 regDate 的set方法
     * @return
     */
    public void setRegDate(Date regDate){
        this.regDate = regDate;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof IrTablegroupsGrant))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        IrTablegroupsGrant other = (IrTablegroupsGrant) o;	        
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
            .append("marketId"+":"+getMarketId())
            .append("groupId"+":"+getGroupId())
            .append("jydyId"+":"+getJydyId())
            .append("regDate"+":"+getRegDate())
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