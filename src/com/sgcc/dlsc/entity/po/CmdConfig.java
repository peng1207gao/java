package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * CmdConfig的POJO类
 *
 * @author  toshiba  [Fri Feb 07 16:41:54 CST 2014]
 * 
 */
public class CmdConfig implements Serializable{

    /** 
     * 属性cmdId
     */
    private String cmdId;
	
    /** 
     * 属性cmdDescr
     */
    private String cmdDescr;
	
    /** 
     * 属性cmd
     */
    private String cmd;
	
    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性cmdTimeouts
     */
    private String cmdTimeouts;
	
    /** 
     * 属性cmdWatch
     */
    private String cmdWatch;
	
    /** 
     * 属性cmdType
     */
    private String cmdType;
    
    /**
     * 算法说明
     */
    private String cmdExplicate;
    
	
    /**
     * CmdConfig构造函数
     */
    public CmdConfig() {
        super();
    }  
	
    /**
     * CmdConfig完整的构造函数
     */  
    public CmdConfig(String cmdId,String cmd,String guid){
        this.cmdId = cmdId;
        this.cmd = cmd;
        this.guid = guid;
    }
 
    /**
     * 属性 cmdId 的get方法
     * @return String
     */
    public String getCmdId(){
        return cmdId;
    }
	
    /**
     * 属性 cmdId 的set方法
     * @return
     */
    public void setCmdId(String cmdId){
        this.cmdId = cmdId;
    } 
	
    /**
     * 属性 cmdDescr 的get方法
     * @return String
     */
    public String getCmdDescr(){
        return cmdDescr;
    }
	
    /**
     * 属性 cmdDescr 的set方法
     * @return
     */
    public void setCmdDescr(String cmdDescr){
        this.cmdDescr = cmdDescr;
    } 
	
    /**
     * 属性 cmd 的get方法
     * @return String
     */
    public String getCmd(){
        return cmd;
    }
	
    /**
     * 属性 cmd 的set方法
     * @return
     */
    public void setCmd(String cmd){
        this.cmd = cmd;
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
     * 属性 cmdTimeouts 的get方法
     * @return String
     */
    public String getCmdTimeouts(){
        return cmdTimeouts;
    }
	
    /**
     * 属性 cmdTimeouts 的set方法
     * @return
     */
    public void setCmdTimeouts(String cmdTimeouts){
        this.cmdTimeouts = cmdTimeouts;
    } 
	
    /**
     * 属性 cmdWatch 的get方法
     * @return String
     */
    public String getCmdWatch(){
        return cmdWatch;
    }
	
    /**
     * 属性 cmdWatch 的set方法
     * @return
     */
    public void setCmdWatch(String cmdWatch){
        this.cmdWatch = cmdWatch;
    } 
	
    /**
     * 属性 cmdType 的get方法
     * @return String
     */
    public String getCmdType(){
        return cmdType;
    }
	
    /**
     * 属性 cmdType 的set方法
     * @return
     */
    public void setCmdType(String cmdType){
        this.cmdType = cmdType;
    } 
    
    public String getCmdExplicate() {
		return cmdExplicate;
	}

	public void setCmdExplicate(String cmdExplicate) {
		this.cmdExplicate = cmdExplicate;
	}

	/**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof CmdConfig))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        CmdConfig other = (CmdConfig) o;	        
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
            .append("cmdId"+":"+getCmdId())
            .append("cmdDescr"+":"+getCmdDescr())
            .append("cmd"+":"+getCmd())
            .append("guid"+":"+getGuid())
            .append("cmdTimeouts"+":"+getCmdTimeouts())
            .append("cmdWatch"+":"+getCmdWatch())
            .append("cmdType"+":"+getCmdType())
            .append("cmdExplicate"+":"+getCmdExplicate())
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