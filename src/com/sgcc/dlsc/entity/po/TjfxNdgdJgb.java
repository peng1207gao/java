package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TjfxNdgdJgb的POJO类
 *
 * @author  Administrator  [Thu Aug 08 14:49:22 CST 2013]
 * 
 */
public class TjfxNdgdJgb implements Serializable{

    /** 
     * 属性marketid
     */
    private String marketid;
	

    /** 
     * 属性theyear
     */
    private String theyear;
	
    /** 
     * 属性contractexecutionrate
     */
    private BigDecimal contractexecutionrate;
	
    /** 
     * 属性contractforecastrate
     */
    private BigDecimal contractforecastrate;
	
    /** 
     * 属性contractadjustrate
     */
    private BigDecimal contractadjustrate;
	
    /** 
     * 属性assessmentnumber
     */
    private BigDecimal assessmentnumber;
	
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
     * TjfxNdgdJgb构造函数
     */
    public TjfxNdgdJgb() {
        super();
    }  
	
    /**
     * TjfxNdgdJgb完整的构造函数
     */  
    public TjfxNdgdJgb(String marketid,BigDecimal iseffict,String guid){
        this.marketid = marketid;
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
     * 属性 contractexecutionrate 的get方法
     * @return BigDecimal
     */
    public BigDecimal getContractexecutionrate(){
        return contractexecutionrate;
    }
	
    /**
     * 属性 contractexecutionrate 的set方法
     * @return
     */
    public void setContractexecutionrate(BigDecimal contractexecutionrate){
        this.contractexecutionrate = contractexecutionrate;
    } 
	
    /**
     * 属性 contractforecastrate 的get方法
     * @return BigDecimal
     */
    public BigDecimal getContractforecastrate(){
        return contractforecastrate;
    }
	
    /**
     * 属性 contractforecastrate 的set方法
     * @return
     */
    public void setContractforecastrate(BigDecimal contractforecastrate){
        this.contractforecastrate = contractforecastrate;
    } 
	
    /**
     * 属性 contractadjustrate 的get方法
     * @return BigDecimal
     */
    public BigDecimal getContractadjustrate(){
        return contractadjustrate;
    }
	
    /**
     * 属性 contractadjustrate 的set方法
     * @return
     */
    public void setContractadjustrate(BigDecimal contractadjustrate){
        this.contractadjustrate = contractadjustrate;
    } 
	
    /**
     * 属性 assessmentnumber 的get方法
     * @return BigDecimal
     */
    public BigDecimal getAssessmentnumber(){
        return assessmentnumber;
    }
	
    /**
     * 属性 assessmentnumber 的set方法
     * @return
     */
    public void setAssessmentnumber(BigDecimal assessmentnumber){
        this.assessmentnumber = assessmentnumber;
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
		
        if (o == null || !(o instanceof TjfxNdgdJgb))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        TjfxNdgdJgb other = (TjfxNdgdJgb) o;	        
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
            .append("theyear"+":"+getTheyear())
            .append("contractexecutionrate"+":"+getContractexecutionrate())
            .append("contractforecastrate"+":"+getContractforecastrate())
            .append("contractadjustrate"+":"+getContractadjustrate())
            .append("assessmentnumber"+":"+getAssessmentnumber())
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