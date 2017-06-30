package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * CoContractenergyinfo的POJO类
 *
 * @author  Administrator  [Sat Jan 25 16:40:04 CST 2014]
 * 
 */
public class CoContractenergyinfo implements Serializable{

    /** 
     * 属性contractid
     */
    private String contractid;
	
    /** 
     * 属性startdate
     */
    private Date startdate;
	
    /** 
     * 属性enddate
     */
    private Date enddate;
	
    /** 
     * 属性period
     */
    private BigDecimal period;
	
    /** 
     * 属性purchasergen
     */
    private BigDecimal purchasergen;
	
    /** 
     * 属性fee
     */
    private BigDecimal fee;
	
    /** 
     * 属性energy
     */
    private BigDecimal energy;
	
    /** 
     * 属性qtytype
     */
    private BigDecimal qtytype;
	
    /** 
     * 属性timeno
     */
    private BigDecimal timeno;
	
    /** 
     * 属性purchaserenergy
     */
    private BigDecimal purchaserenergy;
	
    /** 
     * 属性purchaserprice
     */
    private BigDecimal purchaserprice;
	
    /** 
     * 属性purisincludetax
     */
    private BigDecimal purisincludetax;
	
    /** 
     * 属性sellergen
     */
    private BigDecimal sellergen;
	
    /** 
     * 属性sellerenergy
     */
    private BigDecimal sellerenergy;
	
    /** 
     * 属性sellerprice
     */
    private BigDecimal sellerprice;
	
    /** 
     * 属性sellerisincludetax
     */
    private BigDecimal sellerisincludetax;
	
    /** 
     * 属性price
     */
    private BigDecimal price;
	
    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性purisincludetp
     */
    private BigDecimal purisincludetp;
	
    /** 
     * 属性sellerisincludetp
     */
    private BigDecimal sellerisincludetp;
	
    /** 
     * 属性pricetax
     */
    private BigDecimal pricetax;
	
    /** 
     * 属性pricetp
     */
    private BigDecimal pricetp;
	
    /** 
     * 属性whereinsert
     */
    private String whereinsert;
	
    /** 
     * 属性tradePriceMargin
     */
    private BigDecimal tradePriceMargin;
	
    /** 
     * 属性vendeeBreathPrice
     */
    private BigDecimal vendeeBreathPrice;
	
    /** 
     * 属性saleBreathPrice
     */
    private BigDecimal saleBreathPrice;
    
    /** 
     * 属性buyprice
     */
    private BigDecimal buyprice;
	
    /** 
     * 属性usersideqty
     */
    private BigDecimal usersideqty;
	
    /** 
     * 属性lossRatio
     */
    private BigDecimal lossRatio;
	
    /** 
     * 属性allowanceprice
     */
    private BigDecimal allowanceprice;
    
    /**
     * CoContractenergyinfo构造函数
     */
    public CoContractenergyinfo() {
        super();
    }  
	
