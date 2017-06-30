package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

/**
 * BaGeographicalregion的POJO类
 *
 * @author  Administrator  [Thu Jan 23 11:08:53 CST 2014]
 * 
 */
public class BaGeographicalregion implements Serializable{

    /** 
     * 属性geogrregionid
     */
    private String geogrregionid;
	
    /** 
     * 属性geogrregionname
     */
    private String geogrregionname;
	
    /** 
     * 属性aliasname
     */
    private String aliasname;
	
    /** 
     * 属性suppergeogrregionid
     */
    private String suppergeogrregionid;
	
    /** 
     * 属性geogrregioncode
     */
    private String geogrregioncode;
	
    /** 
     * 属性starteffectivedate
     */
    private Date starteffectivedate;
	
    /** 
     * 属性endeffectivedate
     */
    private Date endeffectivedate;
	
    /** 
     * 属性updatetime
     */
    private Date updatetime;
	
    /** 
     * 属性updatepersonid
     */
    private String updatepersonid;
	
    /** 
     * 属性isdelete
     */
    private BigDecimal isdelete;
	
    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性ordernum
     */
    private BigDecimal ordernum;
	
    /**
     * BaGeographicalregion构造函数
     */
    public BaGeographicalregion() {
        super();
    }  
	
    /**
     * BaGeographicalregion完整的构造函数
     */  
    public BaGeographicalregion(String geogrregionid,String geogrregionname,String geogrregioncode,Date starteffectivedate,BigDecimal isdelete){
        this.geogrregionid = geogrregionid;
        this.geogrregionname = geogrregionname;
        this.geogrregioncode = geogrregioncode;
        this.starteffectivedate = starteffectivedate;
        this.isdelete = isdelete;
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
     * 属性 aliasname 的get方法
     * @return String
     */
    public String getAliasname(){
        return aliasname;
    }
	
    /**
     * 属性 aliasname 的set方法
     * @return
     */
    public void setAliasname(String aliasname){
        this.aliasname = aliasname;
    } 
	
	
	
    /**
     * 属性 suppergeogrregionid 的get方法
     * @return String
     */
    public String getSuppergeogrregionid(){
        return suppergeogrregionid;
    }
	
    /**
     * 属性 suppergeogrregionid 的set方法
     * @return
     */
    public void setSuppergeogrregionid(String suppergeogrregionid){
        this.suppergeogrregionid = suppergeogrregionid;
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
     * 属性 starteffectivedate 的get方法
     * @return Date
     */
    public Date getStarteffectivedate(){
        return starteffectivedate;
    }
	
    /**
     * 属性 starteffectivedate 的set方法
     * @return
     */
    public void setStarteffectivedate(Date starteffectivedate){
        this.starteffectivedate = starteffectivedate;
    } 
	
	
	
    /**
     * 属性 endeffectivedate 的get方法
     * @return Date
     */
    public Date getEndeffectivedate(){
        return endeffectivedate;
    }
	
    /**
     * 属性 endeffectivedate 的set方法
     * @return
     */
    public void setEndeffectivedate(Date endeffectivedate){
        this.endeffectivedate = endeffectivedate;
    } 
	
	
	
    /**
     * 属性 updatetime 的get方法
     * @return Date
     */
    public Date getUpdatetime(){
        return updatetime;
    }
	
    /**
     * 属性 updatetime 的set方法
     * @return
     */
    public void setUpdatetime(Date updatetime){
        this.updatetime = updatetime;
    } 
	
	
	
    /**
     * 属性 updatepersonid 的get方法
     * @return String
     */
    public String getUpdatepersonid(){
        return updatepersonid;
    }
	
    /**
     * 属性 updatepersonid 的set方法
     * @return
     */
    public void setUpdatepersonid(String updatepersonid){
        this.updatepersonid = updatepersonid;
    } 
	
	
	
    /**
     * 属性 isdelete 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsdelete(){
        return isdelete;
    }
	
    /**
     * 属性 isdelete 的set方法
     * @return
     */
    public void setIsdelete(BigDecimal isdelete){
        this.isdelete = isdelete;
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
        this.guid = guid;
    } 
	
	
	
    /**
     * 属性 ordernum 的get方法
     * @return BigDecimal
     */
    public BigDecimal getOrdernum(){
        return ordernum;
    }
	
    /**
     * 属性 ordernum 的set方法
     * @return
     */
    public void setOrdernum(BigDecimal ordernum){
        this.ordernum = ordernum;
    } 
	
	/**
     * 从表信息baGeographicalregions
     */
	private Set baGeographicalregions = new HashSet();
	
	/**
     * 从表baGeographicalregions的add方法
     */
    public void addBaGeographicalregion(Object baGeographicalregion){
        this.baGeographicalregions.add(baGeographicalregion);
    }
   
    /**
     * 从表baGeographicalregions的get方法
     */
    public Set getBaGeographicalregions(){
        return this.baGeographicalregions;
    } 
   
    /**
     * 从表baGeographicalregions的set方法
     */
    public void setBaGeographicalregions(Set baGeographicalregions){
        this.baGeographicalregions = baGeographicalregions;
    }    
    
    /**
     * 从表baGeographicalregions的remove方法
     */
	 public void removeBaGeographicalregion(Object baGeographicalregion){
		 this.baGeographicalregions.remove(baGeographicalregion);
	 } 
	
	/**
	 * 在主表中增加从表记录
     * @param arg0 
     */
    public void setAddGridDetail(String[] arg0) {
        if( arg0 == null ) return;

        int itemNum0 = Integer.parseInt(arg0[0]);
        for (int i = 0; i < itemNum0; i++) {
		    BaGeographicalregion baGeographicalregion = new BaGeographicalregion();
		    this.baGeographicalregions.add(baGeographicalregion);
        }
    }	
	
	/**
	 * 返回从表记录集合
	 */
	public Set[] getSets() {
     	return new Set[]{};
	}
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaGeographicalregion))
	        return false; 
			
        if(getGeogrregionid() == null) 
	        return false;

        BaGeographicalregion other = (BaGeographicalregion) o;	        
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
            .append("aliasname"+":"+getAliasname())
            .append("suppergeogrregionid"+":"+getSuppergeogrregionid())
            .append("geogrregioncode"+":"+getGeogrregioncode())
            .append("starteffectivedate"+":"+getStarteffectivedate())
            .append("endeffectivedate"+":"+getEndeffectivedate())
            .append("updatetime"+":"+getUpdatetime())
            .append("updatepersonid"+":"+getUpdatepersonid())
            .append("isdelete"+":"+getIsdelete())
            .append("guid"+":"+getGuid())
            .append("ordernum"+":"+getOrdernum())
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