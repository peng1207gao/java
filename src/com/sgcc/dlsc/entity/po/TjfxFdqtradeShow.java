package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TjfxFdqtradeShow的POJO类
 *
 * @author  sss  [Mon Nov 11 11:56:19 CST 2013]
 * 
 */
public class TjfxFdqtradeShow implements Serializable{

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
     * 属性monthplanquantity
     */
    private BigDecimal monthplanquantity;
	
    /** 
     * 属性monthplancompletionrate
     */
    private BigDecimal monthplancompletionrate;
	
    /** 
     * 属性monthtb
     */
    private BigDecimal monthtb;
	
    /** 
     * 属性ljsettlequantity
     */
    private BigDecimal ljsettlequantity;
	
    /** 
     * 属性ljcontractquantity
     */
    private BigDecimal ljcontractquantity;
	
    /** 
     * 属性ljcompletionrate
     */
    private BigDecimal ljcompletionrate;
	
    /** 
     * 属性ljtb
     */
    private BigDecimal ljtb;
	
    /** 
     * 属性contractid
     */
    private String contractid;
	
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
    private BigDecimal yl3;
	
    /** 
     * 属性yl4
     */
    private String yl4;
	
    /** 
     * 属性yl5
     */
    private String yl5;
	
    /** 
     * 属性yl6
     */
    private String yl6;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /**
     * TjfxFdqtradeShow构造函数
     */
    public TjfxFdqtradeShow() {
        super();
    }  
	
    /**
     * TjfxFdqtradeShow完整的构造函数
     */  
    public TjfxFdqtradeShow(String guid,Date mktMonth,String tjname,String marketid){
        this.guid = guid;
        this.mktMonth = mktMonth;
        this.tjname = tjname;
        this.marketid = marketid;
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
     * 属性 monthplanquantity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMonthplanquantity(){
        return monthplanquantity;
    }
	
    /**
     * 属性 monthplanquantity 的set方法
     * @return
     */
    public void setMonthplanquantity(BigDecimal monthplanquantity){
        this.monthplanquantity = monthplanquantity;
    } 
	
	
	
    /**
     * 属性 monthplancompletionrate 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMonthplancompletionrate(){
        return monthplancompletionrate;
    }
	
    /**
     * 属性 monthplancompletionrate 的set方法
     * @return
     */
    public void setMonthplancompletionrate(BigDecimal monthplancompletionrate){
        this.monthplancompletionrate = monthplancompletionrate;
    } 
	
	
	
    /**
     * 属性 monthtb 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMonthtb(){
        return monthtb;
    }
	
    /**
     * 属性 monthtb 的set方法
     * @return
     */
    public void setMonthtb(BigDecimal monthtb){
        this.monthtb = monthtb;
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
     * 属性 ljcontractquantity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjcontractquantity(){
        return ljcontractquantity;
    }
	
    /**
     * 属性 ljcontractquantity 的set方法
     * @return
     */
    public void setLjcontractquantity(BigDecimal ljcontractquantity){
        this.ljcontractquantity = ljcontractquantity;
    } 
	
	
	
    /**
     * 属性 ljcompletionrate 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjcompletionrate(){
        return ljcompletionrate;
    }
	
    /**
     * 属性 ljcompletionrate 的set方法
     * @return
     */
    public void setLjcompletionrate(BigDecimal ljcompletionrate){
        this.ljcompletionrate = ljcompletionrate;
    } 
	
	
	
    /**
     * 属性 ljtb 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjtb(){
        return ljtb;
    }
	
    /**
     * 属性 ljtb 的set方法
     * @return
     */
    public void setLjtb(BigDecimal ljtb){
        this.ljtb = ljtb;
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
     * @return BigDecimal
     */
    public BigDecimal getYl3(){
        return yl3;
    }
	
    /**
     * 属性 yl3 的set方法
     * @return
     */
    public void setYl3(BigDecimal yl3){
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
     * 属性 yl5 的get方法
     * @return String
     */
    public String getYl5(){
        return yl5;
    }
	
    /**
     * 属性 yl5 的set方法
     * @return
     */
    public void setYl5(String yl5){
        this.yl5 = yl5;
    } 
	
	
	
    /**
     * 属性 yl6 的get方法
     * @return String
     */
    public String getYl6(){
        return yl6;
    }
	
    /**
     * 属性 yl6 的set方法
     * @return
     */
    public void setYl6(String yl6){
        this.yl6 = yl6;
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
		
        if (o == null || !(o instanceof TjfxFdqtradeShow))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        TjfxFdqtradeShow other = (TjfxFdqtradeShow) o;	        
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
            .append("monthplanquantity"+":"+getMonthplanquantity())
            .append("monthplancompletionrate"+":"+getMonthplancompletionrate())
            .append("monthtb"+":"+getMonthtb())
            .append("ljsettlequantity"+":"+getLjsettlequantity())
            .append("ljcontractquantity"+":"+getLjcontractquantity())
            .append("ljcompletionrate"+":"+getLjcompletionrate())
            .append("ljtb"+":"+getLjtb())
            .append("contractid"+":"+getContractid())
            .append("yl1"+":"+getYl1())
            .append("yl2"+":"+getYl2())
            .append("yl3"+":"+getYl3())
            .append("yl4"+":"+getYl4())
            .append("yl5"+":"+getYl5())
            .append("yl6"+":"+getYl6())
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