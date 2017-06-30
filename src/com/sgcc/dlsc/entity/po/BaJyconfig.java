package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaJyconfig的POJO类
 *
 * @author  Administrator  [Mon Aug 12 18:17:11 CST 2013]
 * 
 */
public class BaJyconfig implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性xh
     */
    private BigDecimal xh;
	
    /** 
     * 属性jdid
     */
    private String jdid;
	
    /** 
     * 属性ddate
     */
    private Date ddate;
	
    /** 
     * 属性dmane
     */
    private String dmane;
	
    /** 
     * 属性backstr1
     */
    private String backstr1;
	
    /** 
     * 属性backstr2
     */
    private String backstr2;
	
    /** 
     * 属性backstr3
     */
    private String backstr3;
	
    /** 
     * 属性backstr4
     */
    private String backstr4;
	
    /** 
     * 属性backstr5
     */
    private String backstr5;
	
    /** 
     * 属性flowinsid
     */
    private String flowinsid;
	
    /** 
     * 属性sdate
     */
    private Date sdate;
	
    /** 
     * 属性edate
     */
    private Date edate;
	
    /** 
     * 属性flowid
     */
    private String flowid;
	
    /**
     * BaJyconfig构造函数
     */
    public BaJyconfig() {
        super();
    }  
	
    /**
     * BaJyconfig完整的构造函数
     */  
    public BaJyconfig(String guid,Date sdate,Date edate){
        this.guid = guid;
        this.sdate = sdate;
        this.edate = edate;
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
     * 属性 jdid 的get方法
     * @return String
     */
    public String getJdid(){
        return jdid;
    }
	
    /**
     * 属性 jdid 的set方法
     * @return
     */
    public void setJdid(String jdid){
        this.jdid = jdid;
    } 
	
    /**
     * 属性 ddate 的get方法
     * @return Date
     */
    public Date getDdate(){
        return ddate;
    }
	
    /**
     * 属性 ddate 的set方法
     * @return
     */
    public void setDdate(Date ddate){
        this.ddate = ddate;
    } 
	
    /**
     * 属性 dmane 的get方法
     * @return String
     */
    public String getDmane(){
        return dmane;
    }
	
    /**
     * 属性 dmane 的set方法
     * @return
     */
    public void setDmane(String dmane){
        this.dmane = dmane;
    } 
	
    /**
     * 属性 backstr1 的get方法
     * @return String
     */
    public String getBackstr1(){
        return backstr1;
    }
	
    /**
     * 属性 backstr1 的set方法
     * @return
     */
    public void setBackstr1(String backstr1){
        this.backstr1 = backstr1;
    } 
	
    /**
     * 属性 backstr2 的get方法
     * @return String
     */
    public String getBackstr2(){
        return backstr2;
    }
	
    /**
     * 属性 backstr2 的set方法
     * @return
     */
    public void setBackstr2(String backstr2){
        this.backstr2 = backstr2;
    } 
	
    /**
     * 属性 backstr3 的get方法
     * @return String
     */
    public String getBackstr3(){
        return backstr3;
    }
	
    /**
     * 属性 backstr3 的set方法
     * @return
     */
    public void setBackstr3(String backstr3){
        this.backstr3 = backstr3;
    } 
	
    /**
     * 属性 backstr4 的get方法
     * @return String
     */
    public String getBackstr4(){
        return backstr4;
    }
	
    /**
     * 属性 backstr4 的set方法
     * @return
     */
    public void setBackstr4(String backstr4){
        this.backstr4 = backstr4;
    } 
	
    /**
     * 属性 backstr5 的get方法
     * @return String
     */
    public String getBackstr5(){
        return backstr5;
    }
	
    /**
     * 属性 backstr5 的set方法
     * @return
     */
    public void setBackstr5(String backstr5){
        this.backstr5 = backstr5;
    } 
	
    /**
     * 属性 flowinsid 的get方法
     * @return String
     */
    public String getFlowinsid(){
        return flowinsid;
    }
	
    /**
     * 属性 flowinsid 的set方法
     * @return
     */
    public void setFlowinsid(String flowinsid){
        this.flowinsid = flowinsid;
    } 
	
    /**
     * 属性 sdate 的get方法
     * @return Date
     */
    public Date getSdate(){
        return sdate;
    }
	
    /**
     * 属性 sdate 的set方法
     * @return
     */
    public void setSdate(Date sdate){
        this.sdate = sdate;
    } 
	
    /**
     * 属性 edate 的get方法
     * @return Date
     */
    public Date getEdate(){
        return edate;
    }
	
    /**
     * 属性 edate 的set方法
     * @return
     */
    public void setEdate(Date edate){
        this.edate = edate;
    } 
	
    /**
     * 属性 flowid 的get方法
     * @return String
     */
    public String getFlowid(){
        return flowid;
    }
	
    /**
     * 属性 flowid 的set方法
     * @return
     */
    public void setFlowid(String flowid){
        this.flowid = flowid;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaJyconfig))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaJyconfig other = (BaJyconfig) o;	        
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
            .append("xh"+":"+getXh())
            .append("jdid"+":"+getJdid())
            .append("ddate"+":"+getDdate())
            .append("dmane"+":"+getDmane())
            .append("backstr1"+":"+getBackstr1())
            .append("backstr2"+":"+getBackstr2())
            .append("backstr3"+":"+getBackstr3())
            .append("backstr4"+":"+getBackstr4())
            .append("backstr5"+":"+getBackstr5())
            .append("flowinsid"+":"+getFlowinsid())
            .append("sdate"+":"+getSdate())
            .append("edate"+":"+getEdate())
            .append("flowid"+":"+getFlowid())
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