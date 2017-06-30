package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TjfxKqksJgb的POJO类
 *
 * @author  Administrator  [Sat Aug 24 16:14:46 CST 2013]
 * 
 */
public class TjfxKqksJgb implements Serializable{

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
     * 属性targetcompletionrate
     */
    private BigDecimal targetcompletionrate;
	
    /** 
     * 属性assessmentnumber
     */
    private BigDecimal assessmentnumber;
	
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
     * TjfxKqksJgb构造函数
     */
    public TjfxKqksJgb() {
        super();
    }  
	
    /**
     * TjfxKqksJgb完整的构造函数
     */  
    public TjfxKqksJgb(String marketid,String regionid,String theyear,BigDecimal iseffict,String guid){
        this.marketid = marketid;
        this.regionid = regionid;
        this.theyear = theyear;
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
     * 属性 targetcompletionrate 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTargetcompletionrate(){
        return targetcompletionrate;
    }
	
    /**
     * 属性 targetcompletionrate 的set方法
     * @return
     */
    public void setTargetcompletionrate(BigDecimal targetcompletionrate){
        this.targetcompletionrate = targetcompletionrate;
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
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof TjfxKqksJgb))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        TjfxKqksJgb other = (TjfxKqksJgb) o;	        
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
            .append("targetcompletionrate"+":"+getTargetcompletionrate())
            .append("assessmentnumber"+":"+getAssessmentnumber())
            .append("remarks"+":"+getRemarks())
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