package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaCapacity的POJO类
 *
 * @author  Administrator  [Mon Jul 22 09:45:14 CST 2013]
 * 
 */
public class BaCapacity implements Serializable{

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
     * 属性capacitySWi
     */
    private BigDecimal capacitySWi;
	
    /** 
     * 属性capacitySSu
     */
    private BigDecimal capacitySSu;
	
    /** 
     * 属性capacitySOt
     */
    private BigDecimal capacitySOt;
	
    /** 
     * 属性capacityN
     */
    private BigDecimal capacityN;
	
    /** 
     * 属性capacityNWa
     */
    private BigDecimal capacityNWa;
	
    /** 
     * 属性capacityNFi
     */
    private BigDecimal capacityNFi;
	
    /** 
     * 属性capacityNNu
     */
    private BigDecimal capacityNNu;
	
    /** 
     * 属性capacityNWi
     */
    private BigDecimal capacityNWi;
	
    /** 
     * 属性capacityNSu
     */
    private BigDecimal capacityNSu;
	
    /** 
     * 属性capacityNOt
     */
    private BigDecimal capacityNOt;
	
    /** 
     * 属性capacityR
     */
    private BigDecimal capacityR;
	
    /** 
     * 属性capacityRWa
     */
    private BigDecimal capacityRWa;
	
    /** 
     * 属性capacityRFi
     */
    private BigDecimal capacityRFi;
	
    /** 
     * 属性capacityRNu
     */
    private BigDecimal capacityRNu;
	
    /** 
     * 属性capacityRWi
     */
    private BigDecimal capacityRWi;
	
    /** 
     * 属性capacityRSu
     */
    private BigDecimal capacityRSu;
	
    /** 
     * 属性capacityROt
     */
    private BigDecimal capacityROt;
	
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
     * BaCapacity构造函数
     */
    public BaCapacity() {
        super();
    }  
	
