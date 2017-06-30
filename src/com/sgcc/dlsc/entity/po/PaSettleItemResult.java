package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.sql.Date;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * PaSettleItemResult的POJO类
 *
 * @author  Administrator  [Sat Jun 15 10:09:18 CST 2013]
 * 
 */
public class PaSettleItemResult implements Serializable{
	/**
	 * 
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
     * 属性querydate
     */
    private Date querydate;
	
    /** 
     * 属性theitemid
     */
    private String theitemid;
	
    /** 
     * 属性theitemname
     */
    private String theitemname;
	
    /** 
     * 属性thetype
     */
    private BigDecimal thetype;
	
    /** 
     * 属性montheq
     */
    private BigDecimal montheq;
	
    /** 
     * 属性monthplaneq
     */
    private BigDecimal monthplaneq;
	
    /** 
     * 属性monthplanrate
     */
    private BigDecimal monthplanrate;
	
    /** 
     * 属性montheqcomparehistory
     */
    private BigDecimal montheqcomparehistory;
	
    /** 
     * 属性montheqpercent
     */
    private BigDecimal montheqpercent;
	
    /** 
     * 属性monthaverprice
     */
    private BigDecimal monthaverprice;
	
    /** 
     * 属性monthmoney
     */
    private BigDecimal monthmoney;
	
    /** 
     * 属性monthmoneypercent
     */
    private BigDecimal monthmoneypercent;
	
    /** 
     * 属性monthmoneycomparehistory
     */
    private BigDecimal monthmoneycomparehistory;
	
    /** 
     * 属性montheqT
     */
    private BigDecimal montheqT;
	
    /** 
     * 属性yearplaneq
     */
    private BigDecimal yearplaneq;
	
    /** 
     * 属性yearplanrate
     */
    private BigDecimal yearplanrate;
	
    /** 
     * 属性yearplanratediff
     */
    private BigDecimal yearplanratediff;
	
    /** 
     * 属性montheqTcomparehistory
     */
    private BigDecimal montheqTcomparehistory;
	
    /** 
     * 属性montheqTpercent
     */
    private BigDecimal montheqTpercent;
	
    /** 
     * 属性monthaverpriceTpercent
     */
    private BigDecimal monthaverpriceTpercent;
	
    /** 
     * 属性monthaverpriceTcomparehistory
     */
    private BigDecimal monthaverpriceTcomparehistory;
	
    /** 
     * 属性buytypechangeprice
     */
    private BigDecimal buytypechangeprice;
	
    /** 
     * 属性pricechangeaverprice
     */
    private BigDecimal pricechangeaverprice;
	
    /** 
     * 属性monthmoneyT
     */
    private BigDecimal monthmoneyT;
	
    /** 
     * 属性monthmoneyTpercent
     */
    private BigDecimal monthmoneyTpercent;
	
    /** 
     * 属性monthmoneyTcomparehistory
     */
    private BigDecimal monthmoneyTcomparehistory;
	
    /** 
     * 属性bakStr1
     */
    private String bakStr1;
	
    /** 
     * 属性bakStr2
     */
    private String bakStr2;
	
    /** 
     * 属性bakStr3
     */
    private String bakStr3;
	
    /** 
     * 属性bakInt1
     */
    private BigDecimal bakInt1;
	
    /** 
     * 属性bakInt2
     */
    private BigDecimal bakInt2;
	
    /** 
     * 属性bakInt3
     */
    private BigDecimal bakInt3;
	
    /** 
     * 属性bakDouble1
     */
    private BigDecimal bakDouble1;
	
    /** 
     * 属性bakDouble2
     */
    private BigDecimal bakDouble2;
	
    /** 
     * 属性bakDouble3
     */
    private BigDecimal bakDouble3;
	
    /** 
     * 属性bakDate1
     */
    private Date bakDate1;
	
    /** 
     * 属性bakDate2
     */
    private Date bakDate2;
	
