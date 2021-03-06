package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaPrecisionPf的POJO类
 *
 * @author  sss  [Wed Dec 25 09:32:21 CST 2013]
 * 
 */
public class BaPrecisionPf implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性marketcode
     */
    private String marketcode;
	
    /** 
     * 属性tabdate
     */
    private Date tabdate;
	
    /** 
     * 属性baTable
     */
    private String baTable;
	
    /** 
     * 属性dateType
     */
    private BigDecimal dateType;
	
    /** 
     * 属性precisionPf
     */
    private BigDecimal precisionPf;
	
    /** 
     * 属性sbjsx
     */
    private BigDecimal sbjsx;
	
    /** 
     * 属性orderno
     */
    private BigDecimal orderno;
	
    /**
     * BaPrecisionPf构造函数
     */
    public BaPrecisionPf() {
        super();
    }  
	
    /**
     * BaPrecisionPf完整的构造函数
     */  
    public BaPrecisionPf(String guid,String marketcode,Date tabdate,String baTable){
        this.guid = guid;
        this.marketcode = marketcode;
        this.tabdate = tabdate;
        this.baTable = baTable;
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
     * 属性 precisionPf 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPrecisionPf(){
        return precisionPf;
    }
	
    /**
     * 属性 precisionPf 的set方法
     * @return
     */
    public void setPrecisionPf(BigDecimal precisionPf){
        this.precisionPf = precisionPf;
    } 
	
	
	
    /**
     * 属性 sbjsx 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSbjsx(){
        return sbjsx;
    }
	
    /**
     * 属性 sbjsx 的set方法
     * @return
     */
    public void setSbjsx(BigDecimal sbjsx){
        this.sbjsx = sbjsx;
    } 
	
	
	
    /**
     * 属性 orderno 的get方法
     * @return BigDecimal
     */
    public BigDecimal getOrderno(){
        return orderno;
    }
	
    /**
     * 属性 orderno 的set方法
     * @return
     */
    public void setOrderno(BigDecimal orderno){
        this.orderno = orderno;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaPrecisionPf))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaPrecisionPf other = (BaPrecisionPf) o;	        
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
            .append("tabdate"+":"+getTabdate())
            .append("baTable"+":"+getBaTable())
            .append("dateType"+":"+getDateType())
            .append("precisionPf"+":"+getPrecisionPf())
            .append("sbjsx"+":"+getSbjsx())
            .append("orderno"+":"+getOrderno())
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