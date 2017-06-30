package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * AaBaTable的POJO类
 *
 * @author  Administrator  [Tue Jul 02 16:21:28 CST 2013]
 * 
 */
public class BaTable implements Serializable{

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
     * 属性baTable
     */
    private String baTable;
	
    /** 
     * 属性baUnit
     */
    private String baUnit;
    
    /** 
     * 属性baUnitName
     */
    private String baUnitName;
	
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
     * 属性fz
     */
    private BigDecimal fz;
	
    /** 
     * 属性sx
     */
    private BigDecimal sx;
	
    /**
     * AaBaTable构造函数
     */
    public BaTable() {
        super();
    }  
	
    /**
     * AaBaTable完整的构造函数
     */  
    public BaTable(String guid,String marketcode){
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
     * 属性 baTable 的get方法
     * @return String
     */
    public String getBaTable(){
        return baTable;
    }
	
    /**
     * 属性 baTable 的set方法
     * @return
     */
    public void setBaTable(String baTable){
        this.baTable = baTable;
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
	
    public String getBaUnitName() {
		return baUnitName;
	}

	public void setBaUnitName(String baUnitName) {
		this.baUnitName = baUnitName;
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
     * 属性 fz 的get方法
     * @return BigDecimal
     */
    public BigDecimal getFz(){
        return fz;
    }
	
    /**
     * 属性 fz 的set方法
     * @return
     */
    public void setFz(BigDecimal fz){
        this.fz = fz;
    } 
	
    /**
     * 属性 sx 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSx(){
        return sx;
    }
	
    /**
     * 属性 sx 的set方法
     * @return
     */
    public void setSx(BigDecimal sx){
        this.sx = sx;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaTable))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaTable other = (BaTable) o;	        
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
            .append("baTable"+":"+getBaTable())
            .append("baUnit"+":"+getBaUnit())
            .append("baUnitName"+":"+getBaUnitName())
            .append("version"+":"+getVersion())
            .append("startdate"+":"+getStartdate())
            .append("enddate"+":"+getEnddate())
            .append("fz"+":"+getFz())
            .append("sx"+":"+getSx())
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