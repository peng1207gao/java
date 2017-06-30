package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * SjjcGhXzzjqk的POJO类
 *
 * @author  eveliy  [Fri Mar 14 14:56:03 CST 2014]
 * 
 */
public class SjjcGhXzzjqk implements Serializable{

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
     * 属性provincename
     */
    private String provincename;
	
    /** 
     * 属性provinceid
     */
    private String provinceid;
	
    /** 
     * 属性theyear
     */
    private BigDecimal theyear;
	
    /** 
     * 属性themonth
     */
    private BigDecimal themonth;
	
    /** 
     * 属性statisticalcalibre
     */
    private BigDecimal statisticalcalibre;
	
    /** 
     * 属性newnumber
     */
    private BigDecimal newnumber;
	
    /** 
     * 属性newcapacity
     */
    private BigDecimal newcapacity;
	
    /** 
     * 属性newtwentynumber
     */
    private BigDecimal newtwentynumber;
	
    /** 
     * 属性newtwentycapacity
     */
    private BigDecimal newtwentycapacity;
	
    /** 
     * 属性newthirtynumber
     */
    private BigDecimal newthirtynumber;
	
    /** 
     * 属性newthirtycapacity
     */
    private BigDecimal newthirtycapacity;
	
    /** 
     * 属性newsixtynumber
     */
    private BigDecimal newsixtynumber;
	
    /** 
     * 属性newsixtycapacity
     */
    private BigDecimal newsixtycapacity;
	
    /** 
     * 属性newhundrednumber
     */
    private BigDecimal newhundrednumber;
	
    /** 
     * 属性newhundredcapacity
     */
    private BigDecimal newhundredcapacity;
	
    /** 
     * 属性dxpdeptcode
     */
    private String dxpdeptcode;
	
    /** 
     * 属性deptCode
     */
    private String deptCode;
	
    /** 
     * 属性tabYear
     */
    private BigDecimal tabYear;
	
    /** 
     * 属性tabMonth
     */
    private BigDecimal tabMonth;
	
    /**
     * SjjcGhXzzjqk构造函数
     */
    public SjjcGhXzzjqk() {
        super();
    }  
	
