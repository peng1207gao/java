package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TrPageDisplayConfig的POJO类
 *
 * @author  DWJ  [Sat Apr 12 10:07:55 CST 2014]
 * 
 */
public class TrPageDisplayConfig implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性tradetypeCode
     */
    private String tradetypeCode;
	
    /** 
     * 属性marketId
     */
    private String marketId;
	
    /** 
     * 属性pageId
     */
    private String pageId;
	
    /** 
     * 属性columnPhysicsName
     */
    private String columnPhysicsName;
	
    /** 
     * 属性columnName
     */
    private String columnName;
	
    /** 
     * 属性columnIsDisplay
     */
    private BigDecimal columnIsDisplay;
	
    /** 
     * 属性columnIsLock
     */
    private BigDecimal columnIsLock;
	
    /** 
     * 属性columnDisplayName
     */
    private String columnDisplayName;
	
    /** 
     * 属性columnDisplayNum
     */
    private BigDecimal columnDisplayNum;
	
    /** 
     * 属性tablePhysicsName
     */
    private String tablePhysicsName;
	
    /** 
     * 属性tableName
     */
    private String tableName;
	
    /**
     * TrPageDisplayConfig构造函数
     */
    public TrPageDisplayConfig() {
        super();
    }  
	
    /**
     * TrPageDisplayConfig完整的构造函数
     */  
    public TrPageDisplayConfig(String guid,String tradetypeCode,String marketId,String pageId,String columnPhysicsName,BigDecimal columnIsDisplay,String columnDisplayName){
        this.guid = guid;
        this.tradetypeCode = tradetypeCode;
        this.marketId = marketId;
        this.pageId = pageId;
        this.columnPhysicsName = columnPhysicsName;
        this.columnIsDisplay = columnIsDisplay;
        this.columnDisplayName = columnDisplayName;
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
     * 属性 tradetypeCode 的get方法
     * @return String
     */
    public String getTradetypeCode(){
        return tradetypeCode;
    }
	
    /**
     * 属性 tradetypeCode 的set方法
     * @return
     */
    public void setTradetypeCode(String tradetypeCode){
        this.tradetypeCode = tradetypeCode;
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
     * 属性 pageId 的get方法
     * @return String
     */
    public String getPageId(){
        return pageId;
    }
	
    /**
     * 属性 pageId 的set方法
     * @return
     */
    public void setPageId(String pageId){
        this.pageId = pageId;
    } 
	
    /**
     * 属性 columnPhysicsName 的get方法
     * @return String
     */
    public String getColumnPhysicsName(){
        return columnPhysicsName;
    }
	
    /**
     * 属性 columnPhysicsName 的set方法
     * @return
     */
    public void setColumnPhysicsName(String columnPhysicsName){
        this.columnPhysicsName = columnPhysicsName;
    } 
	
    /**
     * 属性 columnName 的get方法
     * @return String
     */
    public String getColumnName(){
        return columnName;
    }
	
    /**
     * 属性 columnName 的set方法
     * @return
     */
    public void setColumnName(String columnName){
        this.columnName = columnName;
    } 
	
    /**
     * 属性 columnIsDisplay 的get方法
     * @return BigDecimal
     */
    public BigDecimal getColumnIsDisplay(){
        return columnIsDisplay;
    }
	
    /**
     * 属性 columnIsDisplay 的set方法
     * @return
     */
    public void setColumnIsDisplay(BigDecimal columnIsDisplay){
        this.columnIsDisplay = columnIsDisplay;
    } 
	
    /**
     * 属性 columnIsLock 的get方法
     * @return BigDecimal
     */
    public BigDecimal getColumnIsLock(){
        return columnIsLock;
    }
	
    /**
     * 属性 columnIsLock 的set方法
     * @return
     */
    public void setColumnIsLock(BigDecimal columnIsLock){
        this.columnIsLock = columnIsLock;
    } 
	
    /**
     * 属性 columnDisplayName 的get方法
     * @return String
     */
    public String getColumnDisplayName(){
        return columnDisplayName;
    }
	
    /**
     * 属性 columnDisplayName 的set方法
     * @return
     */
    public void setColumnDisplayName(String columnDisplayName){
        this.columnDisplayName = columnDisplayName;
    } 
	
    /**
     * 属性 columnDisplayNum 的get方法
     * @return BigDecimal
     */
    public BigDecimal getColumnDisplayNum(){
        return columnDisplayNum;
    }
	
    /**
     * 属性 columnDisplayNum 的set方法
     * @return
     */
    public void setColumnDisplayNum(BigDecimal columnDisplayNum){
        this.columnDisplayNum = columnDisplayNum;
    } 
	
    /**
     * 属性 tablePhysicsName 的get方法
     * @return String
     */
    public String getTablePhysicsName(){
        return tablePhysicsName;
    }
	
    /**
     * 属性 tablePhysicsName 的set方法
     * @return
     */
    public void setTablePhysicsName(String tablePhysicsName){
        this.tablePhysicsName = tablePhysicsName;
    } 
	
    /**
     * 属性 tableName 的get方法
     * @return String
     */
    public String getTableName(){
        return tableName;
    }
	
    /**
     * 属性 tableName 的set方法
     * @return
     */
    public void setTableName(String tableName){
        this.tableName = tableName;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof TrPageDisplayConfig))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        TrPageDisplayConfig other = (TrPageDisplayConfig) o;	        
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
            .append("tradetypeCode"+":"+getTradetypeCode())
            .append("marketId"+":"+getMarketId())
            .append("pageId"+":"+getPageId())
            .append("columnPhysicsName"+":"+getColumnPhysicsName())
            .append("columnName"+":"+getColumnName())
            .append("columnIsDisplay"+":"+getColumnIsDisplay())
            .append("columnIsLock"+":"+getColumnIsLock())
            .append("columnDisplayName"+":"+getColumnDisplayName())
            .append("columnDisplayNum"+":"+getColumnDisplayNum())
            .append("tablePhysicsName"+":"+getTablePhysicsName())
            .append("tableName"+":"+getTableName())
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