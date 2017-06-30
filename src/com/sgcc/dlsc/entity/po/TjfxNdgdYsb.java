package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TjfxNdgdYsb的POJO类
 *
 * @author  Administrator  [Wed Aug 07 14:31:34 CST 2013]
 * 
 */
public class TjfxNdgdYsb implements Serializable{

    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性marketerid
     */
    private String marketerid;
	
    /** 
     * 属性contractid
     */
    private String contractid;
	
    /** 
     * 属性theyear
     */
    private String theyear;
	
    /** 
     * 属性contractratea
     */
    private BigDecimal contractratea;
	
    /** 
     * 属性contractrateb
     */
    private BigDecimal contractrateb;
	
    /** 
     * 属性contractratec
     */
    private BigDecimal contractratec;
	
    /** 
     * 属性repliedprice
     */
    private BigDecimal repliedprice;
	
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
     * TjfxNdgdYsb构造函数
     */
    public TjfxNdgdYsb() {
        super();
    }  
	
    /**
     * TjfxNdgdYsb完整的构造函数
     */  
    public TjfxNdgdYsb(String marketid,String marketerid,String contractid,String theyear,BigDecimal iseffict,String guid){
        this.marketid = marketid;
        this.marketerid = marketerid;
        this.contractid = contractid;
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
     * 属性 contractratea 的get方法
     * @return BigDecimal
     */
    public BigDecimal getContractratea(){
        return contractratea;
    }
	
    /**
     * 属性 contractratea 的set方法
     * @return
     */
    public void setContractratea(BigDecimal contractratea){
        this.contractratea = contractratea;
    } 
	
    /**
     * 属性 contractrateb 的get方法
     * @return BigDecimal
     */
    public BigDecimal getContractrateb(){
        return contractrateb;
    }
	
    /**
     * 属性 contractrateb 的set方法
     * @return
     */
    public void setContractrateb(BigDecimal contractrateb){
        this.contractrateb = contractrateb;
    } 
	
    /**
     * 属性 contractratec 的get方法
     * @return BigDecimal
     */
    public BigDecimal getContractratec(){
        return contractratec;
    }
	
    /**
     * 属性 contractratec 的set方法
     * @return
     */
    public void setContractratec(BigDecimal contractratec){
        this.contractratec = contractratec;
    } 
	
    /**
     * 属性 repliedprice 的get方法
     * @return BigDecimal
     */
    public BigDecimal getRepliedprice(){
        return repliedprice;
    }
	
    /**
     * 属性 repliedprice 的set方法
     * @return
     */
    public void setRepliedprice(BigDecimal repliedprice){
        this.repliedprice = repliedprice;
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
		
        if (o == null || !(o instanceof TjfxNdgdYsb))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        TjfxNdgdYsb other = (TjfxNdgdYsb) o;	        
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
            .append("contractid"+":"+getContractid())
            .append("theyear"+":"+getTheyear())
            .append("contractratea"+":"+getContractratea())
            .append("contractrateb"+":"+getContractrateb())
            .append("contractratec"+":"+getContractratec())
            .append("repliedprice"+":"+getRepliedprice())
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