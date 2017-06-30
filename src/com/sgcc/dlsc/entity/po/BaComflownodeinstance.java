package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.sql.Timestamp;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaComflownodeinstance的POJO类
 *
 * @author  Administrator  [Thu Jan 23 16:27:58 CST 2014]
 * 
 */
public class BaComflownodeinstance implements Serializable{

    /** 
     * 属性flownodeinsid
     */
    private String flownodeinsid;
	
    /** 
     * 属性flowinsid
     */
    private String flowinsid;
	
    /** 
     * 属性flowdefid
     */
    private String flowdefid;
	
    /** 
     * 属性ddate
     */
    private Timestamp ddate;
	
    /** 
     * 属性dmane
     */
    private String dmane;
	
    /** 
     * 属性state1
     */
    private BigDecimal state1;
	
    /** 
     * 属性xuhao
     */
    private BigDecimal xuhao;
	
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
     * BaComflownodeinstance构造函数
     */
    public BaComflownodeinstance() {
        super();
    }  
	
    /**
     * BaComflownodeinstance完整的构造函数
     */  
    public BaComflownodeinstance(String flownodeinsid,String flowinsid,String flowdefid,BigDecimal state1,BigDecimal xuhao){
        this.flownodeinsid = flownodeinsid;
        this.flowinsid = flowinsid;
        this.flowdefid = flowdefid;
        this.state1 = state1;
        this.xuhao = xuhao;
    }
 
    /**
     * 属性 flownodeinsid 的get方法
     * @return String
     */
    public String getFlownodeinsid(){
        return flownodeinsid;
    }
	
    /**
     * 属性 flownodeinsid 的set方法
     * @return
     */
    public void setFlownodeinsid(String flownodeinsid){
        if(flownodeinsid != null && flownodeinsid.trim().length() == 0){
            this.flownodeinsid = null;
        }else{
            this.flownodeinsid = flownodeinsid;
        }
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
     * 属性 flowdefid 的get方法
     * @return String
     */
    public String getFlowdefid(){
        return flowdefid;
    }
	
    /**
     * 属性 flowdefid 的set方法
     * @return
     */
    public void setFlowdefid(String flowdefid){
        this.flowdefid = flowdefid;
    } 
	
    /**
     * 属性 ddate 的get方法
     * @return Date
     */
    public Timestamp getDdate(){
        return ddate;
    }
	
    /**
     * 属性 ddate 的set方法
     * @return
     */
    public void setDdate(Timestamp ddate){
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
     * 属性 state1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getState1(){
        return state1;
    }
	
    /**
     * 属性 state1 的set方法
     * @return
     */
    public void setState1(BigDecimal state1){
        this.state1 = state1;
    } 
	
    /**
     * 属性 xuhao 的get方法
     * @return BigDecimal
     */
    public BigDecimal getXuhao(){
        return xuhao;
    }
	
    /**
     * 属性 xuhao 的set方法
     * @return
     */
    public void setXuhao(BigDecimal xuhao){
        this.xuhao = xuhao;
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
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaComflownodeinstance))
	        return false; 
			
        if(getFlownodeinsid() == null) 
	        return false;

        BaComflownodeinstance other = (BaComflownodeinstance) o;	        
	    return new EqualsBuilder()
            .append(this.getFlownodeinsid(), other.getFlownodeinsid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("flownodeinsid"+":"+getFlownodeinsid())
            .append("flowinsid"+":"+getFlowinsid())
            .append("flowdefid"+":"+getFlowdefid())
            .append("ddate"+":"+getDdate())
            .append("dmane"+":"+getDmane())
            .append("state1"+":"+getState1())
            .append("xuhao"+":"+getXuhao())
            .append("backstr1"+":"+getBackstr1())
            .append("backstr2"+":"+getBackstr2())
            .append("backstr3"+":"+getBackstr3())
            .append("backstr4"+":"+getBackstr4())
            .append("backstr5"+":"+getBackstr5())
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