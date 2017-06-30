package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * PubTmAfdzcglgxfltjb的POJO类
 *
 * @author  lenovo  [Wed Jun 11 14:43:49 CST 2014]
 * 
 */
public class PubTmAfdzcglgxfltjb implements Serializable{

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
     * 属性tjxm
     */
    private String tjxm;
	
    /** 
     * 属性dygdl
     */
    private BigDecimal dygdl;
	
    /** 
     * 属性dytb
     */
    private BigDecimal dytb;
	
    /** 
     * 属性dyscfe
     */
    private BigDecimal dyscfe;
	
    /** 
     * 属性dygdjj
     */
    private BigDecimal dygdjj;
	
    /** 
     * 属性dygdjjtb
     */
    private BigDecimal dygdjjtb;
	
    /** 
     * 属性ndljgdl
     */
    private BigDecimal ndljgdl;
	
    /** 
     * 属性ndljtb
     */
    private BigDecimal ndljtb;
	
    /** 
     * 属性ndljscfe
     */
    private BigDecimal ndljscfe;
	
    /** 
     * 属性ndljgdjj
     */
    private BigDecimal ndljgdjj;
	
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
     * PubTmAfdzcglgxfltjb构造函数
     */
    public PubTmAfdzcglgxfltjb() {
        super();
    }  
	
    /**
     * PubTmAfdzcglgxfltjb完整的构造函数
     */  
    public PubTmAfdzcglgxfltjb(String guid,BigDecimal tyear,BigDecimal tmonth,String markerid,BigDecimal state,String fillinman,Date fillintime){
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
     * 属性 tjxm 的get方法
     * @return String
     */
    public String getTjxm(){
        return tjxm;
    }
	
    /**
     * 属性 tjxm 的set方法
     * @return
     */
    public void setTjxm(String tjxm){
        this.tjxm = tjxm;
    } 
	
    /**
     * 属性 dygdl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDygdl(){
        return dygdl;
    }
	
    /**
     * 属性 dygdl 的set方法
     * @return
     */
    public void setDygdl(BigDecimal dygdl){
        this.dygdl = dygdl;
    } 
	
    /**
     * 属性 dytb 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDytb(){
        return dytb;
    }
	
    /**
     * 属性 dytb 的set方法
     * @return
     */
    public void setDytb(BigDecimal dytb){
        this.dytb = dytb;
    } 
	
    /**
     * 属性 dyscfe 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDyscfe(){
        return dyscfe;
    }
	
    /**
     * 属性 dyscfe 的set方法
     * @return
     */
    public void setDyscfe(BigDecimal dyscfe){
        this.dyscfe = dyscfe;
    } 
	
    /**
     * 属性 dygdjj 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDygdjj(){
        return dygdjj;
    }
	
    /**
     * 属性 dygdjj 的set方法
     * @return
     */
    public void setDygdjj(BigDecimal dygdjj){
        this.dygdjj = dygdjj;
    } 
	
    /**
     * 属性 dygdjjtb 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDygdjjtb(){
        return dygdjjtb;
    }
	
    /**
     * 属性 dygdjjtb 的set方法
     * @return
     */
    public void setDygdjjtb(BigDecimal dygdjjtb){
        this.dygdjjtb = dygdjjtb;
    } 
	
    /**
     * 属性 ndljgdl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getNdljgdl(){
        return ndljgdl;
    }
	
    /**
     * 属性 ndljgdl 的set方法
     * @return
     */
    public void setNdljgdl(BigDecimal ndljgdl){
        this.ndljgdl = ndljgdl;
    } 
	
    /**
     * 属性 ndljtb 的get方法
     * @return BigDecimal
     */
    public BigDecimal getNdljtb(){
        return ndljtb;
    }
	
    /**
     * 属性 ndljtb 的set方法
     * @return
     */
    public void setNdljtb(BigDecimal ndljtb){
        this.ndljtb = ndljtb;
    } 
	
    /**
     * 属性 ndljscfe 的get方法
     * @return BigDecimal
     */
    public BigDecimal getNdljscfe(){
        return ndljscfe;
    }
	
    /**
     * 属性 ndljscfe 的set方法
     * @return
     */
    public void setNdljscfe(BigDecimal ndljscfe){
        this.ndljscfe = ndljscfe;
    } 
	
    /**
     * 属性 ndljgdjj 的get方法
     * @return BigDecimal
     */
    public BigDecimal getNdljgdjj(){
        return ndljgdjj;
    }
	
    /**
     * 属性 ndljgdjj 的set方法
     * @return
     */
    public void setNdljgdjj(BigDecimal ndljgdjj){
        this.ndljgdjj = ndljgdjj;
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
		
        if (o == null || !(o instanceof PubTmAfdzcglgxfltjb))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        PubTmAfdzcglgxfltjb other = (PubTmAfdzcglgxfltjb) o;	        
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
            .append("tjxm"+":"+getTjxm())
            .append("dygdl"+":"+getDygdl())
            .append("dytb"+":"+getDytb())
            .append("dyscfe"+":"+getDyscfe())
            .append("dygdjj"+":"+getDygdjj())
            .append("dygdjjtb"+":"+getDygdjjtb())
            .append("ndljgdl"+":"+getNdljgdl())
            .append("ndljtb"+":"+getNdljtb())
            .append("ndljscfe"+":"+getNdljscfe())
            .append("ndljgdjj"+":"+getNdljgdjj())
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