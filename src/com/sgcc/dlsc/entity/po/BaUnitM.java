package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaUnitM的POJO类
 *
 * @author  Administrator  [Wed Jul 17 16:36:39 CST 2013]
 * 
 */
public class BaUnitM implements Serializable{

    /**
	 * @description 
	 */
	private static final long serialVersionUID = 1L;

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
     * 属性generatepower
     */
    private BigDecimal generatepower;
	
    /** 
     * 属性generateelec
     */
    private BigDecimal generateelec;
	
    /** 
     * 属性maxloadforecast
     */
    private BigDecimal maxloadforecast;
	
    /** 
     * 属性consumption
     */
    private BigDecimal consumption;
	
    /**
     * BaUnitM构造函数
     */
    public BaUnitM() {
        super();
    }  
	
    /**
     * BaUnitM完整的构造函数
     */  
    public BaUnitM(String guid,String marketid,Date tabDate){
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
     * 属性 generatepower 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGeneratepower(){
        return generatepower;
    }
	
    /**
     * 属性 generatepower 的set方法
     * @return
     */
    public void setGeneratepower(BigDecimal generatepower){
        this.generatepower = generatepower;
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
     * 属性 maxloadforecast 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMaxloadforecast(){
        return maxloadforecast;
    }
	
    /**
     * 属性 maxloadforecast 的set方法
     * @return
     */
    public void setMaxloadforecast(BigDecimal maxloadforecast){
        this.maxloadforecast = maxloadforecast;
    } 
	
    /**
     * 属性 consumption 的get方法
     * @return BigDecimal
     */
    public BigDecimal getConsumption(){
        return consumption;
    }
	
    /**
     * 属性 consumption 的set方法
     * @return
     */
    public void setConsumption(BigDecimal consumption){
        this.consumption = consumption;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaUnitM))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaUnitM other = (BaUnitM) o;	        
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
            .append("generatepower"+":"+getGeneratepower())
            .append("generateelec"+":"+getGenerateelec())
            .append("maxloadforecast"+":"+getMaxloadforecast())
            .append("consumption"+":"+getConsumption())
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