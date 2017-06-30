package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * ZxjcAccessLog的POJO类
 *
 * @author  Administrator  [Wed Apr 23 15:21:54 CST 2014]
 * 
 */
public class ZxjcAccessLog implements Serializable{

    /** 
     * 属性sheetid
     */
    private String sheetid = "sys_guid()";
	
    /** 
     * 属性accIp
     */
    private String accIp;
	
    /** 
     * 属性accType
     */
    private String accType;
	
    /** 
     * 属性accObjid
     */
    private String accObjid;
	
    /** 
     * 属性accTime
     */
    private String accTime = "TO_CHAR(SYSDATE,'YYYY-MM-DD HH24:MI:SS')";
	
    /**
     * ZxjcAccessLog构造函数
     */
    public ZxjcAccessLog() {
        super();
    }  
	
    /**
     * ZxjcAccessLog完整的构造函数
     */  
    public ZxjcAccessLog(String sheetid){
        this.sheetid = sheetid;
    }
 
    /**
     * 属性 sheetid 的get方法
     * @return String
     */
    public String getSheetid(){
        return sheetid;
    }
	
    /**
     * 属性 sheetid 的set方法
     * @return
     */
    public void setSheetid(String sheetid){
        if(sheetid != null && sheetid.trim().length() == 0){
            this.sheetid = null;
        }else{
            this.sheetid = sheetid;
        }
    } 
	
    /**
     * 属性 accIp 的get方法
     * @return String
     */
    public String getAccIp(){
        return accIp;
    }
	
    /**
     * 属性 accIp 的set方法
     * @return
     */
    public void setAccIp(String accIp){
        this.accIp = accIp;
    } 
	
    /**
     * 属性 accType 的get方法
     * @return String
     */
    public String getAccType(){
        return accType;
    }
	
    /**
     * 属性 accType 的set方法
     * @return
     */
    public void setAccType(String accType){
        this.accType = accType;
    } 
	
    /**
     * 属性 accObjid 的get方法
     * @return String
     */
    public String getAccObjid(){
        return accObjid;
    }
	
    /**
     * 属性 accObjid 的set方法
     * @return
     */
    public void setAccObjid(String accObjid){
        this.accObjid = accObjid;
    } 
	
    /**
     * 属性 accTime 的get方法
     * @return String
     */
    public String getAccTime(){
        return accTime;
    }
	
    /**
     * 属性 accTime 的set方法
     * @return
     */
    public void setAccTime(String accTime){
        this.accTime = accTime;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof ZxjcAccessLog))
	        return false; 
			
        if(getSheetid() == null) 
	        return false;

        ZxjcAccessLog other = (ZxjcAccessLog) o;	        
	    return new EqualsBuilder()
            .append(this.getSheetid(), other.getSheetid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("sheetid"+":"+getSheetid())
            .append("accIp"+":"+getAccIp())
            .append("accType"+":"+getAccType())
            .append("accObjid"+":"+getAccObjid())
            .append("accTime"+":"+getAccTime())
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