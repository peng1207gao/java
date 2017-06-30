package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * SjjcGhCydl的POJO类
 *
 * @author  Administrator  [Sun Mar 16 15:14:46 CST 2014]
 * 
 */
public class SjjcGhCydl implements Serializable{

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
     * 属性plantname
     */
    private String plantname;
	
    /** 
     * 属性plantid
     */
    private String plantid;
	
    /** 
     * 属性theyear
     */
    private BigDecimal theyear;
	
    /** 
     * 属性themonth
     */
    private BigDecimal themonth;
	
    /** 
     * 属性generationquantity
     */
    private BigDecimal generationquantity;
	
    /** 
     * 属性gridquantity
     */
    private BigDecimal gridquantity;
	
    /** 
     * 属性selfconsumptionratio
     */
    private BigDecimal selfconsumptionratio;
	
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
     * SjjcGhCydl构造函数
     */
    public SjjcGhCydl() {
        super();
    }  
	
    /**
     * SjjcGhCydl完整的构造函数
     */  
    public SjjcGhCydl(String objId,String companyname,String companyid,String provincename,String provinceid,String plantname){
        this.objId = objId;
        this.companyname = companyname;
        this.companyid = companyid;
        this.provincename = provincename;
        this.provinceid = provinceid;
        this.plantname = plantname;
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
     * 属性 gridquantity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGridquantity(){
        return gridquantity;
    }
	
    /**
     * 属性 gridquantity 的set方法
     * @return
     */
    public void setGridquantity(BigDecimal gridquantity){
        this.gridquantity = gridquantity;
    } 
	
	
	
    /**
     * 属性 selfconsumptionratio 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSelfconsumptionratio(){
        return selfconsumptionratio;
    }
	
    /**
     * 属性 selfconsumptionratio 的set方法
     * @return
     */
    public void setSelfconsumptionratio(BigDecimal selfconsumptionratio){
        this.selfconsumptionratio = selfconsumptionratio;
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
		
        if (o == null || !(o instanceof SjjcGhCydl))
	        return false; 
			
        if(getObjId() == null) 
	        return false;

        SjjcGhCydl other = (SjjcGhCydl) o;	        
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
            .append("plantname"+":"+getPlantname())
            .append("plantid"+":"+getPlantid())
            .append("theyear"+":"+getTheyear())
            .append("themonth"+":"+getThemonth())
            .append("generationquantity"+":"+getGenerationquantity())
            .append("gridquantity"+":"+getGridquantity())
            .append("selfconsumptionratio"+":"+getSelfconsumptionratio())
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