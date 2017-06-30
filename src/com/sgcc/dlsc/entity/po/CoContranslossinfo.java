package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * CoContranslossinfo的POJO类
 *
 * @author  Administrator  [Sat Jan 25 16:57:00 CST 2014]
 * 
 */
public class CoContranslossinfo implements Serializable{

    /** 
     * 属性contractid
     */
    private String contractid;
	
    /** 
     * 属性translineno
     */
    private BigDecimal translineno;
	
    /** 
     * 属性linestartendgate
     */
    private String linestartendgate;
	
    /** 
     * 属性loss
     */
    private BigDecimal loss;
	
    /** 
     * 属性linkid
     */
    private String linkid;
	
    /** 
     * 属性direction
     */
    private BigDecimal direction;
	
    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性transmission
     */
    private String transmission;
	
    /**
     * CoContranslossinfo构造函数
     */
    public CoContranslossinfo() {
        super();
    }  
	
    /**
     * CoContranslossinfo完整的构造函数
     */  
    public CoContranslossinfo(String contractid,BigDecimal translineno,String linestartendgate,BigDecimal direction,String guid){
        this.contractid = contractid;
        this.translineno = translineno;
        this.linestartendgate = linestartendgate;
        this.direction = direction;
        this.guid = guid;
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
     * 属性 translineno 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTranslineno(){
        return translineno;
    }
	
    /**
     * 属性 translineno 的set方法
     * @return
     */
    public void setTranslineno(BigDecimal translineno){
        this.translineno = translineno;
    } 
	
	
	
    /**
     * 属性 linestartendgate 的get方法
     * @return String
     */
    public String getLinestartendgate(){
        return linestartendgate;
    }
	
    /**
     * 属性 linestartendgate 的set方法
     * @return
     */
    public void setLinestartendgate(String linestartendgate){
        this.linestartendgate = linestartendgate;
    } 
	
	
	
    /**
     * 属性 loss 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLoss(){
        return loss;
    }
	
    /**
     * 属性 loss 的set方法
     * @return
     */
    public void setLoss(BigDecimal loss){
        this.loss = loss;
    } 
	
	
	
    /**
     * 属性 linkid 的get方法
     * @return String
     */
    public String getLinkid(){
        return linkid;
    }
	
    /**
     * 属性 linkid 的set方法
     * @return
     */
    public void setLinkid(String linkid){
        this.linkid = linkid;
    } 
	
	
	
    /**
     * 属性 direction 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDirection(){
        return direction;
    }
	
    /**
     * 属性 direction 的set方法
     * @return
     */
    public void setDirection(BigDecimal direction){
        this.direction = direction;
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
     * 属性 transmission 的get方法
     * @return String
     */
    public String getTransmission(){
        return transmission;
    }
	
    /**
     * 属性 transmission 的set方法
     * @return
     */
    public void setTransmission(String transmission){
        this.transmission = transmission;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof CoContranslossinfo))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        CoContranslossinfo other = (CoContranslossinfo) o;	        
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
            .append("contractid"+":"+getContractid())
            .append("translineno"+":"+getTranslineno())
            .append("linestartendgate"+":"+getLinestartendgate())
            .append("loss"+":"+getLoss())
            .append("linkid"+":"+getLinkid())
            .append("direction"+":"+getDirection())
            .append("guid"+":"+getGuid())
            .append("transmission"+":"+getTransmission())
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