package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * SjjcCwJzdjtzxx的POJO类
 *
 * @author  mengke  [Fri Mar 14 11:14:17 CST 2014]
 * 
 */
public class SjjcCwJzdjtzxx implements Serializable{

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
     * 属性dzwjmcjwh
     */
    private String dzwjmcjwh;
	
    /** 
     * 属性jzjsdymc
     */
    private String jzjsdymc;
	
    /** 
     * 属性jzjsdybm
     */
    private String jzjsdybm;
	
    /** 
     * 属性dzhdjsxsj
     */
    private Date dzhdjsxsj;
	
    /** 
     * 属性zd0014
     */
    private BigDecimal zd0014;
	
    /** 
     * 属性zd0016
     */
    private BigDecimal zd0016;
	
    /** 
     * 属性zd0018
     */
    private BigDecimal zd0018;
	
    /** 
     * 属性zd0023
     */
    private BigDecimal zd0023;
	
    /** 
     * 属性zd0025
     */
    private BigDecimal zd0025;
	
    /** 
     * 属性zd0027
     */
    private BigDecimal zd0027;
	
    /** 
     * 属性zd0029
     */
    private BigDecimal zd0029;
	
    /** 
     * 属性zd0035
     */
    private BigDecimal zd0035;
	
    /** 
     * 属性zd0037
     */
    private BigDecimal zd0037;
	
    /** 
     * 属性zd0039
     */
    private BigDecimal zd0039;
	
    /** 
     * 属性zd0041
     */
    private BigDecimal zd0041;
	
    /** 
     * 属性zd0050
     */
    private BigDecimal zd0050;
	
    /** 
     * 属性zd0051
     */
    private BigDecimal zd0051;
	
    /** 
     * 属性zd0052
     */
    private BigDecimal zd0052;
	
    /** 
     * 属性zd0053
     */
    private BigDecimal zd0053;
	
    /** 
     * 属性zd0058
     */
    private BigDecimal zd0058;
	
    /** 
     * 属性zd0059
     */
    private BigDecimal zd0059;
	
    /** 
     * 属性zd0060
     */
    private BigDecimal zd0060;
	
    /** 
     * 属性zd0061
     */
    private BigDecimal zd0061;
	
    /** 
     * 属性zd0062
     */
    private BigDecimal zd0062;
	
    /** 
     * 属性zd0063
     */
    private BigDecimal zd0063;
	
    /** 
     * 属性zd0064
     */
    private BigDecimal zd0064;
	
    /** 
     * 属性zd0065
     */
    private BigDecimal zd0065;
	
    /** 
     * 属性zd0066
     */
    private BigDecimal zd0066;
	
    /** 
     * 属性zd0067
     */
    private BigDecimal zd0067;
	
    /** 
     * 属性gxsj
     */
    private Date gxsj;
	
    /**
     * SjjcCwJzdjtzxx构造函数
     */
    public SjjcCwJzdjtzxx() {
        super();
    }  
	
