package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TjfxNdgdMbb的POJO类
 *
 * @author  Administrator  [Wed Aug 21 14:48:18 CST 2013]
 * 
 */
public class TjfxNdgdMbb implements Serializable{

    /**
	 * @description 
	 */
	private static final long serialVersionUID = 1L;

	/** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性theyear
     */
    private String theyear;
	
    /** 
     * 属性contractaaimrate
     */
    private BigDecimal contractaaimrate;
	
    /** 
     * 属性ishydroelectricityprovince
     */
    private BigDecimal ishydroelectricityprovince;
	
    /** 
     * 属性remarks
     */
    private String remarks;
	
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
     * TjfxNdgdMbb构造函数
     */
    public TjfxNdgdMbb() {
        super();
    }  
	
    /**
     * TjfxNdgdMbb完整的构造函数
     */  
    public TjfxNdgdMbb(String marketid,BigDecimal contractaaimrate,BigDecimal ishydroelectricityprovince,BigDecimal iseffict,String guid){
        this.marketid = marketid;
        this.contractaaimrate = contractaaimrate;
        this.ishydroelectricityprovince = ishydroelectricityprovince;
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
     * 属性 contractaaimrate 的get方法
     * @return BigDecimal
     */
    public BigDecimal getContractaaimrate(){
        return contractaaimrate;
    }
	
    /**
     * 属性 contractaaimrate 的set方法
     * @return
     */
    public void setContractaaimrate(BigDecimal contractaaimrate){
        this.contractaaimrate = contractaaimrate;
    } 
	
    /**
     * 属性 ishydroelectricityprovince 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIshydroelectricityprovince(){
        return ishydroelectricityprovince;
    }
	
    /**
     * 属性 ishydroelectricityprovince 的set方法
     * @return
     */
    public void setIshydroelectricityprovince(BigDecimal ishydroelectricityprovince){
        this.ishydroelectricityprovince = ishydroelectricityprovince;
    } 
	
    /**
     * 属性 remarks 的get方法
     * @return String
     */
    public String getRemarks(){
        return remarks;
    }
	
    /**
     * 属性 remarks 的set方法
     * @return
     */
    public void setRemarks(String remarks){
        this.remarks = remarks;
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
		
        if (o == null || !(o instanceof TjfxNdgdMbb))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        TjfxNdgdMbb other = (TjfxNdgdMbb) o;	        
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
            .append("contractaaimrate"+":"+getContractaaimrate())
            .append("ishydroelectricityprovince"+":"+getIshydroelectricityprovince())
            .append("remarks"+":"+getRemarks())
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