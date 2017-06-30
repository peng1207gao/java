package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaAppraise的POJO类
 *
 * @author  Administrator  [Wed Jul 17 16:25:53 CST 2013]
 * 
 */
public class BaAppraise implements Serializable{

    /**
	 * @description 
	 */
	private static final long serialVersionUID = 1L;

	/** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性marketcode
     */
    private String marketcode;
	
    /** 
     * 属性balance
     */
    private String balance;
	
    /** 
     * 属性tabDate
     */
    private BigDecimal tabDate;
	
    /** 
     * 属性baUnit
     */
    private String baUnit;
	
    /** 
     * 属性version
     */
    private BigDecimal version;
	
    /** 
     * 属性startdate
     */
    private Date startdate;
	
    /** 
     * 属性enddate
     */
    private Date enddate;
	
    /**
     * BaAppraise构造函数
     */
    public BaAppraise() {
        super();
    }  
	
    /**
     * BaAppraise完整的构造函数
     */  
    public BaAppraise(String guid,String marketcode){
        this.guid = guid;
        this.marketcode = marketcode;
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
     * 属性 balance 的get方法
     * @return String
     */
    public String getBalance(){
        return balance;
    }
	
    /**
     * 属性 balance 的set方法
     * @return
     */
    public void setBalance(String balance){
        this.balance = balance;
    } 
	
    /**
     * 属性 tabDate 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTabDate(){
        return tabDate;
    }
	
    /**
     * 属性 tabDate 的set方法
     * @return
     */
    public void setTabDate(BigDecimal tabDate){
        this.tabDate = tabDate;
    } 
	
    /**
     * 属性 baUnit 的get方法
     * @return String
     */
    public String getBaUnit(){
        return baUnit;
    }
	
    /**
     * 属性 baUnit 的set方法
     * @return
     */
    public void setBaUnit(String baUnit){
        this.baUnit = baUnit;
    } 
	
    /**
     * 属性 version 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVersion(){
        return version;
    }
	
    /**
     * 属性 version 的set方法
     * @return
     */
    public void setVersion(BigDecimal version){
        this.version = version;
    } 
	
    /**
     * 属性 startdate 的get方法
     * @return Date
     */
    public Date getStartdate(){
        return startdate;
    }
	
    /**
     * 属性 startdate 的set方法
     * @return
     */
    public void setStartdate(Date startdate){
        this.startdate = startdate;
    } 
	
    /**
     * 属性 enddate 的get方法
     * @return Date
     */
    public Date getEnddate(){
        return enddate;
    }
	
    /**
     * 属性 enddate 的set方法
     * @return
     */
    public void setEnddate(Date enddate){
        this.enddate = enddate;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaAppraise))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaAppraise other = (BaAppraise) o;	        
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
            .append("balance"+":"+getBalance())
            .append("tabDate"+":"+getTabDate())
            .append("baUnit"+":"+getBaUnit())
            .append("version"+":"+getVersion())
            .append("startdate"+":"+getStartdate())
            .append("enddate"+":"+getEnddate())
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