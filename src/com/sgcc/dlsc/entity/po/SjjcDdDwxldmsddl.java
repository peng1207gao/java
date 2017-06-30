package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.sql.Date;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * SjjcDdDwxldmsddl的POJO类
 *
 * @author  Administrator  [Sat Mar 15 15:27:22 CST 2014]
 * 
 */
public class SjjcDdDwxldmsddl implements Serializable{

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
     * 属性linename
     */
    private String linename;
	
    /** 
     * 属性infoTime
     */
    private Date infoTime;
	
    /** 
     * 属性powernumber
     */
    private BigDecimal powernumber;
	
    /** 
     * 属性dispatchcompanyname
     */
    private String dispatchcompanyname;
	
    /**
     * SjjcDdDwxldmsddl构造函数
     */
    public SjjcDdDwxldmsddl() {
        super();
    }  
	
    /**
     * SjjcDdDwxldmsddl完整的构造函数
     */  
    public SjjcDdDwxldmsddl(String objId,String companyname,String companyid){
        this.objId = objId;
        this.companyname = companyname;
        this.companyid = companyid;
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
     * 属性 powernumber 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPowernumber(){
        return powernumber;
    }
	
    /**
     * 属性 powernumber 的set方法
     * @return
     */
    public void setPowernumber(BigDecimal powernumber){
        this.powernumber = powernumber;
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
		
        if (o == null || !(o instanceof SjjcDdDwxldmsddl))
	        return false; 
			
        if(getObjId() == null) 
	        return false;

        SjjcDdDwxldmsddl other = (SjjcDdDwxldmsddl) o;	        
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
            .append("linename"+":"+getLinename())
            .append("infoTime"+":"+getInfoTime())
            .append("powernumber"+":"+getPowernumber())
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