    /**
     * CoContractenergyinfo完整的构造函数
     */  
    public CoContractenergyinfo(String guid){
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
     * 属性 period 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPeriod(){
        return period;
    }
	
    /**
     * 属性 period 的set方法
     * @return
     */
    public void setPeriod(BigDecimal period){
        this.period = period;
    } 
	
	
	
    /**
     * 属性 purchasergen 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPurchasergen(){
        return purchasergen;
    }
	
    /**
     * 属性 purchasergen 的set方法
     * @return
     */
    public void setPurchasergen(BigDecimal purchasergen){
        this.purchasergen = purchasergen;
    } 
	
	
	
    /**
     * 属性 fee 的get方法
     * @return BigDecimal
     */
    public BigDecimal getFee(){
        return fee;
    }
	
    /**
     * 属性 fee 的set方法
     * @return
     */
    public void setFee(BigDecimal fee){
        this.fee = fee;
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
     * 属性 qtytype 的get方法
     * @return BigDecimal
     */
    public BigDecimal getQtytype(){
        return qtytype;
    }
	
    /**
     * 属性 qtytype 的set方法
     * @return
     */
    public void setQtytype(BigDecimal qtytype){
        this.qtytype = qtytype;
    } 
	
	
	
    /**
     * 属性 timeno 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTimeno(){
        return timeno;
    }
	
    /**
     * 属性 timeno 的set方法
     * @return
     */
    public void setTimeno(BigDecimal timeno){
        this.timeno = timeno;
    } 
	
	
	
    /**
     * 属性 purchaserenergy 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPurchaserenergy(){
        return purchaserenergy;
    }
	
    /**
     * 属性 purchaserenergy 的set方法
     * @return
     */
    public void setPurchaserenergy(BigDecimal purchaserenergy){
        this.purchaserenergy = purchaserenergy;
    } 
	
	
	
    /**
     * 属性 purchaserprice 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPurchaserprice(){
        return purchaserprice;
    }
	
    /**
     * 属性 purchaserprice 的set方法
     * @return
     */
    public void setPurchaserprice(BigDecimal purchaserprice){
        this.purchaserprice = purchaserprice;
    } 
	
	
	
    /**
     * 属性 purisincludetax 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPurisincludetax(){
        return purisincludetax;
    }
	
    /**
     * 属性 purisincludetax 的set方法
     * @return
     */
    public void setPurisincludetax(BigDecimal purisincludetax){
        this.purisincludetax = purisincludetax;
    } 
	
	
	
    /**
     * 属性 sellergen 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSellergen(){
        return sellergen;
    }
	
    /**
     * 属性 sellergen 的set方法
     * @return
     */
    public void setSellergen(BigDecimal sellergen){
        this.sellergen = sellergen;
    } 
	
	
	
    /**
     * 属性 sellerenergy 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSellerenergy(){
        return sellerenergy;
    }
	
    /**
     * 属性 sellerenergy 的set方法
     * @return
     */
    public void setSellerenergy(BigDecimal sellerenergy){
        this.sellerenergy = sellerenergy;
    } 
	
	
	
    /**
     * 属性 sellerprice 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSellerprice(){
        return sellerprice;
    }
	
    /**
     * 属性 sellerprice 的set方法
     * @return
     */
    public void setSellerprice(BigDecimal sellerprice){
        this.sellerprice = sellerprice;
    } 
	
	
	
    /**
     * 属性 sellerisincludetax 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSellerisincludetax(){
        return sellerisincludetax;
    }
	
    /**
     * 属性 sellerisincludetax 的set方法
     * @return
     */
    public void setSellerisincludetax(BigDecimal sellerisincludetax){
        this.sellerisincludetax = sellerisincludetax;
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
     * 属性 purisincludetp 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPurisincludetp(){
        return purisincludetp;
    }
	
    /**
     * 属性 purisincludetp 的set方法
     * @return
     */
    public void setPurisincludetp(BigDecimal purisincludetp){
        this.purisincludetp = purisincludetp;
    } 
	
	
	
    /**
     * 属性 sellerisincludetp 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSellerisincludetp(){
        return sellerisincludetp;
    }
	
    /**
     * 属性 sellerisincludetp 的set方法
     * @return
     */
    public void setSellerisincludetp(BigDecimal sellerisincludetp){
        this.sellerisincludetp = sellerisincludetp;
    } 
	
	
	
    /**
     * 属性 pricetax 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPricetax(){
        return pricetax;
    }
	
    /**
     * 属性 pricetax 的set方法
     * @return
     */
    public void setPricetax(BigDecimal pricetax){
        this.pricetax = pricetax;
    } 
	
	
	
    /**
     * 属性 pricetp 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPricetp(){
        return pricetp;
    }
	
    /**
     * 属性 pricetp 的set方法
     * @return
     */
    public void setPricetp(BigDecimal pricetp){
        this.pricetp = pricetp;
    } 
	
	
	
    /**
     * 属性 whereinsert 的get方法
     * @return String
     */
    public String getWhereinsert(){
        return whereinsert;
    }
	
    /**
     * 属性 whereinsert 的set方法
     * @return
     */
    public void setWhereinsert(String whereinsert){
        this.whereinsert = whereinsert;
    } 
	
    /**
     * 属性 tradePriceMargin 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTradePriceMargin(){
        return tradePriceMargin;
    }
	
    /**
     * 属性 tradePriceMargin 的set方法
     * @return
     */
    public void setTradePriceMargin(BigDecimal tradePriceMargin){
        this.tradePriceMargin = tradePriceMargin;
    } 
	
    /**
     * 属性 vendeeBreathPrice 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVendeeBreathPrice(){
        return vendeeBreathPrice;
    }
	
    /**
     * 属性 vendeeBreathPrice 的set方法
     * @return
     */
    public void setVendeeBreathPrice(BigDecimal vendeeBreathPrice){
        this.vendeeBreathPrice = vendeeBreathPrice;
    } 
	
    /**
     * 属性 saleBreathPrice 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSaleBreathPrice(){
        return saleBreathPrice;
    }
	
    /**
     * 属性 saleBreathPrice 的set方法
     * @return
     */
    public void setSaleBreathPrice(BigDecimal saleBreathPrice){
        this.saleBreathPrice = saleBreathPrice;
    }
    
    /**
     * 属性 buyprice 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBuyprice(){
        return buyprice;
    }
	
    /**
     * 属性 buyprice 的set方法
     * @return
     */
    public void setBuyprice(BigDecimal buyprice){
        this.buyprice = buyprice;
    } 
	
    /**
     * 属性 usersideqty 的get方法
     * @return BigDecimal
     */
    public BigDecimal getUsersideqty(){
        return usersideqty;
    }
	
    /**
     * 属性 usersideqty 的set方法
     * @return
     */
    public void setUsersideqty(BigDecimal usersideqty){
        this.usersideqty = usersideqty;
    } 
	
    /**
     * 属性 lossRatio 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLossRatio(){
        return lossRatio;
    }
	
    /**
     * 属性 lossRatio 的set方法
     * @return
     */
    public void setLossRatio(BigDecimal lossRatio){
        this.lossRatio = lossRatio;
    } 
	
    /**
     * 属性 allowanceprice 的get方法
     * @return BigDecimal
     */
    public BigDecimal getAllowanceprice(){
        return allowanceprice;
    }
	
    /**
     * 属性 allowanceprice 的set方法
     * @return
     */
    public void setAllowanceprice(BigDecimal allowanceprice){
        this.allowanceprice = allowanceprice;
    }
    
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof CoContractenergyinfo))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        CoContractenergyinfo other = (CoContractenergyinfo) o;	        
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
            .append("startdate"+":"+getStartdate())
            .append("enddate"+":"+getEnddate())
            .append("period"+":"+getPeriod())
            .append("purchasergen"+":"+getPurchasergen())
            .append("fee"+":"+getFee())
            .append("energy"+":"+getEnergy())
            .append("qtytype"+":"+getQtytype())
            .append("timeno"+":"+getTimeno())
            .append("purchaserenergy"+":"+getPurchaserenergy())
            .append("purchaserprice"+":"+getPurchaserprice())
            .append("purisincludetax"+":"+getPurisincludetax())
            .append("sellergen"+":"+getSellergen())
            .append("sellerenergy"+":"+getSellerenergy())
            .append("sellerprice"+":"+getSellerprice())
            .append("sellerisincludetax"+":"+getSellerisincludetax())
            .append("price"+":"+getPrice())
            .append("guid"+":"+getGuid())
            .append("purisincludetp"+":"+getPurisincludetp())
            .append("sellerisincludetp"+":"+getSellerisincludetp())
            .append("pricetax"+":"+getPricetax())
            .append("pricetp"+":"+getPricetp())
            .append("whereinsert"+":"+getWhereinsert())
            .append("tradePriceMargin"+":"+getTradePriceMargin())
            .append("vendeeBreathPrice"+":"+getVendeeBreathPrice())
            .append("saleBreathPrice"+":"+getSaleBreathPrice())
            .append("buyprice"+":"+getBuyprice())
            .append("usersideqty"+":"+getUsersideqty())
            .append("lossRatio"+":"+getLossRatio())
            .append("allowanceprice"+":"+getAllowanceprice())
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