package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TjfxNdgdGdlb的POJO类
 *
 * @author  sss  [Tue Nov 12 11:33:44 CST 2013]
 * 
 */
public class TjfxNdgdGdlb implements Serializable{

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
     * 属性contractquantity1
     */
    private BigDecimal contractquantity1;
	
    /** 
     * 属性contractquantity2
     */
    private BigDecimal contractquantity2;
	
    /** 
     * 属性establishtime
     */
    private Date establishtime;
	
    /** 
     * 属性establishpersonid
     */
    private String establishpersonid;
	
    /** 
     * 属性iseffict
     */
    private BigDecimal iseffict;
	
    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性contractname
     */
    private String contractname;
	
    /**
     * TjfxNdgdGdlb构造函数
     */
    public TjfxNdgdGdlb() {
        super();
    }  
	
    /**
     * TjfxNdgdGdlb完整的构造函数
     */  
    public TjfxNdgdGdlb(String marketid,String marketerid,String contractid,String theyear,BigDecimal iseffict,String guid){
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
     * 属性 contractquantity1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getContractquantity1(){
        return contractquantity1;
    }
	
    /**
     * 属性 contractquantity1 的set方法
     * @return
     */
    public void setContractquantity1(BigDecimal contractquantity1){
        this.contractquantity1 = contractquantity1;
    } 
	
	
	
    /**
     * 属性 contractquantity2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getContractquantity2(){
        return contractquantity2;
    }
	
    /**
     * 属性 contractquantity2 的set方法
     * @return
     */
    public void setContractquantity2(BigDecimal contractquantity2){
        this.contractquantity2 = contractquantity2;
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
     * 属性 contractname 的get方法
     * @return String
     */
    public String getContractname(){
        return contractname;
    }
	
    /**
     * 属性 contractname 的set方法
     * @return
     */
    public void setContractname(String contractname){
        this.contractname = contractname;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof TjfxNdgdGdlb))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        TjfxNdgdGdlb other = (TjfxNdgdGdlb) o;	        
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
            .append("contractquantity1"+":"+getContractquantity1())
            .append("contractquantity2"+":"+getContractquantity2())
            .append("establishtime"+":"+getEstablishtime())
            .append("establishpersonid"+":"+getEstablishpersonid())
            .append("iseffict"+":"+getIseffict())
            .append("guid"+":"+getGuid())
            .append("contractname"+":"+getContractname())
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