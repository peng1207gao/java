package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * SjjcCwWjjsdfmx的POJO类
 *
 * @author  mengke  [Sat Mar 15 17:23:58 CST 2014]
 * 
 */
public class SjjcCwWjjsdfmx implements Serializable{

    /** 
     * 属性objId
     */
    private String objId;
	
    /** 
     * 属性companyname
     */
    private String companyname;
	
    /** 
     * 属性companyid
     */
    private String companyid;
	
    /** 
     * 属性provincename
     */
    private String provincename;
	
    /** 
     * 属性provinceid
     */
    private String provinceid;
	
    /** 
     * 属性wjjshtbm
     */
    private String wjjshtbm;
	
    /** 
     * 属性zd0001
     */
    private Date zd0001;
	
    /** 
     * 属性zd0015
     */
    private BigDecimal zd0015;
	
    /** 
     * 属性zd0016
     */
    private BigDecimal zd0016;
	
    /** 
     * 属性zd0017
     */
    private BigDecimal zd0017;
	
    /** 
     * 属性zd0020
     */
    private BigDecimal zd0020;
	
    /** 
     * 属性zd0023
     */
    private BigDecimal zd0023;
	
    /** 
     * 属性zd5090
     */
    private BigDecimal zd5090;
	
    /** 
     * 属性zd0029
     */
    private BigDecimal zd0029;
	
    /** 
     * 属性zd5084
     */
    private BigDecimal zd5084;
	
    /** 
     * 属性zd5086
     */
    private BigDecimal zd5086;
	
    /** 
     * 属性zd5087
     */
    private BigDecimal zd5087;
	
    /** 
     * 属性zd5088
     */
    private BigDecimal zd5088;
	
    /** 
     * 属性zd0035
     */
    private BigDecimal zd0035;
	
    /** 
     * 属性zd0036
     */
    private BigDecimal zd0036;
	
    /** 
     * 属性zd0041
     */
    private BigDecimal zd0041;
	
    /** 
     * 属性zd0049
     */
    private BigDecimal zd0049;
	
    /** 
     * 属性zd0071
     */
    private BigDecimal zd0071;
	
    /** 
     * 属性zd0072
     */
    private BigDecimal zd0072;
	
    /** 
     * 属性zd5089
     */
    private BigDecimal zd5089;
	
    /** 
     * 属性zd0073
     */
    private String zd0073;
	
    /** 
     * 属性gxsj
     */
    private Date gxsj;
	
    /**
     * SjjcCwWjjsdfmx构造函数
     */
    public SjjcCwWjjsdfmx() {
        super();
    }  
	
