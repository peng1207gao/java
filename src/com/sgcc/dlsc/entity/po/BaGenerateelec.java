package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaGenerateelec的POJO类
 *
 * @author  Administrator  [Tue Jul 16 15:39:21 CST 2013]
 * 
 */
public class BaGenerateelec implements Serializable{

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
     * 属性generateelec
     */
    private BigDecimal generateelec;
	
    /** 
     * 属性generateelecWa
     */
    private BigDecimal generateelecWa;
	
    /** 
     * 属性generateelecFi
     */
    private BigDecimal generateelecFi;
	
    /** 
     * 属性generateelecNu
     */
    private BigDecimal generateelecNu;
	
    /** 
     * 属性generateelecWi
     */
    private BigDecimal generateelecWi;
	
    /** 
     * 属性generateelecSu
     */
    private BigDecimal generateelecSu;
	
    /** 
     * 属性generateelecOt
     */
    private BigDecimal generateelecOt;
	
    /**
     * BaGenerateelec构造函数
     */
    public BaGenerateelec() {
        super();
    }  
	
    /**
     * BaGenerateelec完整的构造函数
     */  
    public BaGenerateelec(String guid,String marketcode,BigDecimal dateType,Date tabdate){
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
     * 属性 generateelecWa 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGenerateelecWa(){
        return generateelecWa;
    }
	
    /**
     * 属性 generateelecWa 的set方法
     * @return
     */
    public void setGenerateelecWa(BigDecimal generateelecWa){
        this.generateelecWa = generateelecWa;
    } 
	
    /**
     * 属性 generateelecFi 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGenerateelecFi(){
        return generateelecFi;
    }
	
    /**
     * 属性 generateelecFi 的set方法
     * @return
     */
    public void setGenerateelecFi(BigDecimal generateelecFi){
        this.generateelecFi = generateelecFi;
    } 
	
    /**
     * 属性 generateelecNu 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGenerateelecNu(){
        return generateelecNu;
    }
	
    /**
     * 属性 generateelecNu 的set方法
     * @return
     */
    public void setGenerateelecNu(BigDecimal generateelecNu){
        this.generateelecNu = generateelecNu;
    } 
	
    /**
     * 属性 generateelecWi 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGenerateelecWi(){
        return generateelecWi;
    }
	
    /**
     * 属性 generateelecWi 的set方法
     * @return
     */
    public void setGenerateelecWi(BigDecimal generateelecWi){
        this.generateelecWi = generateelecWi;
    } 
	
    /**
     * 属性 generateelecSu 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGenerateelecSu(){
        return generateelecSu;
    }
	
    /**
     * 属性 generateelecSu 的set方法
     * @return
     */
    public void setGenerateelecSu(BigDecimal generateelecSu){
        this.generateelecSu = generateelecSu;
    } 
	
    /**
     * 属性 generateelecOt 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGenerateelecOt(){
        return generateelecOt;
    }
	
    /**
     * 属性 generateelecOt 的set方法
     * @return
     */
    public void setGenerateelecOt(BigDecimal generateelecOt){
        this.generateelecOt = generateelecOt;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaGenerateelec))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaGenerateelec other = (BaGenerateelec) o;	        
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
            .append("generateelec"+":"+getGenerateelec())
            .append("generateelecWa"+":"+getGenerateelecWa())
            .append("generateelecFi"+":"+getGenerateelecFi())
            .append("generateelecNu"+":"+getGenerateelecNu())
            .append("generateelecWi"+":"+getGenerateelecWi())
            .append("generateelecSu"+":"+getGenerateelecSu())
            .append("generateelecOt"+":"+getGenerateelecOt())
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