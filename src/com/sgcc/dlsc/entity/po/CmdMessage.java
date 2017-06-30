package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * CmdMessage的POJO类
 *
 * @author  sss  [Fri Nov 29 11:17:41 CST 2013]
 * 
 */
public class CmdMessage implements Serializable{

    /** 
     * 属性id
     */
    private String id;
	
    /** 
     * 属性cmdId
     */
    private String cmdId;
	
    /** 
     * 属性cmdDescr
     */
    private String cmdDescr;
	
    /** 
     * 属性cmdMsg
     */
    private String cmdMsg;
	
    /** 
     * 属性position
     */
    private BigDecimal position;
	
    /** 
     * 属性userId
     */
    private String userId;
	
    /** 
     * 属性userName
     */
    private String userName;
	
    /** 
     * 属性actTime
     */
    private String actTime;
	
    /**
     * CmdMessage构造函数
     */
    public CmdMessage() {
        super();
    }  
	
    /**
     * CmdMessage完整的构造函数
     */  
    public CmdMessage(String id){
        this.id = id;
    }
 
	
	
    /**
     * 属性 id 的get方法
     * @return String
     */
    public String getId(){
        return id;
    }
	
    /**
     * 属性 id 的set方法
     * @return
     */
    public void setId(String id){
        if(id != null && id.trim().length() == 0){
            this.id = null;
        }else{
            this.id = id;
        }
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
     * 属性 cmdMsg 的get方法
     * @return String
     */
    public String getCmdMsg(){
        return cmdMsg;
    }
	
    /**
     * 属性 cmdMsg 的set方法
     * @return
     */
    public void setCmdMsg(String cmdMsg){
        this.cmdMsg = cmdMsg;
    } 
	
	
	
    /**
     * 属性 position 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPosition(){
        return position;
    }
	
    /**
     * 属性 position 的set方法
     * @return
     */
    public void setPosition(BigDecimal position){
        this.position = position;
    } 
	
	
	
    /**
     * 属性 userId 的get方法
     * @return String
     */
    public String getUserId(){
        return userId;
    }
	
    /**
     * 属性 userId 的set方法
     * @return
     */
    public void setUserId(String userId){
        this.userId = userId;
    } 
	
	
	
    /**
     * 属性 userName 的get方法
     * @return String
     */
    public String getUserName(){
        return userName;
    }
	
    /**
     * 属性 userName 的set方法
     * @return
     */
    public void setUserName(String userName){
        this.userName = userName;
    } 
	
	
	
    /**
     * 属性 actTime 的get方法
     * @return String
     */
    public String getActTime(){
        return actTime;
    }
	
    /**
     * 属性 actTime 的set方法
     * @return
     */
    public void setActTime(String actTime){
        this.actTime = actTime;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof CmdMessage))
	        return false; 
			
        if(getId() == null) 
	        return false;

        CmdMessage other = (CmdMessage) o;	        
	    return new EqualsBuilder()
            .append(this.getId(), other.getId())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("id"+":"+getId())
            .append("cmdId"+":"+getCmdId())
            .append("cmdDescr"+":"+getCmdDescr())
            .append("cmdMsg"+":"+getCmdMsg())
            .append("position"+":"+getPosition())
            .append("userId"+":"+getUserId())
            .append("userName"+":"+getUserName())
            .append("actTime"+":"+getActTime())
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