package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.sql.Date;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TrResultDecenergyCheck的POJO类
 *
 * @author  lenovo  [Thu Aug 15 15:57:29 CST 2013]
 * 
 */
public class TrResultDecenergyCheck implements Serializable{

    /** 
     * 属性id
     */
    private String id;
	
    /** 
     * 属性tradeResultMainId
     */
    private String tradeResultMainId;
	
    /** 
     * 属性mktMonth
     */
    private Date mktMonth;
	
    /** 
     * 属性vendeeEnergy
     */
    private BigDecimal vendeeEnergy;
	
    /** 
     * 属性saleEnergy
     */
    private BigDecimal saleEnergy;
	
    /** 
     * 属性vendeeEnergyPeriod1
     */
    private BigDecimal vendeeEnergyPeriod1;
	
    /** 
     * 属性saleEnergyPeriod1
     */
    private BigDecimal saleEnergyPeriod1;
	
    /** 
     * 属性vendeeEnergyPeriod2
     */
    private BigDecimal vendeeEnergyPeriod2;
	
    /** 
     * 属性saleEnergyPeriod2
     */
    private BigDecimal saleEnergyPeriod2;
	
    /** 
     * 属性vendeeEnergyPeriod3
     */
    private BigDecimal vendeeEnergyPeriod3;
	
    /** 
     * 属性saleEnergyPeriod3
     */
    private BigDecimal saleEnergyPeriod3;
	
    /** 
     * 属性vendeeEnergyPeriod4
     */
    private BigDecimal vendeeEnergyPeriod4;
	
    /** 
     * 属性saleEnergyPeriod4
     */
    private BigDecimal saleEnergyPeriod4;
	
    /** 
     * 属性vendeeEnergyPeriod5
     */
    private BigDecimal vendeeEnergyPeriod5;
	
    /** 
     * 属性saleEnergyPeriod5
     */
    private BigDecimal saleEnergyPeriod5;
	
    /** 
     * 属性vendeeGrosseng
     */
    private BigDecimal vendeeGrosseng;
	
    /** 
     * 属性saleGrosseng
     */
    private BigDecimal saleGrosseng;
	
    /** 
     * 属性vendeeGrossengPeriod1
     */
    private BigDecimal vendeeGrossengPeriod1;
	
    /** 
     * 属性saleGrossengPeriod1
     */
    private BigDecimal saleGrossengPeriod1;
	
    /** 
     * 属性vendeeGrossengPeriod2
     */
    private BigDecimal vendeeGrossengPeriod2;
	
    /** 
     * 属性saleGrossengPeriod2
     */
    private BigDecimal saleGrossengPeriod2;
	
    /** 
     * 属性vendeeGrossengPeriod3
     */
    private BigDecimal vendeeGrossengPeriod3;
	
    /** 
     * 属性saleGrossengPeriod3
     */
    private BigDecimal saleGrossengPeriod3;
	
    /** 
     * 属性vendeeGrossengPeriod4
     */
    private BigDecimal vendeeGrossengPeriod4;
	
    /** 
     * 属性saleGrossengPeriod4
     */
    private BigDecimal saleGrossengPeriod4;
	
    /** 
     * 属性vendeeGrossengPeriod5
     */
    private BigDecimal vendeeGrossengPeriod5;
	
    /** 
     * 属性saleGrossengPeriod5
     */
    private BigDecimal saleGrossengPeriod5;
	
    /** 
     * 属性powerCurveId
     */
    private String powerCurveId;
	
    /** 
     * 属性marketId
     */
    private String marketId;
	
    /** 
     * 属性operator
     */
    private String operator;
	
    /** 
     * 属性updateTime
     */
    private Date updateTime;
	
    /** 
     * 属性remark
     */
    private String remark;
	
    /**
     * TrResultDecenergyCheck构造函数
     */
    public TrResultDecenergyCheck() {
        super();
    }  
	
    /**
     * TrResultDecenergyCheck完整的构造函数
     */  
    public TrResultDecenergyCheck(String id){
        this.id = id;
    }
 
    /**
     * 属性 id 的get方法
     * @return String
     */
    public String getId(){
        return id;
    }
	
    /**
     * 属性 id 的set方法
     * @return
     */
    public void setId(String id){
        if(id != null && id.trim().length() == 0){
            this.id = null;
        }else{
            this.id = id;
        }
    } 
	
    /**
     * 属性 tradeResultMainId 的get方法
     * @return String
     */
    public String getTradeResultMainId(){
        return tradeResultMainId;
    }
	
    /**
     * 属性 tradeResultMainId 的set方法
     * @return
     */
    public void setTradeResultMainId(String tradeResultMainId){
        this.tradeResultMainId = tradeResultMainId;
    } 
	
