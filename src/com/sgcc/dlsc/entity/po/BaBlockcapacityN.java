package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaBlockcapacityN的POJO类
 *
 * @author  Administrator  [Wed Jul 17 16:28:14 CST 2013]
 * 
 */
public class BaBlockcapacityN implements Serializable{

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
     * 属性blockcapacity
     */
    private BigDecimal blockcapacity;
	
    /** 
     * 属性blockcapacityWa
     */
    private BigDecimal blockcapacityWa;
	
    /** 
     * 属性blockcapacityFi
     */
    private BigDecimal blockcapacityFi;
	
    /** 
     * 属性blockcapacityNu
     */
    private BigDecimal blockcapacityNu;
	
    /** 
     * 属性blockcapacityWi
     */
    private BigDecimal blockcapacityWi;
	
    /** 
     * 属性blockcapacitySu
     */
    private BigDecimal blockcapacitySu;
	
    /** 
     * 属性blockcapacityOt
     */
    private BigDecimal blockcapacityOt;
	
    /** 
     * 属性blockcapacityN
     */
    private BigDecimal blockcapacityN;
	
    /** 
     * 属性blockcapacityP
     */
    private BigDecimal blockcapacityP;
	
    /** 
     * 属性blockcapacityFu
     */
    private BigDecimal blockcapacityFu;
	
    /** 
     * 属性blockcapacityC
     */
    private BigDecimal blockcapacityC;
	
    /** 
     * 属性blockcapacityG
     */
    private BigDecimal blockcapacityG;
	
    /** 
     * 属性blockcapacityH
     */
    private BigDecimal blockcapacityH;
	
    /**
     * BaBlockcapacityN构造函数
     */
    public BaBlockcapacityN() {
        super();
    }  
	
    /**
     * BaBlockcapacityN完整的构造函数
     */  
    public BaBlockcapacityN(String guid,String marketcode,BigDecimal dateType,Date tabdate){
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
     * 属性 blockcapacityWa 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBlockcapacityWa(){
        return blockcapacityWa;
    }
	
    /**
     * 属性 blockcapacityWa 的set方法
     * @return
     */
    public void setBlockcapacityWa(BigDecimal blockcapacityWa){
        this.blockcapacityWa = blockcapacityWa;
    } 
	
    /**
     * 属性 blockcapacityFi 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBlockcapacityFi(){
        return blockcapacityFi;
    }
	
    /**
     * 属性 blockcapacityFi 的set方法
     * @return
     */
    public void setBlockcapacityFi(BigDecimal blockcapacityFi){
        this.blockcapacityFi = blockcapacityFi;
    } 
	
    /**
     * 属性 blockcapacityNu 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBlockcapacityNu(){
        return blockcapacityNu;
    }
	
    /**
     * 属性 blockcapacityNu 的set方法
     * @return
     */
    public void setBlockcapacityNu(BigDecimal blockcapacityNu){
        this.blockcapacityNu = blockcapacityNu;
    } 
	
    /**
     * 属性 blockcapacityWi 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBlockcapacityWi(){
        return blockcapacityWi;
    }
	
    /**
     * 属性 blockcapacityWi 的set方法
     * @return
     */
    public void setBlockcapacityWi(BigDecimal blockcapacityWi){
        this.blockcapacityWi = blockcapacityWi;
    } 
	
    /**
     * 属性 blockcapacitySu 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBlockcapacitySu(){
        return blockcapacitySu;
    }
	
    /**
     * 属性 blockcapacitySu 的set方法
     * @return
     */
    public void setBlockcapacitySu(BigDecimal blockcapacitySu){
        this.blockcapacitySu = blockcapacitySu;
    } 
	
    /**
     * 属性 blockcapacityOt 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBlockcapacityOt(){
        return blockcapacityOt;
    }
	
    /**
     * 属性 blockcapacityOt 的set方法
     * @return
     */
    public void setBlockcapacityOt(BigDecimal blockcapacityOt){
        this.blockcapacityOt = blockcapacityOt;
    } 
	
    /**
     * 属性 blockcapacityN 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBlockcapacityN(){
        return blockcapacityN;
    }
	
    /**
     * 属性 blockcapacityN 的set方法
     * @return
     */
    public void setBlockcapacityN(BigDecimal blockcapacityN){
        this.blockcapacityN = blockcapacityN;
    } 
	
    /**
     * 属性 blockcapacityP 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBlockcapacityP(){
        return blockcapacityP;
    }
	
    /**
     * 属性 blockcapacityP 的set方法
     * @return
     */
    public void setBlockcapacityP(BigDecimal blockcapacityP){
        this.blockcapacityP = blockcapacityP;
    } 
	
    /**
     * 属性 blockcapacityFu 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBlockcapacityFu(){
        return blockcapacityFu;
    }
	
    /**
     * 属性 blockcapacityFu 的set方法
     * @return
     */
    public void setBlockcapacityFu(BigDecimal blockcapacityFu){
        this.blockcapacityFu = blockcapacityFu;
    } 
	
    /**
     * 属性 blockcapacityC 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBlockcapacityC(){
        return blockcapacityC;
    }
	
    /**
     * 属性 blockcapacityC 的set方法
     * @return
     */
    public void setBlockcapacityC(BigDecimal blockcapacityC){
        this.blockcapacityC = blockcapacityC;
    } 
	
    /**
     * 属性 blockcapacityG 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBlockcapacityG(){
        return blockcapacityG;
    }
	
    /**
     * 属性 blockcapacityG 的set方法
     * @return
     */
    public void setBlockcapacityG(BigDecimal blockcapacityG){
        this.blockcapacityG = blockcapacityG;
    } 
	
    /**
     * 属性 blockcapacityH 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBlockcapacityH(){
        return blockcapacityH;
    }
	
    /**
     * 属性 blockcapacityH 的set方法
     * @return
     */
    public void setBlockcapacityH(BigDecimal blockcapacityH){
        this.blockcapacityH = blockcapacityH;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaBlockcapacityN))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaBlockcapacityN other = (BaBlockcapacityN) o;	        
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
            .append("blockcapacity"+":"+getBlockcapacity())
            .append("blockcapacityWa"+":"+getBlockcapacityWa())
            .append("blockcapacityFi"+":"+getBlockcapacityFi())
            .append("blockcapacityNu"+":"+getBlockcapacityNu())
            .append("blockcapacityWi"+":"+getBlockcapacityWi())
            .append("blockcapacitySu"+":"+getBlockcapacitySu())
            .append("blockcapacityOt"+":"+getBlockcapacityOt())
            .append("blockcapacityN"+":"+getBlockcapacityN())
            .append("blockcapacityP"+":"+getBlockcapacityP())
            .append("blockcapacityFu"+":"+getBlockcapacityFu())
            .append("blockcapacityC"+":"+getBlockcapacityC())
            .append("blockcapacityG"+":"+getBlockcapacityG())
            .append("blockcapacityH"+":"+getBlockcapacityH())
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