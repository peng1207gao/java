package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * SjjcCwJzsydjxx的POJO类
 *
 * @author  mengke  [Fri Mar 14 18:57:26 CST 2014]
 * 
 */
public class SjjcCwJzsydjxx implements Serializable{

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
     * 属性jzjsdymc
     */
    private String jzjsdymc;
	
    /** 
     * 属性jzjsdybm
     */
    private String jzjsdybm;
	
    /** 
     * 属性sj
     */
    private Date sj;
	
    /** 
     * 属性zd0039
     */
    private Date zd0039;
	
    /** 
     * 属性zd0038
     */
    private Date zd0038;
	
    /** 
     * 属性zd0018
     */
    private BigDecimal zd0018;
	
    /** 
     * 属性zd0016
     */
    private BigDecimal zd0016;
	
    /** 
     * 属性zd0020
     */
    private BigDecimal zd0020;
	
    /** 
     * 属性zd5064
     */
    private BigDecimal zd5064;
	
    /** 
     * 属性zd5061
     */
    private BigDecimal zd5061;
	
    /** 
     * 属性zd5062
     */
    private BigDecimal zd5062;
	
    /** 
     * 属性zd5063
     */
    private BigDecimal zd5063;
	
    /** 
     * 属性zd0023
     */
    private BigDecimal zd0023;
	
    /** 
     * 属性zd0024
     */
    private BigDecimal zd0024;
	
    /** 
     * 属性zd0025
     */
    private BigDecimal zd0025;
	
    /** 
     * 属性zd5069
     */
    private BigDecimal zd5069;
	
    /** 
     * 属性zd5066
     */
    private BigDecimal zd5066;
	
    /** 
     * 属性zd5067
     */
    private BigDecimal zd5067;
	
    /** 
     * 属性zd5068
     */
    private BigDecimal zd5068;
	
    /** 
     * 属性zd5071
     */
    private BigDecimal zd5071;
	
    /** 
     * 属性zd0019
     */
    private BigDecimal zd0019;
	
    /** 
     * 属性zd0021
     */
    private BigDecimal zd0021;
	
    /** 
     * 属性zd0027
     */
    private BigDecimal zd0027;
	
    /** 
     * 属性zd0028
     */
    private BigDecimal zd0028;
	
    /** 
     * 属性zd0029
     */
    private BigDecimal zd0029;
	
    /** 
     * 属性zd5072
     */
    private BigDecimal zd5072;
	
    /** 
     * 属性zd0046
     */
    private String zd0046;
	
    /** 
     * 属性zd0048
     */
    private String zd0048;
	
    /** 
     * 属性zd0049
     */
    private String zd0049;
	
    /** 
     * 属性zd0050
     */
    private String zd0050;
	
    /** 
     * 属性gxsj
     */
    private Date gxsj;
	
    /**
     * SjjcCwJzsydjxx构造函数
     */
    public SjjcCwJzsydjxx() {
        super();
    }  
	
