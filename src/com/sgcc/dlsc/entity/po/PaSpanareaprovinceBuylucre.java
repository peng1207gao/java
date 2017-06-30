package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.sql.Date;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * PaSpanareaprovinceBuylucre的POJO类
 *
 * @author  Administrator  [Sat Jun 15 14:48:55 CST 2013]
 * 
 */
public class PaSpanareaprovinceBuylucre implements Serializable{

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
     * 属性monthbuyeq
     */
    private BigDecimal monthbuyeq;
	
    /** 
     * 属性monthbuyprice
     */
    private BigDecimal monthbuyprice;
	
    /** 
     * 属性fireplantstandardprice
     */
    private BigDecimal fireplantstandardprice;
	
    /** 
     * 属性pricediff
     */
    private BigDecimal pricediff;
	
    /** 
     * 属性monthincome
     */
    private BigDecimal monthincome;
	
    /** 
     * 属性monthbuyeqT
     */
    private BigDecimal monthbuyeqT;
	
    /** 
     * 属性monthincomeT
     */
    private BigDecimal monthincomeT;
	
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
     * PaSpanareaprovinceBuylucre构造函数
     */
    public PaSpanareaprovinceBuylucre() {
        super();
    }  
	
    /**
     * PaSpanareaprovinceBuylucre完整的构造函数
     */  
    public PaSpanareaprovinceBuylucre(String guid,String marketid,Date querydate,String theitemid){
        this.guid = guid;
        this.marketid = marketid;
        this.querydate = querydate;
        this.theitemid = theitemid;
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
     * 属性 monthbuyeq 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMonthbuyeq(){
        return monthbuyeq;
    }
	
    /**
     * 属性 monthbuyeq 的set方法
     * @return
     */
    public void setMonthbuyeq(BigDecimal monthbuyeq){
        this.monthbuyeq = monthbuyeq;
    } 
	
    /**
     * 属性 monthbuyprice 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMonthbuyprice(){
        return monthbuyprice;
    }
	
    /**
     * 属性 monthbuyprice 的set方法
     * @return
     */
    public void setMonthbuyprice(BigDecimal monthbuyprice){
        this.monthbuyprice = monthbuyprice;
    } 
	
    /**
     * 属性 fireplantstandardprice 的get方法
     * @return BigDecimal
     */
    public BigDecimal getFireplantstandardprice(){
        return fireplantstandardprice;
    }
	
    /**
     * 属性 fireplantstandardprice 的set方法
     * @return
     */
    public void setFireplantstandardprice(BigDecimal fireplantstandardprice){
        this.fireplantstandardprice = fireplantstandardprice;
    } 
	
    /**
     * 属性 pricediff 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPricediff(){
        return pricediff;
    }
	
    /**
     * 属性 pricediff 的set方法
     * @return
     */
    public void setPricediff(BigDecimal pricediff){
        this.pricediff = pricediff;
    } 
	
    /**
     * 属性 monthincome 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMonthincome(){
        return monthincome;
    }
	
    /**
     * 属性 monthincome 的set方法
     * @return
     */
    public void setMonthincome(BigDecimal monthincome){
        this.monthincome = monthincome;
    } 
	
    /**
     * 属性 monthbuyeqT 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMonthbuyeqT(){
        return monthbuyeqT;
    }
	
    /**
     * 属性 monthbuyeqT 的set方法
     * @return
     */
    public void setMonthbuyeqT(BigDecimal monthbuyeqT){
        this.monthbuyeqT = monthbuyeqT;
    } 
	
    /**
     * 属性 monthincomeT 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMonthincomeT(){
        return monthincomeT;
    }
	
    /**
     * 属性 monthincomeT 的set方法
     * @return
     */
    public void setMonthincomeT(BigDecimal monthincomeT){
        this.monthincomeT = monthincomeT;
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
		
        if (o == null || !(o instanceof PaSpanareaprovinceBuylucre))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        PaSpanareaprovinceBuylucre other = (PaSpanareaprovinceBuylucre) o;	        
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
            .append("monthbuyeq"+":"+getMonthbuyeq())
            .append("monthbuyprice"+":"+getMonthbuyprice())
            .append("fireplantstandardprice"+":"+getFireplantstandardprice())
            .append("pricediff"+":"+getPricediff())
            .append("monthincome"+":"+getMonthincome())
            .append("monthbuyeqT"+":"+getMonthbuyeqT())
            .append("monthincomeT"+":"+getMonthincomeT())
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