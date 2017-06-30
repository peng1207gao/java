package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaActdefinfo的POJO类
 *
 * @author  Administrator  [Sat Sep 28 18:49:12 CST 2013]
 * 
 */
public class BaActdefinfo implements Serializable{

    /** 
     * 属性actid
     */
    private String actid;
	
    /** 
     * 属性actname
     */
    private String actname;
	
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
     * BaActdefinfo构造函数
     */
    public BaActdefinfo() {
        super();
    }  
	
    /**
     * BaActdefinfo完整的构造函数
     */  
    public BaActdefinfo(String actid){
        this.actid = actid;
    }
 
    /**
     * 属性 actid 的get方法
     * @return String
     */
    public String getActid(){
        return actid;
    }
	
    /**
     * 属性 actid 的set方法
     * @return
     */
    public void setActid(String actid){
        if(actid != null && actid.trim().length() == 0){
            this.actid = null;
        }else{
            this.actid = actid;
        }
    } 
	
    /**
     * 属性 actname 的get方法
     * @return String
     */
    public String getActname(){
        return actname;
    }
	
    /**
     * 属性 actname 的set方法
     * @return
     */
    public void setActname(String actname){
        this.actname = actname;
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
		
        if (o == null || !(o instanceof BaActdefinfo))
	        return false; 
			
        if(getActid() == null) 
	        return false;

        BaActdefinfo other = (BaActdefinfo) o;	        
	    return new EqualsBuilder()
            .append(this.getActid(), other.getActid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("actid"+":"+getActid())
            .append("actname"+":"+getActname())
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