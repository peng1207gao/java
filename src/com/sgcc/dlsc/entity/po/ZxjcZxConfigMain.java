package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * ZxjcZxConfigMain的POJO类
 *
 * @author  Administrator  [Wed Apr 23 10:18:50 CST 2014]
 * 
 */
public class ZxjcZxConfigMain implements Serializable{

    /** 
     * 属性objId
     */
    private String objId = "sys_guid()";
	
    /** 
     * 属性callId
     */
    private String callId;
	
    /** 
     * 属性serverId
     */
    private String serverId;
	
    /** 
     * 属性marketIdS
     */
    private String marketIdS;
	
    /** 
     * 属性clientappId
     */
    private String clientappId;
	
    /** 
     * 属性apptype
     */
    private String apptype;
	
    /** 
     * 属性dcExTableId
     */
    private String dcExTableId;
	
    /** 
     * 属性callName
     */
    private String callName;
	
    /** 
     * 属性marketIdT
     */
    private String marketIdT;
	
    /** 
     * 属性ywTableId
     */
    private String ywTableId;
	
    /** 
     * 属性idMarketName
     */
    private String idMarketName;
	
    /** 
     * 属性exType
     */
    private String exType;
	
    /** 
     * 属性keyColumnName
     */
    private String keyColumnName;
	
    /** 
     * 属性zxlsExTableId
     */
    private String zxlsExTableId;
	
    /** 
     * 属性isAutoToYw
     */
    private String isAutoToYw;
	
    /**
     * ZxjcZxConfigMain构造函数
     */
    public ZxjcZxConfigMain() {
        super();
    }  
	
    /**
     * ZxjcZxConfigMain完整的构造函数
     */  
    public ZxjcZxConfigMain(String objId){
        this.objId = objId;
    }
 
    /**
     * 属性 objId 的get方法
     * @return String
     */
    public String getObjId(){
        return objId;
    }
	
    /**
     * 属性 objId 的set方法
     * @return
     */
    public void setObjId(String objId){
        if(objId != null && objId.trim().length() == 0){
            this.objId = null;
        }else{
            this.objId = objId;
        }
    } 
	
    /**
     * 属性 callId 的get方法
     * @return String
     */
    public String getCallId(){
        return callId;
    }
	
    /**
     * 属性 callId 的set方法
     * @return
     */
    public void setCallId(String callId){
        this.callId = callId;
    } 
	
    /**
     * 属性 serverId 的get方法
     * @return String
     */
    public String getServerId(){
        return serverId;
    }
	
    /**
     * 属性 serverId 的set方法
     * @return
     */
    public void setServerId(String serverId){
        this.serverId = serverId;
    } 
	
    /**
     * 属性 marketIdS 的get方法
     * @return String
     */
    public String getMarketIdS(){
        return marketIdS;
    }
	
    /**
     * 属性 marketIdS 的set方法
     * @return
     */
    public void setMarketIdS(String marketIdS){
        this.marketIdS = marketIdS;
    } 
	
    /**
     * 属性 clientappId 的get方法
     * @return String
     */
    public String getClientappId(){
        return clientappId;
    }
	
    /**
     * 属性 clientappId 的set方法
     * @return
     */
    public void setClientappId(String clientappId){
        this.clientappId = clientappId;
    } 
	
    /**
     * 属性 apptype 的get方法
     * @return String
     */
    public String getApptype(){
        return apptype;
    }
	
    /**
     * 属性 apptype 的set方法
     * @return
     */
    public void setApptype(String apptype){
        this.apptype = apptype;
    } 
	
    /**
     * 属性 dcExTableId 的get方法
     * @return String
     */
    public String getDcExTableId(){
        return dcExTableId;
    }
	
    /**
     * 属性 dcExTableId 的set方法
     * @return
     */
    public void setDcExTableId(String dcExTableId){
        this.dcExTableId = dcExTableId;
    } 
	
    /**
     * 属性 callName 的get方法
     * @return String
     */
    public String getCallName(){
        return callName;
    }
	
    /**
     * 属性 callName 的set方法
     * @return
     */
    public void setCallName(String callName){
        this.callName = callName;
    } 
	
    /**
     * 属性 marketIdT 的get方法
     * @return String
     */
    public String getMarketIdT(){
        return marketIdT;
    }
	
    /**
     * 属性 marketIdT 的set方法
     * @return
     */
    public void setMarketIdT(String marketIdT){
        this.marketIdT = marketIdT;
    } 
	
    /**
     * 属性 ywTableId 的get方法
     * @return String
     */
    public String getYwTableId(){
        return ywTableId;
    }
	
    /**
     * 属性 ywTableId 的set方法
     * @return
     */
    public void setYwTableId(String ywTableId){
        this.ywTableId = ywTableId;
    } 
	
    /**
     * 属性 idMarketName 的get方法
     * @return String
     */
    public String getIdMarketName(){
        return idMarketName;
    }
	
    /**
     * 属性 idMarketName 的set方法
     * @return
     */
    public void setIdMarketName(String idMarketName){
        this.idMarketName = idMarketName;
    } 
	
    /**
     * 属性 exType 的get方法
     * @return String
     */
    public String getExType(){
        return exType;
    }
	
    /**
     * 属性 exType 的set方法
     * @return
     */
    public void setExType(String exType){
        this.exType = exType;
    } 
	
    /**
     * 属性 keyColumnName 的get方法
     * @return String
     */
    public String getKeyColumnName(){
        return keyColumnName;
    }
	
    /**
     * 属性 keyColumnName 的set方法
     * @return
     */
    public void setKeyColumnName(String keyColumnName){
        this.keyColumnName = keyColumnName;
    } 
	
    /**
     * 属性 zxlsExTableId 的get方法
     * @return String
     */
    public String getZxlsExTableId(){
        return zxlsExTableId;
    }
	
    /**
     * 属性 zxlsExTableId 的set方法
     * @return
     */
    public void setZxlsExTableId(String zxlsExTableId){
        this.zxlsExTableId = zxlsExTableId;
    } 
	
    /**
     * 属性 isAutoToYw 的get方法
     * @return String
     */
    public String getIsAutoToYw(){
        return isAutoToYw;
    }
	
    /**
     * 属性 isAutoToYw 的set方法
     * @return
     */
    public void setIsAutoToYw(String isAutoToYw){
        this.isAutoToYw = isAutoToYw;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof ZxjcZxConfigMain))
	        return false; 
			
        if(getObjId() == null) 
	        return false;

        ZxjcZxConfigMain other = (ZxjcZxConfigMain) o;	        
	    return new EqualsBuilder()
            .append(this.getObjId(), other.getObjId())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("objId"+":"+getObjId())
            .append("callId"+":"+getCallId())
            .append("serverId"+":"+getServerId())
            .append("marketIdS"+":"+getMarketIdS())
            .append("clientappId"+":"+getClientappId())
            .append("apptype"+":"+getApptype())
            .append("dcExTableId"+":"+getDcExTableId())
            .append("callName"+":"+getCallName())
            .append("marketIdT"+":"+getMarketIdT())
            .append("ywTableId"+":"+getYwTableId())
            .append("idMarketName"+":"+getIdMarketName())
            .append("exType"+":"+getExType())
            .append("keyColumnName"+":"+getKeyColumnName())
            .append("zxlsExTableId"+":"+getZxlsExTableId())
            .append("isAutoToYw"+":"+getIsAutoToYw())
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