    /**
     * SjjcCwWjjsdfmx完整的构造函数
     */  
    public SjjcCwWjjsdfmx(String objId,String companyname,String companyid,String provincename,String provinceid){
        this.objId = objId;
        this.companyname = companyname;
        this.companyid = companyid;
        this.provincename = provincename;
        this.provinceid = provinceid;
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
     * 属性 companyname 的get方法
     * @return String
     */
    public String getCompanyname(){
        return companyname;
    }
	
    /**
     * 属性 companyname 的set方法
     * @return
     */
    public void setCompanyname(String companyname){
        this.companyname = companyname;
    } 
	
    /**
     * 属性 companyid 的get方法
     * @return String
     */
    public String getCompanyid(){
        return companyid;
    }
	
    /**
     * 属性 companyid 的set方法
     * @return
     */
    public void setCompanyid(String companyid){
        this.companyid = companyid;
    } 
	
    /**
     * 属性 provincename 的get方法
     * @return String
     */
    public String getProvincename(){
        return provincename;
    }
	
    /**
     * 属性 provincename 的set方法
     * @return
     */
    public void setProvincename(String provincename){
        this.provincename = provincename;
    } 
	
    /**
     * 属性 provinceid 的get方法
     * @return String
     */
    public String getProvinceid(){
        return provinceid;
    }
	
    /**
     * 属性 provinceid 的set方法
     * @return
     */
    public void setProvinceid(String provinceid){
        this.provinceid = provinceid;
    } 
	
    /**
     * 属性 wjjshtbm 的get方法
     * @return String
     */
    public String getWjjshtbm(){
        return wjjshtbm;
    }
	
    /**
     * 属性 wjjshtbm 的set方法
     * @return
     */
    public void setWjjshtbm(String wjjshtbm){
        this.wjjshtbm = wjjshtbm;
    } 
	
    /**
     * 属性 zd0001 的get方法
     * @return Date
     */
    public Date getZd0001(){
        return zd0001;
    }
	
    /**
     * 属性 zd0001 的set方法
     * @return
     */
    public void setZd0001(Date zd0001){
        this.zd0001 = zd0001;
    } 
	
    /**
     * 属性 zd0015 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZd0015(){
        return zd0015;
    }
	
    /**
     * 属性 zd0015 的set方法
     * @return
     */
    public void setZd0015(BigDecimal zd0015){
        this.zd0015 = zd0015;
    } 
	
    /**
     * 属性 zd0016 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZd0016(){
        return zd0016;
    }
	
    /**
     * 属性 zd0016 的set方法
     * @return
     */
    public void setZd0016(BigDecimal zd0016){
        this.zd0016 = zd0016;
    } 
	
    /**
     * 属性 zd0017 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZd0017(){
        return zd0017;
    }
	
    /**
     * 属性 zd0017 的set方法
     * @return
     */
    public void setZd0017(BigDecimal zd0017){
        this.zd0017 = zd0017;
    } 
	
    /**
     * 属性 zd0020 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZd0020(){
        return zd0020;
    }
	
    /**
     * 属性 zd0020 的set方法
     * @return
     */
    public void setZd0020(BigDecimal zd0020){
        this.zd0020 = zd0020;
    } 
	
    /**
     * 属性 zd0023 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZd0023(){
        return zd0023;
    }
	
    /**
     * 属性 zd0023 的set方法
     * @return
     */
    public void setZd0023(BigDecimal zd0023){
        this.zd0023 = zd0023;
    } 
	
    /**
     * 属性 zd5090 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZd5090(){
        return zd5090;
    }
	
    /**
     * 属性 zd5090 的set方法
     * @return
     */
    public void setZd5090(BigDecimal zd5090){
        this.zd5090 = zd5090;
    } 
	
    /**
     * 属性 zd0029 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZd0029(){
        return zd0029;
    }
	
    /**
     * 属性 zd0029 的set方法
     * @return
     */
    public void setZd0029(BigDecimal zd0029){
        this.zd0029 = zd0029;
    } 
	
    /**
     * 属性 zd5084 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZd5084(){
        return zd5084;
    }
	
    /**
     * 属性 zd5084 的set方法
     * @return
     */
    public void setZd5084(BigDecimal zd5084){
        this.zd5084 = zd5084;
    } 
	
    /**
     * 属性 zd5086 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZd5086(){
        return zd5086;
    }
	
    /**
     * 属性 zd5086 的set方法
     * @return
     */
    public void setZd5086(BigDecimal zd5086){
        this.zd5086 = zd5086;
    } 
	
    /**
     * 属性 zd5087 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZd5087(){
        return zd5087;
    }
	
    /**
     * 属性 zd5087 的set方法
     * @return
     */
    public void setZd5087(BigDecimal zd5087){
        this.zd5087 = zd5087;
    } 
	
    /**
     * 属性 zd5088 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZd5088(){
        return zd5088;
    }
	
    /**
     * 属性 zd5088 的set方法
     * @return
     */
    public void setZd5088(BigDecimal zd5088){
        this.zd5088 = zd5088;
    } 
	
    /**
     * 属性 zd0035 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZd0035(){
        return zd0035;
    }
	
    /**
     * 属性 zd0035 的set方法
     * @return
     */
    public void setZd0035(BigDecimal zd0035){
        this.zd0035 = zd0035;
    } 
	
    /**
     * 属性 zd0036 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZd0036(){
        return zd0036;
    }
	
    /**
     * 属性 zd0036 的set方法
     * @return
     */
    public void setZd0036(BigDecimal zd0036){
        this.zd0036 = zd0036;
    } 
	
    /**
     * 属性 zd0041 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZd0041(){
        return zd0041;
    }
	
    /**
     * 属性 zd0041 的set方法
     * @return
     */
    public void setZd0041(BigDecimal zd0041){
        this.zd0041 = zd0041;
    } 
	
    /**
     * 属性 zd0049 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZd0049(){
        return zd0049;
    }
	
    /**
     * 属性 zd0049 的set方法
     * @return
     */
    public void setZd0049(BigDecimal zd0049){
        this.zd0049 = zd0049;
    } 
	
    /**
     * 属性 zd0071 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZd0071(){
        return zd0071;
    }
	
    /**
     * 属性 zd0071 的set方法
     * @return
     */
    public void setZd0071(BigDecimal zd0071){
        this.zd0071 = zd0071;
    } 
	
    /**
     * 属性 zd0072 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZd0072(){
        return zd0072;
    }
	
    /**
     * 属性 zd0072 的set方法
     * @return
     */
    public void setZd0072(BigDecimal zd0072){
        this.zd0072 = zd0072;
    } 
	
    /**
     * 属性 zd5089 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZd5089(){
        return zd5089;
    }
	
    /**
     * 属性 zd5089 的set方法
     * @return
     */
    public void setZd5089(BigDecimal zd5089){
        this.zd5089 = zd5089;
    } 
	
    /**
     * 属性 zd0073 的get方法
     * @return String
     */
    public String getZd0073(){
        return zd0073;
    }
	
    /**
     * 属性 zd0073 的set方法
     * @return
     */
    public void setZd0073(String zd0073){
        this.zd0073 = zd0073;
    } 
	
    /**
     * 属性 gxsj 的get方法
     * @return Date
     */
    public Date getGxsj(){
        return gxsj;
    }
	
    /**
     * 属性 gxsj 的set方法
     * @return
     */
    public void setGxsj(Date gxsj){
        this.gxsj = gxsj;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof SjjcCwWjjsdfmx))
	        return false; 
			