    /**
     * 属性 mktMonth 的get方法
     * @return Date
     */
    public Date getMktMonth(){
        return mktMonth;
    }
	
    /**
     * 属性 mktMonth 的set方法
     * @return
     */
    public void setMktMonth(Date mktMonth){
        this.mktMonth = mktMonth;
    } 
	
    /**
     * 属性 vendeeEnergy 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVendeeEnergy(){
        return vendeeEnergy;
    }
	
    /**
     * 属性 vendeeEnergy 的set方法
     * @return
     */
    public void setVendeeEnergy(BigDecimal vendeeEnergy){
        this.vendeeEnergy = vendeeEnergy;
    } 
	
    /**
     * 属性 saleEnergy 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSaleEnergy(){
        return saleEnergy;
    }
	
    /**
     * 属性 saleEnergy 的set方法
     * @return
     */
    public void setSaleEnergy(BigDecimal saleEnergy){
        this.saleEnergy = saleEnergy;
    } 
	
    /**
     * 属性 vendeeEnergyPeriod1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVendeeEnergyPeriod1(){
        return vendeeEnergyPeriod1;
    }
	
    /**
     * 属性 vendeeEnergyPeriod1 的set方法
     * @return
     */
    public void setVendeeEnergyPeriod1(BigDecimal vendeeEnergyPeriod1){
        this.vendeeEnergyPeriod1 = vendeeEnergyPeriod1;
    } 
	
    /**
     * 属性 saleEnergyPeriod1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSaleEnergyPeriod1(){
        return saleEnergyPeriod1;
    }
	
    /**
     * 属性 saleEnergyPeriod1 的set方法
     * @return
     */
    public void setSaleEnergyPeriod1(BigDecimal saleEnergyPeriod1){
        this.saleEnergyPeriod1 = saleEnergyPeriod1;
    } 
	
    /**
     * 属性 vendeeEnergyPeriod2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVendeeEnergyPeriod2(){
        return vendeeEnergyPeriod2;
    }
	
    /**
     * 属性 vendeeEnergyPeriod2 的set方法
     * @return
     */
    public void setVendeeEnergyPeriod2(BigDecimal vendeeEnergyPeriod2){
        this.vendeeEnergyPeriod2 = vendeeEnergyPeriod2;
    } 
	
    /**
     * 属性 saleEnergyPeriod2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSaleEnergyPeriod2(){
        return saleEnergyPeriod2;
    }
	
    /**
     * 属性 saleEnergyPeriod2 的set方法
     * @return
     */
    public void setSaleEnergyPeriod2(BigDecimal saleEnergyPeriod2){
        this.saleEnergyPeriod2 = saleEnergyPeriod2;
    } 
	
    /**
     * 属性 vendeeEnergyPeriod3 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVendeeEnergyPeriod3(){
        return vendeeEnergyPeriod3;
    }
	
    /**
     * 属性 vendeeEnergyPeriod3 的set方法
     * @return
     */
    public void setVendeeEnergyPeriod3(BigDecimal vendeeEnergyPeriod3){
        this.vendeeEnergyPeriod3 = vendeeEnergyPeriod3;
    } 
	
    /**
     * 属性 saleEnergyPeriod3 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSaleEnergyPeriod3(){
        return saleEnergyPeriod3;
    }
	
    /**
     * 属性 saleEnergyPeriod3 的set方法
     * @return
     */
    public void setSaleEnergyPeriod3(BigDecimal saleEnergyPeriod3){
        this.saleEnergyPeriod3 = saleEnergyPeriod3;
    } 
	
    /**
     * 属性 vendeeEnergyPeriod4 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVendeeEnergyPeriod4(){
        return vendeeEnergyPeriod4;
    }
	
    /**
     * 属性 vendeeEnergyPeriod4 的set方法
     * @return
     */
    public void setVendeeEnergyPeriod4(BigDecimal vendeeEnergyPeriod4){
        this.vendeeEnergyPeriod4 = vendeeEnergyPeriod4;
    } 
	
    /**
     * 属性 saleEnergyPeriod4 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSaleEnergyPeriod4(){
        return saleEnergyPeriod4;
    }
	
    /**
     * 属性 saleEnergyPeriod4 的set方法
     * @return
     */
    public void setSaleEnergyPeriod4(BigDecimal saleEnergyPeriod4){
        this.saleEnergyPeriod4 = saleEnergyPeriod4;
    } 
	
    /**
     * 属性 vendeeEnergyPeriod5 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVendeeEnergyPeriod5(){
        return vendeeEnergyPeriod5;
    }
	
    /**
     * 属性 vendeeEnergyPeriod5 的set方法
     * @return
     */
    public void setVendeeEnergyPeriod5(BigDecimal vendeeEnergyPeriod5){
        this.vendeeEnergyPeriod5 = vendeeEnergyPeriod5;
    } 
	
