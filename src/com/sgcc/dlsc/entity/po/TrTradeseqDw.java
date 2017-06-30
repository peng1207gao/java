package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TrTradeseqDw的POJO类
 *
 * @author  Barca  [Thu Sep 26 17:41:07 CST 2013]
 * 
 */
public class TrTradeseqDw implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性jyxl
     */
    private String jyxl;
	
    /** 
     * 属性dw
     */
    private String dw;
	
    /** 
     * 属性dwtype
     */
    private BigDecimal dwtype;
	
    /** 
     * 属性bm1
     */
    private String bm1;
	
    /** 
     * 属性bm2
     */
    private String bm2;
	
    /** 
     * 属性bm3
     */
    private String bm3;
	
    /** 
     * 属性bm1p
     */
    private String bm1p;
	
    /** 
     * 属性bm2p
     */
    private String bm2p;
	
    /** 
     * 属性bm3p
     */
    private String bm3p;
	
    /** 
     * 属性bm1d
     */
    private Date bm1d;
	
    /** 
     * 属性bm2d
     */
    private Date bm2d;
	
    /** 
     * 属性bm3d
     */
    private Date bm3d;
	
    /**
     * TrTradeseqDw构造函数
     */
    public TrTradeseqDw() {
        super();
    }  
	
    /**
     * TrTradeseqDw完整的构造函数
     */  
    public TrTradeseqDw(String guid){
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
     * 属性 jyxl 的get方法
     * @return String
     */
    public String getJyxl(){
        return jyxl;
    }
	
    /**
     * 属性 jyxl 的set方法
     * @return
     */
    public void setJyxl(String jyxl){
        this.jyxl = jyxl;
    } 
	
    /**
     * 属性 dw 的get方法
     * @return String
     */
    public String getDw(){
        return dw;
    }
	
    /**
     * 属性 dw 的set方法
     * @return
     */
    public void setDw(String dw){
        this.dw = dw;
    } 
	
    /**
     * 属性 dwtype 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDwtype(){
        return dwtype;
    }
	
    /**
     * 属性 dwtype 的set方法
     * @return
     */
    public void setDwtype(BigDecimal dwtype){
        this.dwtype = dwtype;
    } 
	
    /**
     * 属性 bm1 的get方法
     * @return String
     */
    public String getBm1(){
        return bm1;
    }
	
    /**
     * 属性 bm1 的set方法
     * @return
     */
    public void setBm1(String bm1){
        this.bm1 = bm1;
    } 
	
    /**
     * 属性 bm2 的get方法
     * @return String
     */
    public String getBm2(){
        return bm2;
    }
	
    /**
     * 属性 bm2 的set方法
     * @return
     */
    public void setBm2(String bm2){
        this.bm2 = bm2;
    } 
	
    /**
     * 属性 bm3 的get方法
     * @return String
     */
    public String getBm3(){
        return bm3;
    }
	
    /**
     * 属性 bm3 的set方法
     * @return
     */
    public void setBm3(String bm3){
        this.bm3 = bm3;
    } 
	
    /**
     * 属性 bm1p 的get方法
     * @return String
     */
    public String getBm1p(){
        return bm1p;
    }
	
    /**
     * 属性 bm1p 的set方法
     * @return
     */
    public void setBm1p(String bm1p){
        this.bm1p = bm1p;
    } 
	
    /**
     * 属性 bm2p 的get方法
     * @return String
     */
    public String getBm2p(){
        return bm2p;
    }
	
    /**
     * 属性 bm2p 的set方法
     * @return
     */
    public void setBm2p(String bm2p){
        this.bm2p = bm2p;
    } 
	
    /**
     * 属性 bm3p 的get方法
     * @return String
     */
    public String getBm3p(){
        return bm3p;
    }
	
    /**
     * 属性 bm3p 的set方法
     * @return
     */
    public void setBm3p(String bm3p){
        this.bm3p = bm3p;
    } 
	
    /**
     * 属性 bm1d 的get方法
     * @return Date
     */
    public Date getBm1d(){
        return bm1d;
    }
	
    /**
     * 属性 bm1d 的set方法
     * @return
     */
    public void setBm1d(Date bm1d){
        this.bm1d = bm1d;
    } 
	
    /**
     * 属性 bm2d 的get方法
     * @return Date
     */
    public Date getBm2d(){
        return bm2d;
    }
	
    /**
     * 属性 bm2d 的set方法
     * @return
     */
    public void setBm2d(Date bm2d){
        this.bm2d = bm2d;
    } 
	
    /**
     * 属性 bm3d 的get方法
     * @return Date
     */
    public Date getBm3d(){
        return bm3d;
    }
	
    /**
     * 属性 bm3d 的set方法
     * @return
     */
    public void setBm3d(Date bm3d){
        this.bm3d = bm3d;
    } 
	
    //标识从表是否被删除
    private String isDelete;
	
    public String getIsDelete() {
	    return isDelete;
    }

    public void setIsDelete(String isDelete) {
	    this.isDelete = isDelete;
    }
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof TrTradeseqDw))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        TrTradeseqDw other = (TrTradeseqDw) o;	        
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
            .append("jyxl"+":"+getJyxl())
            .append("dw"+":"+getDw())
            .append("dwtype"+":"+getDwtype())
            .append("bm1"+":"+getBm1())
            .append("bm2"+":"+getBm2())
            .append("bm3"+":"+getBm3())
            .append("bm1p"+":"+getBm1p())
            .append("bm2p"+":"+getBm2p())
            .append("bm3p"+":"+getBm3p())
            .append("bm1d"+":"+getBm1d())
            .append("bm2d"+":"+getBm2d())
            .append("bm3d"+":"+getBm3d())
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