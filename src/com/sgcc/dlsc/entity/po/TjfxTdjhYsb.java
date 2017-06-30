package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TjfxTdjhYsb的POJO类
 *
 * @author  Administrator  [Thu Aug 22 10:19:30 CST 2013]
 * 
 */
public class TjfxTdjhYsb implements Serializable{

    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性marketerid
     */
    private String marketerid;
	
    /** 
     * 属性theyear
     */
    private String theyear;
	
    /** 
     * 属性themonth
     */
    private String themonth;
	
    /** 
     * 属性monthplanquantity
     */
    private BigDecimal monthplanquantity;
	
    /** 
     * 属性monthactualquantity
     */
    private BigDecimal monthactualquantity;
	
    /** 
     * 属性monthplancompletionrate
     */
    private BigDecimal monthplancompletionrate;
	
    /** 
     * 属性monthplandeviation
     */
    private BigDecimal monthplandeviation;
	
    /** 
     * 属性establishtime
     */
    private Date establishtime;
	
    /** 
     * 属性establishpersonid
     */
    private String establishpersonid;
	
    /** 
     * 属性approvaltime
     */
    private Date approvaltime;
	
    /** 
     * 属性approvaltimepersonid
     */
    private String approvaltimepersonid;
	
    /** 
     * 属性iseffict
     */
    private BigDecimal iseffict;
	
    /** 
     * 属性guid
     */
    private String guid;
	
    /**
     * TjfxTdjhYsb构造函数
     */
    public TjfxTdjhYsb() {
        super();
    }  
	
    /**
     * TjfxTdjhYsb完整的构造函数
     */  
    public TjfxTdjhYsb(String marketid,String marketerid,String theyear,String themonth,BigDecimal iseffict,String guid){
        this.marketid = marketid;
        this.marketerid = marketerid;
        this.theyear = theyear;
        this.themonth = themonth;
        this.iseffict = iseffict;
        this.guid = guid;
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
     * 属性 marketerid 的get方法
     * @return String
     */
    public String getMarketerid(){
        return marketerid;
    }
	
    /**
     * 属性 marketerid 的set方法
     * @return
     */
    public void setMarketerid(String marketerid){
        this.marketerid = marketerid;
    } 
	
    /**
     * 属性 theyear 的get方法
     * @return String
     */
    public String getTheyear(){
        return theyear;
    }
	
    /**
     * 属性 theyear 的set方法
     * @return
     */
    public void setTheyear(String theyear){
        this.theyear = theyear;
    } 
	
    /**
     * 属性 themonth 的get方法
     * @return String
     */
    public String getThemonth(){
        return themonth;
    }
	
    /**
     * 属性 themonth 的set方法
     * @return
     */
    public void setThemonth(String themonth){
        this.themonth = themonth;
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
     * 属性 monthactualquantity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMonthactualquantity(){
        return monthactualquantity;
    }
	
    /**
     * 属性 monthactualquantity 的set方法
     * @return
     */
    public void setMonthactualquantity(BigDecimal monthactualquantity){
        this.monthactualquantity = monthactualquantity;
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
     * 属性 monthplandeviation 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMonthplandeviation(){
        return monthplandeviation;
    }
	
    /**
     * 属性 monthplandeviation 的set方法
     * @return
     */
    public void setMonthplandeviation(BigDecimal monthplandeviation){
        this.monthplandeviation = monthplandeviation;
    } 
	
    /**
     * 属性 establishtime 的get方法
     * @return Date
     */
    public Date getEstablishtime(){
        return establishtime;
    }
	
    /**
     * 属性 establishtime 的set方法
     * @return
     */
    public void setEstablishtime(Date establishtime){
        this.establishtime = establishtime;
    } 
	
    /**
     * 属性 establishpersonid 的get方法
     * @return String
     */
    public String getEstablishpersonid(){
        return establishpersonid;
    }
	
    /**
     * 属性 establishpersonid 的set方法
     * @return
     */
    public void setEstablishpersonid(String establishpersonid){
        this.establishpersonid = establishpersonid;
    } 
	
    /**
     * 属性 approvaltime 的get方法
     * @return Date
     */
    public Date getApprovaltime(){
        return approvaltime;
    }
	
    /**
     * 属性 approvaltime 的set方法
     * @return
     */
    public void setApprovaltime(Date approvaltime){
        this.approvaltime = approvaltime;
    } 
	
    /**
     * 属性 approvaltimepersonid 的get方法
     * @return String
     */
    public String getApprovaltimepersonid(){
        return approvaltimepersonid;
    }
	
    /**
     * 属性 approvaltimepersonid 的set方法
     * @return
     */
    public void setApprovaltimepersonid(String approvaltimepersonid){
        this.approvaltimepersonid = approvaltimepersonid;
    } 
	
    /**
     * 属性 iseffict 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIseffict(){
        return iseffict;
    }
	
    /**
     * 属性 iseffict 的set方法
     * @return
     */
    public void setIseffict(BigDecimal iseffict){
        this.iseffict = iseffict;
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
		
        if (o == null || !(o instanceof TjfxTdjhYsb))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        TjfxTdjhYsb other = (TjfxTdjhYsb) o;	        
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
            .append("marketid"+":"+getMarketid())
            .append("marketerid"+":"+getMarketerid())
            .append("theyear"+":"+getTheyear())
            .append("themonth"+":"+getThemonth())
            .append("monthplanquantity"+":"+getMonthplanquantity())
            .append("monthactualquantity"+":"+getMonthactualquantity())
            .append("monthplancompletionrate"+":"+getMonthplancompletionrate())
            .append("monthplandeviation"+":"+getMonthplandeviation())
            .append("establishtime"+":"+getEstablishtime())
            .append("establishpersonid"+":"+getEstablishpersonid())
            .append("approvaltime"+":"+getApprovaltime())
            .append("approvaltimepersonid"+":"+getApprovaltimepersonid())
            .append("iseffict"+":"+getIseffict())
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