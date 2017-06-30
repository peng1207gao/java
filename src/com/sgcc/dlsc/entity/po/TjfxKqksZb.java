package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TjfxKqksZb的POJO类
 *
 * @author  Administrator  [Mon Aug 12 16:22:00 CST 2013]
 * 
 */
public class TjfxKqksZb implements Serializable{

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
     * 属性dyswjj
     */
    private BigDecimal dyswjj;
	
    /** 
     * 属性dyswjjtb
     */
    private BigDecimal dyswjjtb;
	
    /** 
     * 属性dyldjj
     */
    private BigDecimal dyldjj;
	
    /** 
     * 属性dyldjjtb
     */
    private BigDecimal dyldjjtb;
	
    /** 
     * 属性dyjygdcb
     */
    private BigDecimal dyjygdcb;
	
    /** 
     * 属性dyjygdcbtb
     */
    private BigDecimal dyjygdcbtb;
	
    /** 
     * 属性dyjydl
     */
    private BigDecimal dyjydl;
	
    /** 
     * 属性dyjydltb
     */
    private BigDecimal dyjydltb;
	
    /** 
     * 属性dygdf
     */
    private BigDecimal dygdf;
	
    /** 
     * 属性dygdftb
     */
    private BigDecimal dygdftb;
	
    /** 
     * 属性ljswjj
     */
    private BigDecimal ljswjj;
	
    /** 
     * 属性ljswjjtb
     */
    private BigDecimal ljswjjtb;
	
    /** 
     * 属性ljldjj
     */
    private BigDecimal ljldjj;
	
    /** 
     * 属性ljldjjtb
     */
    private BigDecimal ljldjjtb;
	
    /** 
     * 属性ljjygdcb
     */
    private BigDecimal ljjygdcb;
	
    /** 
     * 属性ljjygdcbtb
     */
    private BigDecimal ljjygdcbtb;
	
    /** 
     * 属性ljjydl
     */
    private BigDecimal ljjydl;
	
    /** 
     * 属性ljjydltb
     */
    private BigDecimal ljjydltb;
	
    /** 
     * 属性ljgdf
     */
    private BigDecimal ljgdf;
	
    /** 
     * 属性ljgdftb
     */
    private BigDecimal ljgdftb;
	
    /** 
     * 属性guid
     */
    private String guid;
	
    /**
     * TjfxKqksZb构造函数
     */
    public TjfxKqksZb() {
        super();
    }  
	
