package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TjfxGjscZb的POJO类
 *
 * @author  sss  [Wed Nov 20 14:40:14 CST 2013]
 * 
 */
public class TjfxGjscZb implements Serializable{

    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性themonth
     */
    private Date themonth;
	
    /** 
     * 属性projectid
     */
    private BigDecimal projectid;
	
    /** 
     * 属性dyjysr
     */
    private BigDecimal dyjysr;
	
    /** 
     * 属性dytb
     */
    private BigDecimal dytb;
	
    /** 
     * 属性ljjysr
     */
    private BigDecimal ljjysr;
	
    /** 
     * 属性ljtb
     */
    private BigDecimal ljtb;
	
    /** 
     * 属性ndys
     */
    private BigDecimal ndys;
	
    /** 
     * 属性wcjd
     */
    private BigDecimal wcjd;
	
    /** 
     * 属性guid
     */
    private String guid;
	
    /**
     * TjfxGjscZb构造函数
     */
    public TjfxGjscZb() {
        super();
    }  
	
    /**
     * TjfxGjscZb完整的构造函数
     */  
    public TjfxGjscZb(String marketid,Date themonth,BigDecimal projectid,String guid){
        this.marketid = marketid;
        this.themonth = themonth;
        this.projectid = projectid;
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
     * 属性 themonth 的get方法
     * @return Date
     */
    public Date getThemonth(){
        return themonth;
    }
	
    /**
     * 属性 themonth 的set方法
     * @return
     */
    public void setThemonth(Date themonth){
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
     * 属性 dyjysr 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDyjysr(){
        return dyjysr;
    }
	
    /**
     * 属性 dyjysr 的set方法
     * @return
     */
    public void setDyjysr(BigDecimal dyjysr){
        this.dyjysr = dyjysr;
    } 
	
	
	
    /**
     * 属性 dytb 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDytb(){
        return dytb;
    }
	
    /**
     * 属性 dytb 的set方法
     * @return
     */
    public void setDytb(BigDecimal dytb){
        this.dytb = dytb;
    } 
	
	
	
    /**
     * 属性 ljjysr 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjjysr(){
        return ljjysr;
    }
	
    /**
     * 属性 ljjysr 的set方法
     * @return
     */
    public void setLjjysr(BigDecimal ljjysr){
        this.ljjysr = ljjysr;
    } 
	
	
	
    /**
     * 属性 ljtb 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjtb(){
        return ljtb;
    }
	
    /**
     * 属性 ljtb 的set方法
     * @return
     */
    public void setLjtb(BigDecimal ljtb){
        this.ljtb = ljtb;
    } 
	
	
	
    /**
     * 属性 ndys 的get方法
     * @return BigDecimal
     */
    public BigDecimal getNdys(){
        return ndys;
    }
	
    /**
     * 属性 ndys 的set方法
     * @return
     */
    public void setNdys(BigDecimal ndys){
        this.ndys = ndys;
    } 
	
	
	
    /**
     * 属性 wcjd 的get方法
     * @return BigDecimal
     */
    public BigDecimal getWcjd(){
        return wcjd;
    }
	
    /**
     * 属性 wcjd 的set方法
     * @return
     */
    public void setWcjd(BigDecimal wcjd){
        this.wcjd = wcjd;
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
		
        if (o == null || !(o instanceof TjfxGjscZb))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        TjfxGjscZb other = (TjfxGjscZb) o;	        
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
            .append("themonth"+":"+getThemonth())
            .append("projectid"+":"+getProjectid())
            .append("dyjysr"+":"+getDyjysr())
            .append("dytb"+":"+getDytb())
            .append("ljjysr"+":"+getLjjysr())
            .append("ljtb"+":"+getLjtb())
            .append("ndys"+":"+getNdys())
            .append("wcjd"+":"+getWcjd())
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