package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.sql.Date;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaDatachangeLog的POJO类
 *
 * @author  Administrator  [Wed Mar 05 15:39:37 CST 2014]
 * 
 */
public class BaDatachangeLog implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性tableid
     */
    private String tableid;
	
    /** 
     * 属性userid
     */
    private String userid;
	
    /** 
     * 属性updatedate
     */
    private Date updatedate;
	
    /** 
     * 属性marketId
     */
    private String marketId;
	
    /** 
     * 属性wherecond
     */
    private String wherecond;
	
    /** 
     * 属性condext
     */
    private String condext;
	
    /** 
     * 属性deptCode
     */
    private String deptCode;
	
    /** 
     * 属性tabYear
     */
    private BigDecimal tabYear;
	
    /** 
     * 属性tabMonth
     */
    private BigDecimal tabMonth;
	
    /** 
     * 属性tabDay
     */
    private BigDecimal tabDay;
	
    /** 
     * 属性dataFlag
     */
    private String dataFlag;
	
    /**
     * BaDatachangeLog构造函数
     */
    public BaDatachangeLog() {
        super();
    }  
	
    /**
     * BaDatachangeLog完整的构造函数
     */  
    public BaDatachangeLog(String guid){
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
     * 属性 tableid 的get方法
     * @return String
     */
    public String getTableid(){
        return tableid;
    }
	
    /**
     * 属性 tableid 的set方法
     * @return
     */
    public void setTableid(String tableid){
        this.tableid = tableid;
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
     * 属性 updatedate 的get方法
     * @return Date
     */
    public Date getUpdatedate(){
        return updatedate;
    }
	
    /**
     * 属性 updatedate 的set方法
     * @return
     */
    public void setUpdatedate(Date updatedate){
        this.updatedate = updatedate;
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
     * 属性 wherecond 的get方法
     * @return String
     */
    public String getWherecond(){
        return wherecond;
    }
	
    /**
     * 属性 wherecond 的set方法
     * @return
     */
    public void setWherecond(String wherecond){
        this.wherecond = wherecond;
    } 
	
    /**
     * 属性 condext 的get方法
     * @return String
     */
    public String getCondext(){
        return condext;
    }
	
    /**
     * 属性 condext 的set方法
     * @return
     */
    public void setCondext(String condext){
        this.condext = condext;
    } 
	
    /**
     * 属性 deptCode 的get方法
     * @return String
     */
    public String getDeptCode(){
        return deptCode;
    }
	
    /**
     * 属性 deptCode 的set方法
     * @return
     */
    public void setDeptCode(String deptCode){
        this.deptCode = deptCode;
    } 
	
    /**
     * 属性 tabYear 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTabYear(){
        return tabYear;
    }
	
    /**
     * 属性 tabYear 的set方法
     * @return
     */
    public void setTabYear(BigDecimal tabYear){
        this.tabYear = tabYear;
    } 
	
    /**
     * 属性 tabMonth 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTabMonth(){
        return tabMonth;
    }
	
    /**
     * 属性 tabMonth 的set方法
     * @return
     */
    public void setTabMonth(BigDecimal tabMonth){
        this.tabMonth = tabMonth;
    } 
	
    /**
     * 属性 tabDay 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTabDay(){
        return tabDay;
    }
	
    /**
     * 属性 tabDay 的set方法
     * @return
     */
    public void setTabDay(BigDecimal tabDay){
        this.tabDay = tabDay;
    } 
	
    /**
     * 属性 dataFlag 的get方法
     * @return String
     */
    public String getDataFlag(){
        return dataFlag;
    }
	
    /**
     * 属性 dataFlag 的set方法
     * @return
     */
    public void setDataFlag(String dataFlag){
        this.dataFlag = dataFlag;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaDatachangeLog))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaDatachangeLog other = (BaDatachangeLog) o;	        
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
            .append("tableid"+":"+getTableid())
            .append("userid"+":"+getUserid())
            .append("updatedate"+":"+getUpdatedate())
            .append("marketId"+":"+getMarketId())
            .append("wherecond"+":"+getWherecond())
            .append("condext"+":"+getCondext())
            .append("deptCode"+":"+getDeptCode())
            .append("tabYear"+":"+getTabYear())
            .append("tabMonth"+":"+getTabMonth())
            .append("tabDay"+":"+getTabDay())
            .append("dataFlag"+":"+getDataFlag())
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