    /** 
     * 属性bakDate3
     */
    private Date bakDate3;
	
    /**
     * PaSettleItemResult构造函数
     */
    public PaSettleItemResult() {
        super();
    }  
	
    /**
     * PaSettleItemResult完整的构造函数
     */  
    public PaSettleItemResult(String guid,String marketid,Date querydate,String theitemid,BigDecimal thetype){
        this.guid = guid;
        this.marketid = marketid;
        this.querydate = querydate;
        this.theitemid = theitemid;
        this.thetype = thetype;
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
     * 属性 querydate 的get方法
     * @return Date
     */
    public Date getQuerydate(){
        return querydate;
    }
	
    /**
     * 属性 querydate 的set方法
     * @return
     */
    public void setQuerydate(Date querydate){
        this.querydate = querydate;
    } 
	
    /**
     * 属性 theitemid 的get方法
     * @return String
     */
    public String getTheitemid(){
        return theitemid;
    }
	
    /**
     * 属性 theitemid 的set方法
     * @return
     */
    public void setTheitemid(String theitemid){
        this.theitemid = theitemid;
    } 
	
    /**
     * 属性 theitemname 的get方法
     * @return String
     */
    public String getTheitemname(){
        return theitemname;
    }
	
    /**
     * 属性 theitemname 的set方法
     * @return
     */
    public void setTheitemname(String theitemname){
        this.theitemname = theitemname;
    } 
	
    /**
     * 属性 thetype 的get方法
     * @return BigDecimal
     */
    public BigDecimal getThetype(){
        return thetype;
    }
	
    /**
     * 属性 thetype 的set方法
     * @return
     */
    public void setThetype(BigDecimal thetype){
        this.thetype = thetype;
    } 
	
    /**
     * 属性 montheq 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMontheq(){
        return montheq;
    }
	
    /**
     * 属性 montheq 的set方法
     * @return
     */
    public void setMontheq(BigDecimal montheq){
        this.montheq = montheq;
    } 
	
    /**
     * 属性 monthplaneq 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMonthplaneq(){
        return monthplaneq;
    }
	
    /**
     * 属性 monthplaneq 的set方法
     * @return
     */
    public void setMonthplaneq(BigDecimal monthplaneq){
        this.monthplaneq = monthplaneq;
    } 
	
    /**
     * 属性 monthplanrate 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMonthplanrate(){
        return monthplanrate;
    }
	
    /**
     * 属性 monthplanrate 的set方法
     * @return
     */
    public void setMonthplanrate(BigDecimal monthplanrate){
        this.monthplanrate = monthplanrate;
    } 
	
    /**
     * 属性 montheqcomparehistory 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMontheqcomparehistory(){
        return montheqcomparehistory;
    }
	
    /**
     * 属性 montheqcomparehistory 的set方法
     * @return
     */
    public void setMontheqcomparehistory(BigDecimal montheqcomparehistory){
        this.montheqcomparehistory = montheqcomparehistory;
    } 
	
    /**
     * 属性 montheqpercent 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMontheqpercent(){
        return montheqpercent;
    }
	
    /**
     * 属性 montheqpercent 的set方法
     * @return
     */
    public void setMontheqpercent(BigDecimal montheqpercent){
        this.montheqpercent = montheqpercent;
    } 
	
    /**
     * 属性 monthaverprice 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMonthaverprice(){
        return monthaverprice;
    }
	
    /**
     * 属性 monthaverprice 的set方法
     * @return
     */
    public void setMonthaverprice(BigDecimal monthaverprice){
        this.monthaverprice = monthaverprice;
    } 
	
    /**
     * 属性 monthmoney 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMonthmoney(){
        return monthmoney;
    }
	
    /**
     * 属性 monthmoney 的set方法
     * @return
     */
    public void setMonthmoney(BigDecimal monthmoney){
        this.monthmoney = monthmoney;
    } 
	
    /**
     * 属性 monthmoneypercent 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMonthmoneypercent(){
        return monthmoneypercent;
    }
	
    /**
     * 属性 monthmoneypercent 的set方法
     * @return
     */
    public void setMonthmoneypercent(BigDecimal monthmoneypercent){
        this.monthmoneypercent = monthmoneypercent;
    } 
	
    /**
     * 属性 monthmoneycomparehistory 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMonthmoneycomparehistory(){
        return monthmoneycomparehistory;
    }
	
    /**
     * 属性 monthmoneycomparehistory 的set方法
     * @return
     */
    public void setMonthmoneycomparehistory(BigDecimal monthmoneycomparehistory){
        this.monthmoneycomparehistory = monthmoneycomparehistory;
    } 
	
    /**
     * 属性 montheqT 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMontheqT(){
        return montheqT;
    }
	
    /**
     * 属性 montheqT 的set方法
     * @return
     */
    public void setMontheqT(BigDecimal montheqT){
        this.montheqT = montheqT;
    } 
	
    /**
     * 属性 yearplaneq 的get方法
     * @return BigDecimal
     */
    public BigDecimal getYearplaneq(){
        return yearplaneq;
    }
	
    /**
     * 属性 yearplaneq 的set方法
     * @return
     */
    public void setYearplaneq(BigDecimal yearplaneq){
        this.yearplaneq = yearplaneq;
    } 
	
    /**
     * 属性 yearplanrate 的get方法
     * @return BigDecimal
     */
    public BigDecimal getYearplanrate(){
        return yearplanrate;
    }
	
    /**
     * 属性 yearplanrate 的set方法
     * @return
     */
    public void setYearplanrate(BigDecimal yearplanrate){
        this.yearplanrate = yearplanrate;
    } 
	
    /**
     * 属性 yearplanratediff 的get方法
     * @return BigDecimal
     */
    public BigDecimal getYearplanratediff(){
        return yearplanratediff;
    }
	
    /**
     * 属性 yearplanratediff 的set方法
     * @return
     */
    public void setYearplanratediff(BigDecimal yearplanratediff){
        this.yearplanratediff = yearplanratediff;
    } 
	
    /**
     * 属性 montheqTcomparehistory 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMontheqTcomparehistory(){
        return montheqTcomparehistory;
    }
	
    /**
     * 属性 montheqTcomparehistory 的set方法
     * @return
     */
    public void setMontheqTcomparehistory(BigDecimal montheqTcomparehistory){
        this.montheqTcomparehistory = montheqTcomparehistory;
    } 
	
    /**
     * 属性 montheqTpercent 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMontheqTpercent(){
        return montheqTpercent;
    }
	
    /**
     * 属性 montheqTpercent 的set方法
     * @return
     */
    public void setMontheqTpercent(BigDecimal montheqTpercent){
        this.montheqTpercent = montheqTpercent;
    } 
	
    /**
     * 属性 monthaverpriceTpercent 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMonthaverpriceTpercent(){
        return monthaverpriceTpercent;
    }
	
    /**
     * 属性 monthaverpriceTpercent 的set方法
     * @return
     */
    public void setMonthaverpriceTpercent(BigDecimal monthaverpriceTpercent){
        this.monthaverpriceTpercent = monthaverpriceTpercent;
    } 
	
    /**
     * 属性 monthaverpriceTcomparehistory 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMonthaverpriceTcomparehistory(){
        return monthaverpriceTcomparehistory;
    }
	
    /**
     * 属性 monthaverpriceTcomparehistory 的set方法
     * @return
     */
    public void setMonthaverpriceTcomparehistory(BigDecimal monthaverpriceTcomparehistory){
        this.monthaverpriceTcomparehistory = monthaverpriceTcomparehistory;
    } 
	
    /**
     * 属性 buytypechangeprice 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBuytypechangeprice(){
        return buytypechangeprice;
    }
	
    /**
     * 属性 buytypechangeprice 的set方法
     * @return
     */
    public void setBuytypechangeprice(BigDecimal buytypechangeprice){
        this.buytypechangeprice = buytypechangeprice;
    } 
	
    /**
     * 属性 pricechangeaverprice 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPricechangeaverprice(){
        return pricechangeaverprice;
    }
	
    /**
     * 属性 pricechangeaverprice 的set方法
     * @return
     */
    public void setPricechangeaverprice(BigDecimal pricechangeaverprice){
        this.pricechangeaverprice = pricechangeaverprice;
    } 
	
    /**
     * 属性 monthmoneyT 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMonthmoneyT(){
        return monthmoneyT;
    }
	
    /**
     * 属性 monthmoneyT 的set方法
     * @return
     */
    public void setMonthmoneyT(BigDecimal monthmoneyT){
        this.monthmoneyT = monthmoneyT;
    } 
	
    /**
     * 属性 monthmoneyTpercent 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMonthmoneyTpercent(){
        return monthmoneyTpercent;
    }
	
    /**
     * 属性 monthmoneyTpercent 的set方法
     * @return
     */
    public void setMonthmoneyTpercent(BigDecimal monthmoneyTpercent){
        this.monthmoneyTpercent = monthmoneyTpercent;
    } 
	
    /**
     * 属性 monthmoneyTcomparehistory 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMonthmoneyTcomparehistory(){
        return monthmoneyTcomparehistory;
    }
	
    /**
     * 属性 monthmoneyTcomparehistory 的set方法
     * @return
     */
    public void setMonthmoneyTcomparehistory(BigDecimal monthmoneyTcomparehistory){
        this.monthmoneyTcomparehistory = monthmoneyTcomparehistory;
    } 
	
    /**
     * 属性 bakStr1 的get方法
     * @return String
     */
    public String getBakStr1(){
        return bakStr1;
    }
	
    /**
     * 属性 bakStr1 的set方法
     * @return
     */
    public void setBakStr1(String bakStr1){
        this.bakStr1 = bakStr1;
    } 
	
    /**
     * 属性 bakStr2 的get方法
     * @return String
     */
    public String getBakStr2(){
        return bakStr2;
    }
	
    /**
     * 属性 bakStr2 的set方法
     * @return
     */
    public void setBakStr2(String bakStr2){
        this.bakStr2 = bakStr2;
    } 
	
    /**
     * 属性 bakStr3 的get方法
     * @return String
     */
    public String getBakStr3(){
        return bakStr3;
    }
	
    /**
     * 属性 bakStr3 的set方法
     * @return
     */
    public void setBakStr3(String bakStr3){
        this.bakStr3 = bakStr3;
    } 
	
    /**
     * 属性 bakInt1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBakInt1(){
        return bakInt1;
    }
	
    /**
     * 属性 bakInt1 的set方法
     * @return
     */
    public void setBakInt1(BigDecimal bakInt1){
        this.bakInt1 = bakInt1;
    } 
	
    /**
     * 属性 bakInt2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBakInt2(){
        return bakInt2;
    }
	
    /**
     * 属性 bakInt2 的set方法
     * @return
     */
    public void setBakInt2(BigDecimal bakInt2){
        this.bakInt2 = bakInt2;
    } 
	
    /**
     * 属性 bakInt3 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBakInt3(){
        return bakInt3;
    }
	
    /**
     * 属性 bakInt3 的set方法
     * @return
     */
    public void setBakInt3(BigDecimal bakInt3){
        this.bakInt3 = bakInt3;
    } 
	
    /**
     * 属性 bakDouble1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBakDouble1(){
        return bakDouble1;
    }
	
    /**
     * 属性 bakDouble1 的set方法
     * @return
     */
    public void setBakDouble1(BigDecimal bakDouble1){
        this.bakDouble1 = bakDouble1;
    } 
	
    /**
     * 属性 bakDouble2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBakDouble2(){
        return bakDouble2;
    }
	
    /**
     * 属性 bakDouble2 的set方法
     * @return
     */
    public void setBakDouble2(BigDecimal bakDouble2){
        this.bakDouble2 = bakDouble2;
    } 
	
    /**
     * 属性 bakDouble3 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBakDouble3(){
        return bakDouble3;
    }
	
    /**
     * 属性 bakDouble3 的set方法
     * @return
     */
    public void setBakDouble3(BigDecimal bakDouble3){
        this.bakDouble3 = bakDouble3;
    } 
	
    /**
     * 属性 bakDate1 的get方法
     * @return Date
     */
    public Date getBakDate1(){
        return bakDate1;
    }
	
    /**
     * 属性 bakDate1 的set方法
     * @return
     */
    public void setBakDate1(Date bakDate1){
        this.bakDate1 = bakDate1;
    } 
	
    /**
     * 属性 bakDate2 的get方法
     * @return Date
     */
    public Date getBakDate2(){
        return bakDate2;
    }
	
    /**
     * 属性 bakDate2 的set方法
     * @return
     */
    public void setBakDate2(Date bakDate2){
        this.bakDate2 = bakDate2;
    } 
	
    /**
     * 属性 bakDate3 的get方法
     * @return Date
     */
    public Date getBakDate3(){
        return bakDate3;
    }
	
    /**
     * 属性 bakDate3 的set方法
     * @return
     */
    public void setBakDate3(Date bakDate3){
        this.bakDate3 = bakDate3;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof PaSettleItemResult))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        PaSettleItemResult other = (PaSettleItemResult) o;	        
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
            .append("querydate"+":"+getQuerydate())
            .append("theitemid"+":"+getTheitemid())
            .append("theitemname"+":"+getTheitemname())
            .append("thetype"+":"+getThetype())
            .append("montheq"+":"+getMontheq())
            .append("monthplaneq"+":"+getMonthplaneq())
            .append("monthplanrate"+":"+getMonthplanrate())
            .append("montheqcomparehistory"+":"+getMontheqcomparehistory())
            .append("montheqpercent"+":"+getMontheqpercent())
            .append("monthaverprice"+":"+getMonthaverprice())
            .append("monthmoney"+":"+getMonthmoney())
            .append("monthmoneypercent"+":"+getMonthmoneypercent())
            .append("monthmoneycomparehistory"+":"+getMonthmoneycomparehistory())
            .append("montheqT"+":"+getMontheqT())
            .append("yearplaneq"+":"+getYearplaneq())
            .append("yearplanrate"+":"+getYearplanrate())
            .append("yearplanratediff"+":"+getYearplanratediff())
            .append("montheqTcomparehistory"+":"+getMontheqTcomparehistory())
            .append("montheqTpercent"+":"+getMontheqTpercent())
            .append("monthaverpriceTpercent"+":"+getMonthaverpriceTpercent())
            .append("monthaverpriceTcomparehistory"+":"+getMonthaverpriceTcomparehistory())
            .append("buytypechangeprice"+":"+getBuytypechangeprice())
            .append("pricechangeaverprice"+":"+getPricechangeaverprice())
            .append("monthmoneyT"+":"+getMonthmoneyT())
            .append("monthmoneyTpercent"+":"+getMonthmoneyTpercent())
            .append("monthmoneyTcomparehistory"+":"+getMonthmoneyTcomparehistory())
            .append("bakStr1"+":"+getBakStr1())
            .append("bakStr2"+":"+getBakStr2())
            .append("bakStr3"+":"+getBakStr3())
            .append("bakInt1"+":"+getBakInt1())
            .append("bakInt2"+":"+getBakInt2())
            .append("bakInt3"+":"+getBakInt3())
            .append("bakDouble1"+":"+getBakDouble1())
            .append("bakDouble2"+":"+getBakDouble2())
            .append("bakDouble3"+":"+getBakDouble3())
            .append("bakDate1"+":"+getBakDate1())
            .append("bakDate2"+":"+getBakDate2())
            .append("bakDate3"+":"+getBakDate3())
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