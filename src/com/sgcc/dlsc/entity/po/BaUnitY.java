package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaUnitY的POJO类
 *
 * @author  Administrator  [Tue Jul 16 15:17:31 CST 2013]
 * 
 */
public class BaUnitY implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性tabDate
     */
    private Date tabDate;
	
    /** 
     * 属性gdp
     */
    private BigDecimal gdp;
	
    /** 
     * 属性gdpsum
     */
    private BigDecimal gdpsum;
	
    /** 
     * 属性gdpnextY
     */
    private BigDecimal gdpnextY;
	
    /** 
     * 属性gdpnextM
     */
    private BigDecimal gdpnextM;
    
    private BigDecimal dateType;
	
    /**
     * BaUnitY构造函数
     */
    public BaUnitY() {
        super();
    }  
	
    /**
     * BaUnitY完整的构造函数
     */  
    public BaUnitY(String guid,String marketid,Date tabDate){
        this.guid = guid;
        this.marketid = marketid;
        this.tabDate = tabDate;
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
	


	public BigDecimal getDateType() {
		return dateType;
	}

	public void setDateType(BigDecimal dateType) {
		this.dateType = dateType;
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
     * 属性 tabDate 的get方法
     * @return Date
     */
    public Date getTabDate(){
        return tabDate;
    }
	
    /**
     * 属性 tabDate 的set方法
     * @return
     */
    public void setTabDate(Date tabDate){
        this.tabDate = tabDate;
    } 
	
    /**
     * 属性 gdp 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGdp(){
        return gdp;
    }
	
    /**
     * 属性 gdp 的set方法
     * @return
     */
    public void setGdp(BigDecimal gdp){
        this.gdp = gdp;
    } 
	
    /**
     * 属性 gdpsum 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGdpsum(){
        return gdpsum;
    }
	
    /**
     * 属性 gdpsum 的set方法
     * @return
     */
    public void setGdpsum(BigDecimal gdpsum){
        this.gdpsum = gdpsum;
    } 
	
    /**
     * 属性 gdpnextY 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGdpnextY(){
        return gdpnextY;
    }
	
    /**
     * 属性 gdpnextY 的set方法
     * @return
     */
    public void setGdpnextY(BigDecimal gdpnextY){
        this.gdpnextY = gdpnextY;
    } 
	
    /**
     * 属性 gdpnextM 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGdpnextM(){
        return gdpnextM;
    }
	
    /**
     * 属性 gdpnextM 的set方法
     * @return
     */
    public void setGdpnextM(BigDecimal gdpnextM){
        this.gdpnextM = gdpnextM;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaUnitY))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaUnitY other = (BaUnitY) o;	        
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
            .append("marketid"+":"+getMarketid())
            .append("tabDate"+":"+getTabDate())
            .append("gdp"+":"+getGdp())
            .append("gdpsum"+":"+getGdpsum())
            .append("gdpnextY"+":"+getGdpnextY())
            .append("gdpnextM"+":"+getGdpnextM())
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