    /**
     * SjjcGhXzzjqk完整的构造函数
     */  
    public SjjcGhXzzjqk(String objId,String companyname,String companyid,String provincename,String provinceid,String dxpdeptcode){
        this.objId = objId;
        this.companyname = companyname;
        this.companyid = companyid;
        this.provincename = provincename;
        this.provinceid = provinceid;
        this.dxpdeptcode = dxpdeptcode;
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
     * 属性 provincename 的get方法
     * @return String
     */
    public String getProvincename(){
        return provincename;
    }
	
    /**
     * 属性 provincename 的set方法
     * @return
     */
    public void setProvincename(String provincename){
        this.provincename = provincename;
    } 
	
    /**
     * 属性 provinceid 的get方法
     * @return String
     */
    public String getProvinceid(){
        return provinceid;
    }
	
    /**
     * 属性 provinceid 的set方法
     * @return
     */
    public void setProvinceid(String provinceid){
        this.provinceid = provinceid;
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
     * 属性 statisticalcalibre 的get方法
     * @return BigDecimal
     */
    public BigDecimal getStatisticalcalibre(){
        return statisticalcalibre;
    }
	
    /**
     * 属性 statisticalcalibre 的set方法
     * @return
     */
    public void setStatisticalcalibre(BigDecimal statisticalcalibre){
        this.statisticalcalibre = statisticalcalibre;
    } 
	
    /**
     * 属性 newnumber 的get方法
     * @return BigDecimal
     */
    public BigDecimal getNewnumber(){
        return newnumber;
    }
	
    /**
     * 属性 newnumber 的set方法
     * @return
     */
    public void setNewnumber(BigDecimal newnumber){
        this.newnumber = newnumber;
    } 
	
    /**
     * 属性 newcapacity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getNewcapacity(){
        return newcapacity;
    }
	
    /**
     * 属性 newcapacity 的set方法
     * @return
     */
    public void setNewcapacity(BigDecimal newcapacity){
        this.newcapacity = newcapacity;
    } 
	
    /**
     * 属性 newtwentynumber 的get方法
     * @return BigDecimal
     */
    public BigDecimal getNewtwentynumber(){
        return newtwentynumber;
    }
	
    /**
     * 属性 newtwentynumber 的set方法
     * @return
     */
    public void setNewtwentynumber(BigDecimal newtwentynumber){
        this.newtwentynumber = newtwentynumber;
    } 
	
    /**
     * 属性 newtwentycapacity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getNewtwentycapacity(){
        return newtwentycapacity;
    }
	
    /**
     * 属性 newtwentycapacity 的set方法
     * @return
     */
    public void setNewtwentycapacity(BigDecimal newtwentycapacity){
        this.newtwentycapacity = newtwentycapacity;
    } 
	
    /**
     * 属性 newthirtynumber 的get方法
     * @return BigDecimal
     */
    public BigDecimal getNewthirtynumber(){
        return newthirtynumber;
    }
	
    /**
     * 属性 newthirtynumber 的set方法
     * @return
     */
    public void setNewthirtynumber(BigDecimal newthirtynumber){
        this.newthirtynumber = newthirtynumber;
    } 
	
    /**
     * 属性 newthirtycapacity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getNewthirtycapacity(){
        return newthirtycapacity;
    }
	
    /**
     * 属性 newthirtycapacity 的set方法
     * @return
     */
    public void setNewthirtycapacity(BigDecimal newthirtycapacity){
        this.newthirtycapacity = newthirtycapacity;
    } 
	
    /**
     * 属性 newsixtynumber 的get方法
     * @return BigDecimal
     */
    public BigDecimal getNewsixtynumber(){
        return newsixtynumber;
    }
	
    /**
     * 属性 newsixtynumber 的set方法
     * @return
     */
    public void setNewsixtynumber(BigDecimal newsixtynumber){
        this.newsixtynumber = newsixtynumber;
    } 
	
    /**
     * 属性 newsixtycapacity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getNewsixtycapacity(){
        return newsixtycapacity;
    }
	
    /**
     * 属性 newsixtycapacity 的set方法
     * @return
     */
    public void setNewsixtycapacity(BigDecimal newsixtycapacity){
        this.newsixtycapacity = newsixtycapacity;
    } 
	
    /**
     * 属性 newhundrednumber 的get方法
     * @return BigDecimal
     */
    public BigDecimal getNewhundrednumber(){
        return newhundrednumber;
    }
	
    /**
     * 属性 newhundrednumber 的set方法
     * @return
     */
    public void setNewhundrednumber(BigDecimal newhundrednumber){
        this.newhundrednumber = newhundrednumber;
    } 
	
    /**
     * 属性 newhundredcapacity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getNewhundredcapacity(){
        return newhundredcapacity;
    }
	
    /**
     * 属性 newhundredcapacity 的set方法
     * @return
     */
    public void setNewhundredcapacity(BigDecimal newhundredcapacity){
        this.newhundredcapacity = newhundredcapacity;
    } 
	
    /**
     * 属性 dxpdeptcode 的get方法
     * @return String
     */
    public String getDxpdeptcode(){
        return dxpdeptcode;
    }
	
    /**
     * 属性 dxpdeptcode 的set方法
     * @return
     */
    public void setDxpdeptcode(String dxpdeptcode){
        this.dxpdeptcode = dxpdeptcode;
    } 
	
    /**
     * 属性 deptCode 的get方法
     * @return String
     */
    public String getDeptCode(){
        return deptCode;
    }
	
    /**
     * 属性 deptCode 的set方法
     * @return
     */
    public void setDeptCode(String deptCode){
        this.deptCode = deptCode;
    } 
	
    /**
     * 属性 tabYear 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTabYear(){
        return tabYear;
    }
	
    /**
     * 属性 tabYear 的set方法
     * @return
     */
    public void setTabYear(BigDecimal tabYear){
        this.tabYear = tabYear;
    } 
	
    /**
     * 属性 tabMonth 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTabMonth(){
        return tabMonth;
    }
	
    /**
     * 属性 tabMonth 的set方法
     * @return
     */
    public void setTabMonth(BigDecimal tabMonth){
        this.tabMonth = tabMonth;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof SjjcGhXzzjqk))
	        return false; 
			
        if(getObjId() == null) 
	        return false;

        SjjcGhXzzjqk other = (SjjcGhXzzjqk) o;	        
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
            .append("provincename"+":"+getProvincename())
            .append("provinceid"+":"+getProvinceid())
            .append("theyear"+":"+getTheyear())
            .append("themonth"+":"+getThemonth())
            .append("statisticalcalibre"+":"+getStatisticalcalibre())
            .append("newnumber"+":"+getNewnumber())
            .append("newcapacity"+":"+getNewcapacity())
            .append("newtwentynumber"+":"+getNewtwentynumber())
            .append("newtwentycapacity"+":"+getNewtwentycapacity())
            .append("newthirtynumber"+":"+getNewthirtynumber())
            .append("newthirtycapacity"+":"+getNewthirtycapacity())
            .append("newsixtynumber"+":"+getNewsixtynumber())
            .append("newsixtycapacity"+":"+getNewsixtycapacity())
            .append("newhundrednumber"+":"+getNewhundrednumber())
            .append("newhundredcapacity"+":"+getNewhundredcapacity())
            .append("dxpdeptcode"+":"+getDxpdeptcode())
            .append("deptCode"+":"+getDeptCode())
            .append("tabYear"+":"+getTabYear())
            .append("tabMonth"+":"+getTabMonth())
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