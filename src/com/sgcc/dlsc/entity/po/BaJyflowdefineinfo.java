package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaJyflowdefineinfo的POJO类
 *
 * @author  Administrator  [Mon Sep 16 11:48:39 CST 2013]
 * 
 */
public class BaJyflowdefineinfo implements Serializable{

    /** 
     * 属性flowid
     */
    private String flowid;
	
    /** 
     * 属性flowname
     */
    private String flowname;
	
    /** 
     * 属性flowdefdate
     */
    private Date flowdefdate;
	
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
     * 属性flowdefperson
     */
    private String flowdefperson;
	
    /**
     * BaJyflowdefineinfo构造函数
     */
    public BaJyflowdefineinfo() {
        super();
    }  
	
    /**
     * BaJyflowdefineinfo完整的构造函数
     */  
    public BaJyflowdefineinfo(String flowid){
        this.flowid = flowid;
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
        if(flowid != null && flowid.trim().length() == 0){
            this.flowid = null;
        }else{
            this.flowid = flowid;
        }
    } 
	
    /**
     * 属性 flowname 的get方法
     * @return String
     */
    public String getFlowname(){
        return flowname;
    }
	
    /**
     * 属性 flowname 的set方法
     * @return
     */
    public void setFlowname(String flowname){
        this.flowname = flowname;
    } 
	
    /**
     * 属性 flowdefdate 的get方法
     * @return Date
     */
    public Date getFlowdefdate(){
        return flowdefdate;
    }
	
    /**
     * 属性 flowdefdate 的set方法
     * @return
     */
    public void setFlowdefdate(Date flowdefdate){
        this.flowdefdate = flowdefdate;
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
     * 属性 flowdefperson 的get方法
     * @return String
     */
    public String getFlowdefperson(){
        return flowdefperson;
    }
	
    /**
     * 属性 flowdefperson 的set方法
     * @return
     */
    public void setFlowdefperson(String flowdefperson){
        this.flowdefperson = flowdefperson;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaJyflowdefineinfo))
	        return false; 
			
        if(getFlowid() == null) 
	        return false;

        BaJyflowdefineinfo other = (BaJyflowdefineinfo) o;	        
	    return new EqualsBuilder()
            .append(this.getFlowid(), other.getFlowid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("flowid"+":"+getFlowid())
            .append("flowname"+":"+getFlowname())
            .append("flowdefdate"+":"+getFlowdefdate())
            .append("backstr1"+":"+getBackstr1())
            .append("backstr2"+":"+getBackstr2())
            .append("backstr3"+":"+getBackstr3())
            .append("backstr4"+":"+getBackstr4())
            .append("backstr5"+":"+getBackstr5())
            .append("flowdefperson"+":"+getFlowdefperson())
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