    /**
     * SjjcCwJzdjtzxx完整的构造函数
     */  
    public SjjcCwJzdjtzxx(String objId,String companyname,String companyid,String provincename,String provinceid){
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
     * 属性 dzwjmcjwh 的get方法
     * @return String
     */
    public String getDzwjmcjwh(){
        return dzwjmcjwh;
    }
	
    /**
     * 属性 dzwjmcjwh 的set方法
     * @return
     */
    public void setDzwjmcjwh(String dzwjmcjwh){
        this.dzwjmcjwh = dzwjmcjwh;
    } 
	
    /**
     * 属性 jzjsdymc 的get方法
     * @return String
     */
    public String getJzjsdymc(){
        return jzjsdymc;
    }
	
    /**
     * 属性 jzjsdymc 的set方法
     * @return
     */
    public void setJzjsdymc(String jzjsdymc){
        this.jzjsdymc = jzjsdymc;
    } 
	
    /**
     * 属性 jzjsdybm 的get方法
     * @return String
     */
    public String getJzjsdybm(){
        return jzjsdybm;
    }
	
    /**
     * 属性 jzjsdybm 的set方法
     * @return
     */
    public void setJzjsdybm(String jzjsdybm){
        this.jzjsdybm = jzjsdybm;
    } 
	
    /**
     * 属性 dzhdjsxsj 的get方法
     * @return Date
     */
    public Date getDzhdjsxsj(){
        return dzhdjsxsj;
    }
	
    /**
     * 属性 dzhdjsxsj 的set方法
     * @return
     */
    public void setDzhdjsxsj(Date dzhdjsxsj){
        this.dzhdjsxsj = dzhdjsxsj;
    } 
	
    /**
     * 属性 zd0014 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZd0014(){
        return zd0014;
    }
	
    /**
     * 属性 zd0014 的set方法
     * @return
     */
    public void setZd0014(BigDecimal zd0014){
        this.zd0014 = zd0014;
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
     * 属性 zd0018 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZd0018(){
        return zd0018;
    }
	
    /**
     * 属性 zd0018 的set方法
     * @return
     */
    public void setZd0018(BigDecimal zd0018){
        this.zd0018 = zd0018;
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
     * 属性 zd0025 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZd0025(){
        return zd0025;
    }
	
    /**
     * 属性 zd0025 的set方法
     * @return
     */
    public void setZd0025(BigDecimal zd0025){
        this.zd0025 = zd0025;
    } 
	
    /**
     * 属性 zd0027 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZd0027(){
        return zd0027;
    }
	
    /**
     * 属性 zd0027 的set方法
     * @return
     */
    public void setZd0027(BigDecimal zd0027){
        this.zd0027 = zd0027;
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
     * 属性 zd0037 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZd0037(){
        return zd0037;
    }
	
    /**
     * 属性 zd0037 的set方法
     * @return
     */
    public void setZd0037(BigDecimal zd0037){
        this.zd0037 = zd0037;
    } 
	
    /**
     * 属性 zd0039 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZd0039(){
        return zd0039;
    }
	
    /**
     * 属性 zd0039 的set方法
     * @return
     */
    public void setZd0039(BigDecimal zd0039){
        this.zd0039 = zd0039;
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
     * 属性 zd0050 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZd0050(){
        return zd0050;
    }
	
    /**
     * 属性 zd0050 的set方法
     * @return
     */
    public void setZd0050(BigDecimal zd0050){
        this.zd0050 = zd0050;
    } 
	
    /**
     * 属性 zd0051 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZd0051(){
        return zd0051;
    }
	
    /**
     * 属性 zd0051 的set方法
     * @return
     */
    public void setZd0051(BigDecimal zd0051){
        this.zd0051 = zd0051;
    } 
	
    /**
     * 属性 zd0052 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZd0052(){
        return zd0052;
    }
	
    /**
     * 属性 zd0052 的set方法
     * @return
     */
    public void setZd0052(BigDecimal zd0052){
        this.zd0052 = zd0052;
    } 
	
    /**
     * 属性 zd0053 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZd0053(){
        return zd0053;
    }
	
    /**
     * 属性 zd0053 的set方法
     * @return
     */
    public void setZd0053(BigDecimal zd0053){
        this.zd0053 = zd0053;
    } 
	
    /**
     * 属性 zd0058 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZd0058(){
        return zd0058;
    }
	
    /**
     * 属性 zd0058 的set方法
     * @return
     */
    public void setZd0058(BigDecimal zd0058){
        this.zd0058 = zd0058;
    } 
	
    /**
     * 属性 zd0059 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZd0059(){
        return zd0059;
    }
	
    /**
     * 属性 zd0059 的set方法
     * @return
     */
    public void setZd0059(BigDecimal zd0059){
        this.zd0059 = zd0059;
    } 
	
    /**
     * 属性 zd0060 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZd0060(){
        return zd0060;
    }
	
    /**
     * 属性 zd0060 的set方法
     * @return
     */
    public void setZd0060(BigDecimal zd0060){
        this.zd0060 = zd0060;
    } 
	
    /**
     * 属性 zd0061 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZd0061(){
        return zd0061;
    }
	
    /**
     * 属性 zd0061 的set方法
     * @return
     */
    public void setZd0061(BigDecimal zd0061){
        this.zd0061 = zd0061;
    } 
	
    /**
     * 属性 zd0062 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZd0062(){
        return zd0062;
    }
	
    /**
     * 属性 zd0062 的set方法
     * @return
     */
    public void setZd0062(BigDecimal zd0062){
        this.zd0062 = zd0062;
    } 
	
    /**
     * 属性 zd0063 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZd0063(){
        return zd0063;
    }
	
    /**
     * 属性 zd0063 的set方法
     * @return
     */
    public void setZd0063(BigDecimal zd0063){
        this.zd0063 = zd0063;
    } 
	
    /**
     * 属性 zd0064 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZd0064(){
        return zd0064;
    }
	
    /**
     * 属性 zd0064 的set方法
     * @return
     */
    public void setZd0064(BigDecimal zd0064){
        this.zd0064 = zd0064;
    } 
	
    /**
     * 属性 zd0065 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZd0065(){
        return zd0065;
    }
	
    /**
     * 属性 zd0065 的set方法
     * @return
     */
    public void setZd0065(BigDecimal zd0065){
        this.zd0065 = zd0065;
    } 
	
    /**
     * 属性 zd0066 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZd0066(){
        return zd0066;
    }
	
    /**
     * 属性 zd0066 的set方法
     * @return
     */
    public void setZd0066(BigDecimal zd0066){
        this.zd0066 = zd0066;
    } 
	
    /**
     * 属性 zd0067 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZd0067(){
        return zd0067;
    }
	
    /**
     * 属性 zd0067 的set方法
     * @return
     */
    public void setZd0067(BigDecimal zd0067){
        this.zd0067 = zd0067;
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
		
        if (o == null || !(o instanceof SjjcCwJzdjtzxx))
	        return false; 
			
        if(getObjId() == null) 
	        return false;

        SjjcCwJzdjtzxx other = (SjjcCwJzdjtzxx) o;	        
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
            .append("dzwjmcjwh"+":"+getDzwjmcjwh())
            .append("jzjsdymc"+":"+getJzjsdymc())
            .append("jzjsdybm"+":"+getJzjsdybm())
            .append("dzhdjsxsj"+":"+getDzhdjsxsj())
            .append("zd0014"+":"+getZd0014())
            .append("zd0016"+":"+getZd0016())
            .append("zd0018"+":"+getZd0018())
            .append("zd0023"+":"+getZd0023())
            .append("zd0025"+":"+getZd0025())
            .append("zd0027"+":"+getZd0027())
            .append("zd0029"+":"+getZd0029())
            .append("zd0035"+":"+getZd0035())
            .append("zd0037"+":"+getZd0037())
            .append("zd0039"+":"+getZd0039())
            .append("zd0041"+":"+getZd0041())
            .append("zd0050"+":"+getZd0050())
            .append("zd0051"+":"+getZd0051())
            .append("zd0052"+":"+getZd0052())
            .append("zd0053"+":"+getZd0053())
            .append("zd0058"+":"+getZd0058())
            .append("zd0059"+":"+getZd0059())
            .append("zd0060"+":"+getZd0060())
            .append("zd0061"+":"+getZd0061())
            .append("zd0062"+":"+getZd0062())
            .append("zd0063"+":"+getZd0063())
            .append("zd0064"+":"+getZd0064())
            .append("zd0065"+":"+getZd0065())
            .append("zd0066"+":"+getZd0066())
            .append("zd0067"+":"+getZd0067())
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