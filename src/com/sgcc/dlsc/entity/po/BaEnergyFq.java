package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaEnergyFq的POJO类
 *
 * @author  Administrator  [Tue Jul 16 15:09:30 CST 2013]
 * 
 */
public class BaEnergyFq implements Serializable{

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
     * 属性balanceType
     */
    private BigDecimal balanceType;
	
    /** 
     * 属性capacityS
     */
    private BigDecimal capacityS;
	
    /** 
     * 属性capacitySWa
     */
    private BigDecimal capacitySWa;
	
    /** 
     * 属性capacitySFi
     */
    private BigDecimal capacitySFi;
	
    /** 
     * 属性capacitySNu
     */
    private BigDecimal capacitySNu;
	
    /** 
     * 属性energy
     */
    private BigDecimal energy;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /**
     * BaEnergyFq构造函数
     */
    public BaEnergyFq() {
        super();
    }  
	
    /**
     * BaEnergyFq完整的构造函数
     */  
    public BaEnergyFq(String guid,String marketcode,BigDecimal dateType,Date tabdate){
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
     * 属性 balanceType 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBalanceType(){
        return balanceType;
    }
	
    /**
     * 属性 balanceType 的set方法
     * @return
     */
    public void setBalanceType(BigDecimal balanceType){
        this.balanceType = balanceType;
    } 
	
    /**
     * 属性 capacityS 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCapacityS(){
        return capacityS;
    }
	
    /**
     * 属性 capacityS 的set方法
     * @return
     */
    public void setCapacityS(BigDecimal capacityS){
        this.capacityS = capacityS;
    } 
	
    /**
     * 属性 capacitySWa 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCapacitySWa(){
        return capacitySWa;
    }
	
    /**
     * 属性 capacitySWa 的set方法
     * @return
     */
    public void setCapacitySWa(BigDecimal capacitySWa){
        this.capacitySWa = capacitySWa;
    } 
	
    /**
     * 属性 capacitySFi 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCapacitySFi(){
        return capacitySFi;
    }
	
    /**
     * 属性 capacitySFi 的set方法
     * @return
     */
    public void setCapacitySFi(BigDecimal capacitySFi){
        this.capacitySFi = capacitySFi;
    } 
	
    /**
     * 属性 capacitySNu 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCapacitySNu(){
        return capacitySNu;
    }
	
    /**
     * 属性 capacitySNu 的set方法
     * @return
     */
    public void setCapacitySNu(BigDecimal capacitySNu){
        this.capacitySNu = capacitySNu;
    } 
	
    /**
     * 属性 energy 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEnergy(){
        return energy;
    }
	
    /**
     * 属性 energy 的set方法
     * @return
     */
    public void setEnergy(BigDecimal energy){
        this.energy = energy;
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
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaEnergyFq))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaEnergyFq other = (BaEnergyFq) o;	        
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
            .append("balanceType"+":"+getBalanceType())
            .append("capacityS"+":"+getCapacityS())
            .append("capacitySWa"+":"+getCapacitySWa())
            .append("capacitySFi"+":"+getCapacitySFi())
            .append("capacitySNu"+":"+getCapacitySNu())
            .append("energy"+":"+getEnergy())
            .append("marketid"+":"+getMarketid())
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