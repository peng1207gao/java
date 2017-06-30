package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.sql.Date;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaDatachangeLogext的POJO类
 *
 * @author  Administrator  [Wed Mar 05 15:42:02 CST 2014]
 * 
 */
public class BaDatachangeLogext implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性fguid
     */
    private String fguid;
	
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
     * 属性keyvalue1
     */
    private String keyvalue1;
	
    /** 
     * 属性keyvalue2
     */
    private String keyvalue2;
	
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
     * 属性tableid
     */
    private String tableid;
	
    /**
     * BaDatachangeLogext构造函数
     */
    public BaDatachangeLogext() {
        super();
    }  
	
    /**
     * BaDatachangeLogext完整的构造函数
     */  
    public BaDatachangeLogext(String guid){
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
     * 属性 fguid 的get方法
     * @return String
     */
    public String getFguid(){
        return fguid;
    }
	
    /**
     * 属性 fguid 的set方法
     * @return
     */
    public void setFguid(String fguid){
        this.fguid = fguid;
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
     * 属性 keyvalue1 的get方法
     * @return String
     */
    public String getKeyvalue1(){
        return keyvalue1;
    }
	
    /**
     * 属性 keyvalue1 的set方法
     * @return
     */
    public void setKeyvalue1(String keyvalue1){
        this.keyvalue1 = keyvalue1;
    } 
	
    /**
     * 属性 keyvalue2 的get方法
     * @return String
     */
    public String getKeyvalue2(){
        return keyvalue2;
    }
	
    /**
     * 属性 keyvalue2 的set方法
     * @return
     */
    public void setKeyvalue2(String keyvalue2){
        this.keyvalue2 = keyvalue2;
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
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaDatachangeLogext))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaDatachangeLogext other = (BaDatachangeLogext) o;	        
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
            .append("fguid"+":"+getFguid())
            .append("userid"+":"+getUserid())
            .append("updatedate"+":"+getUpdatedate())
            .append("marketId"+":"+getMarketId())
            .append("keyvalue1"+":"+getKeyvalue1())
            .append("keyvalue2"+":"+getKeyvalue2())
            .append("deptCode"+":"+getDeptCode())
            .append("tabYear"+":"+getTabYear())
            .append("tabMonth"+":"+getTabMonth())
            .append("tabDay"+":"+getTabDay())
            .append("tableid"+":"+getTableid())
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