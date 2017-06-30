package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaUnitD的POJO类
 *
 * @author  Administrator  [Wed Jul 17 16:36:31 CST 2013]
 * 
 */
public class BaUnitD implements Serializable{

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
     * 属性generateelec
     */
    private BigDecimal generateelec;
	
    /** 
     * 属性blockcapacity
     */
    private BigDecimal blockcapacity;
	
    /** 
     * 属性freepacity
     */
    private BigDecimal freepacity;
	
    /**
     * BaUnitD构造函数
     */
    public BaUnitD() {
        super();
    }  
	
    /**
     * BaUnitD完整的构造函数
     */  
    public BaUnitD(String guid,String marketid,Date tabDate){
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
     * 属性 blockcapacity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBlockcapacity(){
        return blockcapacity;
    }
	
    /**
     * 属性 blockcapacity 的set方法
     * @return
     */
    public void setBlockcapacity(BigDecimal blockcapacity){
        this.blockcapacity = blockcapacity;
    } 
	
    /**
     * 属性 freepacity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getFreepacity(){
        return freepacity;
    }
	
    /**
     * 属性 freepacity 的set方法
     * @return
     */
    public void setFreepacity(BigDecimal freepacity){
        this.freepacity = freepacity;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaUnitD))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaUnitD other = (BaUnitD) o;	        
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
            .append("generateelec"+":"+getGenerateelec())
            .append("blockcapacity"+":"+getBlockcapacity())
            .append("freepacity"+":"+getFreepacity())
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