    /**
     * BaCapacity完整的构造函数
     */  
    public BaCapacity(String guid){
        this.guid = guid;
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
     * 属性 capacitySWi 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCapacitySWi(){
        return capacitySWi;
    }
	
    /**
     * 属性 capacitySWi 的set方法
     * @return
     */
    public void setCapacitySWi(BigDecimal capacitySWi){
        this.capacitySWi = capacitySWi;
    } 
	
    /**
     * 属性 capacitySSu 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCapacitySSu(){
        return capacitySSu;
    }
	
    /**
     * 属性 capacitySSu 的set方法
     * @return
     */
    public void setCapacitySSu(BigDecimal capacitySSu){
        this.capacitySSu = capacitySSu;
    } 
	
    /**
     * 属性 capacitySOt 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCapacitySOt(){
        return capacitySOt;
    }
	
    /**
     * 属性 capacitySOt 的set方法
     * @return
     */
    public void setCapacitySOt(BigDecimal capacitySOt){
        this.capacitySOt = capacitySOt;
    } 
	
    /**
     * 属性 capacityN 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCapacityN(){
        return capacityN;
    }
	
    /**
     * 属性 capacityN 的set方法
     * @return
     */
    public void setCapacityN(BigDecimal capacityN){
        this.capacityN = capacityN;
    } 
	
    /**
     * 属性 capacityNWa 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCapacityNWa(){
        return capacityNWa;
    }
	
    /**
     * 属性 capacityNWa 的set方法
     * @return
     */
    public void setCapacityNWa(BigDecimal capacityNWa){
        this.capacityNWa = capacityNWa;
    } 
	
    /**
     * 属性 capacityNFi 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCapacityNFi(){
        return capacityNFi;
    }
	
    /**
     * 属性 capacityNFi 的set方法
     * @return
     */
    public void setCapacityNFi(BigDecimal capacityNFi){
        this.capacityNFi = capacityNFi;
    } 
	
    /**
     * 属性 capacityNNu 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCapacityNNu(){
        return capacityNNu;
    }
	
    /**
     * 属性 capacityNNu 的set方法
     * @return
     */
    public void setCapacityNNu(BigDecimal capacityNNu){
        this.capacityNNu = capacityNNu;
    } 
	
    /**
     * 属性 capacityNWi 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCapacityNWi(){
        return capacityNWi;
    }
	
    /**
     * 属性 capacityNWi 的set方法
     * @return
     */
    public void setCapacityNWi(BigDecimal capacityNWi){
        this.capacityNWi = capacityNWi;
    } 
	
    /**
     * 属性 capacityNSu 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCapacityNSu(){
        return capacityNSu;
    }
	
    /**
     * 属性 capacityNSu 的set方法
     * @return
     */
    public void setCapacityNSu(BigDecimal capacityNSu){
        this.capacityNSu = capacityNSu;
    } 
	
    /**
     * 属性 capacityNOt 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCapacityNOt(){
        return capacityNOt;
    }
	
    /**
     * 属性 capacityNOt 的set方法
     * @return
     */
    public void setCapacityNOt(BigDecimal capacityNOt){
        this.capacityNOt = capacityNOt;
    } 
	
    /**
     * 属性 capacityR 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCapacityR(){
        return capacityR;
    }
	
    /**
     * 属性 capacityR 的set方法
     * @return
     */
    public void setCapacityR(BigDecimal capacityR){
        this.capacityR = capacityR;
    } 
	
    /**
     * 属性 capacityRWa 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCapacityRWa(){
        return capacityRWa;
    }
	
    /**
     * 属性 capacityRWa 的set方法
     * @return
     */
    public void setCapacityRWa(BigDecimal capacityRWa){
        this.capacityRWa = capacityRWa;
    } 
	
    /**
     * 属性 capacityRFi 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCapacityRFi(){
        return capacityRFi;
    }
	
    /**
     * 属性 capacityRFi 的set方法
     * @return
     */
    public void setCapacityRFi(BigDecimal capacityRFi){
        this.capacityRFi = capacityRFi;
    } 
	
    /**
     * 属性 capacityRNu 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCapacityRNu(){
        return capacityRNu;
    }
	
    /**
     * 属性 capacityRNu 的set方法
     * @return
     */
    public void setCapacityRNu(BigDecimal capacityRNu){
        this.capacityRNu = capacityRNu;
    } 
	
    /**
     * 属性 capacityRWi 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCapacityRWi(){
        return capacityRWi;
    }
	
    /**
     * 属性 capacityRWi 的set方法
     * @return
     */
    public void setCapacityRWi(BigDecimal capacityRWi){
        this.capacityRWi = capacityRWi;
    } 
	
    /**
     * 属性 capacityRSu 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCapacityRSu(){
        return capacityRSu;
    }
	
    /**
     * 属性 capacityRSu 的set方法
     * @return
     */
    public void setCapacityRSu(BigDecimal capacityRSu){
        this.capacityRSu = capacityRSu;
    } 
	
    /**
     * 属性 capacityROt 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCapacityROt(){
        return capacityROt;
    }
	
    /**
     * 属性 capacityROt 的set方法
     * @return
     */
    public void setCapacityROt(BigDecimal capacityROt){
        this.capacityROt = capacityROt;
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
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaCapacity))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaCapacity other = (BaCapacity) o;	        
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
            .append("capacitySWi"+":"+getCapacitySWi())
            .append("capacitySSu"+":"+getCapacitySSu())
            .append("capacitySOt"+":"+getCapacitySOt())
            .append("capacityN"+":"+getCapacityN())
            .append("capacityNWa"+":"+getCapacityNWa())
            .append("capacityNFi"+":"+getCapacityNFi())
            .append("capacityNNu"+":"+getCapacityNNu())
            .append("capacityNWi"+":"+getCapacityNWi())
            .append("capacityNSu"+":"+getCapacityNSu())
            .append("capacityNOt"+":"+getCapacityNOt())
            .append("capacityR"+":"+getCapacityR())
            .append("capacityRWa"+":"+getCapacityRWa())
            .append("capacityRFi"+":"+getCapacityRFi())
            .append("capacityRNu"+":"+getCapacityRNu())
            .append("capacityRWi"+":"+getCapacityRWi())
            .append("capacityRSu"+":"+getCapacityRSu())
            .append("capacityROt"+":"+getCapacityROt())
            .append("planfixcapacity"+":"+getPlanfixcapacity())
            .append("planfixcapacityWa"+":"+getPlanfixcapacityWa())
            .append("planfixcapacityFi"+":"+getPlanfixcapacityFi())
            .append("planfixcapacityNu"+":"+getPlanfixcapacityNu())
            .append("planfixcapacityWi"+":"+getPlanfixcapacityWi())
            .append("planfixcapacitySu"+":"+getPlanfixcapacitySu())
            .append("planfixcapacityOt"+":"+getPlanfixcapacityOt())
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