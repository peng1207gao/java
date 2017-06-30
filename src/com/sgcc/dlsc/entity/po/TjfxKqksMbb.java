package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TjfxKqksMbb的POJO类
 *
 * @author  Administrator  [Wed Aug 21 14:51:22 CST 2013]
 * 
 */
public class TjfxKqksMbb implements Serializable{

    /**
	 * @description 
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
     * 属性regionid
     */
    private String regionid;
	
    /** 
     * 属性theyear
     */
    private String theyear;
	
    /** 
     * 属性yearregiontrade
     */
    private BigDecimal yearregiontrade;
	
    /** 
     * 属性shortregiontrade
     */
    private BigDecimal shortregiontrade;
	
    /** 
     * 属性yearprovincetrade
     */
    private BigDecimal yearprovincetrade;
	
    /** 
     * 属性shortprovincetrade
     */
    private BigDecimal shortprovincetrade;
	
    /** 
     * 属性assessmenttotalvalue
     */
    private BigDecimal assessmenttotalvalue;
	
    /** 
     * 属性remarks
     */
    private String remarks;
	
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
     * TjfxKqksMbb构造函数
     */
    public TjfxKqksMbb() {
        super();
    }  
	
    /**
     * TjfxKqksMbb完整的构造函数
     */  
    public TjfxKqksMbb(String guid,String marketid,String regionid,String theyear,BigDecimal iseffict){
        this.guid = guid;
        this.marketid = marketid;
        this.regionid = regionid;
        this.theyear = theyear;
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
     * 属性 regionid 的get方法
     * @return String
     */
    public String getRegionid(){
        return regionid;
    }
	
    /**
     * 属性 regionid 的set方法
     * @return
     */
    public void setRegionid(String regionid){
        this.regionid = regionid;
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
     * 属性 yearregiontrade 的get方法
     * @return BigDecimal
     */
    public BigDecimal getYearregiontrade(){
        return yearregiontrade;
    }
	
    /**
     * 属性 yearregiontrade 的set方法
     * @return
     */
    public void setYearregiontrade(BigDecimal yearregiontrade){
        this.yearregiontrade = yearregiontrade;
    } 
	
    /**
     * 属性 shortregiontrade 的get方法
     * @return BigDecimal
     */
    public BigDecimal getShortregiontrade(){
        return shortregiontrade;
    }
	
    /**
     * 属性 shortregiontrade 的set方法
     * @return
     */
    public void setShortregiontrade(BigDecimal shortregiontrade){
        this.shortregiontrade = shortregiontrade;
    } 
	
    /**
     * 属性 yearprovincetrade 的get方法
     * @return BigDecimal
     */
    public BigDecimal getYearprovincetrade(){
        return yearprovincetrade;
    }
	
    /**
     * 属性 yearprovincetrade 的set方法
     * @return
     */
    public void setYearprovincetrade(BigDecimal yearprovincetrade){
        this.yearprovincetrade = yearprovincetrade;
    } 
	
    /**
     * 属性 shortprovincetrade 的get方法
     * @return BigDecimal
     */
    public BigDecimal getShortprovincetrade(){
        return shortprovincetrade;
    }
	
    /**
     * 属性 shortprovincetrade 的set方法
     * @return
     */
    public void setShortprovincetrade(BigDecimal shortprovincetrade){
        this.shortprovincetrade = shortprovincetrade;
    } 
	
    /**
     * 属性 assessmenttotalvalue 的get方法
     * @return BigDecimal
     */
    public BigDecimal getAssessmenttotalvalue(){
        return assessmenttotalvalue;
    }
	
    /**
     * 属性 assessmenttotalvalue 的set方法
     * @return
     */
    public void setAssessmenttotalvalue(BigDecimal assessmenttotalvalue){
        this.assessmenttotalvalue = assessmenttotalvalue;
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
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof TjfxKqksMbb))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        TjfxKqksMbb other = (TjfxKqksMbb) o;	        
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
            .append("regionid"+":"+getRegionid())
            .append("theyear"+":"+getTheyear())
            .append("yearregiontrade"+":"+getYearregiontrade())
            .append("shortregiontrade"+":"+getShortregiontrade())
            .append("yearprovincetrade"+":"+getYearprovincetrade())
            .append("shortprovincetrade"+":"+getShortprovincetrade())
            .append("assessmenttotalvalue"+":"+getAssessmenttotalvalue())
            .append("remarks"+":"+getRemarks())
            .append("establishtime"+":"+getEstablishtime())
            .append("establishpersonid"+":"+getEstablishpersonid())
            .append("approvaltime"+":"+getApprovaltime())
            .append("approvaltimepersonid"+":"+getApprovaltimepersonid())
            .append("iseffict"+":"+getIseffict())
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