    /**
     * TjfxKqksZb完整的构造函数
     */  
    public TjfxKqksZb(String theyear,String themonth,BigDecimal projectid,BigDecimal dygdf,BigDecimal dygdftb,String guid){
        this.theyear = theyear;
        this.themonth = themonth;
        this.projectid = projectid;
        this.dygdf = dygdf;
        this.dygdftb = dygdftb;
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
     * 属性 dyswjj 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDyswjj(){
        return dyswjj;
    }
	
    /**
     * 属性 dyswjj 的set方法
     * @return
     */
    public void setDyswjj(BigDecimal dyswjj){
        this.dyswjj = dyswjj;
    } 
	
    /**
     * 属性 dyswjjtb 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDyswjjtb(){
        return dyswjjtb;
    }
	
    /**
     * 属性 dyswjjtb 的set方法
     * @return
     */
    public void setDyswjjtb(BigDecimal dyswjjtb){
        this.dyswjjtb = dyswjjtb;
    } 
	
    /**
     * 属性 dyldjj 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDyldjj(){
        return dyldjj;
    }
	
    /**
     * 属性 dyldjj 的set方法
     * @return
     */
    public void setDyldjj(BigDecimal dyldjj){
        this.dyldjj = dyldjj;
    } 
	
    /**
     * 属性 dyldjjtb 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDyldjjtb(){
        return dyldjjtb;
    }
	
    /**
     * 属性 dyldjjtb 的set方法
     * @return
     */
    public void setDyldjjtb(BigDecimal dyldjjtb){
        this.dyldjjtb = dyldjjtb;
    } 
	
    /**
     * 属性 dyjygdcb 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDyjygdcb(){
        return dyjygdcb;
    }
	
    /**
     * 属性 dyjygdcb 的set方法
     * @return
     */
    public void setDyjygdcb(BigDecimal dyjygdcb){
        this.dyjygdcb = dyjygdcb;
    } 
	
    /**
     * 属性 dyjygdcbtb 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDyjygdcbtb(){
        return dyjygdcbtb;
    }
	
    /**
     * 属性 dyjygdcbtb 的set方法
     * @return
     */
    public void setDyjygdcbtb(BigDecimal dyjygdcbtb){
        this.dyjygdcbtb = dyjygdcbtb;
    } 
	
    /**
     * 属性 dyjydl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDyjydl(){
        return dyjydl;
    }
	
    /**
     * 属性 dyjydl 的set方法
     * @return
     */
    public void setDyjydl(BigDecimal dyjydl){
        this.dyjydl = dyjydl;
    } 
	
    /**
     * 属性 dyjydltb 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDyjydltb(){
        return dyjydltb;
    }
	
    /**
     * 属性 dyjydltb 的set方法
     * @return
     */
    public void setDyjydltb(BigDecimal dyjydltb){
        this.dyjydltb = dyjydltb;
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
     * 属性 ljswjj 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjswjj(){
        return ljswjj;
    }
	
    /**
     * 属性 ljswjj 的set方法
     * @return
     */
    public void setLjswjj(BigDecimal ljswjj){
        this.ljswjj = ljswjj;
    } 
	
    /**
     * 属性 ljswjjtb 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjswjjtb(){
        return ljswjjtb;
    }
	
    /**
     * 属性 ljswjjtb 的set方法
     * @return
     */
    public void setLjswjjtb(BigDecimal ljswjjtb){
        this.ljswjjtb = ljswjjtb;
    } 
	
    /**
     * 属性 ljldjj 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjldjj(){
        return ljldjj;
    }
	
    /**
     * 属性 ljldjj 的set方法
     * @return
     */
    public void setLjldjj(BigDecimal ljldjj){
        this.ljldjj = ljldjj;
    } 
	
    /**
     * 属性 ljldjjtb 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjldjjtb(){
        return ljldjjtb;
    }
	
    /**
     * 属性 ljldjjtb 的set方法
     * @return
     */
    public void setLjldjjtb(BigDecimal ljldjjtb){
        this.ljldjjtb = ljldjjtb;
    } 
	
    /**
     * 属性 ljjygdcb 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjjygdcb(){
        return ljjygdcb;
    }
	
    /**
     * 属性 ljjygdcb 的set方法
     * @return
     */
    public void setLjjygdcb(BigDecimal ljjygdcb){
        this.ljjygdcb = ljjygdcb;
    } 
	
    /**
     * 属性 ljjygdcbtb 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjjygdcbtb(){
        return ljjygdcbtb;
    }
	
    /**
     * 属性 ljjygdcbtb 的set方法
     * @return
     */
    public void setLjjygdcbtb(BigDecimal ljjygdcbtb){
        this.ljjygdcbtb = ljjygdcbtb;
    } 
	
    /**
     * 属性 ljjydl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjjydl(){
        return ljjydl;
    }
	
    /**
     * 属性 ljjydl 的set方法
     * @return
     */
    public void setLjjydl(BigDecimal ljjydl){
        this.ljjydl = ljjydl;
    } 
	
    /**
     * 属性 ljjydltb 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjjydltb(){
        return ljjydltb;
    }
	
    /**
     * 属性 ljjydltb 的set方法
     * @return
     */
    public void setLjjydltb(BigDecimal ljjydltb){
        this.ljjydltb = ljjydltb;
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
		
        if (o == null || !(o instanceof TjfxKqksZb))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        TjfxKqksZb other = (TjfxKqksZb) o;	        
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
            .append("dyswjj"+":"+getDyswjj())
            .append("dyswjjtb"+":"+getDyswjjtb())
            .append("dyldjj"+":"+getDyldjj())
            .append("dyldjjtb"+":"+getDyldjjtb())
            .append("dyjygdcb"+":"+getDyjygdcb())
            .append("dyjygdcbtb"+":"+getDyjygdcbtb())
            .append("dyjydl"+":"+getDyjydl())
            .append("dyjydltb"+":"+getDyjydltb())
            .append("dygdf"+":"+getDygdf())
            .append("dygdftb"+":"+getDygdftb())
            .append("ljswjj"+":"+getLjswjj())
            .append("ljswjjtb"+":"+getLjswjjtb())
            .append("ljldjj"+":"+getLjldjj())
            .append("ljldjjtb"+":"+getLjldjjtb())
            .append("ljjygdcb"+":"+getLjjygdcb())
            .append("ljjygdcbtb"+":"+getLjjygdcbtb())
            .append("ljjydl"+":"+getLjjydl())
            .append("ljjydltb"+":"+getLjjydltb())
            .append("ljgdf"+":"+getLjgdf())
            .append("ljgdftb"+":"+getLjgdftb())
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