package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * CoContransenergyinfo的POJO类
 *
 * @author  Administrator  [Sat Jan 25 16:43:29 CST 2014]
 * 
 */
public class CoContransenergyinfo implements Serializable{

    /** 
     * 属性contractid
     */
    private String contractid;
	
    /** 
     * 属性transno
     */
    private BigDecimal transno;
	
    /** 
     * 属性transmission
     */
    private String transmission;
	
    /** 
     * 属性transperson
     */
    private String transperson;
	
    /** 
     * 属性transphone
     */
    private String transphone;
	
    /** 
     * 属性transconftime
     */
    private Date transconftime;
	
    /** 
     * 属性transenergy
     */
    private BigDecimal transenergy;
	
    /** 
     * 属性cost
     */
    private BigDecimal cost;
	
    /** 
     * 属性lossattribute
     */
    private BigDecimal lossattribute;
	
    /** 
     * 属性price
     */
    private BigDecimal price;
	
    /** 
     * 属性settleside
     */
    private BigDecimal settleside;
	
    /** 
     * 属性settletype
     */
    private BigDecimal settletype;
	
    /** 
     * 属性isincludetax
     */
    private BigDecimal isincludetax;
	
    /** 
     * 属性taxrate
     */
    private BigDecimal taxrate;
	
    /** 
     * 属性loss
     */
    private BigDecimal loss;
	
    /** 
     * 属性energypercent
     */
    private BigDecimal energypercent;
	
    /** 
     * 属性startdate
     */
    private Date startdate;
	
    /** 
     * 属性enddate
     */
    private Date enddate;
	
    /** 
     * 属性guid
     */
    private String guid;
	
    /**
     * CoContransenergyinfo构造函数
     */
    public CoContransenergyinfo() {
        super();
    }  
	
    /**
     * CoContransenergyinfo完整的构造函数
     */  
    public CoContransenergyinfo(String guid){
        this.guid = guid;
    }
 
	
	
    /**
     * 属性 contractid 的get方法
     * @return String
     */
    public String getContractid(){
        return contractid;
    }
	
    /**
     * 属性 contractid 的set方法
     * @return
     */
    public void setContractid(String contractid){
        this.contractid = contractid;
    } 
	
	
	
    /**
     * 属性 transno 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTransno(){
        return transno;
    }
	
    /**
     * 属性 transno 的set方法
     * @return
     */
    public void setTransno(BigDecimal transno){
        this.transno = transno;
    } 
	
	
	
    /**
     * 属性 transmission 的get方法
     * @return String
     */
    public String getTransmission(){
        return transmission;
    }
	
    /**
     * 属性 transmission 的set方法
     * @return
     */
    public void setTransmission(String transmission){
        this.transmission = transmission;
    } 
	
	
	
    /**
     * 属性 transperson 的get方法
     * @return String
     */
    public String getTransperson(){
        return transperson;
    }
	
    /**
     * 属性 transperson 的set方法
     * @return
     */
    public void setTransperson(String transperson){
        this.transperson = transperson;
    } 
	
	
	
    /**
     * 属性 transphone 的get方法
     * @return String
     */
    public String getTransphone(){
        return transphone;
    }
	
    /**
     * 属性 transphone 的set方法
     * @return
     */
    public void setTransphone(String transphone){
        this.transphone = transphone;
    } 
	
	
	
    /**
     * 属性 transconftime 的get方法
     * @return Date
     */
    public Date getTransconftime(){
        return transconftime;
    }
	
    /**
     * 属性 transconftime 的set方法
     * @return
     */
    public void setTransconftime(Date transconftime){
        this.transconftime = transconftime;
    } 
	
	
	
    /**
     * 属性 transenergy 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTransenergy(){
        return transenergy;
    }
	
    /**
     * 属性 transenergy 的set方法
     * @return
     */
    public void setTransenergy(BigDecimal transenergy){
        this.transenergy = transenergy;
    } 
	
	
	
    /**
     * 属性 cost 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCost(){
        return cost;
    }
	
    /**
     * 属性 cost 的set方法
     * @return
     */
    public void setCost(BigDecimal cost){
        this.cost = cost;
    } 
	
	
	
    /**
     * 属性 lossattribute 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLossattribute(){
        return lossattribute;
    }
	
    /**
     * 属性 lossattribute 的set方法
     * @return
     */
    public void setLossattribute(BigDecimal lossattribute){
        this.lossattribute = lossattribute;
    } 
	
	
	
    /**
     * 属性 price 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPrice(){
        return price;
    }
	
    /**
     * 属性 price 的set方法
     * @return
     */
    public void setPrice(BigDecimal price){
        this.price = price;
    } 
	
	
	
    /**
     * 属性 settleside 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSettleside(){
        return settleside;
    }
	
    /**
     * 属性 settleside 的set方法
     * @return
     */
    public void setSettleside(BigDecimal settleside){
        this.settleside = settleside;
    } 
	
	
	
    /**
     * 属性 settletype 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSettletype(){
        return settletype;
    }
	
    /**
     * 属性 settletype 的set方法
     * @return
     */
    public void setSettletype(BigDecimal settletype){
        this.settletype = settletype;
    } 
	
	
	
    /**
     * 属性 isincludetax 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsincludetax(){
        return isincludetax;
    }
	
    /**
     * 属性 isincludetax 的set方法
     * @return
     */
    public void setIsincludetax(BigDecimal isincludetax){
        this.isincludetax = isincludetax;
    } 
	
	
	
    /**
     * 属性 taxrate 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTaxrate(){
        return taxrate;
    }
	
    /**
     * 属性 taxrate 的set方法
     * @return
     */
    public void setTaxrate(BigDecimal taxrate){
        this.taxrate = taxrate;
    } 
	
	
	
    /**
     * 属性 loss 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLoss(){
        return loss;
    }
	
    /**
     * 属性 loss 的set方法
     * @return
     */
    public void setLoss(BigDecimal loss){
        this.loss = loss;
    } 
	
	
	
    /**
     * 属性 energypercent 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEnergypercent(){
        return energypercent;
    }
	
    /**
     * 属性 energypercent 的set方法
     * @return
     */
    public void setEnergypercent(BigDecimal energypercent){
        this.energypercent = energypercent;
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
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof CoContransenergyinfo))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        CoContransenergyinfo other = (CoContransenergyinfo) o;	        
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
            .append("contractid"+":"+getContractid())
            .append("transno"+":"+getTransno())
            .append("transmission"+":"+getTransmission())
            .append("transperson"+":"+getTransperson())
            .append("transphone"+":"+getTransphone())
            .append("transconftime"+":"+getTransconftime())
            .append("transenergy"+":"+getTransenergy())
            .append("cost"+":"+getCost())
            .append("lossattribute"+":"+getLossattribute())
            .append("price"+":"+getPrice())
            .append("settleside"+":"+getSettleside())
            .append("settletype"+":"+getSettletype())
            .append("isincludetax"+":"+getIsincludetax())
            .append("taxrate"+":"+getTaxrate())
            .append("loss"+":"+getLoss())
            .append("energypercent"+":"+getEnergypercent())
            .append("startdate"+":"+getStartdate())
            .append("enddate"+":"+getEnddate())
            .append("guid"+":"+getGuid())
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