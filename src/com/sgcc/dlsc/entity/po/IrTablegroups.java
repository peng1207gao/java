package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.sql.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * IrTablegroups的POJO类
 *
 * @author  zhen  [Wed Sep 25 16:53:04 CST 2013]
 * 
 */
public class IrTablegroups implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性tableType
     */
    private String tableType;
	
    /** 
     * 属性tablenameCn
     */
    private String tablenameCn;
	
    /** 
     * 属性tablenameEn
     */
    private String tablenameEn;
	
    /** 
     * 属性groupId
     */
    private String groupId;
	
    /** 
     * 属性groupName
     */
    private String groupName;
	
    /** 
     * 属性marketId
     */
    private String marketId;
	
    /** 
     * 属性regPerson
     */
    private String regPerson;
	
    /** 
     * 属性regDate
     */
    private Date regDate;
	
    /**
     * IrTablegroups构造函数
     */
    public IrTablegroups() {
        super();
    }  
	
    /**
     * IrTablegroups完整的构造函数
     */  
    public IrTablegroups(String guid,String tablenameEn,String groupId){
        this.guid = guid;
        this.tablenameEn = tablenameEn;
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
     * 属性 tableType 的get方法
     * @return String
     */
    public String getTableType(){
        return tableType;
    }
	
    /**
     * 属性 tableType 的set方法
     * @return
     */
    public void setTableType(String tableType){
        this.tableType = tableType;
    } 
	
    /**
     * 属性 tablenameCn 的get方法
     * @return String
     */
    public String getTablenameCn(){
        return tablenameCn;
    }
	
    /**
     * 属性 tablenameCn 的set方法
     * @return
     */
    public void setTablenameCn(String tablenameCn){
        this.tablenameCn = tablenameCn;
    } 
	
    /**
     * 属性 tablenameEn 的get方法
     * @return String
     */
    public String getTablenameEn(){
        return tablenameEn;
    }
	
    /**
     * 属性 tablenameEn 的set方法
     * @return
     */
    public void setTablenameEn(String tablenameEn){
        this.tablenameEn = tablenameEn;
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
     * 属性 groupName 的get方法
     * @return String
     */
    public String getGroupName(){
        return groupName;
    }
	
    /**
     * 属性 groupName 的set方法
     * @return
     */
    public void setGroupName(String groupName){
        this.groupName = groupName;
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
     * 属性 regPerson 的get方法
     * @return String
     */
    public String getRegPerson(){
        return regPerson;
    }
	
    /**
     * 属性 regPerson 的set方法
     * @return
     */
    public void setRegPerson(String regPerson){
        this.regPerson = regPerson;
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
		
        if (o == null || !(o instanceof IrTablegroups))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        IrTablegroups other = (IrTablegroups) o;	        
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
            .append("tableType"+":"+getTableType())
            .append("tablenameCn"+":"+getTablenameCn())
            .append("tablenameEn"+":"+getTablenameEn())
            .append("groupId"+":"+getGroupId())
            .append("groupName"+":"+getGroupName())
            .append("marketId"+":"+getMarketId())
            .append("regPerson"+":"+getRegPerson())
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