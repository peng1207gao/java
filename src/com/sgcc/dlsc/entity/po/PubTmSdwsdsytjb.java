package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * PubTmSdwsdsytjb的POJO类
 *
 * @author  lenovo  [Wed Jun 11 14:45:57 CST 2014]
 * 
 */
public class PubTmSdwsdsytjb implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性tyear
     */
    private BigDecimal tyear;
	
    /** 
     * 属性tmonth
     */
    private BigDecimal tmonth;
	
    /** 
     * 属性markerid
     */
    private String markerid;
	
    /** 
     * 属性kssd
     */
    private String kssd;
	
    /** 
     * 属性dywsdl
     */
    private BigDecimal dywsdl;
	
    /** 
     * 属性dyjhwcl
     */
    private BigDecimal dyjhwcl;
	
    /** 
     * 属性dywsdltb
     */
    private BigDecimal dywsdltb;
	
    /** 
     * 属性dygdj
     */
    private BigDecimal dygdj;
	
    /** 
     * 属性dysdj
     */
    private BigDecimal dysdj;
	
    /** 
     * 属性dyshudj
     */
    private BigDecimal dyshudj;
	
    /** 
     * 属性sysdf
     */
    private BigDecimal sysdf;
	
    /** 
     * 属性ndljwsdl
     */
    private BigDecimal ndljwsdl;
	
    /** 
     * 属性ndljwsdltb
     */
    private BigDecimal ndljwsdltb;
	
    /** 
     * 属性ndljsdf
     */
    private BigDecimal ndljsdf;
	
    /** 
     * 属性ndljsdftb
     */
    private BigDecimal ndljsdftb;
	
    /** 
     * 属性xh
     */
    private BigDecimal xh;
	
    /** 
     * 属性state
     */
    private BigDecimal state;
	
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
    private String bak3;
	
    /** 
     * 属性bak4
     */
    private String bak4;
	
    /** 
     * 属性bak5
     */
    private String bak5;
	
    /** 
     * 属性bak6
     */
    private String bak6;
	
    /**
     * PubTmSdwsdsytjb构造函数
     */
    public PubTmSdwsdsytjb() {
        super();
    }  
	
    /**
     * PubTmSdwsdsytjb完整的构造函数
     */  
    public PubTmSdwsdsytjb(String guid,BigDecimal tyear,BigDecimal tmonth,String markerid,BigDecimal state,String fillinman,Date fillintime){
        this.guid = guid;
        this.tyear = tyear;
        this.tmonth = tmonth;
        this.markerid = markerid;
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
     * 属性 tyear 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTyear(){
        return tyear;
    }
	
    /**
     * 属性 tyear 的set方法
     * @return
     */
    public void setTyear(BigDecimal tyear){
        this.tyear = tyear;
    } 
	
    /**
     * 属性 tmonth 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTmonth(){
        return tmonth;
    }
	
    /**
     * 属性 tmonth 的set方法
     * @return
     */
    public void setTmonth(BigDecimal tmonth){
        this.tmonth = tmonth;
    } 
	
    /**
     * 属性 markerid 的get方法
     * @return String
     */
    public String getMarkerid(){
        return markerid;
    }
	
    /**
     * 属性 markerid 的set方法
     * @return
     */
    public void setMarkerid(String markerid){
        this.markerid = markerid;
    } 
	
    /**
     * 属性 kssd 的get方法
     * @return String
     */
    public String getKssd(){
        return kssd;
    }
	
    /**
     * 属性 kssd 的set方法
     * @return
     */
    public void setKssd(String kssd){
        this.kssd = kssd;
    } 
	
    /**
     * 属性 dywsdl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDywsdl(){
        return dywsdl;
    }
	
    /**
     * 属性 dywsdl 的set方法
     * @return
     */
    public void setDywsdl(BigDecimal dywsdl){
        this.dywsdl = dywsdl;
    } 
	
    /**
     * 属性 dyjhwcl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDyjhwcl(){
        return dyjhwcl;
    }
	
    /**
     * 属性 dyjhwcl 的set方法
     * @return
     */
    public void setDyjhwcl(BigDecimal dyjhwcl){
        this.dyjhwcl = dyjhwcl;
    } 
	
    /**
     * 属性 dywsdltb 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDywsdltb(){
        return dywsdltb;
    }
	
    /**
     * 属性 dywsdltb 的set方法
     * @return
     */
    public void setDywsdltb(BigDecimal dywsdltb){
        this.dywsdltb = dywsdltb;
    } 
	
    /**
     * 属性 dygdj 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDygdj(){
        return dygdj;
    }
	
    /**
     * 属性 dygdj 的set方法
     * @return
     */
    public void setDygdj(BigDecimal dygdj){
        this.dygdj = dygdj;
    } 
	
    /**
     * 属性 dysdj 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDysdj(){
        return dysdj;
    }
	
    /**
     * 属性 dysdj 的set方法
     * @return
     */
    public void setDysdj(BigDecimal dysdj){
        this.dysdj = dysdj;
    } 
	
    /**
     * 属性 dyshudj 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDyshudj(){
        return dyshudj;
    }
	
    /**
     * 属性 dyshudj 的set方法
     * @return
     */
    public void setDyshudj(BigDecimal dyshudj){
        this.dyshudj = dyshudj;
    } 
	
    /**
     * 属性 sysdf 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSysdf(){
        return sysdf;
    }
	
    /**
     * 属性 sysdf 的set方法
     * @return
     */
    public void setSysdf(BigDecimal sysdf){
        this.sysdf = sysdf;
    } 
	
    /**
     * 属性 ndljwsdl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getNdljwsdl(){
        return ndljwsdl;
    }
	
    /**
     * 属性 ndljwsdl 的set方法
     * @return
     */
    public void setNdljwsdl(BigDecimal ndljwsdl){
        this.ndljwsdl = ndljwsdl;
    } 
	
    /**
     * 属性 ndljwsdltb 的get方法
     * @return BigDecimal
     */
    public BigDecimal getNdljwsdltb(){
        return ndljwsdltb;
    }
	
    /**
     * 属性 ndljwsdltb 的set方法
     * @return
     */
    public void setNdljwsdltb(BigDecimal ndljwsdltb){
        this.ndljwsdltb = ndljwsdltb;
    } 
	
    /**
     * 属性 ndljsdf 的get方法
     * @return BigDecimal
     */
    public BigDecimal getNdljsdf(){
        return ndljsdf;
    }
	
    /**
     * 属性 ndljsdf 的set方法
     * @return
     */
    public void setNdljsdf(BigDecimal ndljsdf){
        this.ndljsdf = ndljsdf;
    } 
	
    /**
     * 属性 ndljsdftb 的get方法
     * @return BigDecimal
     */
    public BigDecimal getNdljsdftb(){
        return ndljsdftb;
    }
	
    /**
     * 属性 ndljsdftb 的set方法
     * @return
     */
    public void setNdljsdftb(BigDecimal ndljsdftb){
        this.ndljsdftb = ndljsdftb;
    } 
	
    /**
     * 属性 xh 的get方法
     * @return BigDecimal
     */
    public BigDecimal getXh(){
        return xh;
    }
	
    /**
     * 属性 xh 的set方法
     * @return
     */
    public void setXh(BigDecimal xh){
        this.xh = xh;
    } 
	
    /**
     * 属性 state 的get方法
     * @return BigDecimal
     */
    public BigDecimal getState(){
        return state;
    }
	
    /**
     * 属性 state 的set方法
     * @return
     */
    public void setState(BigDecimal state){
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
     * @return String
     */
    public String getBak3(){
        return bak3;
    }
	
    /**
     * 属性 bak3 的set方法
     * @return
     */
    public void setBak3(String bak3){
        this.bak3 = bak3;
    } 
	
    /**
     * 属性 bak4 的get方法
     * @return String
     */
    public String getBak4(){
        return bak4;
    }
	
    /**
     * 属性 bak4 的set方法
     * @return
     */
    public void setBak4(String bak4){
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
		
        if (o == null || !(o instanceof PubTmSdwsdsytjb))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        PubTmSdwsdsytjb other = (PubTmSdwsdsytjb) o;	        
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
            .append("tyear"+":"+getTyear())
            .append("tmonth"+":"+getTmonth())
            .append("markerid"+":"+getMarkerid())
            .append("kssd"+":"+getKssd())
            .append("dywsdl"+":"+getDywsdl())
            .append("dyjhwcl"+":"+getDyjhwcl())
            .append("dywsdltb"+":"+getDywsdltb())
            .append("dygdj"+":"+getDygdj())
            .append("dysdj"+":"+getDysdj())
            .append("dyshudj"+":"+getDyshudj())
            .append("sysdf"+":"+getSysdf())
            .append("ndljwsdl"+":"+getNdljwsdl())
            .append("ndljwsdltb"+":"+getNdljwsdltb())
            .append("ndljsdf"+":"+getNdljsdf())
            .append("ndljsdftb"+":"+getNdljsdftb())
            .append("xh"+":"+getXh())
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