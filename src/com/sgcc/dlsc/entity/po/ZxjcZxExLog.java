package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * ZxjcZxExLog的POJO类
 *
 * @author  Administrator  [Wed Apr 23 10:24:28 CST 2014]
 * 
 */
public class ZxjcZxExLog implements Serializable{

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
     * 属性clientappId
     */
    private String clientappId;
	
    /** 
     * 属性apptype
     */
    private String apptype;
	
    /** 
     * 属性callName
     */
    private String callName;
	
    /** 
     * 属性exTime
     */
    private String exTime;
	
    /** 
     * 属性exUserid
     */
    private String exUserid;
	
    /** 
     * 属性exUsername
     */
    private String exUsername;
	
    /** 
     * 属性isSuc
     */
    private String isSuc;
	
    /** 
     * 属性failInfo
     */
    private String failInfo;
	
    /** 
     * 属性marketIdS
     */
    private String marketIdS;
	
    /** 
     * 属性dcExTableId
     */
    private String dcExTableId;
	
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
     * 属性sqlText
     */
    private String sqlText;
	
    /** 
     * 属性keyColumnName
     */
    private String keyColumnName;
	
    /** 
     * 属性exTimelong
     */
    private BigDecimal exTimelong;
	
    /** 
     * 属性zxlsExTableId
     */
    private String zxlsExTableId;
	
    /** 
     * 属性exTimelongFb
     */
    private String exTimelongFb;
	
    /** 
     * 属性exNumber
     */
    private BigDecimal exNumber;
	
    /** 
     * 属性configObjId
     */
    private String configObjId;
	
    /**
     * ZxjcZxExLog构造函数
     */
    public ZxjcZxExLog() {
        super();
    }  
	
    /**
     * ZxjcZxExLog完整的构造函数
     */  
    public ZxjcZxExLog(String objId){
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
     * 属性 exTime 的get方法
     * @return Date
     */
    public String getExTime(){
        return exTime;
    }
	
    /**
     * 属性 exTime 的set方法
     * @return
     */
    public void setExTime(String exTime){
        this.exTime = exTime;
    } 
	
    /**
     * 属性 exUserid 的get方法
     * @return String
     */
    public String getExUserid(){
        return exUserid;
    }
	
    /**
     * 属性 exUserid 的set方法
     * @return
     */
    public void setExUserid(String exUserid){
        this.exUserid = exUserid;
    } 
	
    /**
     * 属性 exUsername 的get方法
     * @return String
     */
    public String getExUsername(){
        return exUsername;
    }
	
    /**
     * 属性 exUsername 的set方法
     * @return
     */
    public void setExUsername(String exUsername){
        this.exUsername = exUsername;
    } 
	
    /**
     * 属性 isSuc 的get方法
     * @return String
     */
    public String getIsSuc(){
        return isSuc;
    }
	
    /**
     * 属性 isSuc 的set方法
     * @return
     */
    public void setIsSuc(String isSuc){
        this.isSuc = isSuc;
    } 
	
    /**
     * 属性 failInfo 的get方法
     * @return String
     */
    public String getFailInfo(){
        return failInfo;
    }
	
    /**
     * 属性 failInfo 的set方法
     * @return
     */
    public void setFailInfo(String failInfo){
        this.failInfo = failInfo;
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
     * 属性 sqlText 的get方法
     * @return String
     */
    public String getSqlText(){
        return sqlText;
    }
	
    /**
     * 属性 sqlText 的set方法
     * @return
     */
    public void setSqlText(String sqlText){
        this.sqlText = sqlText;
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
     * 属性 exTimelong 的get方法
     * @return BigDecimal
     */
    public BigDecimal getExTimelong(){
        return exTimelong;
    }
	
    /**
     * 属性 exTimelong 的set方法
     * @return
     */
    public void setExTimelong(BigDecimal exTimelong){
        this.exTimelong = exTimelong;
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
     * 属性 exTimelongFb 的get方法
     * @return String
     */
    public String getExTimelongFb(){
        return exTimelongFb;
    }
	
    /**
     * 属性 exTimelongFb 的set方法
     * @return
     */
    public void setExTimelongFb(String exTimelongFb){
        this.exTimelongFb = exTimelongFb;
    } 
	
    /**
     * 属性 exNumber 的get方法
     * @return BigDecimal
     */
    public BigDecimal getExNumber(){
        return exNumber;
    }
	
    /**
     * 属性 exNumber 的set方法
     * @return
     */
    public void setExNumber(BigDecimal exNumber){
        this.exNumber = exNumber;
    } 
	
    /**
     * 属性 configObjId 的get方法
     * @return String
     */
    public String getConfigObjId(){
        return configObjId;
    }
	
    /**
     * 属性 configObjId 的set方法
     * @return
     */
    public void setConfigObjId(String configObjId){
        this.configObjId = configObjId;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof ZxjcZxExLog))
	        return false; 
			
        if(getObjId() == null) 
	        return false;

        ZxjcZxExLog other = (ZxjcZxExLog) o;	        
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
            .append("clientappId"+":"+getClientappId())
            .append("apptype"+":"+getApptype())
            .append("callName"+":"+getCallName())
            .append("exTime"+":"+getExTime())
            .append("exUserid"+":"+getExUserid())
            .append("exUsername"+":"+getExUsername())
            .append("isSuc"+":"+getIsSuc())
            .append("failInfo"+":"+getFailInfo())
            .append("marketIdS"+":"+getMarketIdS())
            .append("dcExTableId"+":"+getDcExTableId())
            .append("marketIdT"+":"+getMarketIdT())
            .append("ywTableId"+":"+getYwTableId())
            .append("idMarketName"+":"+getIdMarketName())
            .append("exType"+":"+getExType())
            .append("sqlText"+":"+getSqlText())
            .append("keyColumnName"+":"+getKeyColumnName())
            .append("exTimelong"+":"+getExTimelong())
            .append("zxlsExTableId"+":"+getZxlsExTableId())
            .append("exTimelongFb"+":"+getExTimelongFb())
            .append("exNumber"+":"+getExNumber())
            .append("configObjId"+":"+getConfigObjId())
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