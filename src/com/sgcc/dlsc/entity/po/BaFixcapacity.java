package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaFixcapacity的POJO类
 *
 * @author  Administrator  [Tue Jul 16 15:22:39 CST 2013]
 * 
 */
public class BaFixcapacity implements Serializable{

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
     * 属性tabdate
     */
    private Date tabdate;
	
    /** 
     * 属性planfixcapacity
     */
    private BigDecimal planfixcapacity;
	
    /** 
     * 属性planfixcapacityWa
     */
    private BigDecimal planfixcapacityWa;
	
    /** 
     * 属性planfixcapacityFi
     */
    private BigDecimal planfixcapacityFi;
	
    /** 
     * 属性planfixcapacityNu
     */
    private BigDecimal planfixcapacityNu;
	
    /** 
     * 属性planfixcapacityWi
     */
    private BigDecimal planfixcapacityWi;
	
    /** 
     * 属性planfixcapacitySu
     */
    private BigDecimal planfixcapacitySu;
	
    /** 
     * 属性planfixcapacityOt
     */
    private BigDecimal planfixcapacityOt;
	
    /** 
     * 属性actualfixcapacity
     */
    private BigDecimal actualfixcapacity;
	
    /** 
     * 属性actualfixcapacityWa
     */
    private BigDecimal actualfixcapacityWa;
	
    /** 
     * 属性actualfixcapacityFi
     */
    private BigDecimal actualfixcapacityFi;
	
    /** 
     * 属性actualfixcapacityNu
     */
    private BigDecimal actualfixcapacityNu;
	
    /** 
     * 属性actualfixcapacityWi
     */
    private BigDecimal actualfixcapacityWi;
	
    /** 
     * 属性actualfixcapacitySu
     */
    private BigDecimal actualfixcapacitySu;
	
    /** 
     * 属性actualfixcapacityOt
     */
    private BigDecimal actualfixcapacityOt;
	
    /**
     * BaFixcapacity构造函数
     */
    public BaFixcapacity() {
        super();
    }  
	
