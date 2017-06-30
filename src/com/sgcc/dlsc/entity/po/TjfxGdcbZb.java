package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TjfxGdcbZb的POJO类
 *
 * @author  Administrator  [Mon Aug 12 10:18:26 CST 2013]
 * 
 */
public class TjfxGdcbZb implements Serializable{

	private static final long serialVersionUID = 1L;
    /** 
     * 属性theyear
     */
    private String theyear;
	
    /** 
     * 属性themonth
     */
    private String themonth;
	
    /** 
     * 属性projectid
     */
    private BigDecimal projectid;
	
    /** 
     * 属性dygdf
     */
    private BigDecimal dygdf;
	
    /** 
     * 属性dygdftb
     */
    private BigDecimal dygdftb;
	
    /** 
     * 属性ljgdf
     */
    private BigDecimal ljgdf;
	
    /** 
     * 属性ljgdftb
     */
    private BigDecimal ljgdftb;
	
    /** 
     * 属性ljgdl
     */
    private BigDecimal ljgdl;
	
    /** 
     * 属性ljgdltb
     */
    private BigDecimal ljgdltb;
	
    /** 
     * 属性ljgdjj
     */
    private BigDecimal ljgdjj;
	
    /** 
     * 属性ljgdjjtb
     */
    private BigDecimal ljgdjjtb;
	
    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性dygdl
     */
    private BigDecimal dygdl;
	
    /** 
     * 属性dygdltb
     */
    private BigDecimal dygdltb;
	
    /** 
     * 属性dygdjj
     */
    private BigDecimal dygdjj;
	
    /** 
     * 属性dygdjjtb
     */
    private BigDecimal dygdjjtb;
	
    /**
     * TjfxGdcbZb构造函数
     */
    public TjfxGdcbZb() {
        super();
    }  
	
    /**
     * TjfxGdcbZb完整的构造函数
     */  
    public TjfxGdcbZb(String theyear,String themonth,BigDecimal projectid,String guid){
        this.theyear = theyear;
        this.themonth = themonth;
        this.projectid = projectid;
        this.guid = guid;
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
     * 属性 projectid 的get方法
     * @return BigDecimal
     */
    public BigDecimal getProjectid(){
        return projectid;
    }
	
    /**
     * 属性 projectid 的set方法
     * @return
     */
    public void setProjectid(BigDecimal projectid){
        this.projectid = projectid;
    } 
	
    /**
     * 属性 dygdf 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDygdf(){
        return dygdf;
    }
	
    /**
     * 属性 dygdf 的set方法
     * @return
     */
    public void setDygdf(BigDecimal dygdf){
        this.dygdf = dygdf;
    } 
	
    /**
     * 属性 dygdftb 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDygdftb(){
        return dygdftb;
    }
	
    /**
     * 属性 dygdftb 的set方法
     * @return
     */
    public void setDygdftb(BigDecimal dygdftb){
        this.dygdftb = dygdftb;
    } 
	
    /**
     * 属性 ljgdf 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjgdf(){
        return ljgdf;
    }
	
    /**
     * 属性 ljgdf 的set方法
     * @return
     */
    public void setLjgdf(BigDecimal ljgdf){
        this.ljgdf = ljgdf;
    } 
	
    /**
     * 属性 ljgdftb 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjgdftb(){
        return ljgdftb;
    }
	
    /**
     * 属性 ljgdftb 的set方法
     * @return
     */
    public void setLjgdftb(BigDecimal ljgdftb){
        this.ljgdftb = ljgdftb;
    } 
	
    /**
     * 属性 ljgdl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjgdl(){
        return ljgdl;
    }
	
    /**
     * 属性 ljgdl 的set方法
     * @return
     */
    public void setLjgdl(BigDecimal ljgdl){
        this.ljgdl = ljgdl;
    } 
	
    /**
     * 属性 ljgdltb 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjgdltb(){
        return ljgdltb;
    }
	
    /**
     * 属性 ljgdltb 的set方法
     * @return
     */
    public void setLjgdltb(BigDecimal ljgdltb){
        this.ljgdltb = ljgdltb;
    } 
	
    /**
     * 属性 ljgdjj 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjgdjj(){
        return ljgdjj;
    }
	
    /**
     * 属性 ljgdjj 的set方法
     * @return
     */
    public void setLjgdjj(BigDecimal ljgdjj){
        this.ljgdjj = ljgdjj;
    } 
	
    /**
     * 属性 ljgdjjtb 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjgdjjtb(){
        return ljgdjjtb;
    }
	
    /**
     * 属性 ljgdjjtb 的set方法
     * @return
     */
    public void setLjgdjjtb(BigDecimal ljgdjjtb){
        this.ljgdjjtb = ljgdjjtb;
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
     * 属性 dygdl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDygdl(){
        return dygdl;
    }
	
    /**
     * 属性 dygdl 的set方法
     * @return
     */
    public void setDygdl(BigDecimal dygdl){
        this.dygdl = dygdl;
    } 
	
    /**
     * 属性 dygdltb 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDygdltb(){
        return dygdltb;
    }
	
    /**
     * 属性 dygdltb 的set方法
     * @return
     */
    public void setDygdltb(BigDecimal dygdltb){
        this.dygdltb = dygdltb;
    } 
	
    /**
     * 属性 dygdjj 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDygdjj(){
        return dygdjj;
    }
	
    /**
     * 属性 dygdjj 的set方法
     * @return
     */
    public void setDygdjj(BigDecimal dygdjj){
        this.dygdjj = dygdjj;
    } 
	
    /**
     * 属性 dygdjjtb 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDygdjjtb(){
        return dygdjjtb;
    }
	
    /**
     * 属性 dygdjjtb 的set方法
     * @return
     */
    public void setDygdjjtb(BigDecimal dygdjjtb){
        this.dygdjjtb = dygdjjtb;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof TjfxGdcbZb))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        TjfxGdcbZb other = (TjfxGdcbZb) o;	        
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
            .append("theyear"+":"+getTheyear())
            .append("themonth"+":"+getThemonth())
            .append("projectid"+":"+getProjectid())
            .append("dygdf"+":"+getDygdf())
            .append("dygdftb"+":"+getDygdftb())
            .append("ljgdf"+":"+getLjgdf())
            .append("ljgdftb"+":"+getLjgdftb())
            .append("ljgdl"+":"+getLjgdl())
            .append("ljgdltb"+":"+getLjgdltb())
            .append("ljgdjj"+":"+getLjgdjj())
            .append("ljgdjjtb"+":"+getLjgdjjtb())
            .append("guid"+":"+getGuid())
            .append("dygdl"+":"+getDygdl())
            .append("dygdltb"+":"+getDygdltb())
            .append("dygdjj"+":"+getDygdjj())
            .append("dygdjjtb"+":"+getDygdjjtb())
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