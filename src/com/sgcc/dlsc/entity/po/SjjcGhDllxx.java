package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * SjjcGhDllxx的POJO类
 *
 * @author  Administrator  [Sun Mar 16 15:14:59 CST 2014]
 * 
 */
public class SjjcGhDllxx implements Serializable{

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
     * 属性wholeconsumption
     */
    private BigDecimal wholeconsumption;
	
    /** 
     * 属性wholeconsumptionrate
     */
    private BigDecimal wholeconsumptionrate;
	
    /** 
     * 属性gridconsumption
     */
    private BigDecimal gridconsumption;
	
    /** 
     * 属性gridconsumptionrate
     */
    private BigDecimal gridconsumptionrate;
	
    /** 
     * 属性statisticalcalibre
     */
    private BigDecimal statisticalcalibre;
	
    /** 
     * 属性primaryconsumption
     */
    private BigDecimal primaryconsumption;
	
    /** 
     * 属性secondconsumption
     */
    private BigDecimal secondconsumption;
	
    /** 
     * 属性thirdconsumption
     */
    private BigDecimal thirdconsumption;
	
    /** 
     * 属性residentconsumption
     */
    private BigDecimal residentconsumption;
	
    /** 
     * 属性dxpdeptcode
     */
    private String dxpdeptcode = "1";
	
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
     * SjjcGhDllxx构造函数
     */
    public SjjcGhDllxx() {
        super();
    }  
	
    /**
     * SjjcGhDllxx完整的构造函数
     */  
    public SjjcGhDllxx(String objId,String companyname,String companyid,String provincename,String provinceid,BigDecimal theyear,String dxpdeptcode){
        this.objId = objId;
        this.companyname = companyname;
        this.companyid = companyid;
        this.provincename = provincename;
        this.provinceid = provinceid;
        this.theyear = theyear;
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
     * 属性 wholeconsumption 的get方法
     * @return BigDecimal
     */
    public BigDecimal getWholeconsumption(){
        return wholeconsumption;
    }
	
    /**
     * 属性 wholeconsumption 的set方法
     * @return
     */
    public void setWholeconsumption(BigDecimal wholeconsumption){
        this.wholeconsumption = wholeconsumption;
    } 
	
	
	
    /**
     * 属性 wholeconsumptionrate 的get方法
     * @return BigDecimal
     */
    public BigDecimal getWholeconsumptionrate(){
        return wholeconsumptionrate;
    }
	
    /**
     * 属性 wholeconsumptionrate 的set方法
     * @return
     */
    public void setWholeconsumptionrate(BigDecimal wholeconsumptionrate){
        this.wholeconsumptionrate = wholeconsumptionrate;
    } 
	
	
	
    /**
     * 属性 gridconsumption 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGridconsumption(){
        return gridconsumption;
    }
	
    /**
     * 属性 gridconsumption 的set方法
     * @return
     */
    public void setGridconsumption(BigDecimal gridconsumption){
        this.gridconsumption = gridconsumption;
    } 
	
	
	
    /**
     * 属性 gridconsumptionrate 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGridconsumptionrate(){
        return gridconsumptionrate;
    }
	
    /**
     * 属性 gridconsumptionrate 的set方法
     * @return
     */
    public void setGridconsumptionrate(BigDecimal gridconsumptionrate){
        this.gridconsumptionrate = gridconsumptionrate;
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
     * 属性 primaryconsumption 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPrimaryconsumption(){
        return primaryconsumption;
    }
	
    /**
     * 属性 primaryconsumption 的set方法
     * @return
     */
    public void setPrimaryconsumption(BigDecimal primaryconsumption){
        this.primaryconsumption = primaryconsumption;
    } 
	
	
	
    /**
     * 属性 secondconsumption 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSecondconsumption(){
        return secondconsumption;
    }
	
    /**
     * 属性 secondconsumption 的set方法
     * @return
     */
    public void setSecondconsumption(BigDecimal secondconsumption){
        this.secondconsumption = secondconsumption;
    } 
	
	
	
    /**
     * 属性 thirdconsumption 的get方法
     * @return BigDecimal
     */
    public BigDecimal getThirdconsumption(){
        return thirdconsumption;
    }
	
    /**
     * 属性 thirdconsumption 的set方法
     * @return
     */
    public void setThirdconsumption(BigDecimal thirdconsumption){
        this.thirdconsumption = thirdconsumption;
    } 
	
	
	
    /**
     * 属性 residentconsumption 的get方法
     * @return BigDecimal
     */
    public BigDecimal getResidentconsumption(){
        return residentconsumption;
    }
	
    /**
     * 属性 residentconsumption 的set方法
     * @return
     */
    public void setResidentconsumption(BigDecimal residentconsumption){
        this.residentconsumption = residentconsumption;
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
		
        if (o == null || !(o instanceof SjjcGhDllxx))
	        return false; 
			
        if(getObjId() == null) 
	        return false;

        SjjcGhDllxx other = (SjjcGhDllxx) o;	        
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
            .append("wholeconsumption"+":"+getWholeconsumption())
            .append("wholeconsumptionrate"+":"+getWholeconsumptionrate())
            .append("gridconsumption"+":"+getGridconsumption())
            .append("gridconsumptionrate"+":"+getGridconsumptionrate())
            .append("statisticalcalibre"+":"+getStatisticalcalibre())
            .append("primaryconsumption"+":"+getPrimaryconsumption())
            .append("secondconsumption"+":"+getSecondconsumption())
            .append("thirdconsumption"+":"+getThirdconsumption())
            .append("residentconsumption"+":"+getResidentconsumption())
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