    /**
     * 属性 saleEnergyPeriod5 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSaleEnergyPeriod5(){
        return saleEnergyPeriod5;
    }
	
    /**
     * 属性 saleEnergyPeriod5 的set方法
     * @return
     */
    public void setSaleEnergyPeriod5(BigDecimal saleEnergyPeriod5){
        this.saleEnergyPeriod5 = saleEnergyPeriod5;
    } 
	
    /**
     * 属性 vendeeGrosseng 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVendeeGrosseng(){
        return vendeeGrosseng;
    }
	
    /**
     * 属性 vendeeGrosseng 的set方法
     * @return
     */
    public void setVendeeGrosseng(BigDecimal vendeeGrosseng){
        this.vendeeGrosseng = vendeeGrosseng;
    } 
	
    /**
     * 属性 saleGrosseng 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSaleGrosseng(){
        return saleGrosseng;
    }
	
    /**
     * 属性 saleGrosseng 的set方法
     * @return
     */
    public void setSaleGrosseng(BigDecimal saleGrosseng){
        this.saleGrosseng = saleGrosseng;
    } 
	
    /**
     * 属性 vendeeGrossengPeriod1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVendeeGrossengPeriod1(){
        return vendeeGrossengPeriod1;
    }
	
    /**
     * 属性 vendeeGrossengPeriod1 的set方法
     * @return
     */
    public void setVendeeGrossengPeriod1(BigDecimal vendeeGrossengPeriod1){
        this.vendeeGrossengPeriod1 = vendeeGrossengPeriod1;
    } 
	
    /**
     * 属性 saleGrossengPeriod1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSaleGrossengPeriod1(){
        return saleGrossengPeriod1;
    }
	
    /**
     * 属性 saleGrossengPeriod1 的set方法
     * @return
     */
    public void setSaleGrossengPeriod1(BigDecimal saleGrossengPeriod1){
        this.saleGrossengPeriod1 = saleGrossengPeriod1;
    } 
	
    /**
     * 属性 vendeeGrossengPeriod2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVendeeGrossengPeriod2(){
        return vendeeGrossengPeriod2;
    }
	
    /**
     * 属性 vendeeGrossengPeriod2 的set方法
     * @return
     */
    public void setVendeeGrossengPeriod2(BigDecimal vendeeGrossengPeriod2){
        this.vendeeGrossengPeriod2 = vendeeGrossengPeriod2;
    } 
	
    /**
     * 属性 saleGrossengPeriod2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSaleGrossengPeriod2(){
        return saleGrossengPeriod2;
    }
	
    /**
     * 属性 saleGrossengPeriod2 的set方法
     * @return
     */
    public void setSaleGrossengPeriod2(BigDecimal saleGrossengPeriod2){
        this.saleGrossengPeriod2 = saleGrossengPeriod2;
    } 
	
    /**
     * 属性 vendeeGrossengPeriod3 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVendeeGrossengPeriod3(){
        return vendeeGrossengPeriod3;
    }
	
    /**
     * 属性 vendeeGrossengPeriod3 的set方法
     * @return
     */
    public void setVendeeGrossengPeriod3(BigDecimal vendeeGrossengPeriod3){
        this.vendeeGrossengPeriod3 = vendeeGrossengPeriod3;
    } 
	
    /**
     * 属性 saleGrossengPeriod3 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSaleGrossengPeriod3(){
        return saleGrossengPeriod3;
    }
	
    /**
     * 属性 saleGrossengPeriod3 的set方法
     * @return
     */
    public void setSaleGrossengPeriod3(BigDecimal saleGrossengPeriod3){
        this.saleGrossengPeriod3 = saleGrossengPeriod3;
    } 
	
    /**
     * 属性 vendeeGrossengPeriod4 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVendeeGrossengPeriod4(){
        return vendeeGrossengPeriod4;
    }
	
    /**
     * 属性 vendeeGrossengPeriod4 的set方法
     * @return
     */
    public void setVendeeGrossengPeriod4(BigDecimal vendeeGrossengPeriod4){
        this.vendeeGrossengPeriod4 = vendeeGrossengPeriod4;
    } 
	
    /**
     * 属性 saleGrossengPeriod4 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSaleGrossengPeriod4(){
        return saleGrossengPeriod4;
    }
	
    /**
     * 属性 saleGrossengPeriod4 的set方法
     * @return
     */
    public void setSaleGrossengPeriod4(BigDecimal saleGrossengPeriod4){
        this.saleGrossengPeriod4 = saleGrossengPeriod4;
    } 
	
    /**
     * 属性 vendeeGrossengPeriod5 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVendeeGrossengPeriod5(){
        return vendeeGrossengPeriod5;
    }
	
    /**
     * 属性 vendeeGrossengPeriod5 的set方法
     * @return
     */
    public void setVendeeGrossengPeriod5(BigDecimal vendeeGrossengPeriod5){
        this.vendeeGrossengPeriod5 = vendeeGrossengPeriod5;
    } 
	
