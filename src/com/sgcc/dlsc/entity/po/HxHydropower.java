package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * HxHydropower的POJO类
 *
 * @author  Administrator  [Thu Jul 25 16:25:34 CST 2013]
 * 
 */
public class HxHydropower implements Serializable{

    /**
	 * @description 
	 */
	private static final long serialVersionUID = 1L;

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
     * 属性hydropowername
     */
    private String hydropowername;
	
    /** 
     * 属性datetime
     */
    private Date datetime;
	
    /** 
     * 属性enterwaterquantity
     */
    private BigDecimal enterwaterquantity;
	
    /** 
     * 属性outerwaterquantity
     */
    private BigDecimal outerwaterquantity;
	
    /** 
     * 属性enterwaterflow
     */
    private BigDecimal enterwaterflow;
	
    /** 
     * 属性outerwaterflow
     */
    private BigDecimal outerwaterflow;
	
    /** 
     * 属性waterlevel
     */
    private BigDecimal waterlevel;
	
    /** 
     * 属性yl
     */
    private BigDecimal yl;
	
    /** 
     * 属性bxx
     */
    private BigDecimal bxx;
	
    /** 
     * 属性dispatchcompanyid
     */
    private String dispatchcompanyid;
	
    /**
     * HxHydropower构造函数
     */
    public HxHydropower() {
        super();
    }  
	
    /**
     * HxHydropower完整的构造函数
     */  
    public HxHydropower(String objId,String companyid,String hydropowername,Date datetime,BigDecimal enterwaterquantity,BigDecimal outerwaterquantity,BigDecimal enterwaterflow,BigDecimal outerwaterflow,BigDecimal waterlevel){
        this.objId = objId;
        this.companyid = companyid;
        this.hydropowername = hydropowername;
        this.datetime = datetime;
        this.enterwaterquantity = enterwaterquantity;
        this.outerwaterquantity = outerwaterquantity;
        this.enterwaterflow = enterwaterflow;
        this.outerwaterflow = outerwaterflow;
        this.waterlevel = waterlevel;
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
     * 属性 hydropowername 的get方法
     * @return String
     */
    public String getHydropowername(){
        return hydropowername;
    }
	
    /**
     * 属性 hydropowername 的set方法
     * @return
     */
    public void setHydropowername(String hydropowername){
        this.hydropowername = hydropowername;
    } 
	
    /**
     * 属性 datetime 的get方法
     * @return Date
     */
    public Date getDatetime(){
        return datetime;
    }
	
    /**
     * 属性 datetime 的set方法
     * @return
     */
    public void setDatetime(Date datetime){
        this.datetime = datetime;
    } 
	
    /**
     * 属性 enterwaterquantity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEnterwaterquantity(){
        return enterwaterquantity;
    }
	
    /**
     * 属性 enterwaterquantity 的set方法
     * @return
     */
    public void setEnterwaterquantity(BigDecimal enterwaterquantity){
        this.enterwaterquantity = enterwaterquantity;
    } 
	
    /**
     * 属性 outerwaterquantity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getOuterwaterquantity(){
        return outerwaterquantity;
    }
	
    /**
     * 属性 outerwaterquantity 的set方法
     * @return
     */
    public void setOuterwaterquantity(BigDecimal outerwaterquantity){
        this.outerwaterquantity = outerwaterquantity;
    } 
	
    /**
     * 属性 enterwaterflow 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEnterwaterflow(){
        return enterwaterflow;
    }
	
    /**
     * 属性 enterwaterflow 的set方法
     * @return
     */
    public void setEnterwaterflow(BigDecimal enterwaterflow){
        this.enterwaterflow = enterwaterflow;
    } 
	
    /**
     * 属性 outerwaterflow 的get方法
     * @return BigDecimal
     */
    public BigDecimal getOuterwaterflow(){
        return outerwaterflow;
    }
	
    /**
     * 属性 outerwaterflow 的set方法
     * @return
     */
    public void setOuterwaterflow(BigDecimal outerwaterflow){
        this.outerwaterflow = outerwaterflow;
    } 
	
    /**
     * 属性 waterlevel 的get方法
     * @return BigDecimal
     */
    public BigDecimal getWaterlevel(){
        return waterlevel;
    }
	
    /**
     * 属性 waterlevel 的set方法
     * @return
     */
    public void setWaterlevel(BigDecimal waterlevel){
        this.waterlevel = waterlevel;
    } 
	
    /**
     * 属性 yl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getYl(){
        return yl;
    }
	
    /**
     * 属性 yl 的set方法
     * @return
     */
    public void setYl(BigDecimal yl){
        this.yl = yl;
    } 
	
    /**
     * 属性 bxx 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBxx(){
        return bxx;
    }
	
    /**
     * 属性 bxx 的set方法
     * @return
     */
    public void setBxx(BigDecimal bxx){
        this.bxx = bxx;
    } 
	
    /**
     * 属性 dispatchcompanyid 的get方法
     * @return String
     */
    public String getDispatchcompanyid(){
        return dispatchcompanyid;
    }
	
    /**
     * 属性 dispatchcompanyid 的set方法
     * @return
     */
    public void setDispatchcompanyid(String dispatchcompanyid){
        this.dispatchcompanyid = dispatchcompanyid;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof HxHydropower))
	        return false; 
			
        if(getObjId() == null) 
	        return false;

        HxHydropower other = (HxHydropower) o;	        
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
            .append("hydropowername"+":"+getHydropowername())
            .append("datetime"+":"+getDatetime())
            .append("enterwaterquantity"+":"+getEnterwaterquantity())
            .append("outerwaterquantity"+":"+getOuterwaterquantity())
            .append("enterwaterflow"+":"+getEnterwaterflow())
            .append("outerwaterflow"+":"+getOuterwaterflow())
            .append("waterlevel"+":"+getWaterlevel())
            .append("yl"+":"+getYl())
            .append("bxx"+":"+getBxx())
            .append("dispatchcompanyid"+":"+getDispatchcompanyid())
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