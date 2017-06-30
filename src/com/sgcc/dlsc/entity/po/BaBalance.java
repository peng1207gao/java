package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaBalance的POJO类
 *
 * @author  Administrator  [Wed Jul 03 09:14:25 CST 2013]
 * 
 */
public class BaBalance implements Serializable{

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
     * 属性balancetype
     */
    private BigDecimal balancetype;
	
    /** 
     * 属性wfr
     */
    private String wfr;
	
    /** 
     * 属性iseffict
     */
    private BigDecimal iseffict;
	
    /** 
     * 属性version
     */
    private BigDecimal version;

    private String ba_table;
    
    private String ba_table_name;
    /** 
     * 属性startdate
     */
    private Date startdate;
	
    /** 
     * 属性enddate
     */
    private Date enddate;
	
    /**
     * BaBalance构造函数
     */
    public BaBalance() {
        super();
    }  
	
    /**
     * BaBalance完整的构造函数
     */  
    public BaBalance(String guid,String marketcode){
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
     * 属性 balancetype 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBalancetype(){
        return balancetype;
    }
	
    /**
     * 属性 balancetype 的set方法
     * @return
     */
    public void setBalancetype(BigDecimal balancetype){
        this.balancetype = balancetype;
    } 
	
    /**
     * 属性 wfr 的get方法
     * @return String
     */
    public String getWfr(){
        return wfr;
    }
	
    /**
     * 属性 wfr 的set方法
     * @return
     */
    public void setWfr(String wfr){
        this.wfr = wfr;
    } 
	
    /**
     * 属性 iseffict 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIseffict(){
        return iseffict;
    }
	
    /**
     * 属性 iseffict 的set方法
     * @return
     */
    public void setIseffict(BigDecimal iseffict){
        this.iseffict = iseffict;
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
	
    public String getBa_table() {
		return ba_table;
	}

	public void setBa_table(String ba_table) {
		this.ba_table = ba_table;
	}

	public String getBa_table_name() {
		return ba_table_name;
	}

	public void setBa_table_name(String ba_table_name) {
		this.ba_table_name = ba_table_name;
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
		
        if (o == null || !(o instanceof BaBalance))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaBalance other = (BaBalance) o;	        
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
            .append("balancetype"+":"+getBalancetype())
            .append("wfr"+":"+getWfr())
            .append("iseffict"+":"+getIseffict())
            .append("version"+":"+getVersion())
            .append("ba_table"+":"+getBa_table())
            .append("ba_table_name"+":"+getBa_table_name())
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