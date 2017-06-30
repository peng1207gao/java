package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaOrderly的POJO类
 *
 * @author  Administrator  [Tue Jul 16 15:39:41 CST 2013]
 * 
 */
public class BaOrderly implements Serializable{

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
     * 属性maxpullpower
     */
    private BigDecimal maxpullpower;
	
    /** 
     * 属性maxlimitpower
     */
    private BigDecimal maxlimitpower;
	
    /** 
     * 属性pullelec
     */
    private BigDecimal pullelec;
	
    /** 
     * 属性limitelec
     */
    private BigDecimal limitelec;
	
    /** 
     * 属性cfpower
     */
    private BigDecimal cfpower;
	
    /** 
     * 属性bfpower
     */
    private BigDecimal bfpower;
	
    /** 
     * 属性cfelec
     */
    private BigDecimal cfelec;
	
    /** 
     * 属性bfelec
     */
    private BigDecimal bfelec;
	
    /**
     * BaOrderly构造函数
     */
    public BaOrderly() {
        super();
    }  
	
    /**
     * BaOrderly完整的构造函数
     */  
    public BaOrderly(String guid,String marketcode,BigDecimal dateType,Date tabdate){
        this.guid = guid;
        this.marketcode = marketcode;
        this.dateType = dateType;
        this.tabdate = tabdate;
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
     * 属性 maxpullpower 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMaxpullpower(){
        return maxpullpower;
    }
	
    /**
     * 属性 maxpullpower 的set方法
     * @return
     */
    public void setMaxpullpower(BigDecimal maxpullpower){
        this.maxpullpower = maxpullpower;
    } 
	
    /**
     * 属性 maxlimitpower 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMaxlimitpower(){
        return maxlimitpower;
    }
	
    /**
     * 属性 maxlimitpower 的set方法
     * @return
     */
    public void setMaxlimitpower(BigDecimal maxlimitpower){
        this.maxlimitpower = maxlimitpower;
    } 
	
    /**
     * 属性 pullelec 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPullelec(){
        return pullelec;
    }
	
    /**
     * 属性 pullelec 的set方法
     * @return
     */
    public void setPullelec(BigDecimal pullelec){
        this.pullelec = pullelec;
    } 
	
    /**
     * 属性 limitelec 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLimitelec(){
        return limitelec;
    }
	
    /**
     * 属性 limitelec 的set方法
     * @return
     */
    public void setLimitelec(BigDecimal limitelec){
        this.limitelec = limitelec;
    } 
	
    /**
     * 属性 cfpower 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCfpower(){
        return cfpower;
    }
	
    /**
     * 属性 cfpower 的set方法
     * @return
     */
    public void setCfpower(BigDecimal cfpower){
        this.cfpower = cfpower;
    } 
	
    /**
     * 属性 bfpower 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBfpower(){
        return bfpower;
    }
	
    /**
     * 属性 bfpower 的set方法
     * @return
     */
    public void setBfpower(BigDecimal bfpower){
        this.bfpower = bfpower;
    } 
	
    /**
     * 属性 cfelec 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCfelec(){
        return cfelec;
    }
	
    /**
     * 属性 cfelec 的set方法
     * @return
     */
    public void setCfelec(BigDecimal cfelec){
        this.cfelec = cfelec;
    } 
	
    /**
     * 属性 bfelec 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBfelec(){
        return bfelec;
    }
	
    /**
     * 属性 bfelec 的set方法
     * @return
     */
    public void setBfelec(BigDecimal bfelec){
        this.bfelec = bfelec;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaOrderly))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaOrderly other = (BaOrderly) o;	        
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
            .append("maxpullpower"+":"+getMaxpullpower())
            .append("maxlimitpower"+":"+getMaxlimitpower())
            .append("pullelec"+":"+getPullelec())
            .append("limitelec"+":"+getLimitelec())
            .append("cfpower"+":"+getCfpower())
            .append("bfpower"+":"+getBfpower())
            .append("cfelec"+":"+getCfelec())
            .append("bfelec"+":"+getBfelec())
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