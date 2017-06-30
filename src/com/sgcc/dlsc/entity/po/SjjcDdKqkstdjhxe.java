package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * SjjcDdKqkstdjhxe的POJO类
 *
 * @author  Administrator  [Fri Mar 14 11:19:09 CST 2014]
 * 
 */
public class SjjcDdKqkstdjhxe implements Serializable{

    /** 
     * 属性objId
     */
    private String objId;
	
    /** 
     * 属性companyname
     */
    private String companyname;
	
    /** 
     * 属性companyid
     */
    private String companyid;
	
    /** 
     * 属性theyear
     */
    private BigDecimal theyear;
	
    /** 
     * 属性themonth
     */
    private BigDecimal themonth;
	
    /** 
     * 属性channelname
     */
    private String channelname;
	
    /** 
     * 属性maxlimit
     */
    private BigDecimal maxlimit;
	
    /** 
     * 属性minlimit
     */
    private BigDecimal minlimit;
	
    /** 
     * 属性direction
     */
    private BigDecimal direction;
	
    /** 
     * 属性dispatchcompanyname
     */
    private String dispatchcompanyname;
	
    /**
     * SjjcDdKqkstdjhxe构造函数
     */
    public SjjcDdKqkstdjhxe() {
        super();
    }  
	
    /**
     * SjjcDdKqkstdjhxe完整的构造函数
     */  
    public SjjcDdKqkstdjhxe(String objId,String companyname,String companyid,BigDecimal theyear,BigDecimal themonth,String channelname){
        this.objId = objId;
        this.companyname = companyname;
        this.companyid = companyid;
        this.theyear = theyear;
        this.themonth = themonth;
        this.channelname = channelname;
    }
 
    /**
     * 属性 objId 的get方法
     * @return String
     */
    public String getObjId(){
        return objId;
    }
	
    /**
     * 属性 objId 的set方法
     * @return
     */
    public void setObjId(String objId){
        if(objId != null && objId.trim().length() == 0){
            this.objId = null;
        }else{
            this.objId = objId;
        }
    } 
	
    /**
     * 属性 companyname 的get方法
     * @return String
     */
    public String getCompanyname(){
        return companyname;
    }
	
    /**
     * 属性 companyname 的set方法
     * @return
     */
    public void setCompanyname(String companyname){
        this.companyname = companyname;
    } 
	
    /**
     * 属性 companyid 的get方法
     * @return String
     */
    public String getCompanyid(){
        return companyid;
    }
	
    /**
     * 属性 companyid 的set方法
     * @return
     */
    public void setCompanyid(String companyid){
        this.companyid = companyid;
    } 
	
    /**
     * 属性 theyear 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTheyear(){
        return theyear;
    }
	
    /**
     * 属性 theyear 的set方法
     * @return
     */
    public void setTheyear(BigDecimal theyear){
        this.theyear = theyear;
    } 
	
    /**
     * 属性 themonth 的get方法
     * @return BigDecimal
     */
    public BigDecimal getThemonth(){
        return themonth;
    }
	
    /**
     * 属性 themonth 的set方法
     * @return
     */
    public void setThemonth(BigDecimal themonth){
        this.themonth = themonth;
    } 
	
    /**
     * 属性 channelname 的get方法
     * @return String
     */
    public String getChannelname(){
        return channelname;
    }
	
    /**
     * 属性 channelname 的set方法
     * @return
     */
    public void setChannelname(String channelname){
        this.channelname = channelname;
    } 
	
    /**
     * 属性 maxlimit 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMaxlimit(){
        return maxlimit;
    }
	
    /**
     * 属性 maxlimit 的set方法
     * @return
     */
    public void setMaxlimit(BigDecimal maxlimit){
        this.maxlimit = maxlimit;
    } 
	
    /**
     * 属性 minlimit 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMinlimit(){
        return minlimit;
    }
	
    /**
     * 属性 minlimit 的set方法
     * @return
     */
    public void setMinlimit(BigDecimal minlimit){
        this.minlimit = minlimit;
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
     * 属性 dispatchcompanyname 的get方法
     * @return String
     */
    public String getDispatchcompanyname(){
        return dispatchcompanyname;
    }
	
    /**
     * 属性 dispatchcompanyname 的set方法
     * @return
     */
    public void setDispatchcompanyname(String dispatchcompanyname){
        this.dispatchcompanyname = dispatchcompanyname;
    } 
	
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof SjjcDdKqkstdjhxe))
	        return false; 
			
        if(getObjId() == null) 
	        return false;

        SjjcDdKqkstdjhxe other = (SjjcDdKqkstdjhxe) o;	        
	    return new EqualsBuilder()
            .append(this.getObjId(), other.getObjId())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("objId"+":"+getObjId())
            .append("companyname"+":"+getCompanyname())
            .append("companyid"+":"+getCompanyid())
            .append("theyear"+":"+getTheyear())
            .append("themonth"+":"+getThemonth())
            .append("channelname"+":"+getChannelname())
            .append("maxlimit"+":"+getMaxlimit())
            .append("minlimit"+":"+getMinlimit())
            .append("direction"+":"+getDirection())
            .append("dispatchcompanyname"+":"+getDispatchcompanyname())
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