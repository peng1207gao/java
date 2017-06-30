package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaInterfaceconfigModule的POJO类
 *
 * @author  Administrator  [Wed Jan 22 17:24:09 CST 2014]
 * 
 */
public class BaInterfaceconfigModule implements Serializable{

    /** 
     * 属性sheetid
     */
    private String sheetid;
	
    /** 
     * 属性moduleName
     */
    private String moduleName;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性interfaceid
     */
    private String interfaceid;
	
    /** 
     * 属性interfacename
     */
    private String interfacename;
	
    /** 
     * 属性displayitemname
     */
    private String displayitemname;
	
    /** 
     * 属性isdisplay
     */
    private BigDecimal isdisplay;
	
    /** 
     * 属性displayitemid
     */
    private String displayitemid;
	
    /** 
     * 属性cotype
     */
    private String cotype;
	
    /** 
     * 属性grade
     */
    private BigDecimal grade;
	
    /** 
     * 属性moduleVersion
     */
    private String moduleVersion;
	
    /** 
     * 属性moduleKey
     */
    private String moduleKey;
	
    /** 
     * 属性state
     */
    private BigDecimal state;
	
    /** 
     * 属性isshare
     */
    private BigDecimal isshare;
    private BigDecimal orderby;
    private BigDecimal readOnly;
    /**
     * BaInterfaceconfigModule构造函数
     */
    public BaInterfaceconfigModule() {
        super();
    }  
	
    public BigDecimal getReadOnly() {
		return readOnly;
	}

	public void setReadOnly(BigDecimal readOnly) {
		this.readOnly = readOnly;
	}

	/**
     * BaInterfaceconfigModule完整的构造函数
     */  
    public BaInterfaceconfigModule(String sheetid){
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
     * 属性 moduleName 的get方法
     * @return String
     */
    public String getModuleName(){
        return moduleName;
    }
	
    /**
     * 属性 moduleName 的set方法
     * @return
     */
    public void setModuleName(String moduleName){
        this.moduleName = moduleName;
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
     * 属性 interfaceid 的get方法
     * @return String
     */
    public String getInterfaceid(){
        return interfaceid;
    }
	
    /**
     * 属性 interfaceid 的set方法
     * @return
     */
    public void setInterfaceid(String interfaceid){
        this.interfaceid = interfaceid;
    } 
	
    /**
     * 属性 interfacename 的get方法
     * @return String
     */
    public String getInterfacename(){
        return interfacename;
    }
	
    /**
     * 属性 interfacename 的set方法
     * @return
     */
    public void setInterfacename(String interfacename){
        this.interfacename = interfacename;
    } 
	
    /**
     * 属性 displayitemname 的get方法
     * @return String
     */
    public String getDisplayitemname(){
        return displayitemname;
    }
	
    /**
     * 属性 displayitemname 的set方法
     * @return
     */
    public void setDisplayitemname(String displayitemname){
        this.displayitemname = displayitemname;
    } 
	
    /**
     * 属性 isdisplay 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsdisplay(){
        return isdisplay;
    }
	
    /**
     * 属性 isdisplay 的set方法
     * @return
     */
    public void setIsdisplay(BigDecimal isdisplay){
        this.isdisplay = isdisplay;
    } 
	
    /**
     * 属性 displayitemid 的get方法
     * @return String
     */
    public String getDisplayitemid(){
        return displayitemid;
    }
	
    /**
     * 属性 displayitemid 的set方法
     * @return
     */
    public void setDisplayitemid(String displayitemid){
        this.displayitemid = displayitemid;
    } 
	
    /**
     * 属性 cotype 的get方法
     * @return String
     */
    public String getCotype(){
        return cotype;
    }
	
    /**
     * 属性 cotype 的set方法
     * @return
     */
    public void setCotype(String cotype){
        this.cotype = cotype;
    } 
	
    /**
     * 属性 grade 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGrade(){
        return grade;
    }
	
    /**
     * 属性 grade 的set方法
     * @return
     */
    public void setGrade(BigDecimal grade){
        this.grade = grade;
    } 
	
    /**
     * 属性 moduleVersion 的get方法
     * @return String
     */
    public String getModuleVersion(){
        return moduleVersion;
    }
	
    /**
     * 属性 moduleVersion 的set方法
     * @return
     */
    public void setModuleVersion(String moduleVersion){
        this.moduleVersion = moduleVersion;
    } 
	
    /**
     * 属性 moduleKey 的get方法
     * @return String
     */
    public String getModuleKey(){
        return moduleKey;
    }
	
    /**
     * 属性 moduleKey 的set方法
     * @return
     */
    public void setModuleKey(String moduleKey){
        this.moduleKey = moduleKey;
    } 
	
    /**
     * 属性 state 的get方法
     * @return BigDecimal
     */
    public BigDecimal getState(){
        return state;
    }
	
    /**
     * 属性 state 的set方法
     * @return
     */
    public void setState(BigDecimal state){
        this.state = state;
    } 
	
    /**
     * 属性 isshare 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsshare(){
        return isshare;
    }
	
    /**
     * 属性 isshare 的set方法
     * @return
     */
    public void setIsshare(BigDecimal isshare){
        this.isshare = isshare;
    } 
    public BigDecimal getOrderby(){
        return orderby;
    }
	
    /**
     * 属性 isshare 的set方法
     * @return
     */
    public void setOrderby(BigDecimal orderby){
        this.orderby = orderby;
    } 
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaInterfaceconfigModule))
	        return false; 
			
        if(getSheetid() == null) 
	        return false;

        BaInterfaceconfigModule other = (BaInterfaceconfigModule) o;	        
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
            .append("moduleName"+":"+getModuleName())
            .append("marketid"+":"+getMarketid())
            .append("interfaceid"+":"+getInterfaceid())
            .append("interfacename"+":"+getInterfacename())
            .append("displayitemname"+":"+getDisplayitemname())
            .append("isdisplay"+":"+getIsdisplay())
            .append("displayitemid"+":"+getDisplayitemid())
            .append("cotype"+":"+getCotype())
            .append("grade"+":"+getGrade())
            .append("moduleVersion"+":"+getModuleVersion())
            .append("moduleKey"+":"+getModuleKey())
            .append("state"+":"+getState())
            .append("isshare"+":"+getIsshare())
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