        if(getObjId() == null) 
	        return false;

        SjjcCwWjjsdfmx other = (SjjcCwWjjsdfmx) o;	        
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
            .append("companyname"+":"+getCompanyname())
            .append("companyid"+":"+getCompanyid())
            .append("provincename"+":"+getProvincename())
            .append("provinceid"+":"+getProvinceid())
            .append("wjjshtbm"+":"+getWjjshtbm())
            .append("zd0001"+":"+getZd0001())
            .append("zd0015"+":"+getZd0015())
            .append("zd0016"+":"+getZd0016())
            .append("zd0017"+":"+getZd0017())
            .append("zd0020"+":"+getZd0020())
            .append("zd0023"+":"+getZd0023())
            .append("zd5090"+":"+getZd5090())
            .append("zd0029"+":"+getZd0029())
            .append("zd5084"+":"+getZd5084())
            .append("zd5086"+":"+getZd5086())
            .append("zd5087"+":"+getZd5087())
            .append("zd5088"+":"+getZd5088())
            .append("zd0035"+":"+getZd0035())
            .append("zd0036"+":"+getZd0036())
            .append("zd0041"+":"+getZd0041())
            .append("zd0049"+":"+getZd0049())
            .append("zd0071"+":"+getZd0071())
            .append("zd0072"+":"+getZd0072())
            .append("zd5089"+":"+getZd5089())
            .append("zd0073"+":"+getZd0073())
            .append("gxsj"+":"+getGxsj())
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