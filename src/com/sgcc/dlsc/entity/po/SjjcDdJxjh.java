package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * SjjcDdJxjh的POJO类
 *
 * @author  Administrator  [Sat Mar 15 16:29:41 CST 2014]
 * 
 */
public class SjjcDdJxjh implements Serializable{

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
     * 属性maintenanceplanclass
     */
    private BigDecimal maintenanceplanclass;
	
    /** 
     * 属性maintenanceequipmentclass
     */
    private BigDecimal maintenanceequipmentclass;
	
    /** 
     * 属性theyear
     */
    private BigDecimal theyear;
	
    /** 
     * 属性themonth
     */
    private BigDecimal themonth;
	
    /** 
     * 属性unitlinename
     */
    private String unitlinename;
	
    /** 
     * 属性starttime
     */
    private String starttime;
	
    /** 
     * 属性endtime
     */
    private String endtime;
	
    /** 
     * 属性maintenancecapacity
     */
    private BigDecimal maintenancecapacity;
	
    /** 
     * 属性maintenancereason
     */
    private String maintenancereason;
	
    /** 
     * 属性dispatchcompanyname
     */
    private String dispatchcompanyname;
	
    /**
     * SjjcDdJxjh构造函数
     */
    public SjjcDdJxjh() {
        super();
    }  
	
    /**
     * SjjcDdJxjh完整的构造函数
     */  
    public SjjcDdJxjh(String objId,String companyname,String companyid,BigDecimal theyear){
        this.objId = objId;
        this.companyname = companyname;
        this.companyid = companyid;
        this.theyear = theyear;
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
     * 属性 maintenanceplanclass 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMaintenanceplanclass(){
        return maintenanceplanclass;
    }
	
    /**
     * 属性 maintenanceplanclass 的set方法
     * @return
     */
    public void setMaintenanceplanclass(BigDecimal maintenanceplanclass){
        this.maintenanceplanclass = maintenanceplanclass;
    } 
	
	
	
    /**
     * 属性 maintenanceequipmentclass 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMaintenanceequipmentclass(){
        return maintenanceequipmentclass;
    }
	
    /**
     * 属性 maintenanceequipmentclass 的set方法
     * @return
     */
    public void setMaintenanceequipmentclass(BigDecimal maintenanceequipmentclass){
        this.maintenanceequipmentclass = maintenanceequipmentclass;
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
     * 属性 unitlinename 的get方法
     * @return String
     */
    public String getUnitlinename(){
        return unitlinename;
    }
	
    /**
     * 属性 unitlinename 的set方法
     * @return
     */
    public void setUnitlinename(String unitlinename){
        this.unitlinename = unitlinename;
    } 
	
	
	
    /**
     * 属性 starttime 的get方法
     * @return String
     */
    public String getStarttime(){
        return starttime;
    }
	
    /**
     * 属性 starttime 的set方法
     * @return
     */
    public void setStarttime(String starttime){
        this.starttime = starttime;
    } 
	
	
	
    /**
     * 属性 endtime 的get方法
     * @return String
     */
    public String getEndtime(){
        return endtime;
    }
	
    /**
     * 属性 endtime 的set方法
     * @return
     */
    public void setEndtime(String endtime){
        this.endtime = endtime;
    } 
	
	
	
    /**
     * 属性 maintenancecapacity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMaintenancecapacity(){
        return maintenancecapacity;
    }
	
    /**
     * 属性 maintenancecapacity 的set方法
     * @return
     */
    public void setMaintenancecapacity(BigDecimal maintenancecapacity){
        this.maintenancecapacity = maintenancecapacity;
    } 
	
	
	
    /**
     * 属性 maintenancereason 的get方法
     * @return String
     */
    public String getMaintenancereason(){
        return maintenancereason;
    }
	
    /**
     * 属性 maintenancereason 的set方法
     * @return
     */
    public void setMaintenancereason(String maintenancereason){
        this.maintenancereason = maintenancereason;
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
		
        if (o == null || !(o instanceof SjjcDdJxjh))
	        return false; 
			
        if(getObjId() == null) 
	        return false;

        SjjcDdJxjh other = (SjjcDdJxjh) o;	        
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
            .append("maintenanceplanclass"+":"+getMaintenanceplanclass())
            .append("maintenanceequipmentclass"+":"+getMaintenanceequipmentclass())
            .append("theyear"+":"+getTheyear())
            .append("themonth"+":"+getThemonth())
            .append("unitlinename"+":"+getUnitlinename())
            .append("starttime"+":"+getStarttime())
            .append("endtime"+":"+getEndtime())
            .append("maintenancecapacity"+":"+getMaintenancecapacity())
            .append("maintenancereason"+":"+getMaintenancereason())
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