    /**
     * SjjcCwJzsydjxx完整的构造函数
     */  
    public SjjcCwJzsydjxx(String objId,String companyname,String companyid,String provincename,String provinceid,String jzjsdymc,String jzjsdybm,Date sj){
        this.objId = objId;
        this.companyname = companyname;
        this.companyid = companyid;
        this.provincename = provincename;
        this.provinceid = provinceid;
        this.jzjsdymc = jzjsdymc;
        this.jzjsdybm = jzjsdybm;
        this.sj = sj;
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
     * 属性 sj 的get方法
     * @return Date
     */
    public Date getSj(){
        return sj;
    }
	
    /**
     * 属性 sj 的set方法
     * @return
     */
    public void setSj(Date sj){
        this.sj = sj;
    } 
	
    /**
     * 属性 zd0039 的get方法
     * @return Date
     */
    public Date getZd0039(){
        return zd0039;
    }
	
    /**
     * 属性 zd0039 的set方法
     * @return
     */
    public void setZd0039(Date zd0039){
        this.zd0039 = zd0039;
    } 
	
    /**
     * 属性 zd0038 的get方法
     * @return Date
     */
    public Date getZd0038(){
        return zd0038;
    }
	
    /**
     * 属性 zd0038 的set方法
     * @return
     */
    public void setZd0038(Date zd0038){
        this.zd0038 = zd0038;
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
     * 属性 zd5064 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZd5064(){
        return zd5064;
    }
	
    /**
     * 属性 zd5064 的set方法
     * @return
     */
    public void setZd5064(BigDecimal zd5064){
        this.zd5064 = zd5064;
    } 
	
    /**
     * 属性 zd5061 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZd5061(){
        return zd5061;
    }
	
    /**
     * 属性 zd5061 的set方法
     * @return
     */
    public void setZd5061(BigDecimal zd5061){
        this.zd5061 = zd5061;
    } 
	
    /**
     * 属性 zd5062 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZd5062(){
        return zd5062;
    }
	
    /**
     * 属性 zd5062 的set方法
     * @return
     */
    public void setZd5062(BigDecimal zd5062){
        this.zd5062 = zd5062;
    } 
	
    /**
     * 属性 zd5063 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZd5063(){
        return zd5063;
    }
	
    /**
     * 属性 zd5063 的set方法
     * @return
     */
    public void setZd5063(BigDecimal zd5063){
        this.zd5063 = zd5063;
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
     * 属性 zd0024 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZd0024(){
        return zd0024;
    }
	
    /**
     * 属性 zd0024 的set方法
     * @return
     */
    public void setZd0024(BigDecimal zd0024){
        this.zd0024 = zd0024;
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
     * 属性 zd5069 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZd5069(){
        return zd5069;
    }
	
    /**
     * 属性 zd5069 的set方法
     * @return
     */
    public void setZd5069(BigDecimal zd5069){
        this.zd5069 = zd5069;
    } 
	
    /**
     * 属性 zd5066 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZd5066(){
        return zd5066;
    }
	
    /**
     * 属性 zd5066 的set方法
     * @return
     */
    public void setZd5066(BigDecimal zd5066){
        this.zd5066 = zd5066;
    } 
	
    /**
     * 属性 zd5067 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZd5067(){
        return zd5067;
    }
	
    /**
     * 属性 zd5067 的set方法
     * @return
     */
    public void setZd5067(BigDecimal zd5067){
        this.zd5067 = zd5067;
    } 
	
    /**
     * 属性 zd5068 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZd5068(){
        return zd5068;
    }
	
    /**
     * 属性 zd5068 的set方法
     * @return
     */
    public void setZd5068(BigDecimal zd5068){
        this.zd5068 = zd5068;
    } 
	
    /**
     * 属性 zd5071 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZd5071(){
        return zd5071;
    }
	
    /**
     * 属性 zd5071 的set方法
     * @return
     */
    public void setZd5071(BigDecimal zd5071){
        this.zd5071 = zd5071;
    } 
	
    /**
     * 属性 zd0019 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZd0019(){
        return zd0019;
    }
	
    /**
     * 属性 zd0019 的set方法
     * @return
     */
    public void setZd0019(BigDecimal zd0019){
        this.zd0019 = zd0019;
    } 
	
    /**
     * 属性 zd0021 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZd0021(){
        return zd0021;
    }
	
    /**
     * 属性 zd0021 的set方法
     * @return
     */
    public void setZd0021(BigDecimal zd0021){
        this.zd0021 = zd0021;
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
     * 属性 zd0028 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZd0028(){
        return zd0028;
    }
	
    /**
     * 属性 zd0028 的set方法
     * @return
     */
    public void setZd0028(BigDecimal zd0028){
        this.zd0028 = zd0028;
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
     * 属性 zd5072 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZd5072(){
        return zd5072;
    }
	
    /**
     * 属性 zd5072 的set方法
     * @return
     */
    public void setZd5072(BigDecimal zd5072){
        this.zd5072 = zd5072;
    } 
	
    /**
     * 属性 zd0046 的get方法
     * @return String
     */
    public String getZd0046(){
        return zd0046;
    }
	
    /**
     * 属性 zd0046 的set方法
     * @return
     */
    public void setZd0046(String zd0046){
        this.zd0046 = zd0046;
    } 
	
    /**
     * 属性 zd0048 的get方法
     * @return String
     */
    public String getZd0048(){
        return zd0048;
    }
	
    /**
     * 属性 zd0048 的set方法
     * @return
     */
    public void setZd0048(String zd0048){
        this.zd0048 = zd0048;
    } 
	
    /**
     * 属性 zd0049 的get方法
     * @return String
     */
    public String getZd0049(){
        return zd0049;
    }
	
    /**
     * 属性 zd0049 的set方法
     * @return
     */
    public void setZd0049(String zd0049){
        this.zd0049 = zd0049;
    } 
	
    /**
     * 属性 zd0050 的get方法
     * @return String
     */
    public String getZd0050(){
        return zd0050;
    }
	
    /**
     * 属性 zd0050 的set方法
     * @return
     */
    public void setZd0050(String zd0050){
        this.zd0050 = zd0050;
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
		
        if (o == null || !(o instanceof SjjcCwJzsydjxx))
	        return false; 
			
        if(getObjId() == null) 
	        return false;

        SjjcCwJzsydjxx other = (SjjcCwJzsydjxx) o;	        
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
            .append("jzjsdymc"+":"+getJzjsdymc())
            .append("jzjsdybm"+":"+getJzjsdybm())
            .append("sj"+":"+getSj())
            .append("zd0039"+":"+getZd0039())
            .append("zd0038"+":"+getZd0038())
            .append("zd0018"+":"+getZd0018())
            .append("zd0016"+":"+getZd0016())
            .append("zd0020"+":"+getZd0020())
            .append("zd5064"+":"+getZd5064())
            .append("zd5061"+":"+getZd5061())
            .append("zd5062"+":"+getZd5062())
            .append("zd5063"+":"+getZd5063())
            .append("zd0023"+":"+getZd0023())
            .append("zd0024"+":"+getZd0024())
            .append("zd0025"+":"+getZd0025())
            .append("zd5069"+":"+getZd5069())
            .append("zd5066"+":"+getZd5066())
            .append("zd5067"+":"+getZd5067())
            .append("zd5068"+":"+getZd5068())
            .append("zd5071"+":"+getZd5071())
            .append("zd0019"+":"+getZd0019())
            .append("zd0021"+":"+getZd0021())
            .append("zd0027"+":"+getZd0027())
            .append("zd0028"+":"+getZd0028())
            .append("zd0029"+":"+getZd0029())
            .append("zd5072"+":"+getZd5072())
            .append("zd0046"+":"+getZd0046())
            .append("zd0048"+":"+getZd0048())
            .append("zd0049"+":"+getZd0049())
            .append("zd0050"+":"+getZd0050())
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