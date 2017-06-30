package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * ZxjcDxpConfigMain的POJO类
 *
 * @author  Administrator  [Wed Apr 23 10:02:09 CST 2014]
 * 
 */
public class ZxjcDxpConfigMain implements Serializable{

    /** 
     * 属性objId
     */
    private String objId = "sys_guid()";
	
    /** 
     * 属性callId
     */
    private String callId;
	
    /** 
     * 属性callName
     */
    private String callName;
	
    /** 
     * 属性ywTableId
     */
    private String ywTableId;
	
    /** 
     * 属性zxTableId
     */
    private String zxTableId;
	
    /** 
     * 属性dcTableId
     */
    private String dcTableId;
	
    /** 
     * 属性exType
     */
    private String exType;
	
    /** 
     * 属性callType
     */
    private String callType;
	
    /** 
     * 属性dxpYearCol
     */
    private String dxpYearCol;
	
    /** 
     * 属性dxpMonthCol
     */
    private String dxpMonthCol;
	
    /** 
     * 属性dxpDayCol
     */
    private String dxpDayCol;
	
    /** 
     * 属性dxpDeptCol
     */
    private String dxpDeptCol;
	
    /** 
     * 属性marketIdS
     */
    private String marketIdS;
	
    /** 
     * 属性marketIdT
     */
    private String marketIdT;
	
    /** 
     * 属性dxpTableNumber
     */
    private BigDecimal dxpTableNumber;
	
    /** 
     * 属性keyColumnName
     */
    private String keyColumnName;
	
    /** 
     * 属性isAutoToYw
     */
    private String isAutoToYw;
    
    /** 
     * 属性sqlText
     */
    private String sqlText;
	
    /**
     * ZxjcDxpConfigMain构造函数
     */
    public ZxjcDxpConfigMain() {
        super();
    }  
	
    /**
     * ZxjcDxpConfigMain完整的构造函数
     */  
    public ZxjcDxpConfigMain(String objId,String marketIdS){
        this.objId = objId;
        this.marketIdS = marketIdS;
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
     * 属性 zxTableId 的get方法
     * @return String
     */
    public String getZxTableId(){
        return zxTableId;
    }
	
    /**
     * 属性 zxTableId 的set方法
     * @return
     */
    public void setZxTableId(String zxTableId){
        this.zxTableId = zxTableId;
    } 
	
    /**
     * 属性 dcTableId 的get方法
     * @return String
     */
    public String getDcTableId(){
        return dcTableId;
    }
	
    /**
     * 属性 dcTableId 的set方法
     * @return
     */
    public void setDcTableId(String dcTableId){
        this.dcTableId = dcTableId;
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
     * 属性 callType 的get方法
     * @return String
     */
    public String getCallType(){
        return callType;
    }
	
    /**
     * 属性 callType 的set方法
     * @return
     */
    public void setCallType(String callType){
        this.callType = callType;
    } 
	
    /**
     * 属性 dxpYearCol 的get方法
     * @return String
     */
    public String getDxpYearCol(){
        return dxpYearCol;
    }
	
    /**
     * 属性 dxpYearCol 的set方法
     * @return
     */
    public void setDxpYearCol(String dxpYearCol){
        this.dxpYearCol = dxpYearCol;
    } 
	
    /**
     * 属性 dxpMonthCol 的get方法
     * @return String
     */
    public String getDxpMonthCol(){
        return dxpMonthCol;
    }
	
    /**
     * 属性 dxpMonthCol 的set方法
     * @return
     */
    public void setDxpMonthCol(String dxpMonthCol){
        this.dxpMonthCol = dxpMonthCol;
    } 
	
    /**
     * 属性 dxpDayCol 的get方法
     * @return String
     */
    public String getDxpDayCol(){
        return dxpDayCol;
    }
	
    /**
     * 属性 dxpDayCol 的set方法
     * @return
     */
    public void setDxpDayCol(String dxpDayCol){
        this.dxpDayCol = dxpDayCol;
    } 
	
    /**
     * 属性 dxpDeptCol 的get方法
     * @return String
     */
    public String getDxpDeptCol(){
        return dxpDeptCol;
    }
	
    /**
     * 属性 dxpDeptCol 的set方法
     * @return
     */
    public void setDxpDeptCol(String dxpDeptCol){
        this.dxpDeptCol = dxpDeptCol;
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
     * 属性 dxpTableNumber 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDxpTableNumber(){
        return dxpTableNumber;
    }
	
    /**
     * 属性 dxpTableNumber 的set方法
     * @return
     */
    public void setDxpTableNumber(BigDecimal dxpTableNumber){
        this.dxpTableNumber = dxpTableNumber;
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
		
        if (o == null || !(o instanceof ZxjcDxpConfigMain))
	        return false; 
			
        if(getObjId() == null) 
	        return false;

        ZxjcDxpConfigMain other = (ZxjcDxpConfigMain) o;	        
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
            .append("callName"+":"+getCallName())
            .append("ywTableId"+":"+getYwTableId())
            .append("zxTableId"+":"+getZxTableId())
            .append("dcTableId"+":"+getDcTableId())
            .append("exType"+":"+getExType())
            .append("callType"+":"+getCallType())
            .append("dxpYearCol"+":"+getDxpYearCol())
            .append("dxpMonthCol"+":"+getDxpMonthCol())
            .append("dxpDayCol"+":"+getDxpDayCol())
            .append("dxpDeptCol"+":"+getDxpDeptCol())
            .append("marketIdS"+":"+getMarketIdS())
            .append("marketIdT"+":"+getMarketIdT())
            .append("dxpTableNumber"+":"+getDxpTableNumber())
            .append("keyColumnName"+":"+getKeyColumnName())
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