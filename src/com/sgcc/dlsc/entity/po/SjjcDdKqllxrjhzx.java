package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * SjjcDdKqllxrjhzx的POJO类
 *
 * @author  Administrator  [Fri Mar 14 11:28:04 CST 2014]
 * 
 */
public class SjjcDdKqllxrjhzx implements Serializable{

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
     * 属性linename
     */
    private String linename;
	
    /** 
     * 属性compositionname
     */
    private String compositionname;
	
    /** 
     * 属性infoTime
     */
    private Date infoTime;
	
    /** 
     * 属性powerexecution
     */
    private BigDecimal powerexecution;
	
    /** 
     * 属性dispatchcompanyname
     */
    private String dispatchcompanyname;
	
    /**
     * SjjcDdKqllxrjhzx构造函数
     */
    public SjjcDdKqllxrjhzx() {
        super();
    }  
	
    /**
     * SjjcDdKqllxrjhzx完整的构造函数
     */  
    public SjjcDdKqllxrjhzx(String objId,String companyname,String companyid,Date infoDate,String linename,String compositionname,Date infoTime){
        this.objId = objId;
        this.companyname = companyname;
        this.companyid = companyid;
        this.infoDate = infoDate;
        this.linename = linename;
        this.compositionname = compositionname;
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
     * 属性 linename 的get方法
     * @return String
     */
    public String getLinename(){
        return linename;
    }
	
    /**
     * 属性 linename 的set方法
     * @return
     */
    public void setLinename(String linename){
        this.linename = linename;
    } 
	
    /**
     * 属性 compositionname 的get方法
     * @return String
     */
    public String getCompositionname(){
        return compositionname;
    }
	
    /**
     * 属性 compositionname 的set方法
     * @return
     */
    public void setCompositionname(String compositionname){
        this.compositionname = compositionname;
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
     * 属性 powerexecution 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPowerexecution(){
        return powerexecution;
    }
	
    /**
     * 属性 powerexecution 的set方法
     * @return
     */
    public void setPowerexecution(BigDecimal powerexecution){
        this.powerexecution = powerexecution;
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
		
        if (o == null || !(o instanceof SjjcDdKqllxrjhzx))
	        return false; 
			
        if(getObjId() == null) 
	        return false;

        SjjcDdKqllxrjhzx other = (SjjcDdKqllxrjhzx) o;	        
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
            .append("linename"+":"+getLinename())
            .append("compositionname"+":"+getCompositionname())
            .append("infoTime"+":"+getInfoTime())
            .append("powerexecution"+":"+getPowerexecution())
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