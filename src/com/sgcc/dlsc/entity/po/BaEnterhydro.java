package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaEnterhydro的POJO类
 *
 * @author  Administrator  [Wed Jul 17 16:32:14 CST 2013]
 * 
 */
public class BaEnterhydro implements Serializable{

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
     * 属性dateType
     */
    private BigDecimal dateType;
	
    /** 
     * 属性datetime
     */
    private Date datetime;
	
    /** 
     * 属性hydropowername
     */
    private String hydropowername;
	
    /** 
     * 属性hydropowerid
     */
    private String hydropowerid;
	
    /** 
     * 属性enterwaterquantity
     */
    private BigDecimal enterwaterquantity;
	
    /**
     * BaEnterhydro构造函数
     */
    public BaEnterhydro() {
        super();
    }  
	
    /**
     * BaEnterhydro完整的构造函数
     */  
    public BaEnterhydro(String guid,String marketcode,BigDecimal dateType,Date datetime,String hydropowerid){
        this.guid = guid;
        this.marketcode = marketcode;
        this.dateType = dateType;
        this.datetime = datetime;
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
     * 属性 datetime 的get方法
     * @return Date
     */
    public Date getDatetime(){
        return datetime;
    }
	
    /**
     * 属性 datetime 的set方法
     * @return
     */
    public void setDatetime(Date datetime){
        this.datetime = datetime;
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
     * 属性 enterwaterquantity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEnterwaterquantity(){
        return enterwaterquantity;
    }
	
    /**
     * 属性 enterwaterquantity 的set方法
     * @return
     */
    public void setEnterwaterquantity(BigDecimal enterwaterquantity){
        this.enterwaterquantity = enterwaterquantity;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaEnterhydro))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaEnterhydro other = (BaEnterhydro) o;	        
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
            .append("datetime"+":"+getDatetime())
            .append("hydropowername"+":"+getHydropowername())
            .append("hydropowerid"+":"+getHydropowerid())
            .append("enterwaterquantity"+":"+getEnterwaterquantity())
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