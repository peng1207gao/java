package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * SjjcYxFzgdcdljlsj的POJO类
 *
 * @author  Administrator  [Sat Mar 15 15:58:51 CST 2014]
 * 
 */
public class SjjcYxFzgdcdljlsj implements Serializable{

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
     * 属性infodate
     */
    private Date infodate;
	
    /** 
     * 属性plantname
     */
    private String plantname;
	
    /** 
     * 属性plantid
     */
    private String plantid;
	
    /** 
     * 属性generationquantity
     */
    private BigDecimal generationquantity;
	
    /** 
     * 属性quantity
     */
    private BigDecimal quantity;
	
    /**
     * SjjcYxFzgdcdljlsj构造函数
     */
    public SjjcYxFzgdcdljlsj() {
        super();
    }  
	
    /**
     * SjjcYxFzgdcdljlsj完整的构造函数
     */  
    public SjjcYxFzgdcdljlsj(String objId,String companyname,String companyid,Date infodate,String plantname,String plantid){
        this.objId = objId;
        this.companyname = companyname;
        this.companyid = companyid;
        this.infodate = infodate;
        this.plantname = plantname;
        this.plantid = plantid;
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
     * 属性 infodate 的get方法
     * @return Date
     */
    public Date getInfodate(){
        return infodate;
    }
	
    /**
     * 属性 infodate 的set方法
     * @return
     */
    public void setInfodate(Date infodate){
        this.infodate = infodate;
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
     * 属性 plantid 的get方法
     * @return String
     */
    public String getPlantid(){
        return plantid;
    }
	
    /**
     * 属性 plantid 的set方法
     * @return
     */
    public void setPlantid(String plantid){
        this.plantid = plantid;
    } 
	
    /**
     * 属性 generationquantity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGenerationquantity(){
        return generationquantity;
    }
	
    /**
     * 属性 generationquantity 的set方法
     * @return
     */
    public void setGenerationquantity(BigDecimal generationquantity){
        this.generationquantity = generationquantity;
    } 
	
    /**
     * 属性 quantity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getQuantity(){
        return quantity;
    }
	
    /**
     * 属性 quantity 的set方法
     * @return
     */
    public void setQuantity(BigDecimal quantity){
        this.quantity = quantity;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof SjjcYxFzgdcdljlsj))
	        return false; 
			
        if(getObjId() == null) 
	        return false;

        SjjcYxFzgdcdljlsj other = (SjjcYxFzgdcdljlsj) o;	        
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
            .append("infodate"+":"+getInfodate())
            .append("plantname"+":"+getPlantname())
            .append("plantid"+":"+getPlantid())
            .append("generationquantity"+":"+getGenerationquantity())
            .append("quantity"+":"+getQuantity())
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