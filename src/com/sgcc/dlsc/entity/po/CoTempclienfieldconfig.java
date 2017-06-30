package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * CoTempclienfieldconfig的POJO类
 *
 * @author  thinpad  [Wed Feb 19 17:45:24 CST 2014]
 * 
 */
public class CoTempclienfieldconfig implements Serializable{

    /** 
     * 属性sheetid
     */
    private String sheetid;
	
    /** 
     * 属性canSheetid
     */
    private String canSheetid;
	
    /** 
     * 属性configFieldName
     */
    private String configFieldName;
	
    /** 
     * 属性personid
     */
    private String personid;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性updatedate
     */
    private Date updatedate;
	
    /** 
     * 属性contracttemplatecode
     */
    private String contracttemplatecode;
	
    /**
     * CoTempclienfieldconfig构造函数
     */
    public CoTempclienfieldconfig() {
        super();
    }  
	
    /**
     * CoTempclienfieldconfig完整的构造函数
     */  
    public CoTempclienfieldconfig(String sheetid){
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
     * 属性 canSheetid 的get方法
     * @return String
     */
    public String getCanSheetid(){
        return canSheetid;
    }
	
    /**
     * 属性 canSheetid 的set方法
     * @return
     */
    public void setCanSheetid(String canSheetid){
        this.canSheetid = canSheetid;
    } 
	
	
	
    /**
     * 属性 configFieldName 的get方法
     * @return String
     */
    public String getConfigFieldName(){
        return configFieldName;
    }
	
    /**
     * 属性 configFieldName 的set方法
     * @return
     */
    public void setConfigFieldName(String configFieldName){
        this.configFieldName = configFieldName;
    } 
	
	
	
    /**
     * 属性 personid 的get方法
     * @return String
     */
    public String getPersonid(){
        return personid;
    }
	
    /**
     * 属性 personid 的set方法
     * @return
     */
    public void setPersonid(String personid){
        this.personid = personid;
    } 
	
	
	
    /**
     * 属性 marketid 的get方法
     * @return String
     */
    public String getMarketid(){
        return marketid;
    }
	
    /**
     * 属性 marketid 的set方法
     * @return
     */
    public void setMarketid(String marketid){
        this.marketid = marketid;
    } 
	
	
	
    /**
     * 属性 updatedate 的get方法
     * @return Date
     */
    public Date getUpdatedate(){
        return updatedate;
    }
	
    /**
     * 属性 updatedate 的set方法
     * @return
     */
    public void setUpdatedate(Date updatedate){
        this.updatedate = updatedate;
    } 
	
	
	
    /**
     * 属性 contracttemplatecode 的get方法
     * @return String
     */
    public String getContracttemplatecode(){
        return contracttemplatecode;
    }
	
    /**
     * 属性 contracttemplatecode 的set方法
     * @return
     */
    public void setContracttemplatecode(String contracttemplatecode){
        this.contracttemplatecode = contracttemplatecode;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof CoTempclienfieldconfig))
	        return false; 
			
        if(getSheetid() == null) 
	        return false;

        CoTempclienfieldconfig other = (CoTempclienfieldconfig) o;	        
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
            .append("canSheetid"+":"+getCanSheetid())
            .append("configFieldName"+":"+getConfigFieldName())
            .append("personid"+":"+getPersonid())
            .append("marketid"+":"+getMarketid())
            .append("updatedate"+":"+getUpdatedate())
            .append("contracttemplatecode"+":"+getContracttemplatecode())
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