package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TjfxPurchasetradeincomeShow的POJO类
 *
 * @author  sss  [Thu Nov 14 19:59:56 CST 2013]
 * 
 */
public class TjfxPurchasetradeincomeShow implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性mktMonth
     */
    private Date mktMonth;
	
    /** 
     * 属性tjname
     */
    private String tjname;
	
    /** 
     * 属性monthsettlequantity
     */
    private BigDecimal monthsettlequantity;
	
    /** 
     * 属性monthprice
     */
    private BigDecimal monthprice;
	
    /** 
     * 属性monthpricetb
     */
    private BigDecimal monthpricetb;
	
    /** 
     * 属性monthincome
     */
    private BigDecimal monthincome;
	
    /** 
     * 属性monthincometb
     */
    private BigDecimal monthincometb;
	
    /** 
     * 属性ljsettlequantity
     */
    private BigDecimal ljsettlequantity;
	
    /** 
     * 属性ljprice
     */
    private BigDecimal ljprice;
	
    /** 
     * 属性ljpricetb
     */
    private BigDecimal ljpricetb;
	
    /** 
     * 属性ljincome
     */
    private BigDecimal ljincome;
	
    /** 
     * 属性ljincometb
     */
    private BigDecimal ljincometb;
	
    /** 
     * 属性yl1
     */
    private BigDecimal yl1;
	
    /** 
     * 属性yl2
     */
    private BigDecimal yl2;
	
    /** 
     * 属性yl3
     */
    private String yl3;
	
    /** 
     * 属性yl4
     */
    private String yl4;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /**
     * TjfxPurchasetradeincomeShow构造函数
     */
    public TjfxPurchasetradeincomeShow() {
        super();
    }  
	
    /**
     * TjfxPurchasetradeincomeShow完整的构造函数
     */  
    public TjfxPurchasetradeincomeShow(String guid,Date mktMonth,String tjname){
        this.guid = guid;
        this.mktMonth = mktMonth;
        this.tjname = tjname;
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
     * 属性 tjname 的get方法
     * @return String
     */
    public String getTjname(){
        return tjname;
    }
	
    /**
     * 属性 tjname 的set方法
     * @return
     */
    public void setTjname(String tjname){
        this.tjname = tjname;
    } 
	
	
	
    /**
     * 属性 monthsettlequantity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMonthsettlequantity(){
        return monthsettlequantity;
    }
	
    /**
     * 属性 monthsettlequantity 的set方法
     * @return
     */
    public void setMonthsettlequantity(BigDecimal monthsettlequantity){
        this.monthsettlequantity = monthsettlequantity;
    } 
	
	
	
    /**
     * 属性 monthprice 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMonthprice(){
        return monthprice;
    }
	
    /**
     * 属性 monthprice 的set方法
     * @return
     */
    public void setMonthprice(BigDecimal monthprice){
        this.monthprice = monthprice;
    } 
	
	
	
    /**
     * 属性 monthpricetb 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMonthpricetb(){
        return monthpricetb;
    }
	
    /**
     * 属性 monthpricetb 的set方法
     * @return
     */
    public void setMonthpricetb(BigDecimal monthpricetb){
        this.monthpricetb = monthpricetb;
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
     * 属性 monthincometb 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMonthincometb(){
        return monthincometb;
    }
	
    /**
     * 属性 monthincometb 的set方法
     * @return
     */
    public void setMonthincometb(BigDecimal monthincometb){
        this.monthincometb = monthincometb;
    } 
	
	
	
    /**
     * 属性 ljsettlequantity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjsettlequantity(){
        return ljsettlequantity;
    }
	
    /**
     * 属性 ljsettlequantity 的set方法
     * @return
     */
    public void setLjsettlequantity(BigDecimal ljsettlequantity){
        this.ljsettlequantity = ljsettlequantity;
    } 
	
	
	
    /**
     * 属性 ljprice 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjprice(){
        return ljprice;
    }
	
    /**
     * 属性 ljprice 的set方法
     * @return
     */
    public void setLjprice(BigDecimal ljprice){
        this.ljprice = ljprice;
    } 
	
	
	
    /**
     * 属性 ljpricetb 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjpricetb(){
        return ljpricetb;
    }
	
    /**
     * 属性 ljpricetb 的set方法
     * @return
     */
    public void setLjpricetb(BigDecimal ljpricetb){
        this.ljpricetb = ljpricetb;
    } 
	
	
	
    /**
     * 属性 ljincome 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjincome(){
        return ljincome;
    }
	
    /**
     * 属性 ljincome 的set方法
     * @return
     */
    public void setLjincome(BigDecimal ljincome){
        this.ljincome = ljincome;
    } 
	
	
	
    /**
     * 属性 ljincometb 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjincometb(){
        return ljincometb;
    }
	
    /**
     * 属性 ljincometb 的set方法
     * @return
     */
    public void setLjincometb(BigDecimal ljincometb){
        this.ljincometb = ljincometb;
    } 
	
	
	
    /**
     * 属性 yl1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getYl1(){
        return yl1;
    }
	
    /**
     * 属性 yl1 的set方法
     * @return
     */
    public void setYl1(BigDecimal yl1){
        this.yl1 = yl1;
    } 
	
	
	
    /**
     * 属性 yl2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getYl2(){
        return yl2;
    }
	
    /**
     * 属性 yl2 的set方法
     * @return
     */
    public void setYl2(BigDecimal yl2){
        this.yl2 = yl2;
    } 
	
	
	
    /**
     * 属性 yl3 的get方法
     * @return String
     */
    public String getYl3(){
        return yl3;
    }
	
    /**
     * 属性 yl3 的set方法
     * @return
     */
    public void setYl3(String yl3){
        this.yl3 = yl3;
    } 
	
	
	
    /**
     * 属性 yl4 的get方法
     * @return String
     */
    public String getYl4(){
        return yl4;
    }
	
    /**
     * 属性 yl4 的set方法
     * @return
     */
    public void setYl4(String yl4){
        this.yl4 = yl4;
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
		
        if (o == null || !(o instanceof TjfxPurchasetradeincomeShow))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        TjfxPurchasetradeincomeShow other = (TjfxPurchasetradeincomeShow) o;	        
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
            .append("mktMonth"+":"+getMktMonth())
            .append("tjname"+":"+getTjname())
            .append("monthsettlequantity"+":"+getMonthsettlequantity())
            .append("monthprice"+":"+getMonthprice())
            .append("monthpricetb"+":"+getMonthpricetb())
            .append("monthincome"+":"+getMonthincome())
            .append("monthincometb"+":"+getMonthincometb())
            .append("ljsettlequantity"+":"+getLjsettlequantity())
            .append("ljprice"+":"+getLjprice())
            .append("ljpricetb"+":"+getLjpricetb())
            .append("ljincome"+":"+getLjincome())
            .append("ljincometb"+":"+getLjincometb())
            .append("yl1"+":"+getYl1())
            .append("yl2"+":"+getYl2())
            .append("yl3"+":"+getYl3())
            .append("yl4"+":"+getYl4())
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