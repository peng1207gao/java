package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TjfxKqksYsb的POJO类
 *
 * @author  Administrator  [Thu Aug 22 16:28:01 CST 2013]
 * 
 */
public class TjfxKqksYsb implements Serializable{

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
     * 属性themonth
     */
    private String themonth;
	
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
     * 属性totalvalue
     */
    private BigDecimal totalvalue;
	
    /** 
     * 属性assessmentrecommendedvalues
     */
    private BigDecimal assessmentrecommendedvalues;
	
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
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性cleanenergyrate
     */
    private BigDecimal cleanenergyrate;
	
    /** 
     * 属性tradename
     */
    private String tradename;
	
    /**
     * TjfxKqksYsb构造函数
     */
    public TjfxKqksYsb() {
        super();
    }  
	
    /**
     * TjfxKqksYsb完整的构造函数
     */  
    public TjfxKqksYsb(String marketid,String regionid,String theyear,String themonth,BigDecimal iseffict,String guid,String tradename){
        this.marketid = marketid;
        this.regionid = regionid;
        this.theyear = theyear;
        this.themonth = themonth;
        this.iseffict = iseffict;
        this.guid = guid;
        this.tradename = tradename;
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
     * 属性 totalvalue 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTotalvalue(){
        return totalvalue;
    }
	
    /**
     * 属性 totalvalue 的set方法
     * @return
     */
    public void setTotalvalue(BigDecimal totalvalue){
        this.totalvalue = totalvalue;
    } 
	
    /**
     * 属性 assessmentrecommendedvalues 的get方法
     * @return BigDecimal
     */
    public BigDecimal getAssessmentrecommendedvalues(){
        return assessmentrecommendedvalues;
    }
	
    /**
     * 属性 assessmentrecommendedvalues 的set方法
     * @return
     */
    public void setAssessmentrecommendedvalues(BigDecimal assessmentrecommendedvalues){
        this.assessmentrecommendedvalues = assessmentrecommendedvalues;
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
     * 属性 cleanenergyrate 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCleanenergyrate(){
        return cleanenergyrate;
    }
	
    /**
     * 属性 cleanenergyrate 的set方法
     * @return
     */
    public void setCleanenergyrate(BigDecimal cleanenergyrate){
        this.cleanenergyrate = cleanenergyrate;
    } 
	
    /**
     * 属性 tradename 的get方法
     * @return String
     */
    public String getTradename(){
        return tradename;
    }
	
    /**
     * 属性 tradename 的set方法
     * @return
     */
    public void setTradename(String tradename){
        this.tradename = tradename;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof TjfxKqksYsb))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        TjfxKqksYsb other = (TjfxKqksYsb) o;	        
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
            .append("regionid"+":"+getRegionid())
            .append("theyear"+":"+getTheyear())
            .append("themonth"+":"+getThemonth())
            .append("yearregiontrade"+":"+getYearregiontrade())
            .append("shortregiontrade"+":"+getShortregiontrade())
            .append("yearprovincetrade"+":"+getYearprovincetrade())
            .append("shortprovincetrade"+":"+getShortprovincetrade())
            .append("totalvalue"+":"+getTotalvalue())
            .append("assessmentrecommendedvalues"+":"+getAssessmentrecommendedvalues())
            .append("remarks"+":"+getRemarks())
            .append("establishtime"+":"+getEstablishtime())
            .append("establishpersonid"+":"+getEstablishpersonid())
            .append("approvaltime"+":"+getApprovaltime())
            .append("approvaltimepersonid"+":"+getApprovaltimepersonid())
            .append("iseffict"+":"+getIseffict())
            .append("guid"+":"+getGuid())
            .append("cleanenergyrate"+":"+getCleanenergyrate())
            .append("tradename"+":"+getTradename())
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