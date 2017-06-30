package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * PubYGeneOvhPlan的POJO类
 *
 * @author  Administrator  [Tue Apr 01 11:35:10 CST 2014]
 * 
 */
public class PubYGeneOvhPlan implements Serializable{

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
    private BigDecimal tyear;
	
    /** 
     * 属性facid
     */
    private String facid;
	
    /** 
     * 属性facname
     */
    private String facname;
	
    /** 
     * 属性macid
     */
    private String macid;
	
    /** 
     * 属性macname
     */
    private String macname;
	
    /** 
     * 属性begintime
     */
    private Date begintime;
	
    /** 
     * 属性endtime
     */
    private Date endtime;
	
    /** 
     * 属性stopdays
     */
    private BigDecimal stopdays;
	
    /** 
     * 属性ovhtype
     */
    private String ovhtype;
	
    /** 
     * 属性genevolume
     */
    private BigDecimal genevolume;
	
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
     * PubYGeneOvhPlan构造函数
     */
    public PubYGeneOvhPlan() {
        super();
    }  
	
    /**
     * PubYGeneOvhPlan完整的构造函数
     */  
    public PubYGeneOvhPlan(String guid,String marketid,BigDecimal tyear,BigDecimal state,String fillinman,Date fillintime){
        this.guid = guid;
        this.marketid = marketid;
        this.tyear = tyear;
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
     * 属性 facid 的get方法
     * @return String
     */
    public String getFacid(){
        return facid;
    }
	
    /**
     * 属性 facid 的set方法
     * @return
     */
    public void setFacid(String facid){
        this.facid = facid;
    } 
	
    /**
     * 属性 facname 的get方法
     * @return String
     */
    public String getFacname(){
        return facname;
    }
	
    /**
     * 属性 facname 的set方法
     * @return
     */
    public void setFacname(String facname){
        this.facname = facname;
    } 
	
    /**
     * 属性 macid 的get方法
     * @return String
     */
    public String getMacid(){
        return macid;
    }
	
    /**
     * 属性 macid 的set方法
     * @return
     */
    public void setMacid(String macid){
        this.macid = macid;
    } 
	
    /**
     * 属性 macname 的get方法
     * @return String
     */
    public String getMacname(){
        return macname;
    }
	
    /**
     * 属性 macname 的set方法
     * @return
     */
    public void setMacname(String macname){
        this.macname = macname;
    } 
	
    /**
     * 属性 begintime 的get方法
     * @return Date
     */
    public Date getBegintime(){
        return begintime;
    }
	
    /**
     * 属性 begintime 的set方法
     * @return
     */
    public void setBegintime(Date begintime){
        this.begintime = begintime;
    } 
	
    /**
     * 属性 endtime 的get方法
     * @return Date
     */
    public Date getEndtime(){
        return endtime;
    }
	
    /**
     * 属性 endtime 的set方法
     * @return
     */
    public void setEndtime(Date endtime){
        this.endtime = endtime;
    } 
	
    /**
     * 属性 stopdays 的get方法
     * @return BigDecimal
     */
    public BigDecimal getStopdays(){
        return stopdays;
    }
	
    /**
     * 属性 stopdays 的set方法
     * @return
     */
    public void setStopdays(BigDecimal stopdays){
        this.stopdays = stopdays;
    } 
	
    /**
     * 属性 ovhtype 的get方法
     * @return String
     */
    public String getOvhtype(){
        return ovhtype;
    }
	
    /**
     * 属性 ovhtype 的set方法
     * @return
     */
    public void setOvhtype(String ovhtype){
        this.ovhtype = ovhtype;
    } 
	
    /**
     * 属性 genevolume 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGenevolume(){
        return genevolume;
    }
	
    /**
     * 属性 genevolume 的set方法
     * @return
     */
    public void setGenevolume(BigDecimal genevolume){
        this.genevolume = genevolume;
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
		
        if (o == null || !(o instanceof PubYGeneOvhPlan))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        PubYGeneOvhPlan other = (PubYGeneOvhPlan) o;	        
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
            .append("facid"+":"+getFacid())
            .append("facname"+":"+getFacname())
            .append("macid"+":"+getMacid())
            .append("macname"+":"+getMacname())
            .append("begintime"+":"+getBegintime())
            .append("endtime"+":"+getEndtime())
            .append("stopdays"+":"+getStopdays())
            .append("ovhtype"+":"+getOvhtype())
            .append("genevolume"+":"+getGenevolume())
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