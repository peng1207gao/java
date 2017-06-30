package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaExcel的POJO类
 *
 * @author  Administrator  [Wed Jul 17 16:32:29 CST 2013]
 * 
 */
public class BaExcel implements Serializable{

    /**
	 * @description 
	 */
	private static final long serialVersionUID = 1L;

	/** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性marketcode
     */
    private String marketcode;
	
    /** 
     * 属性balance
     */
    private String balance;
    
    private String filename;
	
    /** 
     * 属性baTable
     */
    private String baTable;
	
    /** 
     * 属性baScript
     */
    private String baScript;
	
    /** 
     * 属性baFile
     */
    private byte[] baFile;
	
    /**
     * BaExcel构造函数
     */
    public BaExcel() {
        super();
    }  
	
    /**
     * BaExcel完整的构造函数
     */  
    public BaExcel(String guid,String marketcode){
        this.guid = guid;
        this.marketcode = marketcode;
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
     * 属性 marketcode 的get方法
     * @return String
     */
    public String getMarketcode(){
        return marketcode;
    }
	
    /**
     * 属性 marketcode 的set方法
     * @return
     */
    public void setMarketcode(String marketcode){
        this.marketcode = marketcode;
    } 
	
    /**
     * 属性 balance 的get方法
     * @return String
     */
    public String getBalance(){
        return balance;
    }
	
    public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	/**
     * 属性 balance 的set方法
     * @return
     */
    public void setBalance(String balance){
        this.balance = balance;
    } 
	
    /**
     * 属性 baTable 的get方法
     * @return String
     */
    public String getBaTable(){
        return baTable;
    }
	
    /**
     * 属性 baTable 的set方法
     * @return
     */
    public void setBaTable(String baTable){
        this.baTable = baTable;
    } 
	
    /**
     * 属性 baScript 的get方法
     * @return String
     */
    public String getBaScript(){
        return baScript;
    }
	
    /**
     * 属性 baScript 的set方法
     * @return
     */
    public void setBaScript(String baScript){
        this.baScript = baScript;
    } 
	
    /**
     * 属性 baFile 的get方法
     * @return byte[]
     */
    public byte[] getBaFile(){
        return baFile;
    }
	
    /**
     * 属性 baFile 的set方法
     * @return
     */
    public void setBaFile(byte[] baFile){
        this.baFile = baFile;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaExcel))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaExcel other = (BaExcel) o;	        
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
            .append("marketcode"+":"+getMarketcode())
            .append("balance"+":"+getBalance())
            .append("baTable"+":"+getBaTable())
            .append("baScript"+":"+getBaScript())
            .append("baFile"+":"+getBaFile())
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