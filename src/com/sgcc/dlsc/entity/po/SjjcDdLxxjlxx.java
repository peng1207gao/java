package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * SjjcDdLxxjlxx的POJO类
 *
 * @author  Administrator  [Wed Apr 02 09:19:54 CST 2014]
 * 
 */
public class SjjcDdLxxjlxx implements Serializable{

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
     * 属性infoDate
     */
    private Date infoDate;
	
    /** 
     * 属性plantname
     */
    private String plantname;
	
    /** 
     * 属性markname
     */
    private String markname;
	
    /** 
     * 属性infoTime
     */
    private Date infoTime;
	
    /** 
     * 属性lastcode
     */
    private BigDecimal lastcode;
	
    /** 
     * 属性dispatchcompanyname
     */
    private String dispatchcompanyname;
	
    /** 
     * 属性forwardquantity
     */
    private BigDecimal forwardquantity;
	
    /** 
     * 属性oppositequantity
     */
    private BigDecimal oppositequantity;
	
    /**
     * SjjcDdLxxjlxx构造函数
     */
    public SjjcDdLxxjlxx() {
        super();
    }  
	
    /**
     * SjjcDdLxxjlxx完整的构造函数
     */  
    public SjjcDdLxxjlxx(String objId,String companyname,String companyid,Date infoDate,String plantname,Date infoTime){
        this.objId = objId;
        this.companyname = companyname;
        this.companyid = companyid;
        this.infoDate = infoDate;
        this.plantname = plantname;
        this.infoTime = infoTime;
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
     * 属性 infoDate 的get方法
     * @return Date
     */
    public Date getInfoDate(){
        return infoDate;
    }
	
    /**
     * 属性 infoDate 的set方法
     * @return
     */
    public void setInfoDate(Date infoDate){
        this.infoDate = infoDate;
    } 
	
    /**
     * 属性 plantname 的get方法
     * @return String
     */
    public String getPlantname(){
        return plantname;
    }
	
    /**
     * 属性 plantname 的set方法
     * @return
     */
    public void setPlantname(String plantname){
        this.plantname = plantname;
    } 
	
    /**
     * 属性 markname 的get方法
     * @return String
     */
    public String getMarkname(){
        return markname;
    }
	
    /**
     * 属性 markname 的set方法
     * @return
     */
    public void setMarkname(String markname){
        this.markname = markname;
    } 
	
    /**
     * 属性 infoTime 的get方法
     * @return Date
     */
    public Date getInfoTime(){
        return infoTime;
    }
	
    /**
     * 属性 infoTime 的set方法
     * @return
     */
    public void setInfoTime(Date infoTime){
        this.infoTime = infoTime;
    } 
	
    /**
     * 属性 lastcode 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLastcode(){
        return lastcode;
    }
	
    /**
     * 属性 lastcode 的set方法
     * @return
     */
    public void setLastcode(BigDecimal lastcode){
        this.lastcode = lastcode;
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
     * 属性 forwardquantity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getForwardquantity(){
        return forwardquantity;
    }
	
    /**
     * 属性 forwardquantity 的set方法
     * @return
     */
    public void setForwardquantity(BigDecimal forwardquantity){
        this.forwardquantity = forwardquantity;
    } 
	
    /**
     * 属性 oppositequantity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getOppositequantity(){
        return oppositequantity;
    }
	
    /**
     * 属性 oppositequantity 的set方法
     * @return
     */
    public void setOppositequantity(BigDecimal oppositequantity){
        this.oppositequantity = oppositequantity;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof SjjcDdLxxjlxx))
	        return false; 
			
        if(getObjId() == null) 
	        return false;

        SjjcDdLxxjlxx other = (SjjcDdLxxjlxx) o;	        
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
            .append("infoDate"+":"+getInfoDate())
            .append("plantname"+":"+getPlantname())
            .append("markname"+":"+getMarkname())
            .append("infoTime"+":"+getInfoTime())
            .append("lastcode"+":"+getLastcode())
            .append("dispatchcompanyname"+":"+getDispatchcompanyname())
            .append("forwardquantity"+":"+getForwardquantity())
            .append("oppositequantity"+":"+getOppositequantity())
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