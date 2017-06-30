package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * PubBusiRenewElec的POJO类
 *
 * @author  Administrator  [Sat Mar 01 17:04:45 GMT+08:00 2014]
 * 
 */
public class PubBusiRenewElec implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性tyear
     */
    private int tyear;
	
    /** 
     * 属性tmonth
     */
    private int tmonth;
    /** 
     * 属性deptid
     */
    private String deptid;
   
	/** 
     * 属性companyname
     */
    private String companyname;
	
    /** 
     * 属性electricity1
     */
    private BigDecimal electricity1;
	
    /** 
     * 属性electricity2
     */
    private BigDecimal electricity2;
	
    /** 
     * 属性rpric
     */
    private BigDecimal rpric;
	
    /** 
     * 属性description
     */
    private String description;
	
    /** 
     * 属性state
     */
    private int state;
	
    /** 
     * 属性subjectguid
     */
    private String subjectguid;
	
    /** 
     * 属性fillinman
     */
    private String fillinman;
	
    /** 
     * 属性fillintime
     */
    private Date fillintime;
	
    /** 
     * 属性bak1
     */
    private BigDecimal bak1;
	
    /** 
     * 属性bak2
     */
    private BigDecimal bak2;
	
    /** 
     * 属性bak3
     */
    private BigDecimal bak3;
	
    /** 
     * 属性bak4
     */
    private BigDecimal bak4;
	
    /** 
     * 属性bak5
     */
    private String bak5;
	
    /** 
     * 属性bak6
     */
    private String bak6;
	
    /**
     * PubBusiRenewElec构造函数
     */
    public PubBusiRenewElec() {
        super();
    }  
	
    /**
     * PubBusiRenewElec完整的构造函数
     */  
    public PubBusiRenewElec(String guid,String marketid,int tyear,int tmonth,int state,String fillinman,Date fillintime){
        this.guid = guid;
        this.marketid = marketid;
        this.tyear = tyear;
        this.tmonth = tmonth;
        this.state = state;
        this.fillinman = fillinman;
        this.fillintime = fillintime;
    }
 
    /**
     * 属性 guid 的get方法
     * @return String
     */
    public String getGuid(){
        return guid;
    }
	
    /**
     * 属性 guid 的set方法
     * @return
     */
    public void setGuid(String guid){
        if(guid != null && guid.trim().length() == 0){
            this.guid = null;
        }else{
            this.guid = guid;
        }
    } 
	
    /**
     * 属性 marketid 的get方法
     * @return String
     */
    public String getMarketid(){
        return marketid;
    }
	
    /**
     * 属性 marketid 的set方法
     * @return
     */
    public void setMarketid(String marketid){
        this.marketid = marketid;
    } 
	
    /**
     * 属性 tyear 的get方法
     * @return BigDecimal
     */
    public int getTyear(){
        return tyear;
    }
	
    /**
     * 属性 tyear 的set方法
     * @return
     */
    public void setTyear(int tyear){
        this.tyear = tyear;
    } 
	
    /**
     * 属性 tquarter 的get方法
     * @return BigDecimal
     */
    public int getTmonth(){
        return tmonth;
    }
	
    /**
     * 属性 tquarter 的set方法
     * @return
     */
    public void setTmonth(int tmonth){
        this.tmonth = tmonth;
    } 
	
    /**
     * 属性 companyname 的get方法
     * @return String
     */
    public String getCompanyname(){
        return companyname;
    }
    
    /**
     * 属性 deptid 的get方法
     * @return String
     */
    public String getDeptid() {
		return deptid;
	}
    /**
     * 属性 setDeptid 的set方法
     * @return
     */
	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}


    /**
     * 属性 companyname 的set方法
     * @return
     */
    public void setCompanyname(String companyname){
        this.companyname = companyname;
    } 
	
    /**
     * 属性 electricity1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getElectricity1(){
        return electricity1;
    }
	
    /**
     * 属性 electricity1 的set方法
     * @return
     */
    public void setElectricity1(BigDecimal electricity1){
        this.electricity1 = electricity1;
    } 
	
    /**
     * 属性 electricity2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getElectricity2(){
        return electricity2;
    }
	
    /**
     * 属性 electricity2 的set方法
     * @return
     */
    public void setElectricity2(BigDecimal electricity2){
        this.electricity2 = electricity2;
    } 
	
    /**
     * 属性 rpric 的get方法
     * @return BigDecimal
     */
    public BigDecimal getRpric(){
        return rpric;
    }
	
    /**
     * 属性 rpric 的set方法
     * @return
     */
    public void setRpric(BigDecimal rpric){
        this.rpric = rpric;
    } 
	
    /**
     * 属性 description 的get方法
     * @return String
     */
    public String getDescription(){
        return description;
    }
	
    /**
     * 属性 description 的set方法
     * @return
     */
    public void setDescription(String description){
        this.description = description;
    } 
	
    /**
     * 属性 state 的get方法
     * @return BigDecimal
     */
    public int getState(){
        return state;
    }
	
    /**
     * 属性 state 的set方法
     * @return
     */
    public void setState(int state){
        this.state = state;
    } 
	
    /**
     * 属性 subjectguid 的get方法
     * @return String
     */
    public String getSubjectguid(){
        return subjectguid;
    }
	
    /**
     * 属性 subjectguid 的set方法
     * @return
     */
    public void setSubjectguid(String subjectguid){
        this.subjectguid = subjectguid;
    } 
	
    /**
     * 属性 fillinman 的get方法
     * @return String
     */
    public String getFillinman(){
        return fillinman;
    }
	
    /**
     * 属性 fillinman 的set方法
     * @return
     */
    public void setFillinman(String fillinman){
        this.fillinman = fillinman;
    } 
	
    /**
     * 属性 fillintime 的get方法
     * @return Date
     */
    public Date getFillintime(){
        return fillintime;
    }
	
    /**
     * 属性 fillintime 的set方法
     * @return
     */
    public void setFillintime(Date fillintime){
        this.fillintime = fillintime;
    } 
	
    /**
     * 属性 bak1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBak1(){
        return bak1;
    }
	
    /**
     * 属性 bak1 的set方法
     * @return
     */
    public void setBak1(BigDecimal bak1){
        this.bak1 = bak1;
    } 
	
    /**
     * 属性 bak2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBak2(){
        return bak2;
    }
	
    /**
     * 属性 bak2 的set方法
     * @return
     */
    public void setBak2(BigDecimal bak2){
        this.bak2 = bak2;
    } 
	
    /**
     * 属性 bak3 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBak3(){
        return bak3;
    }
	
    /**
     * 属性 bak3 的set方法
     * @return
     */
    public void setBak3(BigDecimal bak3){
        this.bak3 = bak3;
    } 
	
    /**
     * 属性 bak4 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBak4(){
        return bak4;
    }
	
    /**
     * 属性 bak4 的set方法
     * @return
     */
    public void setBak4(BigDecimal bak4){
        this.bak4 = bak4;
    } 
	
    /**
     * 属性 bak5 的get方法
     * @return String
     */
    public String getBak5(){
        return bak5;
    }
	
    /**
     * 属性 bak5 的set方法
     * @return
     */
    public void setBak5(String bak5){
        this.bak5 = bak5;
    } 
	
    /**
     * 属性 bak6 的get方法
     * @return String
     */
    public String getBak6(){
        return bak6;
    }
	
    /**
     * 属性 bak6 的set方法
     * @return
     */
    public void setBak6(String bak6){
        this.bak6 = bak6;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof PubBusiRenewElec))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        PubBusiRenewElec other = (PubBusiRenewElec) o;	        
	    return new EqualsBuilder()
            .append(this.getGuid(), other.getGuid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("guid"+":"+getGuid())
            .append("marketid"+":"+getMarketid())
            .append("tyear"+":"+getTyear())
            .append("tmonth"+":"+getTmonth())
            .append("deptid"+":"+getDeptid())
            .append("companyname"+":"+getCompanyname())
            .append("electricity1"+":"+getElectricity1())
            .append("electricity2"+":"+getElectricity2())
            .append("rpric"+":"+getRpric())
            .append("description"+":"+getDescription())
            .append("state"+":"+getState())
            .append("subjectguid"+":"+getSubjectguid())
            .append("fillinman"+":"+getFillinman())
            .append("fillintime"+":"+getFillintime())
            .append("bak1"+":"+getBak1())
            .append("bak2"+":"+getBak2())
            .append("bak3"+":"+getBak3())
            .append("bak4"+":"+getBak4())
            .append("bak5"+":"+getBak5())
            .append("bak6"+":"+getBak6())
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