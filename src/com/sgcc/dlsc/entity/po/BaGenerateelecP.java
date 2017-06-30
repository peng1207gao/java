package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaGenerateelecP的POJO类
 *
 * @author  Administrator  [Tue Jul 16 15:17:04 CST 2013]
 * 
 */
public class BaGenerateelecP implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性marketcode
     */
    private String marketcode;
	
    /** 
     * 属性dateType
     */
    private BigDecimal dateType;
	
    /** 
     * 属性tabdate
     */
    private Date tabdate;
	
    /** 
     * 属性hydropowername
     */
    private String hydropowername;
	
    /** 
     * 属性hydropowerid
     */
    private String hydropowerid;
	
    /** 
     * 属性powertype
     */
    private BigDecimal powertype;
	
    /** 
     * 属性generateelec
     */
    private BigDecimal generateelec;
	
    /**
     * BaGenerateelecP构造函数
     */
    public BaGenerateelecP() {
        super();
    }  
	
    /**
     * BaGenerateelecP完整的构造函数
     */  
    public BaGenerateelecP(String guid,String marketcode,BigDecimal dateType,Date tabdate,String hydropowerid){
        this.guid = guid;
        this.marketcode = marketcode;
        this.dateType = dateType;
        this.tabdate = tabdate;
        this.hydropowerid = hydropowerid;
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
     * 属性 marketcode 的get方法
     * @return String
     */
    public String getMarketcode(){
        return marketcode;
    }
	
    /**
     * 属性 marketcode 的set方法
     * @return
     */
    public void setMarketcode(String marketcode){
        this.marketcode = marketcode;
    } 
	
    /**
     * 属性 dateType 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDateType(){
        return dateType;
    }
	
    /**
     * 属性 dateType 的set方法
     * @return
     */
    public void setDateType(BigDecimal dateType){
        this.dateType = dateType;
    } 
	
    /**
     * 属性 tabdate 的get方法
     * @return Date
     */
    public Date getTabdate(){
        return tabdate;
    }
	
    /**
     * 属性 tabdate 的set方法
     * @return
     */
    public void setTabdate(Date tabdate){
        this.tabdate = tabdate;
    } 
	
    /**
     * 属性 hydropowername 的get方法
     * @return String
     */
    public String getHydropowername(){
        return hydropowername;
    }
	
    /**
     * 属性 hydropowername 的set方法
     * @return
     */
    public void setHydropowername(String hydropowername){
        this.hydropowername = hydropowername;
    } 
	
    /**
     * 属性 hydropowerid 的get方法
     * @return String
     */
    public String getHydropowerid(){
        return hydropowerid;
    }
	
    /**
     * 属性 hydropowerid 的set方法
     * @return
     */
    public void setHydropowerid(String hydropowerid){
        this.hydropowerid = hydropowerid;
    } 
	
    /**
     * 属性 powertype 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPowertype(){
        return powertype;
    }
	
    /**
     * 属性 powertype 的set方法
     * @return
     */
    public void setPowertype(BigDecimal powertype){
        this.powertype = powertype;
    } 
	
    /**
     * 属性 generateelec 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGenerateelec(){
        return generateelec;
    }
	
    /**
     * 属性 generateelec 的set方法
     * @return
     */
    public void setGenerateelec(BigDecimal generateelec){
        this.generateelec = generateelec;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaGenerateelecP))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaGenerateelecP other = (BaGenerateelecP) o;	        
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
            .append("marketcode"+":"+getMarketcode())
            .append("dateType"+":"+getDateType())
            .append("tabdate"+":"+getTabdate())
            .append("hydropowername"+":"+getHydropowername())
            .append("hydropowerid"+":"+getHydropowerid())
            .append("powertype"+":"+getPowertype())
            .append("generateelec"+":"+getGenerateelec())
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