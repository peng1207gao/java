package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TrAlgorithmParams的POJO类
 *
 * @author  Administrator  [Sun Sep 15 17:40:13 CST 2013]
 * 
 */
public class TrAlgorithmParams implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性param1
     */
    private String param1;
	
    /** 
     * 属性param2
     */
    private String param2;
	
    /** 
     * 属性param3
     */
    private String param3;
	
    /** 
     * 属性param4
     */
    private String param4;
	
    /** 
     * 属性param5
     */
    private String param5;
	
    /** 
     * 属性param6
     */
    private String param6;
	
    /**
     * TrAlgorithmParams构造函数
     */
    public TrAlgorithmParams() {
        super();
    }  
	
    /**
     * TrAlgorithmParams完整的构造函数
     */  
    public TrAlgorithmParams(String guid){
        this.guid = guid;
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
     * 属性 param1 的get方法
     * @return String
     */
    public String getParam1(){
        return param1;
    }
	
    /**
     * 属性 param1 的set方法
     * @return
     */
    public void setParam1(String param1){
        this.param1 = param1;
    } 
	
	
	
    /**
     * 属性 param2 的get方法
     * @return String
     */
    public String getParam2(){
        return param2;
    }
	
    /**
     * 属性 param2 的set方法
     * @return
     */
    public void setParam2(String param2){
        this.param2 = param2;
    } 
	
	
	
    /**
     * 属性 param3 的get方法
     * @return String
     */
    public String getParam3(){
        return param3;
    }
	
    /**
     * 属性 param3 的set方法
     * @return
     */
    public void setParam3(String param3){
        this.param3 = param3;
    } 
	
	
	
    /**
     * 属性 param4 的get方法
     * @return String
     */
    public String getParam4(){
        return param4;
    }
	
    /**
     * 属性 param4 的set方法
     * @return
     */
    public void setParam4(String param4){
        this.param4 = param4;
    } 
	
	
	
    /**
     * 属性 param5 的get方法
     * @return String
     */
    public String getParam5(){
        return param5;
    }
	
    /**
     * 属性 param5 的set方法
     * @return
     */
    public void setParam5(String param5){
        this.param5 = param5;
    } 
	
	
	
    /**
     * 属性 param6 的get方法
     * @return String
     */
    public String getParam6(){
        return param6;
    }
	
    /**
     * 属性 param6 的set方法
     * @return
     */
    public void setParam6(String param6){
        this.param6 = param6;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof TrAlgorithmParams))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        TrAlgorithmParams other = (TrAlgorithmParams) o;	        
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
            .append("param1"+":"+getParam1())
            .append("param2"+":"+getParam2())
            .append("param3"+":"+getParam3())
            .append("param4"+":"+getParam4())
            .append("param5"+":"+getParam5())
            .append("param6"+":"+getParam6())
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