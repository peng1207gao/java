package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * DwGeographicalregion的POJO类
 *
 * @author  zndw0  [Wed Mar 12 11:17:14 CST 2014]
 * 
 */
public class DwGeographicalregion implements Serializable{

    /** 
     * 属性geogrregionid
     */
    private String geogrregionid;
	
    /** 
     * 属性geogrregionname
     */
    private String geogrregionname;
	
    /** 
     * 属性geogrregionalias
     */
    private String geogrregionalias;
	
    /** 
     * 属性parentregionid
     */
    private String parentregionid;
	
    /** 
     * 属性geogrregioncode
     */
    private String geogrregioncode;
	
    /**
     * DwGeographicalregion构造函数
     */
    public DwGeographicalregion() {
        super();
    }  
	
    /**
     * DwGeographicalregion完整的构造函数
     */  
    public DwGeographicalregion(String geogrregionid,String geogrregionname){
        this.geogrregionid = geogrregionid;
        this.geogrregionname = geogrregionname;
    }
 
    /**
     * 属性 geogrregionid 的get方法
     * @return String
     */
    public String getGeogrregionid(){
        return geogrregionid;
    }
	
    /**
     * 属性 geogrregionid 的set方法
     * @return
     */
    public void setGeogrregionid(String geogrregionid){
        if(geogrregionid != null && geogrregionid.trim().length() == 0){
            this.geogrregionid = null;
        }else{
            this.geogrregionid = geogrregionid;
        }
    } 
	
    /**
     * 属性 geogrregionname 的get方法
     * @return String
     */
    public String getGeogrregionname(){
        return geogrregionname;
    }
	
    /**
     * 属性 geogrregionname 的set方法
     * @return
     */
    public void setGeogrregionname(String geogrregionname){
        this.geogrregionname = geogrregionname;
    } 
	
    /**
     * 属性 geogrregionalias 的get方法
     * @return String
     */
    public String getGeogrregionalias(){
        return geogrregionalias;
    }
	
    /**
     * 属性 geogrregionalias 的set方法
     * @return
     */
    public void setGeogrregionalias(String geogrregionalias){
        this.geogrregionalias = geogrregionalias;
    } 
	
    /**
     * 属性 parentregionid 的get方法
     * @return String
     */
    public String getParentregionid(){
        return parentregionid;
    }
	
    /**
     * 属性 parentregionid 的set方法
     * @return
     */
    public void setParentregionid(String parentregionid){
        this.parentregionid = parentregionid;
    } 
	
    /**
     * 属性 geogrregioncode 的get方法
     * @return String
     */
    public String getGeogrregioncode(){
        return geogrregioncode;
    }
	
    /**
     * 属性 geogrregioncode 的set方法
     * @return
     */
    public void setGeogrregioncode(String geogrregioncode){
        this.geogrregioncode = geogrregioncode;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof DwGeographicalregion))
	        return false; 
			
        if(getGeogrregionid() == null) 
	        return false;

        DwGeographicalregion other = (DwGeographicalregion) o;	        
	    return new EqualsBuilder()
            .append(this.getGeogrregionid(), other.getGeogrregionid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("geogrregionid"+":"+getGeogrregionid())
            .append("geogrregionname"+":"+getGeogrregionname())
            .append("geogrregionalias"+":"+getGeogrregionalias())
            .append("parentregionid"+":"+getParentregionid())
            .append("geogrregioncode"+":"+getGeogrregioncode())
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