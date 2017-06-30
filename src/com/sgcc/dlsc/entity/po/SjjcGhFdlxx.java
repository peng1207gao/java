package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * SjjcGhFdlxx的POJO类
 *
 * @author  Administrator  [Sun Mar 16 15:15:10 CST 2014]
 * 
 */
public class SjjcGhFdlxx implements Serializable{

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
     * 属性totalquantity
     */
    private BigDecimal totalquantity;
	
    /** 
     * 属性totalquantityrate
     */
    private BigDecimal totalquantityrate;
	
    /** 
     * 属性thermalquantity
     */
    private BigDecimal thermalquantity;
	
    /** 
     * 属性thermalquantityrate
     */
    private BigDecimal thermalquantityrate;
	
    /** 
     * 属性hydropowerquantity
     */
    private BigDecimal hydropowerquantity;
	
    /** 
     * 属性hydropowerquantityrate
     */
    private BigDecimal hydropowerquantityrate;
	
    /** 
     * 属性nuclearquantity
     */
    private BigDecimal nuclearquantity;
	
    /** 
     * 属性nuclearquantityrate
     */
    private BigDecimal nuclearquantityrate;
	
    /** 
     * 属性windquantity
     */
    private BigDecimal windquantity;
	
    /** 
     * 属性windquantityrate
     */
    private BigDecimal windquantityrate;
	
    /** 
     * 属性otherquantity
     */
    private BigDecimal otherquantity;
	
    /** 
     * 属性otherquantityrate
     */
    private BigDecimal otherquantityrate;
	
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
     * SjjcGhFdlxx构造函数
     */
    public SjjcGhFdlxx() {
        super();
    }  
	
    /**
     * SjjcGhFdlxx完整的构造函数
     */  
    public SjjcGhFdlxx(String objId,String companyname,String companyid,String provincename,String provinceid,String dxpdeptcode){
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
     * 属性 totalquantity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTotalquantity(){
        return totalquantity;
    }
	
    /**
     * 属性 totalquantity 的set方法
     * @return
     */
    public void setTotalquantity(BigDecimal totalquantity){
        this.totalquantity = totalquantity;
    } 
	
	
	
    /**
     * 属性 totalquantityrate 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTotalquantityrate(){
        return totalquantityrate;
    }
	
    /**
     * 属性 totalquantityrate 的set方法
     * @return
     */
    public void setTotalquantityrate(BigDecimal totalquantityrate){
        this.totalquantityrate = totalquantityrate;
    } 
	
	
	
    /**
     * 属性 thermalquantity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getThermalquantity(){
        return thermalquantity;
    }
	
    /**
     * 属性 thermalquantity 的set方法
     * @return
     */
    public void setThermalquantity(BigDecimal thermalquantity){
        this.thermalquantity = thermalquantity;
    } 
	
	
	
    /**
     * 属性 thermalquantityrate 的get方法
     * @return BigDecimal
     */
    public BigDecimal getThermalquantityrate(){
        return thermalquantityrate;
    }
	
    /**
     * 属性 thermalquantityrate 的set方法
     * @return
     */
    public void setThermalquantityrate(BigDecimal thermalquantityrate){
        this.thermalquantityrate = thermalquantityrate;
    } 
	
	
	
    /**
     * 属性 hydropowerquantity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getHydropowerquantity(){
        return hydropowerquantity;
    }
	
    /**
     * 属性 hydropowerquantity 的set方法
     * @return
     */
    public void setHydropowerquantity(BigDecimal hydropowerquantity){
        this.hydropowerquantity = hydropowerquantity;
    } 
	
	
	
    /**
     * 属性 hydropowerquantityrate 的get方法
     * @return BigDecimal
     */
    public BigDecimal getHydropowerquantityrate(){
        return hydropowerquantityrate;
    }
	
    /**
     * 属性 hydropowerquantityrate 的set方法
     * @return
     */
    public void setHydropowerquantityrate(BigDecimal hydropowerquantityrate){
        this.hydropowerquantityrate = hydropowerquantityrate;
    } 
	
	
	
    /**
     * 属性 nuclearquantity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getNuclearquantity(){
        return nuclearquantity;
    }
	
    /**
     * 属性 nuclearquantity 的set方法
     * @return
     */
    public void setNuclearquantity(BigDecimal nuclearquantity){
        this.nuclearquantity = nuclearquantity;
    } 
	
	
	
    /**
     * 属性 nuclearquantityrate 的get方法
     * @return BigDecimal
     */
    public BigDecimal getNuclearquantityrate(){
        return nuclearquantityrate;
    }
	
    /**
     * 属性 nuclearquantityrate 的set方法
     * @return
     */
    public void setNuclearquantityrate(BigDecimal nuclearquantityrate){
        this.nuclearquantityrate = nuclearquantityrate;
    } 
	
	
	
    /**
     * 属性 windquantity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getWindquantity(){
        return windquantity;
    }
	
    /**
     * 属性 windquantity 的set方法
     * @return
     */
    public void setWindquantity(BigDecimal windquantity){
        this.windquantity = windquantity;
    } 
	
	
	
    /**
     * 属性 windquantityrate 的get方法
     * @return BigDecimal
     */
    public BigDecimal getWindquantityrate(){
        return windquantityrate;
    }
	
    /**
     * 属性 windquantityrate 的set方法
     * @return
     */
    public void setWindquantityrate(BigDecimal windquantityrate){
        this.windquantityrate = windquantityrate;
    } 
	
	
	
    /**
     * 属性 otherquantity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getOtherquantity(){
        return otherquantity;
    }
	
    /**
     * 属性 otherquantity 的set方法
     * @return
     */
    public void setOtherquantity(BigDecimal otherquantity){
        this.otherquantity = otherquantity;
    } 
	
	
	
    /**
     * 属性 otherquantityrate 的get方法
     * @return BigDecimal
     */
    public BigDecimal getOtherquantityrate(){
        return otherquantityrate;
    }
	
    /**
     * 属性 otherquantityrate 的set方法
     * @return
     */
    public void setOtherquantityrate(BigDecimal otherquantityrate){
        this.otherquantityrate = otherquantityrate;
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
		
        if (o == null || !(o instanceof SjjcGhFdlxx))
	        return false; 
			
        if(getObjId() == null) 
	        return false;

        SjjcGhFdlxx other = (SjjcGhFdlxx) o;	        
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
            .append("totalquantity"+":"+getTotalquantity())
            .append("totalquantityrate"+":"+getTotalquantityrate())
            .append("thermalquantity"+":"+getThermalquantity())
            .append("thermalquantityrate"+":"+getThermalquantityrate())
            .append("hydropowerquantity"+":"+getHydropowerquantity())
            .append("hydropowerquantityrate"+":"+getHydropowerquantityrate())
            .append("nuclearquantity"+":"+getNuclearquantity())
            .append("nuclearquantityrate"+":"+getNuclearquantityrate())
            .append("windquantity"+":"+getWindquantity())
            .append("windquantityrate"+":"+getWindquantityrate())
            .append("otherquantity"+":"+getOtherquantity())
            .append("otherquantityrate"+":"+getOtherquantityrate())
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