    /**
     * BaFixcapacity完整的构造函数
     */  
    public BaFixcapacity(String guid,String marketcode,BigDecimal dateType,Date tabdate){
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
     * 属性 planfixcapacity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPlanfixcapacity(){
        return planfixcapacity;
    }
	
    /**
     * 属性 planfixcapacity 的set方法
     * @return
     */
    public void setPlanfixcapacity(BigDecimal planfixcapacity){
        this.planfixcapacity = planfixcapacity;
    } 
	
    /**
     * 属性 planfixcapacityWa 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPlanfixcapacityWa(){
        return planfixcapacityWa;
    }
	
    /**
     * 属性 planfixcapacityWa 的set方法
     * @return
     */
    public void setPlanfixcapacityWa(BigDecimal planfixcapacityWa){
        this.planfixcapacityWa = planfixcapacityWa;
    } 
	
    /**
     * 属性 planfixcapacityFi 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPlanfixcapacityFi(){
        return planfixcapacityFi;
    }
	
    /**
     * 属性 planfixcapacityFi 的set方法
     * @return
     */
    public void setPlanfixcapacityFi(BigDecimal planfixcapacityFi){
        this.planfixcapacityFi = planfixcapacityFi;
    } 
	
    /**
     * 属性 planfixcapacityNu 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPlanfixcapacityNu(){
        return planfixcapacityNu;
    }
	
    /**
     * 属性 planfixcapacityNu 的set方法
     * @return
     */
    public void setPlanfixcapacityNu(BigDecimal planfixcapacityNu){
        this.planfixcapacityNu = planfixcapacityNu;
    } 
	
    /**
     * 属性 planfixcapacityWi 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPlanfixcapacityWi(){
        return planfixcapacityWi;
    }
	
    /**
     * 属性 planfixcapacityWi 的set方法
     * @return
     */
    public void setPlanfixcapacityWi(BigDecimal planfixcapacityWi){
        this.planfixcapacityWi = planfixcapacityWi;
    } 
	
    /**
     * 属性 planfixcapacitySu 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPlanfixcapacitySu(){
        return planfixcapacitySu;
    }
	
    /**
     * 属性 planfixcapacitySu 的set方法
     * @return
     */
    public void setPlanfixcapacitySu(BigDecimal planfixcapacitySu){
        this.planfixcapacitySu = planfixcapacitySu;
    } 
	
    /**
     * 属性 planfixcapacityOt 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPlanfixcapacityOt(){
        return planfixcapacityOt;
    }
	
    /**
     * 属性 planfixcapacityOt 的set方法
     * @return
     */
    public void setPlanfixcapacityOt(BigDecimal planfixcapacityOt){
        this.planfixcapacityOt = planfixcapacityOt;
    } 
	
    /**
     * 属性 actualfixcapacity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getActualfixcapacity(){
        return actualfixcapacity;
    }
	
    /**
     * 属性 actualfixcapacity 的set方法
     * @return
     */
    public void setActualfixcapacity(BigDecimal actualfixcapacity){
        this.actualfixcapacity = actualfixcapacity;
    } 
	
    /**
     * 属性 actualfixcapacityWa 的get方法
     * @return BigDecimal
     */
    public BigDecimal getActualfixcapacityWa(){
        return actualfixcapacityWa;
    }
	
    /**
     * 属性 actualfixcapacityWa 的set方法
     * @return
     */
    public void setActualfixcapacityWa(BigDecimal actualfixcapacityWa){
        this.actualfixcapacityWa = actualfixcapacityWa;
    } 
	
    /**
     * 属性 actualfixcapacityFi 的get方法
     * @return BigDecimal
     */
    public BigDecimal getActualfixcapacityFi(){
        return actualfixcapacityFi;
    }
	
    /**
     * 属性 actualfixcapacityFi 的set方法
     * @return
     */
    public void setActualfixcapacityFi(BigDecimal actualfixcapacityFi){
        this.actualfixcapacityFi = actualfixcapacityFi;
    } 
	
    /**
     * 属性 actualfixcapacityNu 的get方法
     * @return BigDecimal
     */
    public BigDecimal getActualfixcapacityNu(){
        return actualfixcapacityNu;
    }
	
    /**
     * 属性 actualfixcapacityNu 的set方法
     * @return
     */
    public void setActualfixcapacityNu(BigDecimal actualfixcapacityNu){
        this.actualfixcapacityNu = actualfixcapacityNu;
    } 
	
    /**
     * 属性 actualfixcapacityWi 的get方法
     * @return BigDecimal
     */
    public BigDecimal getActualfixcapacityWi(){
        return actualfixcapacityWi;
    }
	
    /**
     * 属性 actualfixcapacityWi 的set方法
     * @return
     */
    public void setActualfixcapacityWi(BigDecimal actualfixcapacityWi){
        this.actualfixcapacityWi = actualfixcapacityWi;
    } 
	
    /**
     * 属性 actualfixcapacitySu 的get方法
     * @return BigDecimal
     */
    public BigDecimal getActualfixcapacitySu(){
        return actualfixcapacitySu;
    }
	
    /**
     * 属性 actualfixcapacitySu 的set方法
     * @return
     */
    public void setActualfixcapacitySu(BigDecimal actualfixcapacitySu){
        this.actualfixcapacitySu = actualfixcapacitySu;
    } 
	
    /**
     * 属性 actualfixcapacityOt 的get方法
     * @return BigDecimal
     */
    public BigDecimal getActualfixcapacityOt(){
        return actualfixcapacityOt;
    }
	
    /**
     * 属性 actualfixcapacityOt 的set方法
     * @return
     */
    public void setActualfixcapacityOt(BigDecimal actualfixcapacityOt){
        this.actualfixcapacityOt = actualfixcapacityOt;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaFixcapacity))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaFixcapacity other = (BaFixcapacity) o;	        
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
            .append("planfixcapacity"+":"+getPlanfixcapacity())
            .append("planfixcapacityWa"+":"+getPlanfixcapacityWa())
            .append("planfixcapacityFi"+":"+getPlanfixcapacityFi())
            .append("planfixcapacityNu"+":"+getPlanfixcapacityNu())
            .append("planfixcapacityWi"+":"+getPlanfixcapacityWi())
            .append("planfixcapacitySu"+":"+getPlanfixcapacitySu())
            .append("planfixcapacityOt"+":"+getPlanfixcapacityOt())
            .append("actualfixcapacity"+":"+getActualfixcapacity())
            .append("actualfixcapacityWa"+":"+getActualfixcapacityWa())
            .append("actualfixcapacityFi"+":"+getActualfixcapacityFi())
            .append("actualfixcapacityNu"+":"+getActualfixcapacityNu())
            .append("actualfixcapacityWi"+":"+getActualfixcapacityWi())
            .append("actualfixcapacitySu"+":"+getActualfixcapacitySu())
            .append("actualfixcapacityOt"+":"+getActualfixcapacityOt())
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