    /**
     * 属性 saleGrossengPeriod5 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSaleGrossengPeriod5(){
        return saleGrossengPeriod5;
    }
	
    /**
     * 属性 saleGrossengPeriod5 的set方法
     * @return
     */
    public void setSaleGrossengPeriod5(BigDecimal saleGrossengPeriod5){
        this.saleGrossengPeriod5 = saleGrossengPeriod5;
    } 
	
    /**
     * 属性 powerCurveId 的get方法
     * @return String
     */
    public String getPowerCurveId(){
        return powerCurveId;
    }
	
    /**
     * 属性 powerCurveId 的set方法
     * @return
     */
    public void setPowerCurveId(String powerCurveId){
        this.powerCurveId = powerCurveId;
    } 
	
    /**
     * 属性 marketId 的get方法
     * @return String
     */
    public String getMarketId(){
        return marketId;
    }
	
    /**
     * 属性 marketId 的set方法
     * @return
     */
    public void setMarketId(String marketId){
        this.marketId = marketId;
    } 
	
    /**
     * 属性 operator 的get方法
     * @return String
     */
    public String getOperator(){
        return operator;
    }
	
    /**
     * 属性 operator 的set方法
     * @return
     */
    public void setOperator(String operator){
        this.operator = operator;
    } 
	
    /**
     * 属性 updateTime 的get方法
     * @return Date
     */
    public Date getUpdateTime(){
        return updateTime;
    }
	
    /**
     * 属性 updateTime 的set方法
     * @return
     */
    public void setUpdateTime(Date updateTime){
        this.updateTime = updateTime;
    } 
	
    /**
     * 属性 remark 的get方法
     * @return String
     */
    public String getRemark(){
        return remark;
    }
	
    /**
     * 属性 remark 的set方法
     * @return
     */
    public void setRemark(String remark){
        this.remark = remark;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof TrResultDecenergyCheck))
	        return false; 
			
        if(getId() == null) 
	        return false;

        TrResultDecenergyCheck other = (TrResultDecenergyCheck) o;	        
	    return new EqualsBuilder()
            .append(this.getId(), other.getId())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("id"+":"+getId())
            .append("tradeResultMainId"+":"+getTradeResultMainId())
            .append("mktMonth"+":"+getMktMonth())
            .append("vendeeEnergy"+":"+getVendeeEnergy())
            .append("saleEnergy"+":"+getSaleEnergy())
            .append("vendeeEnergyPeriod1"+":"+getVendeeEnergyPeriod1())
            .append("saleEnergyPeriod1"+":"+getSaleEnergyPeriod1())
            .append("vendeeEnergyPeriod2"+":"+getVendeeEnergyPeriod2())
            .append("saleEnergyPeriod2"+":"+getSaleEnergyPeriod2())
            .append("vendeeEnergyPeriod3"+":"+getVendeeEnergyPeriod3())
            .append("saleEnergyPeriod3"+":"+getSaleEnergyPeriod3())
            .append("vendeeEnergyPeriod4"+":"+getVendeeEnergyPeriod4())
            .append("saleEnergyPeriod4"+":"+getSaleEnergyPeriod4())
            .append("vendeeEnergyPeriod5"+":"+getVendeeEnergyPeriod5())
            .append("saleEnergyPeriod5"+":"+getSaleEnergyPeriod5())
            .append("vendeeGrosseng"+":"+getVendeeGrosseng())
            .append("saleGrosseng"+":"+getSaleGrosseng())
            .append("vendeeGrossengPeriod1"+":"+getVendeeGrossengPeriod1())
            .append("saleGrossengPeriod1"+":"+getSaleGrossengPeriod1())
            .append("vendeeGrossengPeriod2"+":"+getVendeeGrossengPeriod2())
            .append("saleGrossengPeriod2"+":"+getSaleGrossengPeriod2())
            .append("vendeeGrossengPeriod3"+":"+getVendeeGrossengPeriod3())
            .append("saleGrossengPeriod3"+":"+getSaleGrossengPeriod3())
            .append("vendeeGrossengPeriod4"+":"+getVendeeGrossengPeriod4())
            .append("saleGrossengPeriod4"+":"+getSaleGrossengPeriod4())
            .append("vendeeGrossengPeriod5"+":"+getVendeeGrossengPeriod5())
            .append("saleGrossengPeriod5"+":"+getSaleGrossengPeriod5())
            .append("powerCurveId"+":"+getPowerCurveId())
            .append("marketId"+":"+getMarketId())
            .append("operator"+":"+getOperator())
            .append("updateTime"+":"+getUpdateTime())
            .append("remark"+":"+getRemark())
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