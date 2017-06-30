package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * PubTmGjdlscjydltjb的POJO类
 *
 * @author  Administrator  [Mon Jun 09 18:21:52 CST 2014]
 * 
 */
public class PubTmGjdlscjydltjb implements Serializable{

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
     * 属性jymc1
     */
    private String jymc1;
	
    /** 
     * 属性jymc2
     */
    private String jymc2;
	
    /** 
     * 属性dyjh
     */
    private BigDecimal dyjh;
	
    /** 
     * 属性dywc
     */
    private BigDecimal dywc;
	
    /** 
     * 属性jhpcyy
     */
    private String jhpcyy;
	
    /** 
     * 属性ljwc
     */
    private BigDecimal ljwc;
	
    /** 
     * 属性bsdw
     */
    private String bsdw;
	
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
     * PubTmGjdlscjydltjb构造函数
     */
    public PubTmGjdlscjydltjb() {
        super();
    }  
	
    /**
     * PubTmGjdlscjydltjb完整的构造函数
     */  
    public PubTmGjdlscjydltjb(String guid,BigDecimal tyear,BigDecimal tmonth,String markerid,BigDecimal state,String fillinman,Date fillintime){
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
     * 属性 jymc1 的get方法
     * @return String
     */
    public String getJymc1(){
        return jymc1;
    }
	
    /**
     * 属性 jymc1 的set方法
     * @return
     */
    public void setJymc1(String jymc1){
        this.jymc1 = jymc1;
    } 
	
    /**
     * 属性 jymc2 的get方法
     * @return String
     */
    public String getJymc2(){
        return jymc2;
    }
	
    /**
     * 属性 jymc2 的set方法
     * @return
     */
    public void setJymc2(String jymc2){
        this.jymc2 = jymc2;
    } 
	
    /**
     * 属性 dyjh 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDyjh(){
        return dyjh;
    }
	
    /**
     * 属性 dyjh 的set方法
     * @return
     */
    public void setDyjh(BigDecimal dyjh){
        this.dyjh = dyjh;
    } 
	
    /**
     * 属性 dywc 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDywc(){
        return dywc;
    }
	
    /**
     * 属性 dywc 的set方法
     * @return
     */
    public void setDywc(BigDecimal dywc){
        this.dywc = dywc;
    } 
	
    /**
     * 属性 jhpcyy 的get方法
     * @return String
     */
    public String getJhpcyy(){
        return jhpcyy;
    }
	
    /**
     * 属性 jhpcyy 的set方法
     * @return
     */
    public void setJhpcyy(String jhpcyy){
        this.jhpcyy = jhpcyy;
    } 
	
    /**
     * 属性 ljwc 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjwc(){
        return ljwc;
    }
	
    /**
     * 属性 ljwc 的set方法
     * @return
     */
    public void setLjwc(BigDecimal ljwc){
        this.ljwc = ljwc;
    } 
	
    /**
     * 属性 bsdw 的get方法
     * @return String
     */
    public String getBsdw(){
        return bsdw;
    }
	
    /**
     * 属性 bsdw 的set方法
     * @return
     */
    public void setBsdw(String bsdw){
        this.bsdw = bsdw;
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
		
        if (o == null || !(o instanceof PubTmGjdlscjydltjb))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        PubTmGjdlscjydltjb other = (PubTmGjdlscjydltjb) o;	        
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
            .append("jymc1"+":"+getJymc1())
            .append("jymc2"+":"+getJymc2())
            .append("dyjh"+":"+getDyjh())
            .append("dywc"+":"+getDywc())
            .append("jhpcyy"+":"+getJhpcyy())
            .append("ljwc"+":"+getLjwc())
            .append("bsdw"+":"+getBsdw())
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